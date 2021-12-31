import java.sql.SQLOutput;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

      /*  int a = 1;
        int b = 3;
        double a1 = 2.5;
        double b1 = 10.745;
        short c = 3;
        short c1 = 673;
        long d = 6784563;
        long d1 = 1098293049;
        byte e = 3;
        byte e1 = 33;
        String name = "Tomek";
        char key = '2';

        System.out.println("Show a:"+" "+a);
        System.out.println("Show b:"+" "+b);
        System.out.println("Show a1:"+" "+a1);
        System.out.println("Show b1:"+" "+b1);
        System.out.println("Show c:"+" "+c);
        System.out.println("Show c1:"+" "+c1);
        System.out.println("Show d:"+" "+d);
        System.out.println("Show d1:"+" "+d1);
        System.out.println("Show e:"+" "+e);
        System.out.println("Show e1:"+" "+e1);
        System.out.println("Show Name:"+" "+name);
        System.out.println("Show Number:"+" "+key);
*/

        Scanner scan = new Scanner(System.in);

        int dodaj = 1;
        int minus = 2;
        int mnozenie = 3;
        int dzielenie = 4;
        int modulo = 5;


        System.out.println("Wpisz 'q' by zakonczyc lub enter, by kontynuowac");
        String end = scan.toString();
        while  (end != "q")  {
        System.out.println();
        System.out.println("Wybierz 'q' by zakonczyc!");
        System.out.println();
        System.out.println("Wybierz działanie :");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Modulo");
        int c = scan.nextInt();


        if (c == dodaj) {
            System.out.println("Wybrales dodawanie!");
            System.out.print("Podaj a :" + " ");
            long a = scan.nextLong();
            System.out.print("Podaj b :" + " ");
            long b = scan.nextLong();


            System.out.println("Wynik dodawania to =" + " " + (a+b));

        } else if (c == minus) {
            System.out.println("Wybrales odejmowanie!");
            System.out.print("Podaj a :" + " ");
            long a = scan.nextLong();
            System.out.print("Podaj b :" + " ");
            long b = scan.nextLong();


            System.out.println("Wynik odejmowania to =" + " " + (a-b));
        }
        else if (c == mnozenie) {
            System.out.println("Wybrales mnozenie!");
            System.out.print("Podaj a :" + " ");
            double a = scan.nextInt();
            System.out.print("Podaj b :" + " ");
            double b = scan.nextInt();


            System.out.println("Wynik mnozenia to =" + " " + (a*b));
        }
        else if (c == dzielenie) {
            System.out.println("Wybrales dzielenie!");
            System.out.print("Podaj a :" + " ");
            double a = scan.nextDouble();
            System.out.print("Podaj b :" + " ");
            double b = scan.nextDouble();
            if(b == 0){
                System.out.println("Nie mozna dzielic przez 0!");
            }
            else

            System.out.println("Wynik dzielenia to =" + " " + (a/b));
        }
            if (c == modulo) {
                System.out.println("Wybrales dzialanie Modulo!");
                System.out.print("Podaj a :" + " ");
                double a = scan.nextDouble();
                System.out.print("Podaj b :" + " ");
                double b = scan.nextDouble();


                System.out.println("Wynik dzialania modulo to =" + " " + (a%b));
            }
        else if (end == "q") {
            System.out.println("Koniec Programu!");
        }
        else
        {
            System.out.println("Numer spoza zakresu!");
        }


        }



        }
    }

