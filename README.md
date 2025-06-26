# Aplikasi Kamen Rider Fandom (Submission Dicoding)

---

**Deskripsi Proyek:**

Aplikasi ini dibuat sebagai tugas akhir (submission) untuk kelas **"Belajar Membuat Aplikasi Android untuk Pemula"** di Dicoding. Proyek ini bertujuan untuk menerapkan konsep-konsep dasar pengembangan Android, seperti `Activity`, `Intent`, `View & ViewGroup`, `Style & Theme`, serta penggunaan `RecyclerView` untuk menampilkan data secara efisien.

---

**Fitur Utama:**

Aplikasi ini dirancang sebagai katalog sederhana untuk para penggemar serial Kamen Rider. Fitur-fitur yang tersedia meliputi:

* **Splash Screen:** Layar pembuka yang muncul saat aplikasi pertama kali dijalankan.
* **Daftar Pahlawan:** Menampilkan semua Kamen Rider dalam daftar vertikal yang dapat di-scroll, menggunakan `RecyclerView`.
* **Tampilan Ganda:** Memberikan opsi kepada pengguna untuk mengubah tampilan dari format `List` menjadi format `Grid` melalui menu di pojok kanan atas.
* **Halaman Detail:** Menyajikan informasi yang lebih rinci untuk setiap Kamen Rider yang dipilih, termasuk gambar yang lebih besar dan deskripsi lengkap.
* **Halaman Profil:** Halaman "About" sederhana yang berisi informasi tentang pembuat aplikasi.

---

**Tampilan Antarmuka (UI):**

Berikut adalah gambaran umum tampilan antarmuka aplikasi:

1.  **Tampilan Daftar (List View)**
    * Halaman utama yang menampilkan daftar Kamen Rider secara vertikal.
    * Setiap item menampilkan gambar, nama, dan peran Rider.
    * ![Tampilan Daftar](https://raw.githubusercontent.com/MENSTRUE/First_Android_Dicoding/main/img/list.jpg)

2.  **Tampilan Kotak (Grid View)**
    * Tampilan alternatif yang menampilkan daftar Kamen Rider dalam format grid 2 kolom.
    * Dapat diakses melalui opsi "Grid" pada menu.
    * ![Tampilan Kotak](https://raw.githubusercontent.com/MENSTRUE/First_Android_Dicoding/main/img/grid.jpg)

3.  **Opsi Menu**
    * Menu di `ActionBar` yang berisi navigasi untuk mengubah layout (`List`/`Grid`) dan untuk mengakses halaman `About`.
    * ![Opsi Menu](https://raw.githubusercontent.com/MENSTRUE/First_Android_Dicoding/main/img/menu.jpg)

4.  **Halaman Detail**
    * Muncul ketika salah satu item Rider di klik.
    * Menampilkan gambar besar di bagian atas, diikuti oleh nama dan deskripsi lengkap dari Rider tersebut.
    * ![Halaman Detail](https://raw.githubusercontent.com/MENSTRUE/First_Android_Dicoding/main/img/detail.jpg)

5.  **Halaman Profil**
    * Menampilkan foto, nama, dan email dari pembuat aplikasi.
    * Diakses melalui opsi "About" pada menu.
    * ![Halaman Profil](https://raw.githubusercontent.com/MENSTRUE/First_Android_Dicoding/main/img/about.jpg)

---

**Teknologi yang Digunakan:**

* **Bahasa:** Kotlin
* **Arsitektur UI:** XML (Extensible Markup Language)
* **IDE:** Android Studio
* **Komponen Utama:**
    * `RecyclerView`
    * `CardView`
    * `Intent` (Eksplisit & Implisit)
    * `ImageView` & `TextView`
    * `Menu` & `ActionBar`

---

**Cara Menjalankan Aplikasi:**

Untuk menjalankan proyek ini di lingkungan lokal Anda, ikuti langkah-langkah berikut:

1.  **Prasyarat:**
    * Pastikan Anda telah menginstal versi terbaru **Android Studio**.

2.  **Clone Repositori:**
    * Buka terminal atau command prompt Anda.
    * Jalankan perintah berikut untuk meng-clone repositori:
        ```bash
        git clone [https://github.com/MENSTRUE/First_Android_Dicoding.git](https://github.com/MENSTRUE/First_Android_Dicoding.git)
        ```

3.  **Buka di Android Studio:**
    * Buka aplikasi Android Studio.
    * Pilih `File` > `Open`, lalu arahkan ke folder proyek yang baru saja Anda clone.

4.  **Build dan Jalankan:**
    * Tunggu hingga Android Studio selesai melakukan sinkronisasi Gradle.
    * Klik tombol `Run 'app'` (ikon panah hijau) untuk membangun dan menjalankan aplikasi di emulator atau perangkat Android fisik.

---

**Pembuat:**

* **Nama:** Wafa bila syaefurokhman
* **Email:** menstruesalvation@gmail.com
* **GitHub:** [@MENSTRUE](https://github.com/MENSTRUE)

**Sertifikat Kelulusan:**

* [Lihat Sertifikat di Dicoding](https://www.dicoding.com/certificates/1OP82YD41PQK)
