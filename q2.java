import java.util.Scanner;

public class q2{ 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int k = sc.nextInt();

	int [][]aa= matrix(m,n);
	int [][]bb=matrix(n,k);
	int [][]cc=new int[m][k];

	for(int i=0; i<m; i++) {
		for(int j=0; j<k; j++){
			int o=0;
			for(int g=0; g<n; g++){
				o = o + (aa[i][g]&bb[g][j]);
			}
			cc[i][j]=o;
		}
	}

	print(cc);
}

// to read a matrix from console and return it to a array
// a is number of rows and b is num of columns
public static int[][] matrix(int a, int b){
	Scanner sc = new Scanner(System.in);
	int[][] mat = new int[a][b];
	for(int i=0; i<a; i++){
		for(int j=0; j<b; j++){
			mat[i][j]=sc.nextInt();
		}
	}
return mat;
}

// to multipilication two matrix
/*public static int[][] zarb(int[][] a , int[][] b){
int i = a.length;
int j = b[0].length;
int[][] re = new int[i][j];

return re;
}*/

// to print arrays
public static void print(int[][] a){
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[0].length; j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
	}
}
}