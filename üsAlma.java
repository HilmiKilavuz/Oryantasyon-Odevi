public class üsAlma {
    
    public static void main(String[] args) {
        int taban = 6, kuvvet = 2;
 
        long sonuc = 1;
 
        for (;kuvvet != 0; --kuvvet)
        {
            sonuc *= taban;
        }
 
        System.out.println("CEVAP = " + sonuc);
    }
    
}
