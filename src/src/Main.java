import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator test = new Translator(alphabetic, numeric);

        boolean play = true;

        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        while(play){

            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");

            String input = scanner.nextLine();

            if(input.equals("x")){
                play = false;
            }
            else if(input.equals("v")){
                System.out.println("Typ een cijfer van 0 t/m 9 ");
                int number = scanner.nextInt();
                scanner.nextLine();
                if(number < 10){
                    System.out.println(test.translate(number));
                }
                else{
                    System.out.println(ongeldig);;
                }
            }
        }
    }
}



































//
//
//    int [][] twoDarray = {{1,2,3},
//            {3,4,5},
//            {6,7,8},
//            {9,10,11}};
//
//    for(int i = 0; i < twoDarray.length; i++){
//        for(int j = 0; j < twoDarray[i].length; j++){
//
//        if(i == i) {
//        System.out.print("numbers: ");
//        }
//        System.out.print(twoDarray[i][j] + " ");
//
//        }
//        System.out.println(" ");
//        }
//
//
//


//    int column, row;
//    for(column=0; column<4; column++){
//        for(row=0; row<3; row++){
//            if(row < 1) {
//                System.out.print(" row numbers = ");
//            }
//            System.out.print(" " + twoDarray[column][row]);
//        }
//        System.out.println("");
//    }





//        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        int row, column;
//
//        for (column = 0; column < 4; column++) {
//            for (row = 0; row < 4; row++) { // hier check die van index 0tm3 en print deze na index 3 uit de loop en nieuwe column
//                System.out.print(" " + matrix[row][column]); //
//            }
//            System.out.println();
//        }


