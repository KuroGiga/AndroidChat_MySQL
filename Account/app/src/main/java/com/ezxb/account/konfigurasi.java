package com.ezxb.account;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA

    /**
     *
     * Make Your Code EZY
     * Visit My WEB : https://ezxb.com
     * Owner : https://github.com/KuroGiga
     *
     * */

    public static final String URL_ADD="http://192.168.100.209/andro/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.100.209/andro/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.100.209/andro/tampilPgw.php?id=";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_PESAN = "pesan"; //desg itu variabel untuk posisi

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_PESAN = "pesan";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";

}
