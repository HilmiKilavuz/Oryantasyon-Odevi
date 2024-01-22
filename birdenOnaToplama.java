public class birdenOnaToplama {
    public static void main(String[] args) {
        int sayi = 10, toplam = 0;
     
        for(int i = 1; i <= sayi; ++i)
        {
            // toplam = toplam + i;
            toplam += i;
        }
        System.out.println("Toplam = " + toplam);
      }
    
}
