# Kalkulator Tagihan Listrik

Aplikasi Kalkulator Tagihan Listrik berbasis Java yang dibuat menggunakan JavaFX sebagai antarmuka pengguna (GUI). Aplikasi ini digunakan untuk menghitung total biaya tagihan listrik berdasarkan jumlah pemakaian listrik dan tarif listrik per kWh.

## Fitur Aplikasi

- Input pemakaian listrik dalam satuan kWh.
- Input tarif listrik dalam satuan Rupiah per kWh.
- Menghitung total tagihan listrik secara otomatis.
- Menampilkan hasil perhitungan tagihan listrik.

## Cara Menjalankan Aplikasi

### 1. Clone Repository

Buka terminal atau Command Prompt, kemudian jalankan perintah berikut:

    git clone https://github.com/dafiputrag07-stack/Tugas_java.git

### 2. Masuk ke Folder Project

    cd TagihanListrik

### 3. Jalankan Aplikasi

Pastikan Java JDK dan Maven sudah terpasang di komputer.

Jalankan perintah berikut:

    mvn clean javafx:run

Tunggu hingga proses build selesai. Aplikasi Kalkulator Tagihan Listrik akan terbuka.

### 4. Menjalankan Melalui NetBeans IDE

1. Buka NetBeans IDE.
2. Pilih *File → Open Project*.
3. Pilih folder TagihanListrik hasil clone.
4. Tunggu hingga konfigurasi Maven selesai.
5. Klik kanan pada project, kemudian pilih *Run*.

## Rumus Perhitungan

Total tagihan listrik dihitung menggunakan rumus:

*Total Tagihan = Pemakaian Listrik × Tarif Listrik*

Contoh perhitungan:

- Pemakaian listrik: 150 kWh
- Tarif listrik: Rp1.444/kWh

Hasil perhitungan:

*150 × 1.444 = Rp216.600*

## Tampilan Aplikasi

Berikut merupakan tampilan antarmuka aplikasi Kalkulator Tagihan Listrik:

![Tampilan Kalkulator Tagihan Listrik](HitungListrik/Screenshoot/Screenshot (75).png)
