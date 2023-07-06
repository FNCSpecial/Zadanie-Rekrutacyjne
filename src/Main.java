// Napisz program konsolowy, który przyjmuje na wyjściu nieokreśloną liczbę reszt do
//wydania. Na starcie kasa drobnych do wydawania ma następujący stan:
// 5 zł: 1 szt.
//2 zł: 3 szt.
//1 zł: 5 szt.
//50 gr: 10 szt.
//20 gr: 20 szt.
//10 gr: 200 szt.
//5 gr: 100 szt.
//2 gr: 100 szt.
//1 gr: 10000 szt.


class Kasa {

     int groszy500 = 1;
     int groszy200 = 3;
     int groszy100 = 5;
     int groszy50 = 10;
     int groszy20 = 20;
     int groszy10 = 200;
     int groszy5 = 100;
     int groszy2 = 100;
     int groszy1 = 10000;

    public int ObliczanieReszty( int reszta) {

        int ilosc_5zł = 0;
        int ilosc_2zł = 0;;
        int ilosc_1zł = 0;;
        int ilosc_50gr = 0;;
        int ilosc_20gr = 0;;
        int ilosc_10gr = 0;;
        int ilosc_5gr = 0;;
        int ilosc_2gr = 0;;
        int ilosc_1gr = 0;;



        while (reszta > 0) {

            if (reszta >= 500 && groszy500 > 0) {
                reszta -= 500;
                groszy500--;
                ilosc_5zł++;
            } else if (reszta >= 200 && groszy200 > 0) {
                reszta -= 200;
                groszy200--;
                ilosc_2zł++;
            } else if (reszta >= 100 && groszy100 > 0) {
                reszta -= 100;
                groszy100--;
                ilosc_1zł++;
            } else if (reszta >= 50 && groszy50 > 0) {
                reszta -= 50;
                groszy50--;
                ilosc_50gr++;
            } else if (reszta >= 20 && groszy20 > 0) {
                reszta -= 20;
                groszy20--;
                ilosc_20gr++;
            } else if (reszta >= 10 && groszy10 > 0) {
                reszta -= 10;
                groszy10--;
                ilosc_10gr++;
            } else if (reszta >= 5 && groszy5 > 0) {
                reszta -= 5;
                groszy5--;
                ilosc_5gr++;
            } else if (reszta >= 2 && groszy2 > 0) {
                reszta -= 2;
                groszy2--;
                ilosc_2gr++;

            } else if (reszta >= 1 && groszy1 > 0) {
                reszta -= 1;
                groszy1--;
                ilosc_1gr++;
            } else {
                System.out.println("brak możliwości wydania");
                return 0;


            }
        }


        System.out.println("Wydaj 5zl : " + ilosc_5zł);
        System.out.println("Wydaj 2zl : " + ilosc_2zł);
        System.out.println("Wydaj 1zl : " + ilosc_1zł);
        System.out.println("Wydaj 50gr : " + ilosc_50gr);
        System.out.println("Wydaj 20gr : " + ilosc_20gr);
        System.out.println("Wydaj 10gr : " + ilosc_10gr);
        System.out.println("Wydaj 5gr : " + ilosc_5gr);
        System.out.println("Wydaj 2gr : " + ilosc_2gr);
        System.out.println("Wydaj 1gr : " + ilosc_1gr);


        return 0;
    }
}



public class Main {




    public static void main(String[] args) {

        Kasa kasa = new Kasa();

        kasa.ObliczanieReszty(130);
        System.out.println("==============");
        kasa.ObliczanieReszty(1170);
        System.out.println("==============");
        kasa.ObliczanieReszty(670);
        System.out.println("==============");
        kasa.ObliczanieReszty(430);
        System.out.println("==============");



        //Niesety wiem że nie jest to opytamlne roziwązanie z uwagi że przechodze przez while wielokrotną ilość razy lecz zobaczyłem ogłoszenie w ostatniej chiwli.
    }
}
