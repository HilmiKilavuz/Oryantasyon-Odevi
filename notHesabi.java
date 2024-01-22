
import java.util.Scanner;
public class notHesabi {
   
public static void main(String[] args) {
  Scanner input =new Scanner(System.in);
  System.out.println("Ders notunuzu girniz.");
  double not = input.nextInt(); 
if(not<0)
{
System.out.println("HATALI NOT");
}
else if(not<50)
{
System.out.println("KALDI(1)");
}
else if (not < 60)
{
System.out.println("GEÇER(2)");
}
else if (not < 70)
{
System.out.println("ORTA(3)");
}
else if (not < 85)
{
System.out.println("İYİ(4)");
}
else if (not <= 100)
{
System.out.println("PEKİYİ(5)");
}
 
}
    
}
