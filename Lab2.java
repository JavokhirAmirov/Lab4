
public class Lab2 {
    public static void main(String[] args) {
        int S = 0;
        short[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        short[][] B = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        short[][] C = new short[B.length][B[0].length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
            	C[i][j]=(short)(A[i][j] ^ B[i][j]);
            	S += C[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(S/(C.length * C[0].length));

            }
    }