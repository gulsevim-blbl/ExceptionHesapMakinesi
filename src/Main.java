
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Iki sayi da cok buyuk. Lutfen daha kucuk sayilar girin....");

    }
    
    
}

public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama Islemi\n"
                          +"2. Cikarma Islemi\n"
                          +"3. Carpma Islemi\n"
                          +"4. Bolme Islemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("Islemi Seciniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
        switch(islem){
            case "1":
                System.out.print("Birinci Sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamlari : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Farklari : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi: ");
                b = scanner.nextInt();
                if (a > 10000 && b > 10000) {
                    throw new CarpmaException();
                    
                }
                System.out.println("Girilen Degerlerin Carpimlari : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Sayi: ");
                a = scanner.nextInt();
                System.out.print("Ikinci Sayi: ");
                b = scanner.nextInt();
                System.out.println("Girilen Degerlerin Bolumu : " + (a / b));
                break;
            default:
                System.out.println("Gecersiz Islem");
                

            
            
            
        }
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayi 0'a bolunemez...");
        }
        catch(InputMismatchException e) {
            System.out.println("Lutfen Inputlari Dogru Formatta Girin...");
        } catch (CarpmaException ex) {
            ex.printStackTrace();
            
        }

    }
}
