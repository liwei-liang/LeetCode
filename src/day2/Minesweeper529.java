package day2;

public class Minesweeper529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(click[0]>=board.length||click[1]>=board[0].length||board[click[0]][click[1]] != 'M'&&board[click[0]][click[1]] != 'E'){
        	return board;
        }
        int a = click[0];
        int b = click[1];
        if(board[click[0]][click[1]] == 'M'){
        	board[click[0]][click[1]] = 'X';
        	return board;
        }else{
        	search(board,a,b);
        }
        return board;
    }
    
    public static void search(char[][] board, int a, int b){
    	int num = 0;
    	for(int i = -1; i < 2 ; i++){
    		for(int j = -1; j < 2; j++){
    			if(0<=a+i&&a+i<board.length&&0<=b+j&&b+j<board[0].length){
    				if(board[a+i][b+j]=='M'){
    					num++;
    				}
    			}
    		}
    	}
    	if(num > 0){
    		board[a][b] = Character.forDigit(num, 10);
    	}else{
    		board[a][b] = 'B';
        	for(int i = -1; i < 2 ; i++){
        		for(int j = -1; j < 2; j++){
        			if(0<=a+i&&a+i<board.length&&0<=b+j&&b+j<board[0].length&&board[a+i][b+j] == 'E'){
        	    		search(board,a+i,b+j);
        			}
        		}
        	}
    	}
    }
}
