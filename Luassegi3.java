package prakpert6_hitungluassegi3;

/**
 *
 * @author Eka 20103295
 */
public class Luassegi3 {
   
   /*
    rumus luas segi 3 = Alas * Tinggi * 0.5
    tipe data luas = float/double
    tipe tinggi = float/double
    tipe alas = float/double
    */ 
    private float alas; // jika ingin private isi sifat private di depan sebelum tipe data
    private float tinggi; // jika private tidak dapat diakses di luar kelas (selain di kelas Luassegi3)
    double Luas;
    
    //konstraktor (jadi tidak perlu memanggil segi3.Luassegi3() di class parakpert_Hitungluassegi3
    //konstrktor bisa menggunakan parameter ataupun tidak 
    public Luassegi3 (float AL, float TG){
        this.setALAS(AL);
        this.setTINGGI(TG);
        
    }
    
    /*
    Method setALAS
    parameter : float AL
    tujuan : untuk set (mengambil) nilai ke property/Atribut alas
    */
    public void setALAS(float AL) { //jika sifatnya public maka dapat diakses di luar kelas
        this.alas = AL;
    }
    
    /*
    Method setTINGGI
    parameter : float TG
    tujuan : untuk set (mengambil) nilai ke property/Atribut tinggi
    */
    public void setTINGGI(float TG){
        this.tinggi = TG;
    }
    
    /*
    Method HitungLuas
    parameter : -
    tujuan : di gunakan untuk menghitung luas segi 3
    */
    private double HitungLuas(){ 
        this.Luas = 0.5 * this.alas * this.tinggi;
        return this.Luas;
    }
    
    public void TampilkanLuas(){
        
      //perlu diisi karena hitung luas bersifat private (harus di panggil)  
      this.HitungLuas(); 
      
      //untuk menampilkan output
      System.out.println("Hitung Luas Segi Tiga");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Nilai Alas  : "+this.alas+" cm");
      System.out.println("Nilai Tinggi  : "+this.tinggi+" cm");
      System.out.println("Nilai Luas  : "+this.Luas+" cm²");
        
    }
}
