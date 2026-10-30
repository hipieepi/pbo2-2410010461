# pbo2-2410010461
# Tugas 1

<img width="680" height="227" alt="Tugas 1 Tangkapan Layar Keluaran Program HaloPBO2" src="https://github.com/user-attachments/assets/532cdab2-95f7-475e-ae7c-8bc6cbe1982b" />
<img width="672" height="287" alt="Tugas 1 Tangkapan Layar Keluaran Program KartuMahasiswa" src="https://github.com/user-attachments/assets/57f31e3a-e4bc-405e-825f-fe271f4c1196" />
<img width="1022" height="210" alt="Tugas 1 Tangkapan Layar Hasil Perintah git log --oneline" src="https://github.com/user-attachments/assets/b9064656-197c-44b6-9b3a-2543a9a18824" />

# Tugas 2

<img width="1917" height="1020" alt="Tugas 2 Tangkapan Layar Program Skripsi dan pencarian" src="https://github.com/user-attachments/assets/6f0f6b5f-57ff-40fa-86f2-38633bb1b093" />

Pertanyaan 
1. Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error
dari kompiler dan mengapa?
2. Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi
@Override ada, dan jika dihapus?
3. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan?
4. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main
menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar?

Jawaban:
1. muncul Koleksi is abstract; cannot be instantiated karena koleksi merupakan abstract class jadi tidak bisa dibuat objek secara langsung
2. muncul method does not override or implement a method from a supertype karena method nya tidak sama dengan yang di interface, jadi Ketika override di hapus maka akan membuat method baru
3. muncul IllegalArgumentException: Judul tidak boleh kosong karena program memiliki aturan bahwa judul tidak boleh kosong
4. program bisa jalan namun melanggar enkapsulasi karena status yang seharusnya private bisa di ubah langsung dari main


# Tugas 3

<img width="1917" height="1077" alt="Tugas 3 Tangkapan Layar Design FormTiketTravel" src="https://github.com/user-attachments/assets/4ab65f0d-dc0a-4242-a7da-5944c51d66b5" />
<img width="556" height="487" alt="Tugas 3 Tangkapan Layar Mode Gelap" src="https://github.com/user-attachments/assets/64531f14-d72f-4434-a7a3-7b2685449476" />
<img width="555" height="491" alt="Tugas 3 Tangkapan Layar Mode Terang" src="https://github.com/user-attachments/assets/f2ff9fcb-e13e-4371-ac95-bf2886c40b93" />

Pertanyaan
1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing satu contoh.
2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?
3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?
4. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan
seharusnya ditulis?
5. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?

Jawaban 
1. top-level itu wadah Utama seperti Jframe, intermediate itu wadah untuk mengelompok kan komponen lain seperti Jpanel, atomic component itu komponen yang berinteraksi langsung dengan pengguna seperti Jbutton
2. karena jradiobutton digunakan jika harus memilih 1
3. jcombobox digunakan jika terdapat banyak pilihan sedangkan jradiobutton digunakan jika pilihan nya sedikit
4. karena initcomponent adalah code yang muncul jika menambahkan atau mengedit komponen pada design
5. agar form langsung menggunakan tema flatlaf saat di buat


# Tugas 4

<img width="1917" height="1078" alt="Tangkapan Layar Tugas 4 Desain" src="https://github.com/user-attachments/assets/68a00507-4e61-4111-b62c-b7f381145157" />
<img width="903" height="595" alt="Tangkapan Layar Tugas 4 Jendela Lebar" src="https://github.com/user-attachments/assets/45f997b3-479f-4176-b4ec-2b94077f4b88" />
<img width="415" height="595" alt="Tangkapan Layar Tugas 4" src="https://github.com/user-attachments/assets/a3f1ea2b-76c6-476e-b906-8b3efe01679c" />

# Eksperimen praktikum 2
1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris mana di initComponents() yang ikut berubah?
2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?
3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers diantara tombol.

Jawaban:
1. Tombol-tombol yang sebelumnya berada di sisi kiri akan berpindah ke tengah panel. Ketika ukuran jendela diperkecil, posisi tombol tetap mengikuti pengaturan Alignment Center. Baris yang ikut berubah <img width="1067" height="52" alt="Screenshot 2026-10-15 234030" src="https://github.com/user-attachments/assets/0af39266-aa07-4460-bc1a-2ff1431e55be" />
2. Pada GridLayout, nilai Rows = 0 berarti jumlah baris ditentukan secara otomatis berdasarkan jumlah komponen dan jumlah kolom yang ditentukan. Karena Columns bernilai 2 dan terdapat 9 komponen, hasilnya adalah 9 ÷ 2 = 2 baris. Jadi, 4 baris pertama berisi masing-masing 2 komponen, sedangkan baris terakhir berisi 1 komponen.
3. Lebar keempat tombol dapat melebar hingga memenuhi ruang yang tersedia karena maximumSize diatur menjadi 32767, sedangkan tingginya tetap sama dengan tinggi tombol. Penambahan Vertical Strut di antara tombol berfungsi memberikan jarak vertikal agar tombol tersusun lebih rapi dan tidak terlalu berdekatan.

# Eksperimen praktikum 4
1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?
2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa perbedaannya?
3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian mana yang rusak lebih dulu?

Jawaban:
1. Ketika jendela diperlebar, isian nama tidak ikut melebar secara maksimal karena Weight X diatur menjadi 0.0. Ruang tambahan tidak diberikan kepada kolom isian tersebut berdasarkan bobot horizontalnya.
2. Ketika jendela ditinggikan, posisi form yang sebelumnya berada di bagian atas akan berpindah ke tengah secara vertikal. Dengan demikian, form tidak lagi menempel di bagian atas isiPanel.
3. Ketika jendela diperkecil sekecil mungkin, bagian form akan rusak lebih dulu karena ruang untuk Label dan isian menjadi terlalu sempit. Komponen bisa saling berdekatan, teks terpotong, atau Text Field menjadi terlalu kecil sehingga sulit digunakan.

<img width="1036" height="1280" alt="Foto Sketsa FormAnggotaPerpustakaan" src="https://github.com/user-attachments/assets/cd200057-4655-49ff-b0ca-dff01c3a9b1a" />
<img width="812" height="217" alt="Screenshot 2026-10-16 001710" src="https://github.com/user-attachments/assets/c11abf3e-4b8c-4dd0-add4-7e3a881a2c7b" />

# Penilaian Tahap 4 dari Putri Sal Sabila 2410010086
| No | Pemeriksaan | Ya atau Belum | Keterangan |
|---:|---|:---:|---|
| 1 | Label singkat, jelas, dan sejajar | Ya | Label jelas dan kolom isian tersusun sejajar. |
| 2 | Isian dikelompokkan dengan judul bagian | Ya | Form dibagi menjadi bagian Data Anggota dan Kontak. |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya | Kolom email dan nomor HP memiliki placeholder. |
| 4 | Komponen sesuai jenis data | Ya | Komponen yang digunakan sesuai dengan jenis isian. |
| 5 | Tombol utama menonjol dan berada di kanan bawah | Ya | Tombol Daftar berada di kanan bawah dan mudah ditemukan. |
| 6 | Jarak antar komponen konsisten | Ya | Jarak antar komponen terlihat cukup rapi. |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Belum | Radio button bertumpuk dan keterangan header terpotong saat jendela dikecilkan. |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya | Form menggunakan JFrame dan beberapa Layout Manager. |

Saran Perbaikan
Susunan radio button Dosen, Mahasiswa, dan Umum perlu diperbaiki agar tidak bertumpuk saat jendela dikecilkan. Selain itu, posisi judul dan keterangan header perlu dirapikan supaya tidak terpotong ketika ukuran jendela berubah.

Pertanyaan Refleksi
1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?
2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.
3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?
4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?
5. Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.

Jawaban:
1. Karena posisi dan ukuran komponen harus diatur secara manual. Akibatnya, tampilan bisa berantakan ketika ukuran jendela berubah atau program dijalankan pada layar yang berbeda.
2. FlowLayout menyusun komponen secara berurutan dan dapat memindahkan komponen ke baris berikutnya jika ruang tidak cukup. GridLayout menyusun komponen dalam baris dan kolom dengan ukuran sel yang sama, sehingga ukuran komponen menyesuaikan ukuran jendela.
3. Weight X mengatur pembagian ruang tambahan secara horizontal, sedangkan Fill menentukan apakah komponen mengisi ruang yang tersedia. Jika Fill diatur ke Horizontal, komponen dapat melebar ke arah samping.
4. Agar form tetap berada di bagian atas dan tidak berpindah ke tengah ketika jendela diperbesar. Dengan demikian, tampilan form lebih teratur dan mudah digunakan.
5. Konsistensi: Label dan kolom isian disusun secara sejajar sehingga tampilan form terlihat seragam.
Kerapian dan kemudahan penggunaan: Jarak antar komponen diatur menggunakan Insets agar form mudah dibaca dan digunakan.

# Tugas 5

| No | Tindakan | Event yang Tercatat |
|---:|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | MouseEvent ("Kursor masuk ke tombol" dan "Kursor keluar dari tombol") |
| 2 | Klik tombol Klik Saya | ActionEvent ("Tombol diklik") |
| 3 | Centang lalu hapus centang Aktifkan Fitur | ItemEvent ("Kotak dicentang" dan "Centang dihapus") |
| 4 | Ganti pilihan dari Pagi menjadi Malam | ItemEvent ("Memilih malam") |
| 5 | Klik isian, lalu ketik kata "abc" | KeyEvent ("Isian mendapat focus", "Mengetik huruf a", "Mengetik huruf b", "Mengetik huruf c") |
| 6 | Klik tombol setelah mengetik di isian | FocusEvent ("Isian kehilangan focus") |

# Eksperimen praktikum 3
1. Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
pilihan diganti?
2. Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter?
3. Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
Output?

Jawaban:
1.	Pesan "item berubah" tercetak 2 kali setiap pilihan Combo Box diganti. Hal ini karena itemStateChanged dipanggil dua kali, yaitu saat pilihan lama mengalami DESELECTED dan pilihan baru mengalami SELECTED. Pemeriksaan ItemEvent.SELECTED digunakan agar aksi hanya dijalankan satu kali.
2.	Karena event keyPressed dijalankan saat tombol keyboard ditekan, sebelum karakter dimasukkan ke dalam celsiusField. Akibatnya, method konversi() membaca nilai isian sebelumnya sehingga hasil konversi terlambat satu karakter. Sebaliknya, keyReleased dijalankan setelah tombol dilepas sehingga karakter sudah masuk ke dalam isian.
3.	Akan muncul pesan error berupa NumberFormatException di jendela Output karena huruf yang dimasukkan tidak dapat dikonversi menjadi angka oleh Double.parseDouble(). Tanpa blok try-catch, kesalahan tersebut tidak ditangani sehingga proses konversi berhenti dan hasil tidak diperbarui dengan pesan validasi.


# Eksperimen praktikum 4
1. Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
tombol sebaiknya hanya memakai satu cara?
2. Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source?
3. Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama?

Jawaban:
1.	Pesan kali tercetak sebanyak 2 kali setiap tombol kali ditekan, karena terdapat dua event handler yang dijalankan: satu dari lambda di konstruktor dan satu lagi dari event actionPerformed yang dibuat melalui tab Events.
Satu tombol sebaiknya hanya menggunakan satu cara penanganan event agar kode tidak dijalankan dua kali, menghindari proses ganda, dan lebih mudah dipelihara.
2.	Pada tab Design, tambahkan tombol baru dengan teks % dan atur nama variabelnya menjadi modulusButton. Sesuaikan layout agar tombol tersebut sejajar dengan tombol operator lainnya.
Pada tab Source, tambahkan event untuk tombol modulus dan tambahkan operasi % pada metode hitung() di bagian switch: modulusButton.addActionListener(e -> hitung('%'));
Tambahkan kode berikut pada switch: case '%' -> a % b;
3.	Karena method hapus() menjalankan perintah: angka1Field.requestFocusInWindow();
Perintah tersebut memberikan fokus kembali ke angka1Field setelah kedua isian dikosongkan. Dengan begitu, pengguna dapat langsung memasukkan angka pertama tanpa perlu mengeklik kolom tersebut secara manual.

# Peta Event

| Komponen | Menu Events | Fungsi |
|---|---|---|
| `setujuCheck` | Item: `itemStateChanged` | Mengaktifkan `daftarButton` hanya jika `setujuCheck` dicentang. |
| `batalButton` | Action: `actionPerformed` | Mengosongkan semua isian, menghapus pilihan jenis anggota, mengatur ulang label jumlah digit, dan mengembalikan fokus ke `npmField`. |
| `daftarButton` | Action: `actionPerformed` | Menampilkan ringkasan data anggota menggunakan `JOptionPane`. |
| `npmField` | Key: `keyReleased` | Memperbarui teks `jumlahDigitLabel` sesuai jumlah karakter NPM yang diketik. |
| `FormAnggotaPerpustakaan` (JFrame) | Window: `windowClosing` | Meminta konfirmasi sebelum aplikasi ditutup. |

<img width="327" height="147" alt="Screenshot 2026-10-24 115925" src="https://github.com/user-attachments/assets/2486475b-444b-4751-94e2-bea0c9023942" />
<img width="328" height="277" alt="Screenshot 2026-10-24 115901" src="https://github.com/user-attachments/assets/8113265a-217f-49d2-a73d-85368632c94c" />
<img width="1917" height="1020" alt="Screenshot 2026-10-24 115736" src="https://github.com/user-attachments/assets/4a95b4c8-9c01-4f2d-8db0-b2f5d007d098" />

# Tugas 6
# Eksperimen praktikum 4
1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?
2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?
3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?
4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?
5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?
6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

Jawaban : 
1. muncul pesan "NPM harus berisi 10 digit angka". Huruf tidak bisa dimasukkan ke kolom NPM karena kolom tersebut hanya menerima angka.
   Kode if (!Character.isDigit(evt.getKeyChar()) || penuh) {
    evt.consume();
}
3. Pesan kesalahan muncul saat menekan Tab dan berpindah dari kolom email karena format email yang dimasukkan belum benar.
4. Karena kolom Nama masih kosong. Sistem hanya memeriksa nama saat kolom sudah diisi. Jika kosong, pemeriksaan dilakukan ketika tombol Daftar diklik.
5. Kolom NPM mendapat fokus terlebih dahulu karena NPM merupakan kolom pertama yang diperiksa dan masih kosong.
6. Fokus berpindah ke kolom Nama Lengkap karena huruf N ditetapkan sebagai mnemonic pada label Nama. Fitur ini diatur menggunakan properti displayedMnemonic pada label Nama dan labelFor yang menghubungkannya ke kolom Nama.
7. Ya, data tetap ada karena memilih No berarti membatalkan pengosongan form. Data baru dihapus jika pengguna memilih Yes.


# Hasil Evaluasi Heuristik Nielsen

Evaluasi dilakukan menggunakan 10 prinsip heuristik Nielsen untuk mengidentifikasi masalah pada aplikasi form pendaftaran serta memberikan saran perbaikan.

## Tabel Hasil Evaluasi

| No | Heuristik | Temuan | Skor (0-4) | Saran |
|---|---|---|:---:|---|
| 1 | Visibilitas Status Sistem | Ringkasan pendaftaran berhasil hanya menampilkan NPM, Nama, dan Jenis Anggota. Informasi Program Studi, Email, dan Nomor HP belum ditampilkan. | 2 | Lengkapi ringkasan dengan informasi pendaftaran yang diperlukan. |
| 2 | Kesesuaian dengan Dunia Nyata | Tidak ditemukan masalah pada penggunaan istilah dan bahasa dalam form. | 0 | Tidak ada. |
| 3 | Kendali dan Kebebasan Pengguna | Tidak ditemukan masalah yang dilaporkan terkait pembatalan atau pengembalian tindakan pengguna. | 0 | Tidak ada. |
| 4 | Konsistensi dan Standar | Teks pada kolom Email dan Nomor HP tetap berwarna abu-abu seperti placeholder meskipun sudah diketik. | 2 | Gunakan warna teks normal ketika kolom sudah berisi input. |
| 5 | Pencegahan Kesalahan | Combo box Program Studi tidak memiliki pilihan awal "Pilih program studi". Selain itu, ketika berpindah pilihan dari Sistem Informasi ke Teknik Informatika, muncul pesan "Pilih salah satu program studi". | 3 | Tambahkan pilihan awal dan perbaiki validasi agar pilihan program studi yang valid tidak dianggap kosong. |
| 6 | Mengenali, Bukan Mengingat | Tidak ditemukan masalah yang dilaporkan terkait kebutuhan pengguna untuk mengingat informasi saat mengisi form. | 0 | Tidak ada. |
| 7 | Fleksibilitas dan Efisiensi | `npmLabel` belum terhubung dengan `npmField` melalui properti `labelFor`, sehingga Alt+P tidak mengarahkan fokus ke kolom NPM. | 2 | Hubungkan `npmLabel` dengan `npmField` dan atur mnemonic yang sesuai. |
| 8 | Desain Estetis dan Minimalis | Tidak ditemukan masalah tampilan yang dilaporkan selain warna teks Email dan Nomor HP. | 0 | Tidak ada. |
| 9 | Membantu Memperbaiki Kesalahan | Pengujian validasi NPM, Nama, Email, dan Nomor HP menunjukkan pesan kesalahan sesuai dengan kondisi input yang diuji. | 0 | Tidak ada. |
| 10 | Bantuan dan Dokumentasi | Tidak ditemukan masalah yang dilaporkan terkait petunjuk atau bantuan penggunaan form. | 0 | Tidak ada. |


## Skala Penilaian Tingkat Keparahan Masalah

| Skor | Tingkat | Arti |
|:---:|---|---|
| 0 | Bukan Masalah | Tidak mengganggu kegunaan aplikasi. |
| 1 | Kosmetik | Masalah tampilan yang diperbaiki jika ada waktu. |
| 2 | Minor | Sedikit memperlambat pengguna dalam menggunakan aplikasi. |
| 3 | Mayor | Pengguna sering gagal atau bingung, sehingga perlu segera diperbaiki. |
| 4 | Kritis | Tugas tidak dapat diselesaikan dan wajib diperbaiki. |

Nama peninjau: Putri Sal Sabila       Nama pemilik form: Elvira Eri Saputri
<img width="1917" height="1078" alt="image" src="https://github.com/user-attachments/assets/77ca08e9-a4a8-4a8d-83ad-03046d67a825" />

<img width="485" height="777" alt="image" src="https://github.com/user-attachments/assets/eb353b29-1674-4aef-927a-78fcec012865" />

# Tabel Temuan Peer Review dan Perbaikan

| No. | Temuan dari Teman | Perbaikan yang Dilakukan | Commit |
|---|---|---|---|
| 1 | Ringkasan pendaftaran hanya menampilkan NPM, Nama, dan Jenis Anggota. | Menambahkan informasi Program Studi, Email, dan Nomor HP pada ringkasan pendaftaran. | `fix: Perbaikan dari peer preview heuristik` |
| 2 | Teks pada kolom Email dan Nomor HP tetap berwarna abu-abu setelah diketik. | Memperbaiki warna teks agar menggunakan warna normal ketika kolom diisi. | `fix: Perbaikan dari peer preview heuristik` |
| 3 | ComboBox Program Studi tidak memiliki pilihan awal dan validasi terkadang menganggap pilihan valid sebagai kosong. | Menambahkan pilihan awal "Pilih program studi" dan memperbaiki validasi ComboBox. | `fix: Perbaikan dari peer preview heuristik` |
| 4 | Mnemonic NPM tidak berfungsi ketika menekan Alt+P. | Menghubungkan label NPM dengan kolom input dan memperbaiki fungsi pintasan keyboard. | `fix: Perbaikan dari peer preview heuristik` |
