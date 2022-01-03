import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner sc = new Scanner(System.in);



   System.out.print("Podaj wiek :" +" ");
        double age = sc.nextInt();



       /*
       //zad 1//
        int calc = age%3;
        if(calc == 0){
            System.out.println("Wiek podzielny przez 3!");
        }
        else {
            System.out.println("Wiek niepodzielny przez 3!");
        }
        */

       /* //zad 2//
        String calc;

        System.out.println(calc = age%2 == 0 ? "Numer indeksu jest parzysty!" : "Numer indeksu nie jest parzysty!");
        */

        //zad 3//

        if (age >=0 && age%2 == 0){
            System.out.println("Liczba :"+" "+age+" "+ "jest liczbą dodatnią i parzysta!");
        }
        else if(age <=0 && age%2 == 0) {
            System.out.println("Liczba :"+" "+age+" "+"jest ujemna i parzysta!");
        }
        else if(age >=0 && age%2 != 0) {
            System.out.println("Liczba :"+" "+age+" "+"jest liczbą dodatnią i nieparzystą!");
        }
        else if(age <=0 && age%2 != 0) {
            System.out.println("Liczba :"+" "+age+" "+"jest ujemna i nieparzysta!");
        }


    }
}

