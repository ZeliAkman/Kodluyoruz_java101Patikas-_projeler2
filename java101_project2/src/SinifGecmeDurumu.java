import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        int mat, fiz,turk ,kim,muz;

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.println(" Fizik notunuzu Giriniz :");
        fiz= input.nextInt();

        System.out.println("Türkçe notunuzu Giriniz:");
        turk = input.nextInt();

        System.out.println("Kimya notunuzu Giriniz : ");
        kim = input.nextInt();

        System.out.println("Müzik notunuzu Giriniz: ");
        muz = input.nextInt();

        if (mat<0 || mat >100 )
            mat =0;

        if (fiz<0 || fiz >100 )
            fiz =0;

        if (turk<0 || turk >100 )
            turk =0;
        if (kim<0 || kim >100 )
            kim =0;
        if (muz<0 || muz >100 )
            muz =0;
        double  top = (mat+fiz+turk+kim+muz) /5;
        System.out.println("Derslerin Ortalaması :"+top);
        if(top>=55){
            System.out.println("Geçtiniz");
        }else {
            System.out.println("Notunuz geçmek için yeterli değil ");
        }


    }
}
