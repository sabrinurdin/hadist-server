package com.example.repository

import com.example.model.Comment
import com.example.model.Hadist

class HadistRepositoryImp : HadistRepository {
    override val hadist= listOf(
        Hadist(
            id_hadis = 1,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Berbakti Kepada Orang tua",
            komentar = listOf(
                Comment(
                    id_hadis = 1,
                    id_forum = 1,
                    nama = "Sabri Nurdin",
                    komentar = "Alhamdulillah,tetap berbakti Allah",
                    waktu = "07.00 AM"

                ),
                Comment(
                    id_hadis = 2,
                    id_forum = 2,
                    nama = "Aqmal Nurdin",
                    komentar = "Alhamdulillah,tetap berbakti kepada orang tua",
                    waktu = "07.00 AM"

                ),
                Comment(
                    id_hadis = 3,
                    id_forum = 3,
                    nama = "Ayyuni Salsabilah",
                    komentar = "Alhamdulillah,tetap berbakti kepada orang tua",
                    waktu = "07.00 AM"

                ),
            )
        ),
        Hadist(
            id_hadis = 2,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Berbakti Kepada Orang Saudara",
            komentar = listOf(
                Comment(
                    id_hadis = 1,
                    id_forum = 1,
                    nama = "Nurdin",
                    komentar = "Alhamdulillah,tetap berbakti Allah",
                    waktu = "07.00 AM"

                ),
                Comment(
                    id_hadis = 2,
                    id_forum = 2,
                    nama = "Maryam",
                    komentar = "Alhamdulillah,tetap berbakti kepada orang tua",
                    waktu = "07.00 AM"

                ),
            )
        ),
        Hadist(
            id_hadis = 3,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Berbakti Kepada Kakek Nenek"
        ),
        Hadist(
            id_hadis = 4,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Berbakti Kepada Guru"
        ),

        Hadist(
            id_hadis = 5,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "kewajiban Berkurban"
        ),

        Hadist(
            id_hadis = 6,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "kewajiban Berpuasa"
        ),
        Hadist(
            id_hadis = 7,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Keutamaan Bersedekah"
        ),
        Hadist(
            id_hadis = 8,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Keutamaan Salat Tahajjud"
        ),
        Hadist(
            id_hadis = 9,
            artinya = "Artinya: Siapa yang suka untuk dipanjangkan umur dan ditambahkan rizki, maka berbaktilah pada orang tua dan sambunglah tali silaturahmi (dengan kerabat).(HR Ahmad).",
            hadis = " مَنْ أَحَبَّ أَنْ يُمَدَّ لَهُ فِي عُمْرِهِ وَأَنْ يُزَادَ لَهُ فِي رِزْقِهِ فَلْيَبَرَّ وَالِدَيْهِ وَلْيَصِلْ رَحِمَه",
            nomor= "1000",
            riwayat= "Keutamaan Salat Dhuha"
        )



    )


    override suspend fun getAllHadist(): List<Hadist> {
        return hadist
    }
}