import java.util.Scanner;

    public class Main {
       public static void main(String[] args) {
         int derece;
         //Kullanıcı veri girişi
         Scanner input = new Scanner(System.in);
         System.out.println("Hava sıcaklığını giriniz : ");
         derece = input.nextInt();

         // Derecelere göre etkinlik önerileri
         if(derece < 5){
             System.out.println("Kayak yapabilirsiniz.");
         } else if (derece <= 15){
             System.out.println("Sinemaya gidebilirsiniz.");
         } else if (derece <= 25) {
             System.out.println("Pikniğe gidebilirsiniz.");
         } else {
             System.out.println("Yüzmeye gidebilirsiniz.");
           }
    }
}