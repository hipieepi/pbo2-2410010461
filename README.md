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

Eksperimen praktikum 2
1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris mana di initComponents() yang ikut berubah?
2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?
3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers diantara tombol.

Jawaban:
1. Tombol-tombol yang sebelumnya berada di sisi kiri akan berpindah ke tengah panel. Ketika ukuran jendela diperkecil, posisi tombol tetap mengikuti pengaturan Alignment Center. Baris yang ikut berubah <img width="1067" height="52" alt="Screenshot 2026-10-15 234030" src="https://github.com/user-attachments/assets/0af39266-aa07-4460-bc1a-2ff1431e55be" />
2. Pada GridLayout, nilai Rows = 0 berarti jumlah baris ditentukan secara otomatis berdasarkan jumlah komponen dan jumlah kolom yang ditentukan. Karena Columns bernilai 2 dan terdapat 9 komponen, hasilnya adalah 9 ÷ 2 = 2 baris. Jadi, 4 baris pertama berisi masing-masing 2 komponen, sedangkan baris terakhir berisi 1 komponen.
3. Lebar keempat tombol dapat melebar hingga memenuhi ruang yang tersedia karena maximumSize diatur menjadi 32767, sedangkan tingginya tetap sama dengan tinggi tombol. Penambahan Vertical Strut di antara tombol berfungsi memberikan jarak vertikal agar tombol tersusun lebih rapi dan tidak terlalu berdekatan.

Eksperimen praktikum 4
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
<img width="782" height="767" alt="Tabel Penilaian Tahap 4" src="https://github.com/user-attachments/assets/02d881ca-7fca-4f2f-b672-945a3980e17e" />

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
