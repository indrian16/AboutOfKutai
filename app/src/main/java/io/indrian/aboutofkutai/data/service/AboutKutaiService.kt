package io.indrian.aboutofkutai.data.service

import io.indrian.aboutofkutai.data.model.AboutKutai
import io.reactivex.Observable
import io.reactivex.Single
import java.util.concurrent.TimeUnit

class AboutKutaiService {

    private val offlineData = listOf(
        AboutKutai(
            id = 0,
            title = "Kutai Kartanegara, Sejarah Kerajaan di Ibu Kota Baru RI",
            body = "Jakarta, CNN Indonesia -- Wilayah Kabupaten Kutai Kartanegara bersama Kabupaten Penajam Paser Utara di Kalimantan Timur terpilih sebagai ibu kota negara baru RI menggantikan DKI Jakarta.\n" +
                    "\n" +
                    "Presiden RI Joko Widodo (Jokowi) mengumumkan hal tersebut menimbang alasan lokasi yang strategis dan minim risiko bencana menjadi pertimbangan pemerintah memilih wilayah di Provinsi Kaltim tersebut.\n" +
                    "\n" +
                    "Menyebut nama Kutai Kartanegara tentu tak bisa lepas dari sejarah panjangnya dengan kerajaan besar tertua di Indonesia yakni Kerajaan Kutai Martadipura.\n" +
                    "\n" +
                    "\n" +
                    "Mengutip dari situs resmi Dinas Pariwisata Kabupaten Kutai Kartanegara, sekitar 400 tahun masehi di Kaltim terdapat kerajaan bernama Kutai Martadipura yang terletak di Muara Kaman, kawasan sungai Mahakam. \n" +
                    "\n" +
                    "Kerajaan yang didirikan Maharaja Kudungga itu disebut sebagai kerajaan tertua se-Nusantara berkat temuan prasasti Yupa dengan tulisan huruf Pallawa yang menyebutkan masa kepemimpinan Raja Mulawarman Nala Dewa. Mulawarman adalah cucu dari Maharaja Kudungga...",
            imageUrl = "https://akcdn.detik.net.id/visual/2019/08/26/e0835809-f7cb-49eb-a1f0-bfcc43b9f790_169.jpeg?w=650",
            source = "https://www.cnnindonesia.com/nasional/20190826183505-20-424791/kutai-kartanegara-sejarah-kerajaan-di-ibu-kota-baru-ri"
        ),
        AboutKutai(
            id = 1,
            title = "Pesta Adat Erau Pekan Depan, Sepekan Berikutnya TIFAF 2019",
            body = "Pesta adat Erau akan dihelat pekan depan, 8-15 September 2019. Setelah&nbsp; itu, pada 21-29 September juga akan digelar Tenggarong International Folk Arts Festival (TIFAF) memperingati HUT Kota Tenggarong ke-237.\n" +
                    "\n" +
                    " Kepala Dinas Pariwisata (Dispar) Kukar, Sri Wahyuni mengatakan, Erau pada 2019 ini berbeda pelaksanaannya dengan tahun sebelumnya. Tahun ini, dijadwalkan pembagian waktu pelaksanaannya dengan TIFAF.\n" +
                    "\n " +
                    "Ada pembagian waktu yang berbeda, Erau dilaksanakan 8-15 September. Sedangkan TIFAF dilaksanakan 21-29 September 2019,” kata Sri, Minggu (1/9) kemarin...",
            imageUrl = "https://image-korankaltim.sgp1.digitaloceanspaces.com/berita/large/bc3cf47d8a9c2919b48f1c2d37206982_4.jpg",
            source = "https://www.korankaltim.com/kaltimtara/read/25274/pesta-adat-erau-pekan-depan-sepekan-berikutnya-tifaf-2019"
        ),
        AboutKutai(
            id = 2,
            title = "Tenggarong Punya Pulau Kumala, Dijuluki Ancolnya Kutai Kartanegara",
            body = "VIVA – Kabupaten Kutai Kartanegara (Kukar), Kalimantan Timur, resmi menjadi ibu kota Republik Indonesia yang baru bersama Kabupaten Penajam Paser Utara.\n" +
                    "\n" +
                    "Tapi, tahu enggak, kalau Kukar punya lokasi wisata terkenal? Namanya Pulau Kumala. Letaknya di Tenggarong, ibu kota Kutai Kartanegara.\n" +
                    "\n" +
                    "Berdasarkan data yang diolah VIVA, Senin, 26 Agustus 2019, Pulau Kumala merupakan sebuah pulau yang terletak di delta Sungai Mahakam yang memanjang di sebelah barat Kota Tenggarong.\n" +
                    "\n" +
                    "Sedangkan, Mahakam adalah sungai sepanjang 920 kilometer di provinsi Kalimantan Timur yang juga sungai terpanjang kedua di Indonesia. Pulau Kumala memiliki luas 76 hektare, yang jika dilihat dari atas berbentuk perahu.\n" +
                    "\n" +
                    "Pulau ini awalnya hutan yang ditumbuhi aneka pohon khas Kalimantan, seperti ulin dan meranti, serta rumah bagi bekantan, monyet berhidung panjang. Pada 2000, pemerintah kabupaten mulai membangun Pulau Kumala untuk dijadikan obyek wisata.\n" +
                    "\n" +
                    "Impiannya ingin menyamai Ancol atau pun Taman Mini Indonesia Indah. Saat ini, sebagian area sudah dilengkapi dengan berbagai fasilitas seperti jet coaster hingga kereta api mini untuk mengelilingi pulau.",
            imageUrl = "https://thumb.viva.co.id/media/frontend/thumbs3/2019/08/26/5d63b7f8743ba-pulau-kumala_665_374.jpg",
            source = "https://www.viva.co.id/berita/nasional/1176648-tenggarong-punya-pulau-kumala-dijuluki-ancolnya-kutai-kartanegara"
        ),
        AboutKutai(
            id = 3,
            title = "Pesut Mahakam, Hewan Langka di Ibu Kota Baru",
            body = "Jakarta - Lokasi ibu kota negara baru telah ditentukan di sebagian Kabupaten Penajam Paser Utara dan sebagian Kabupaten Kutai Kartanegara, Kalimantan Timur. Di Kutai Kartanegara, terbentang sungai terpanjang, Sungai Mahakam. Di sana, hidup pesut yang dikenal sebagai pesut Mahakam.\n" +
                    "\n" +
                    "Pesut Mahakam memiliki nama Latin Orcaella brevirostris. Mengutip laman resmi World Wide Fund for Nature (WWF) Indonesia, pesut Mahakam merupakan satu-satunya lumba-lumba air tawar yang dimiliki Indonesia. Habitatnya ditemukan di wilayah perairan Sungai Mahakam. Untuk diketahui, di negara lain juga ada beberapa jenis pesut lainnya, seperti Orcaella fluminalister yang ada di perairan Burma dan Orcaella heinsohni yang ada di perairan Australia dan Papua Nugini.\n",
            imageUrl = "https://akcdn.detik.net.id/community/media/visual/2019/08/27/cad55405-8dd1-422c-a08b-9e87c43c5d56.jpeg?w=780&q=90",
            source = "https://news.detik.com/berita/d-4683230/pesut-mahakam-hewan-langka-di-ibu-kota-baru"
        ),
        AboutKutai(
            id = 4,
            title = "Mengenal Pesut Mahakam, Ikon Kalimantan Timur yang Terancam Punah",
            body = "TRIBUNTRAVEL.COM - Kutai Kartanegara, Kalimantan Timur menajdi satu di anatara dua lokasi yang telah dipilih oleh Presiden Joko Widodo (Jokowi) sebagai ibu kota baru.\n" +
                    "\n" +
                    "Sedangkan lokasi lain ibu kota baru adalah Penajam Paser Utara, Kalimantan Timur.\n" +
                    "\n" +
                    "Ternyata, lokasi ibu kota baru tersebut memiliki hewan langka penghuni Sungai Mahakam yang membentar di tengah Kutai Kartanegara.\n" +
                    "\n" +
                    "Dikutip TribunWow.com dari menlhk.go.id, yakni pesut Mahakam (Orcaella brevirostris), satwa identitas atau maskot Kalimantan Timur yang menjadi ikon dan daya tarik wisata...\n" +
                    "\n" +"",
            imageUrl = "https://cdn2.tstatic.net/travel/foto/bank/images/ikan-pesut.jpg",
            source = "https://travel.tribunnews.com/2019/08/28/mengenal-pesut-mahakam-ikon-kalimantan-timur-yang-terancam-punah"
        ),
        AboutKutai(
            id = 5,
            title = "Jalan-Jalan ke Ibu Kota Baru, Ini 7 Destinasi Wisata di Kutai Kartanegara",
            body = "Suara.com - Presiden Joko Widodo telah menetapkan secara resmi ibu kota baru Indonesia yang berlokasi di dua kabupaten yang ada di Kalimantan Timur, yaitu di Kabupaten Penajam Paser Utara dan sebagian Kabupaten Kutai Kartanegara.\n" +
                    "\n" +
                    "Dua kabupaten ini tentu menjadi sorotan dan membuat kita semua penasaran. Dan bukan tidak mungkin jika dua kabupaten ini akan menjadi tujuan wisata kita selanjutnya.\n" +
                    "\n" +
                    "Nah, ingin tahu potensi wisata apa saja yang bisa kita temui di sana? Berikut beberapa destinasi menarik di yang ada di Kabupaten Kutai Kartanegara, yang sudah Suara.com rangkum...",
            imageUrl = "https://media.suara.com/pictures/653x366/2019/08/27/10381-jalan-jalan-ke-ibu-kota-baru-ini-7-tempat-wisata-di-kutai-kertanegara.jpg",
            source = "https://www.suara.com/lifestyle/2019/08/27/122257/jalan-jalan-ke-ibu-kota-baru-ini-7-destinasi-wisata-di-kutai-kartanegara"
        ),
        AboutKutai(
            id = 6,
            title = "Syarat Utama Prosesi Erau, Sepasang Naga Sudah Hadir di Museum Mulawarman",
            body = "KORANKALTIM.COM, TENGGARONG -Pesta adat Erau sepekan lagi dirayakan dengan suka cita oleh masyarakat Kutai. Perayaan yang kini sudah masuk di daftar Wonderful Indonesia, agenda tahunan Kementerian Pariwisata ini, berada di Museum Mulawarman Tenggarong.\n" +
                    "Perayaan Erau tak bisa lepas dari kehadiran replika sepasang naga yang menjadi salah satu syarat utama. \n" +
                    "\n" +
                    "“Alhamdulillah sepasang naga sudah jadi sejak Sabtu lalu. Naga laki sebelah kanan sisi museum, naga yang bini sebelah kiri. Untuk ukuran naga itu sama panjangnya yaitu 16 meter dengan beda ukuran badan, yang laki itu 85 cm, yang bini 80 cm,” kata pimpinan pemborong pekerja Efendi M kepada KORANKALTIM.COM...\n" +
                    "\n",
            imageUrl = "https://image-korankaltim.sgp1.digitaloceanspaces.com/berita/large/afaaa2a0cb0c2a4452c074af31073305_10.jpg",
            source = "https://korankaltim.com/berita-terkini/read/25281/syarat-utama-prosesi-erau-sepasang-naga-sudah-hadir-di-museum-mulawarman"
        ),
        AboutKutai(
            id = 7,
            title = "Melihat Peradaban Kerajaan Kutai di Ibukota Baru",
            body = "detikTravel Community - Indonesia sedang heboh dengan pemindahan ibukota ke Kalimantan. Kembali ke tempat kejayaan kerajaan pertama di Indonesia, beginilah peradaban Kutai.\n" +
                    "\n" +
                    "Tercatat dalam sejarah sebagai kerajaan tertua di Indonesia, Tentu membuat traveler bertanya apakah peradaban Kutai itu ada? Tentu itu benar adanya dengan ditemukannya 7 yupa berhuruf palawa di Muara Kaman yang menceritakan tentang kerajaan Kutai Martadipura beserta raja-rajanya yang disepakati oleh para ahli sebagai tonggak sejarah peradaban di Indonesia. \n" +
                    "\n" +
                    "Eksistensi kerajaan di kutai ini diteruskan oleh Kesultanan Kutai Kertanegara yang berpusat di Tenggarong. Namun dua rangkaian serajah kedua kerajaan kutai tersebut dapat travelers pelajari di Museum Mulawarman yang dulunya merupakan kedaton kesultanan Kutai Kertanegara yang sebelumnya terbuat dari kayu.\n" +
                    "\n" +
                    "Kedaton kesultanan Kutai direnovasi menjadi bangunan beton sekitar tahun 1930an untuk dan menjadi pusat pemerintahan kesultanan Kutai Kertanegara. Namun setelah kesultanan Kutai Kertanegara bergabung dengan NKRI maka kedaton ini pun tidak lagi difungsikan sebagai pusat pemerintahan. \n" +
                    "\n" +
                    "Pada tanggal 25 November 1971 kedaton ini diserahkan kepada pemerintah daerah Kalimantan Timur dan kemudian dijadikan sebagai museum Mulawarman. Memasuki halaman museum, travelers dapat melihat monumen naga dan pelayaran Aji Imbud, Sultan ke-15 Kutai Kertanegara...",
            imageUrl = "https://akcdn.detik.net.id/customthumb/2019/08/02/1025/img_20190802155844_5d43fb44363da.jpg?w=600&q=90",
            source = "https://travel.detik.com/dtravelers_stories/u-4649773/melihat-peradaban-kerajaan-kutai-di-ibukota-baru"
        ),
        AboutKutai(
            id = 8,
            title = "Pesona Wisata Kutai Kartanegara",
            body = "detikTravel Community - Calon ibukota baru punya destinasi wisata yang beragam. Ini yang harus kamu tahu di Kutai Kertanegara.\n" +
                    "\n" +
                    "Sebelum dipindah ke Tenggarong, pusat kerajaan/ pemerintahan Kutai Kartanegara ada di Kutai Lama, yang merupakan cikal bakal sejarah penyebaran agama Islam di ke Kutai Kartanegara. Setidaknya ada 3 makam yang dikramatkan di Kutai Lama.\n" +
                    "\n" +
                    "1. Makam Sultan Aji Mahkota, bergelar Raja Mahkota Islam (1525-1600M), beliau adalah raja ke-VI dari Kutai Kartanegara, yang berdiri sejak tahun 1300 Masehi.\n" +
                    "2. Makam Tunggang Paranggan (pendamping Sultan/Raja) atau yang disebut-sebut sebagai seorang yang membantu mengislamkan Raja.\n" +
                    "3. Makam Aji Dilanggar (anaknya Raja Mahkota).\n" +
                    "Ke-3 makam ini hingga saat ini masih ramai dikunjungi peziarah dan juga wisatawan yang ingin mengetahui banyak tentang sejarah penyebaran agama Islam di Kutai Kartanegara.\n" +
                    "\n" +
                    "Selain mengunjungi Kutai Lama yang menjadi bagian penting dalam perhelatan Pesta Budaya Erau Adat Kutai yang setiap tahunnya digelar. ada banyak lagi objek wisata lain yang harus dikunjungi.\n" +
                    "\n" +
                    "Tidak jauh dari Keraton Kerajaan Kutai Kartanegara, terdapat Museum Mulawarman yang menyimpan koleksi-koleksi bersejarah dari abad ke-17. Tepat di depan Keraton kita bisa memanfaatkan Monumen Pancasila untuk berfoto. Monumen Pancasila ini lambang kesuksesan Pemerintah Kukar dalam pembangunan daerah.\n" +
                    "\n" +
                    "Di samping Keraton masih berdiri dengan kokohnya Masjid Jami Aji Amir Hasanoeddin, sebuah masjid tertua di Kutai Kartanegara yang dibangun tahun 1874 oleh Raja Sultan Sulaiman. Ingin mengetahui banyak lagi tentang pariwisata yang ada di Kutai Kartanegara, bisa mengunjungi Jam Bentong,Â  bangunan ini dijadikan pusat informasi apa saja yang ada di Kutai Kartanegara....",
            imageUrl = "https://akcdn.detik.net.id/customthumb/2019/08/15/1025/img_20190815205053_5d55633d75521.JPG?w=600&q=90",
            source = "https://travel.detik.com/dtravelers_stories/u-4667481/pesona-wisata-kutai-kartanegara"
        ),
        AboutKutai(
            id = 9,
            title = "Pesta Adat Erau Pekan Depan, Sepekan Berikutnya TIFAF 2019",
            body = "TENGGARONG – Prosesi Mengulur Naga dan Belimbur menjadi penutup perhelatan Erau Adat Kutai dan 6th International Folk Arts Festival (EIFAF) 2018, di Tenggarong, Kutai Kartanegara, Minggu (29/7).\n" +
                    "Prosesi Mengulur Naga merupakan ritual sakral, yang dipusatkan di Kedaton Kutai Kartanegara Ing Martadipura dan Museum Mulawarman. \n" +
                    "\n" +
                    "Setelah ritual Mengulur Naga ke Kutai Lama selesai dilakukan, Putra Mahkota Kutai AP Praboe Anoem Soerja Adiningrat memercikkan Air tuli, menandakan Belimbur dimulai. \n" +
                    "Ribuan masyarakat tumpah ruah mengikuti tradisi dengan makna membersihkan diri dari pengaruh jahat. \n" +
                    "\n" +
                    "Festival adat yang diselenggarakan sejak 21-29 Juni ini diikuti tujuh negara anggota International Council of Organizations of Folklore Festivals and Folk Art (CIOFF), seperti Hongaria, India, Turki, Polandia, Romania, Meksiko, dan tuan rumah Indonesia. \n" +
                    "\n" +
                    "EIFAF 2018  merupakan festival adat dan internasional tahun keenam yang berhasil dipadupadankan oleh Pemkab Kutai Kartanegara dengan menghadirkan delegasi kesenian internasional. Hasil kerja sama  pemangku kepentingan di Kutai Kartanegara dengan CIOFF. \n" +
                    "\n" +
                    "“Sejak awal Erau ini sudah menjadi agenda nasional. Masyarakat hadir dari daerah mana saja untuk menyaksikan upacara adat Erau,” kata Kepala Dinas Pariwisata Kutai Kartangeara, Sri Wahyuni.\n" +
                    "\n" +
                    "Keterlibatan negara asing dalam Erau bukan tanpa alasan. Pemkab Kutai Kartanegara berkeinginan agar hadirnya kelompok kesenian mancanegara itu bisa mengenalkan Indonesia, khususnya Kutai Kartanegara di mata dunia. \n" +
                    "\n" +
                    "“Banyak juga mereka yang baru pertama kali datang ke Indonesia, jadi mereka melihat Indonesia dari Kutai Kartanegara. Nah, kita lah di sini, Kutai Kartanegara menjadi Duta Wisata Indonesia,” tegasnya...",
            imageUrl = "https://image-korankaltim.sgp1.digitaloceanspaces.com/berita/large/1516f48b0931dfcb667bffbaf2272fbd_26.jpg",
            source = "https://www.korankaltim.com/edisi-cetak-hari-ini/read/18052/tradisi-belimbur-tutup-erau-adat-kutai"
        )
    )

    fun getAbouts(): Observable<List<AboutKutai>> {


        return Observable.just(offlineData)
            .delay(800, TimeUnit.MILLISECONDS)
    }

    fun getAbout(id: Int): Single<AboutKutai> {

        return Single.just(offlineData[id])
            .delay(800, TimeUnit.MILLISECONDS)
    }
}