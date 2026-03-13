package model;

import java.util.Random;

public class Game {

    private static final int SIZE = 15;
    
// // fácil
//    {5,4,4,3,3,3,3,2,2,2,2,2,1,1,1,1,1,1}
//
//    // médio
//    {5,4,4,3,3,3,2,2,2,1,1}
//
//    // difícil
//    {5,4,3,3,2}
    private static final int[] NAVIOS = {5,4,4,3,3,3,2,2,2,1,1};//médio

    private int[][] board;
    private boolean[][] shots;

    public Game() {
        board = new int[SIZE][SIZE];
        shots = new boolean[SIZE][SIZE];
        gerarNavios();
    }

    private void gerarNavios() {

    	

        for(int tamanho : NAVIOS){
            colocarNavio(tamanho);
        }
    }

    private void colocarNavio(int tamanho){

        Random r = new Random();
        boolean colocado = false;

        while(!colocado){

            int x = r.nextInt(SIZE);
            int y = r.nextInt(SIZE);

            boolean horizontal = r.nextBoolean();

            if(horizontal){

                if(y + tamanho >= SIZE) continue;

                boolean livre = true;

                for(int i=0;i<tamanho;i++){
                    if(board[x][y+i] != 0){
                        livre = false;
                        break;
                    }
                }

                if(livre){
                    for(int i=0;i<tamanho;i++){
                        board[x][y+i] = 1;
                    }
                    colocado = true;
                }

            }else{

                if(x + tamanho >= SIZE) continue;

                boolean livre = true;

                for(int i=0;i<tamanho;i++){
                    if(board[x+i][y] != 0){
                        livre = false;
                        break;
                    }
                }

                if(livre){
                    for(int i=0;i<tamanho;i++){
                        board[x+i][y] = 1;
                    }
                    colocado = true;
                }
            }
        }
    }

    public boolean atirar(int x,int y){
        shots[x][y] = true;
        return board[x][y] == 1;
    }

    public boolean hasShip(int x,int y){
        return board[x][y] == 1;
    }

    public boolean jaAtirou(int x,int y){
        return shots[x][y];
    }

    public boolean[][] getShots(){
        return shots;
    }

    public int getSize(){
        return SIZE;
    }
    
    public boolean venceu(){

        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){

                if(board[i][j] == 1 && !shots[i][j]){
                    return false; // ainda existe navio não atingido
                }

            }
        }

        return true; // todos os navios destruídos
    }
}