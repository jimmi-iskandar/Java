package com.program;


import com.myclass.barang;

public class main {

   
    public static void main(String[] args) throws Exception {
        //instansiasi barang
        barang barang1 = new barang();
        barang1.nama_barang= "Shampoo";
        barang1.harga_barang= 500;
        barang1.Stock_barang= 100;


        barang1.tambah_stock(5);

        barang1.kurang_stock(10);


        System.out.println("Stock tersedia : "+ barang1.cekStock());

        barang1.infobarang();
    }
}
