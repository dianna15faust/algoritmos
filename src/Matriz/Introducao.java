package Matriz;

public class Introducao {

    public static void main(String[] args) {
        //Criando cm 5 colunas
        //o vetor sempre tem 1 linha
        int[] vetor = new int[5];

        //Preenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            //Armazenando
            vetor[i] = i * 4;

        }

        //Criando uma matriz 3x4 (linxcol)
        int[][] matriz = new int[3][4];

        //Percorrendo as linhas da matriz
        for (int linha = 0; linha < 3; linha++) {

            //Percorrendo colunas
            for (int c = 0; c < 4; c++) {
                //Preenchendo....
                matriz[linha][c] = linha * c;
          
            }
            
                    
               }
        //////////////////////////////////////////// 
                 //Monstrando a matriz na saida
            for (int linha=0; linha<3; linha++) {
                for (int c=0; c<4; c++) {
                    System.out.print((matriz[linha][c]) + " " );
            }
                System.out.println(" ");
            
        }

    }

}
