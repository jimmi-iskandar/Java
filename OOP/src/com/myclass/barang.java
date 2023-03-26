package com.myclass;


     //class barang
 public class barang {
    //property / attribute
    public String nama_barang;
    public int harga_barang,Stock_barang;

    //method
    public void tambah_stock(int jmltambah){
        Stock_barang += jmltambah;
        System.out.println("stock barang berhasil ditambah : "+ jmltambah+" menjadi : " + Stock_barang + "\n");
    }
    public void kurang_stock(int jmlkurang){
        Stock_barang -= jmlkurang;
        System.out.println("Stock barang berhasil dikurangi : "+ jmlkurang + " menjadi : "+ Stock_barang + "\n");
    }
}

