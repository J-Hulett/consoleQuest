package menu;

import characters.Character;

public class GameRuntime {

    public void gameStart(Character player){
        System.out.println(" ______________________________");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("|______________________________|");
        System.out.println();
        printArray();
    }

    public void printArray(){
        int rows = 10;
        int columns = 20;

        String[][] array = new String[rows][columns];

        for (int i = 0; i<rows; i++)
            for (int j = 0; j<columns; j++)
                if(i <= 9 && i >= 1 && j == 0 || j == 19){
                    array[i][j] = "|";
                } else if (j <= 19 && i == 9 || i == 0){
                    array[i][j] = "__";
                } else if(i == 8 && j == 10){
                    array[i][j] = "x ";
                } else
                    array[i][j] = "  ";

        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<columns; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
