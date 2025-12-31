package Lab13;

import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args){
        String[][] board = new String[3][3];
        for (int i = 0; i<3; i++){
            for(int k = 0; k < 3; k++){
                board[i][k] = "-";
            }
        }
        Scanner input = new Scanner(System.in);
        int turns = 0;

        do{
            if (turns % 2 == 0){
                System.out.println("Player one: ");
            } else System.out.println("Player two: ");

            int row = input.nextInt() - 1;
            int col = input.nextInt() - 1;

            while(!board[row][col].equals("-")) {
                System.out.println();
                System.out.println("Error: choose an open tile");
                if (turns % 2 == 0){
                    System.out.println("Player one: ");
                } else System.out.println("Player two: ");

                row = input.nextInt() - 1;
                col = input.nextInt() - 1;
            }

            board[row][col] = turns % 2 == 0 ? "X" : "O";

            if(checkBoard(board).equals("unfinished"))
                System.out.println("Unfinished");
            else
                switch (checkBoard(board)){
                    case "tie": System.out.println("Tie"); break;
                    case "X": System.out.println("Player 1 Won"); break;
                    case "O": System.out.println("Player 2 Won"); break;
                }

            showBoard(board);

            turns++;

            System.out.println();
        } while(checkBoard(board).equals("unfinished"));
    }

    public static void showBoard(String[][] b){
        for (String[] r : b){
            for(String e : r){
                System.out.printf("%1s ", e);
            }
            System.out.println();
        }
    }
    public static String checkBoard(String[][] m){
        String info = "unfinished";

        boolean found = false;
        for(int i=0; i<3; i++){
            String temp = m[i][0];
            boolean isSame = true;
            for (int j=1; j<3; j++){
                if (!(m[i][j].equals(temp))){
                    isSame = false;
                    break;
                }
            }
            if (isSame && !temp.equals("-")){
                info = temp;
                found = true;
            }
        }

        for(int i=0; i<3; i++){
            String temp = m[0][i];
            boolean isSame = true;
            for (int k = 1; k < 3; k++){
                if (!(m[k][i].equals(temp))){
                    isSame = false;
                    break;
                }
            }
            if (isSame && !temp.equals("-")) {
                info = temp;
                found = true;
            }
        }

        String temp = m[0][0];
        boolean isSame = true;
        for(int h = 1; h<3; h++){
            if(!(m[h][h].equals(temp))){
                isSame = false;
                break;
            }
        }
        if (isSame && !temp.equals("-")) {
            info = temp;
            found = true;
        }

        temp = m[0][2];

        isSame = true;
        for(int s=1, l=1; s >= 0 && l<3; s--, l++) {
            if (!(m[l][s].equals(temp))){
                isSame = false;
                break;
            }
        }
        if (isSame && !temp.equals("-")) {
            info = temp;
            found = true;
        }

        boolean open = false;

        for (int i = 0; i < 3; i++){
            for(int h = 0; h < 3; h++){
                if(m[i][h].equals("-")){
                    open = true;
                    break;
                }
            }
        }

        if(!found && !open) {
            info = "tie";
        }
        return info;
    }
}
