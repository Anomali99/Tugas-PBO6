# Tugas-PBO6
Aplikasi ini adalah aplikasi java GUI yang menggunakan JDBC PostgreSQL

## Features
- Dapat melakukan insert data ke database
- Dapat melakuakan update data ke database
- Dapat melakukan delete data dari database
- Dapat menampilkan data pada database
- Dapat mencetak laporan data dari database

## Tech
- JDK 8
- NetBeans IDE 15
- PostgreSQL 14

## Installation
Buat Tabel Buku pada database PBO

```sh
create table santri (
	id_santri char (4) primary key, 
	nama varchar (30), 
	jenis_kelamin char (1),
	alamat varchar (100),
	usia int,
	no_tlp varchar (13)
);
```
=======
> Nur Fatiq (09040622071)
