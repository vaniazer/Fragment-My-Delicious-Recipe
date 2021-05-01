package com.example.mydeliciousrecipe;

import java.util.ArrayList;

public class DataDummy {
    public static ArrayList<Resep> dummyDrama() {
        ArrayList<Resep> listResep = new ArrayList<>();

        listResep.add(
                new Resep(
                        "1",
                        "Dimsum Ayam",
                        "1 Jam",
                        "4 Porsi",
                        "400 g daging ayam giling\n" +
                                "150 g udang kupas, cincang halus\n" +
                                "3 siung bawang putih, haluskan\n" +
                                "1 sdm bawang merah goreng, haluskan\n" +
                                "1 batang daun bawang, iris tipis\n" +
                                "1 sdm tepung terigu\n" +
                                "3 sdm tepung sagu\n" +
                                "2 butir telur\n" +
                                "1 sdt Royco Kaldu Ayam\n" +
                                "½ sdt merica putih bubuk\n" +
                                "½ sdt gula pasir\n" +
                                "½ sdt garam\n" +
                                "3 sdm minyak wijen",
                        "1. Aduk rata semua bahan adonan dimsum. Sisihkan. Panaskan dandang atau panci pengukus. Sisihkan.\n" +
                                "2. Ambil selembar kulit pangsit, taruh 1 sdt adonan siomay di tengahnya. Lipat keliling sisi kulitnya, lalu beri parutan wortel ke atasnya. Ulangi proses serupa pada sisa bahan.\n" +
                                "3. Kukus siomay dalam dandang panas selama sekitar 30 menit.\n" +
                                "4. Sajikan dimsum ayam dengan Saus Sambal Jawara.\n",
                        R.drawable.dimsum
                )
        );
        listResep.add(
                new Resep(
                        "2",
                        "Ayam Katsu Saus Kari",
                        "40 Menit",
                        "4 Porsi",
                        "4 filet paha ayam tanpa kulit, memarkan\n" +
                                "3 siung bawang putih, parut halus\n" +
                                "1 sdt Royco Kaldu Ayam\n" +
                                "½ sdm merica putih bubuk\n" +
                                "1 sdt minyak wijen\n" +
                                "150 g tepung roti kasar atau tepung panko\n" +
                                "2 butir telur ayam, kocok lepas\n" +
                                "minyak, untuk menumis dan menggoreng\n" +
                                "\n" +
                                "Kari Jepang\n" +
                                "\n" +
                                "150 g wortel, potong dadu\n" +
                                "2 buah kentang, kupas, potong dadu\n" +
                                "100 g bawang bombay, cincag halus\n" +
                                "50 g kacang polong\n" +
                                "3 sdm bumbu kari Jepang siap pakai\n" +
                                "2 sdm tepung terigu\n" +
                                "500 ml air\n" +
                                "1 sdt Royco Kaldu Ayam\n",
                        "1. Ayam Katsu: Lumuri ayam dengan bawang putih, merica, dan Royco Kaldu Ayam hingga merata. Diamkan hingga bumbu meresep selama sekitar 15 menit.\n" +
                                "2. Lumuri daging ayam dengan tepung roti, lalu balur dengan telur kocok hingga merata. Lumuri kembali dengan tepung roti hingga permukaannya tertutup rata.\n" +
                                "3. Panaskan minyak, goreng ayam hingga matang dan cokelat keemasan. Angkat dan tiriskan. Sisihkan.\n" +
                                "4. Kari Jepang: Panaskan 2 sdm minyak, tumis bawang bombay dan bumbu kari hingga harum. Masukkan tepung terigu, aduk hingga rata. Tuang air, aduk rata.\n" +
                                "5. Masukkan kentang, wortel, merica, dan Royco Kaldu Ayam. Masak hingga sayuran matang. Tambahkan kacang polong, masak sebentar. Angkat.\n" +
                                "6. Sajikan ayam katsu bersama saus kari.\n" +
                                "\n",
                        R.drawable.katsu
                )
        );
        listResep.add(
                new Resep(
                        "3",
                        "Onigiri",
                        "1 Jam",
                        "8 Porsi",
                        "400 g beras\n" +
                                "100 g beras ketan\n" +
                                "1 sachet Royco Kaldu Ayam\n" +
                                "600 ml air\n" +
                                "2 sdm daun bawang, cincang halus\n" +
                                "1 sdm saus pedas manis\n" +
                                "50 g abon\n" +
                                "1 butir telur, goreng dadar\n" +
                                "1 lembar nori ukuran besar\n" +
                                "2 sdm mayonaise\n" +
                                "\n",
                        "1. Pertama, kita rendam terlebih dahulu beras ketan selama 15 menit. Setelah itu, tiriskan lalu satukan dengan beras biasa kemudian cuci.\n" +
                                "2. Masak nasi di rice cooker seperti biasa. Setelah matang, aduk dengan bawang daun yang telah dicincang dan Royco Kaldu Ayam hingga merata.\n" +
                                "3. Ambil dua hingga tiga sendok makan nasi lalu kepal. Isi bagian dalam dengan abon, telur dadar, dan sambal mayo. Tutup dan rapikan membentuk segitiga.\n" +
                                "4. Potong nori membentuk persegi panjang dan tempelkan di bagian bawah nasi kepal.\n" +
                                "5. Ulangi langkah yang sama. Masukkan onigiri ke dalam wadah. Bekal makan siangmu sudah siap!\n" +
                                "\n",
                        R.drawable.onigiri
                )
        );
        listResep.add(
                new Resep(
                        "4",
                        "Mie Dog Dog",
                        "5 Menit",
                        "1 Porsi",
                        "1 bungkus mie instan goreng\n" +
                                "2 siung bawang merah\n" +
                                "1 siung bawang putih\n" +
                                "5 buah cabai rawit\n" +
                                "2 bauh cabai keriting\n" +
                                "sosis\n" +
                                "garam dan gula secukupnya\n" +
                                "kecap dan saus sambal secukupnya\n" +
                                "2 sendok makan minyak goreng\n" +
                                "1 butir telur",
                        "1. Bawang merah, bawang putih, cabai rawit, cabai keriting, gula dan garam diulek. Kemudian tumis bumbu sampai harum.\n" +
                                "2. Masukkan telur lalu aduk. Tambahkan sedikit air, tunggu sampai mendidih. \n" +
                                "3. Masukkan mie kemudian masak hingga setengah matang. Jika sudah setengah matang, masukkan sosis dan bumbu bawaan dari mie instan. Tambahkan garam, saus sambal serta kecap sesuai selera. \n" +
                                "4. Aduk dan masak hingga air agak meresap.",
                        R.drawable.dogdog
                )
        );
        listResep.add(
                new Resep(
                        "5",
                        "Cumi Saus Padang",
                        "45 Menit",
                        "4 Porsi",
                        "500 g cumi, bersihkan, iris tebal\n" +
                                "1 sdt air jeruk nipis\n" +
                                "3 buah cabai rawit merah, iris\n" +
                                "2 buah cabai merah, iris halus\n" +
                                "3 buah tomat, belah 4, buang biji, cincang\n" +
                                "5 sdm Saus Sambal Jawara Extra Hot\n" +
                                "1 sdt Bango Kecap Manis\n" +
                                "1 sdt Royco Kaldu Jamur\n" +
                                "300 ml air\n" +
                                "2 batang daun bawang, potong 3 cm\n" +
                                "1 sdt tepung maizena, larutkan dengan 1 sdm air\n" +
                                "2 sdm minyak, untuk menumis\n \n" +
                                "Bumbu halus\n \n" +
                                "3 siung bawang putih\n" +
                                "1 buah bawang bombay\n" +
                                "2 cm jahe\n" +
                                "½ sdt garam",
                        "1. Lumuri cumi dengan air jeruk nipis. Diamkan selama 10 menit. Sisihkan.\n" +
                                "2. Panaskan minyak, tumis bumbu halus dan cabai hingga harum. Tambahkan tomat, masak hingga tomat layu. Masukkan cumi, aduk.  \n" +
                                "3. Tambahkan Saus Sambal Jawara Hot, Bango Kecap Manis, Royco Kaldu Jamur, dan air. Masak hingga mendidih.\n" +
                                "4. Masukkan daun bawang dan larutan tepung maizena, aduk hingga mengental. Angkat. Sajikan.",
                        R.drawable.cumi
                )
        );
        listResep.add(
                new Resep(
                        "6",
                        "Mie Celor",
                        "45 Menit",
                        "4 Porsi",
                        "150 g mie basah\n" +
                                "100 g dada ayam fillet, potong dadu\n" +
                                "50 g taoge Jepang, blansir\n" +
                                "1 butir telur ayam, kocok hingga berbuih\n" +
                                "200 ml susu cair\n" +
                                "2 sdt Royco Kaldu Ayam\n" +
                                "1 sdm Bango Kecap Manis\n" +
                                "1 sdt gula pasir\n" +
                                "½ sdt garam\n" +
                                "3 sdm minyak sayur\n" +
                                "200 ml air\n \n" +
                                "Bumbu halus\n \n" +
                                "2 butir bawang merah\n" +
                                "2 siung bawang putih\n" +
                                "1 cm jahe\n \n" +
                                "Bahan pelengkap\n \n" +
                                "1 butir telur, rebus\n" +
                                "1 sdm bawang merah goreng\n" +
                                "daun bawang, iris",
                        "1. Membuat air kaldu: Didihkan air di panci. Tambahkan Royco Kaldu Ayam, lalu aduk hingga tercampur dengan rata. Masak selama 2 menit hingga air matang.\n" +
                                "2. Haluskan semua bumbu halus dengan ulekan atau food processor.\n" +
                                "3. Panaskan minyak di wajan. Masukkan bumbu halus dan tumis hingga harum. Masukkan dada ayam fillet dan tuangkan Kecap Manis Bango ke dalamnya. Tumis hingga ayam matang.\n" +
                                "4. Tuangkan air kaldu ke dalam panci. Tambahkan garam, gula pasir, dan lada bubuk. Lalu, tuangkan susu cair dan masak kembali hingga kaldu mendidih.\n" +
                                "5. Masukkan telur kocok ke dalam kaldu yang mendidih sambil diaduk hingga telur ayam hancur dan menjadi butir-butir gumpalan kecil. Masak selama kurang lebih 3 menit hingga telur ayam matang.\n" +
                                "6. Penyajian: Letakkan mie dan taoge di atas piring saji. Lalu, siram dengan kuah kaldu. Sajikan dengan bawang goreng, daun bawang dan telur rebus.",
                        R.drawable.mie_celor
                )
        );
        listResep.add(
                new Resep(
                        "7",
                        "Lasagna Keju",
                        "2 Jam",
                        "4 Porsi",
                        "12 lembar lasagna kering, blansir\n \n" +
                                "Isi\n \n" +
                                "500 g tomat, rebus, blender\n" +
                                "150 g bawang bombay, cincang\n" +
                                "4 siung bawang putih, cincang\n" +
                                "3 sdm thyme\n" +
                                "100 g wortel, cincang\n" +
                                "4 sdm minyak zaitun\n" +
                                "1.5 sdt garam\n" +
                                "400 g daging sapi cincang\n" +
                                "100 g jamur kancing, cincang\n" +
                                "1 sdt pasta tomat\n" +
                                "½ sdt oregano kering\n" +
                                "1 sdt garam\n" +
                                "1 sdt merica hitam bubuk\n \n" +
                                "Saus keju\n \n" +
                                "500 ml air\n" +
                                "1 sdm Royco Kaldu Ayam\n" +
                                "200 g keju cheddar\n" +
                                "1 sdm margarin\n" +
                                "100 g keju parmesan",
                        "1. Isi: Panaskan minyak zaitun, tumis semua bawang hingga transparan. Masukkan daging sapi, tumis hingga berubah warna.  Masukkan thyme, wortel, dan pasta tomat, aduk. Tumis hingga daging hampir mengering. \n" +
                                "2. Masukkan tomat , aduk hingga mendidih. Tambahkan jamur, oregano, aduk rata. Bumbui dengan garam dan merica, aduk. Masak hingga matang. Angkat. Sisihkan.\n" +
                                "3. Saus keju: Panaskan susu, margarin, dan Royco Kaldu Ayam di atas api kecil sambil diaduk. Masukkan keju parmesan dan 100 g keju cheddar, aduk rata hingga mengental. Angkat. Sisihkan.\n" +
                                "4. Letakkan lembaran lasagna dalam pinggan tahan panas. Sendokkan saus tomat ke atasnya hingga lasagna tertutup saus merata. Sendokkan isi beef ragout ke atasnya. Taburi dengan 1/3 bagian saus keju.\n" +
                                "5. Tutup kembali dengan lembaran lasagna. Ulangi proses serupa dan diakhiri dengan lembaran lasagna. Taburi sisa saus lapisan keju dan sisa keju cheddar ke atasnya.\n" +
                                "6. Panggang dalam oven panas 180° C hingga matang selama sekitar 25 menit. Keluarkan. Sajikan.",
                        R.drawable.lasagna
                )
        );

        return listResep;
    }

    public static Resep getDummyDetailResep(String id) {
        ArrayList<Resep> listResep = dummyDrama();
        Resep resep = null;

        for (int i = 0; i < listResep.size(); i++) {
            if (listResep.get(i).getId().equals(id)) {
                resep = listResep.get(i);
            }
        }

        return resep;
    }

}
