package com.BelajarJava.Inheritance;

public class Dokter extends Profesi{

    public void biodata(String nama, String jenkel, String umur, String tugas, String pekerjaan) {
        super.biodata(nama, jenkel, umur, tugas);
        System.out.println("Pekerjaan :" +pekerjaan);
    }
}
//menambahkan comment
