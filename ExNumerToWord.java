//TO DO: Program ask the user for a number, which later is changing for the words - in polish language
//1. take number from user
//2. create a table and insert each element of this number to each element of table, name of method: FillTab
//3. create a method where each element of table will be checked and displayed a verbal description of the value, name of method: Text

import java.util.Scanner;

public class ExNumerToWord {

    public static int number;

    public static void Welcome ()
    {
        int []tab = new int [7];
        int number = -1;
        while(number<1 || number>1000000) {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj kwotę z zakresu 1 - 1 000 000. Kwota zostanie przedstawiona słownie.");
            number = input.nextInt();
        }

        tab = FillTab(number);
//        for (int i=0; i<tab.length; i++)
//        {
//            System.out.println("Wartość tablicy " + i + " wynosi: " + tab[i]);
//        }
        System.out.println("");
        Text(tab);
    }

    public static int[] FillTab(int number)
    {
        int mil, setTys, dzTys, tys, set, dz, jedn;
        int []tab = new int [7];
        tab[0] = number/1000000;
        tab[1] = (number/100000)%10;
        tab[2] = (number/10000)%10;
        tab[3] = (number/1000)%100%10;
        tab[4] = (number/100)%1000%100%10;
        tab[5] = (number/10)%10000%1000%100%10;
        tab[6] = number%100000%10000%1000%100%10;
        return tab;
    }

    public static void Text (int [] tab)
    {
        String mil = "";
        String setTys = "";
        String dzTys = "";
        String tys = "";
        String set = "";
        String dz = "";
        String j = "";

        if (tab[0] == 1) {
            mil = " Jeden milion złotych";
        }
        if (tab[1] != 0) {
            switch (tab[1]) {
                case 9:
                    setTys = " dziewięćset";
                    break;
                case 8:
                    setTys = " osiemset";
                    break;
                case 7:
                    setTys = " siedemset";
                    break;
                case 6:
                    setTys = " sześćset";
                    break;
                case 5:
                    setTys = " pięćset";
                    break;
                case 4:
                    setTys = " czterysta";
                    break;
                case 3:
                    setTys = " trzysta";
                    break;
                case 2:
                    setTys = " dwieście";
                    break;
                case 1:
                    setTys = " sto";
                    break;
            }
        }
        if (tab[2] > 1) {
            switch (tab[2]) {
                case 9:
                    dzTys = " dziewięćdziesiąt";
                    break;
                case 8:
                    dzTys = " osiemdziesiąt";
                    break;
                case 7:
                    dzTys = " siedemdziesiąt";
                    break;
                case 6:
                    dzTys = " sześćdziesiąt";
                    break;
                case 5:
                    dzTys = " pięćdziesiąt";
                    break;
                case 4:
                    dzTys = " czterdzieści";
                    break;
                case 3:
                    dzTys = " trzydzieści";
                    break;
                case 2:
                    dzTys = " dwadzieścia";
                    break;
            }
        }
        if(tab[2]==1){
            if (tab[3] != 0) {
                switch (tab[3]) {
                    case 9:
                        dzTys = " dziewiętnaście tysięcy";
                        break;
                    case 8:
                        dzTys = " osiemnaście tysięcy";
                        break;
                    case 7:
                        dzTys = " siedemnaście tysięcy";
                        break;
                    case 6:
                        dzTys = " szesnaście tysięcy";
                        break;
                    case 5:
                        dzTys = " piętnaście tysięcy";
                        break;
                    case 4:
                        dzTys = " czternaście tysięcy";
                        break;
                    case 3:
                        dzTys = " trzynaście tysięcy";
                        break;
                    case 2:
                        dzTys = " dwanaście tysięcy";
                        break;
                    case 1:
                        dzTys = " jedenaście tysięcy";
                        break;
                }
            }
        }
            else if(tab[2]!=0){
                if (tab[3]!= 0) {
                switch (tab[3]) {
                    case 9:
                        tys = " dziewięć tysięcy";
                        break;
                    case 8:
                        tys = " osiem tysięcy";
                        break;
                    case 7:
                        tys = " siedem tysięcy";
                        break;
                    case 6:
                        tys = " sześć tysięcy";
                        break;
                    case 5:
                        tys = " pięć tysięcy";
                        break;
                    case 4:
                        tys = " cztery tysiące";
                        break;
                    case 3:
                        tys = " trzy tysiące";
                        break;
                    case 2:
                        tys = " dwa tysiące";
                        break;
                    case 1:
                        tys = " jeden tysięcy";
                        break;
                }
            }
                }
        if (tab[4] != 0) {
            switch (tab[4]) {
                case 9:
                    set = " dziewięćset";
                    break;
                case 8:
                    set = " osiemset";
                    break;
                case 7:
                    set = " siedemset";
                    break;
                case 6:
                    set = " sześćset";
                    break;
                case 5:
                    set = " pięćset";
                    break;
                case 4:
                    set = " czterysta";
                    break;
                case 3:
                    set = " trzysta";
                    break;
                case 2:
                    set = " dwieście";
                    break;
                case 1:
                    set = " sto";
                    break;
            }
        }
        if (tab[5] > 1) {
            switch (tab[5]) {
                case 9:
                    dz = " dziewięćdziesiąt";
                    break;
                case 8:
                    dz = " osiemdziesiąt";
                    break;
                case 7:
                    dz = " siedemdziesiąt";
                    break;
                case 6:
                    dz = " sześćdziesiąt";
                    break;
                case 5:
                    dz = " pięćdziesiąt";
                    break;
                case 4:
                    dz = " czterdzieści";
                    break;
                case 3:
                    dz = " trzydzieści";
                    break;
                case 2:
                    dz = " dwadzieścia";
                    break;
            }
        }
            else if(tab[5]==1) {
            switch (tab[6]) {
                case 9:
                    dz = " dziewiętnaście złotych";
                    break;
                case 8:
                    dz = " osiemnaście złotych";
                    break;
                case 7:
                    dz = " siedemnaście złotych";
                    break;
                case 6:
                    dz = " szesnaście złotych";
                    break;
                case 5:
                    dz = " piętnaście złotych";
                    break;
                case 4:
                    dz = " czternaście złotych";
                    break;
                case 3:
                    dz = " trzynaście złotych";
                    break;
                case 2:
                    dz = " dwanaście złotych";
                    break;
                case 1:
                    dz = " jedenaście złotych";
                    break;
            }
        }
            else if(tab[5]!=0){
                if (tab[6] != 0) {
                switch (tab[6]) {
                    case 9:
                        j = " dziewięć złotych";
                        break;
                    case 8:
                        j = " osiem złotych";
                        break;
                    case 7:
                        j = " siedem złotych";
                        break;
                    case 6:
                        j = " sześć złotych";
                        break;
                    case 5:
                        j = " pięć złotych";
                        break;
                    case 4:
                        j = " cztery złote";
                        break;
                    case 3:
                        j = " trzy złotych";
                        break;
                    case 2:
                        j = " dwa złote";
                        break;
                    case 1:
                        j = " jeden złotych";
                        break;
                }
            }
                }
     if (tab[0]==1) {
         System.out.println("Liczbowo: " + tab[0] + " " + tab[1] + tab[2] + tab[3] + " " + tab[4] + tab[5] + tab[6] + " zł");
         System.out.println("Słownie:" + mil + setTys + dzTys + tys + set + dz + j + ".");
     }
     else {
         System.out.println("Liczbowo: " + tab[1] + tab[2] + tab[3] + " " + tab[4] + tab[5] + tab[6] + " zł");
        System.out.println("Słownie:" + mil + setTys + dzTys + tys + set + dz + j + ".");
     }
    }
    public static void main(String[] args) {
        Welcome();
    }


}
