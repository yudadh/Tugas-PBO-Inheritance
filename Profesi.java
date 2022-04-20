package com.BelajarJava.Inheritance;

public class Profesi extends Manusia{

    public void biodata(String nama, String jenkel, String umur, String tugas) {
        super.biodata(nama, jenkel, umur);
        System.out.println("Tugas :" +tugas);
    }
}
