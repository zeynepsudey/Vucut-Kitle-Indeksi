import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        double boy;
        double kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinde giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextDouble();

        double index = (kg / (boy * boy));

        System.out.println("Vücut kitle indeksiniz : " + index);
    }
}
