package com.example.mydeliciousrecipe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydeliciousrecipe.adapter.ResepAdapter;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_menu_fragment, container, false);
    }

    private RecyclerView recyclerView;
    private ResepAdapter resepAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_resep_list);
        recyclerView.setHasFixedSize(true);

        resepAdapter = new ResepAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(resepAdapter);

        // memasukkan data ke dalam list
        ArrayList<Resep> data = DataDummy.dummyDrama();
        resepAdapter.setReseps(data);

    }


}