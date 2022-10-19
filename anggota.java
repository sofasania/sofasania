class anggota{
    private String nik, nama, alamat;
    private int saldo,pinjam;
    private double pajak;
    
    //method tanpa return dengan parameter
    anggota(String nik, String nama, String alamat){
        this.nik=nik;
        this.nama=nama;
        this.alamat=alamat;
    }
    anggota(int saldo, int pinjam, double pajak){
        this.saldo=saldo;
        this.pinjam=pinjam;
        this.pajak=pajak;
    }
    //method dengan return dan tanpa parameter
    double total (){
        //hitung
        return (saldo+(pinjam-(pinjam*pajak)));
    }
    //method tanpa parameter tanpa return
    void tampil () {
        System.out.println("NPM Anggota : "+ this.nik);
        System.out.println("Nama Anggota : "+ this.nama);  
        System.out.println("Alamat Anggota : "+ this.alamat);
    }
    void tampil2(){
         System.out.println("Sisa Saldo Anda : Rp."+ this.saldo);
         System.out.println("Jumlah yang ingin dipinjam : Rp."+ this.pinjam);
         System.out.println("Bunga Pinjaman: "+ this.pajak);
         System.out.println("Total Saldo Sekarang: Rp."+ this.total());
    }
}