package Arrays;

import java.util.*;

public class SudokuChecker {


    static boolean isValidSudoku(char board[][]){

        List<Set<Character>> row = new ArrayList<>(9);
        List<Set<Character>> col = new ArrayList<>(9);
        List<Set<Character>> box = new ArrayList<>(9);

        for(int i=0; i<9; i++){

            row.add(new HashSet<>());
            col.add(new HashSet<>());
            box.add(new HashSet<>());


        }


        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char currentCharacter = board[i][j];
                if(currentCharacter == '.'){
                    continue;
                }

                int boxIndex = i/3* 3 + j/3;

                if(row.get(i).contains(currentCharacter)|| col.get(j).contains(currentCharacter)|| box.get(boxIndex).contains(currentCharacter)){
                    return false;
                }
                row.get(i).add(currentCharacter);
                col.get(j).add(currentCharacter);
                box.get(boxIndex).add(currentCharacter);



            }
        }
        return true;
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){


                board[i][j] = scanner.next().charAt(0);

            }
        }


       boolean isValid  = isValidSudoku(board);
        System.out.println(isValid);



    }


}
