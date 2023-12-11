import java.util.Scanner;

public class CharacterizedString {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ketik kata/kalimat, lalu tekan enter : ");
        String str = scanner.nextLine();
        System.out.println("======================");
        System.out.println("String penuh: " + str);
        System.out.println("======================");
        System.out.println("process memecahkan kata/kalimat menjadi karakter.....................");
        System.out.println("Done.");
        System.out.println("======================");
        // Loop through the string and print out each character and its position
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Karakter[" + (i + 1) + "]: " + str.charAt(i));
        }
        scanner.close();
    }
}
