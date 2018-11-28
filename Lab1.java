
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * C2 = 0 (О1 = "+")
		 * C3 = 2 (С = 2)
		 * C5 = 3 (О2 = "+")
		 * C7 = 2 (i and j type is "int")
		 * C11 = 10
		 * C17 = 4
		 */
		        int a = -14;
		        int b = 1;
		        int n = -11;
		        int m = 20;
		        int C = 2;
		        float S = 0;
		        if (a <= -C && -C <= n) 
		        {
		        	System.out.println("Delenie na nol");
		        }
		        else { 
		        for (int i = a; i <= n; i++) {
		            for (int j = b; j <= m; j++) {
		                S = S + ((float)i + j) / (i + C);
		            }
		        }
		        System.out.println(S);
		        }
		    }
	}