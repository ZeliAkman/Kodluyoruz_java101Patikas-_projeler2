import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;
        double c;

        System.out.println("Birinci sayıyı giriniz: ");
        a = input.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");
        b = input.nextInt();

        System.out.println("Yapılabilecek işlemler : ");
        System.out.println("1) Toplama işlemi \n 2) Çıkarma İşlemi \n 3)Çarpma işlemi \n 4) Bölme işlemi");
        System.out.println("Seçiniz");
        int sec = input.nextInt();


        // with if-else

      /*  if(sec == 1){
            c =(a+b);
            System.out.println("Toplama İşleminin sonucu : "+ c);
        } else if (sec == 2) {
            c= (a-b);
            System.out.println("Çıkarma İşleminin sonucu : "+ c);
        }else if (sec == 3) {
            c= (a*b);
            System.out.println("Çarpma İşleminin sonucu : "+ c);
        }else if (sec == 4) {
            c= (a/b);
            System.out.println("Bölme İşleminin sonucu : "+ c);
        } else{
            System.out.println("Geçersiz işlem Yaptıınız");
        } */

        // with switch case

        switch (sec) {
            case 1:
                c = (a + b);
                System.out.println("Toplama İşleminin sonucu : " + c);
                break;

            case 2:
                c = (a - b);
                System.out.println("Çıkarma İşleminin sonucu : " + c);
                break;
            case 3:

                c = (a * b);
                System.out.println("Çarpma İşleminin sonucu : " + c);
                break;
            case 4:
                c= (a/b);
                System.out.println("Bölme İşleminin sonucu : "+ c);
                break;

            default:
                System.out.println("Geçersiz işlem Yaptıınız");
        }

    }
}
