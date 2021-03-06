package com.example.mydeliciousrecipe.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mydeliciousrecipe.DetailActivity;
import com.example.mydeliciousrecipe.R;
import com.example.mydeliciousrecipe.Resep;

import java.util.ArrayList;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder> {

    private ArrayList<Resep> reseps = new ArrayList<>();

    // mengisi data list yang akan di tampilkan
    public void setReseps(ArrayList<Resep> reseps) {
        if (reseps != null) {
            this.reseps.clear();
            this.reseps.addAll(reseps);
        }
        // update tampilan jika terdapat perubahan data
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ResepAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResepAdapter.ViewHolder holder, int position) {
        holder.bind(reseps.get(position));
    }

    @Override
    public int getItemCount() {
        return reseps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // deklarasi variabel view sesuai dengan layout xml
        private TextView tvNama, tvLama;
        private ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // koneksikan variabel dengan view berdasarkan id
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvLama = itemView.findViewById(R.id.tv_tahun);
            ivImage = itemView.findViewById(R.id.iv_foto);
        }

        public void bind(Resep resep) {
            // menampilkan text ke dalam view item
            tvNama.setText(resep.getNama());
            tvLama.setText(resep.getLama());
            // mengambil dan menampilkan image berdasarkan link ke dalam view item
            Glide.with(itemView.getContext())
                    .load(resep.getGambar())
                    .into(ivImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra("nama", resep.getNama());
                    intent.putExtra("lama", resep.getLama());
                    intent.putExtra("orang", resep.getOrang());
                    intent.putExtra("bahan", resep.getBahan());
                    intent.putExtra("cara", resep.getCara());
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
