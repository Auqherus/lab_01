import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Formularz");
        System.out.println();
        System.out.print("Podaj imie :" + " ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko :" + " ");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek :" + " ");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr indeksu :" +" ");
        int indeks = scan.nextInt();

        System.out.println();
        System.out.println("Wynik formularzu");
        System.out.println();
        System.out.println("Imię :" + " " +imie);
        System.out.println("Nazwisko :"+ " "+nazwisko);
        System.out.println("Wiek :" +" "+wiek);
        System.out.println("Nr indeksu : "+" "+indeks);

    }
}
