import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullanici , sifre ;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        kullanici =input.nextLine();

        System.out.println("Şifrenizi giriniz : ");
        sifre = input.nextLine();

        if(kullanici.equals("zeli") && sifre.equals("72bat")){
            System.out.println("Giriş Başarılı ");
        }else{
            System.out.println("Hatalı giriş yaptınız , şifrenizi sıfırlamak istermisiniz ?  yeni sifre belirtmek isterseniz yes seçeneğini   istemezseniz no seçeneğini   seciniz ");
             String sifresifirla = input.nextLine();

             if (sifresifirla.equals("no")){
                 System.out.println("İşlem Sona Ermiştir");
             }else if (sifresifirla.equals("yes")){
                 System.out.println("Yeni Şifrenizi Belirleyin Lütfen !");
                 String yeniSifre = input.nextLine();
                 if (yeniSifre.equals("72bat") || yeniSifre.equals(sifre)){
                     System.out.println("Hatalı giriş tekrardan dene");

                 }else {
                     System.out.println("Şifreniz yenilendi.");
                 }

             }

        }
    }
}


// equals : Yani kısaca (==) operatörü 2 nesnenin referans değerlerini karşılaştırırken Equals() methodu sadece içeriği karşılaştırır.