import java.util.*;

public class Main {
    
static final int N = 3; 
  
static void getCofactor(int A[][], int temp[][], int p, int q, int n) 
{ 
    int i = 0, j = 0; 
  
    for (int row = 0; row < n; row++) 
    { 
        for (int col = 0; col < n; col++) 
        { 
    
            if (row != p && col != q) 
            { 
                temp[i][j++] = A[row][col]; 
  
                if (j == n - 1) 
                { 
                    j = 0; 
                    i++; 
                } 
            } 
        } 
    } 
} 
  

static int determinant(int A[][], int n) 
{ 
    int D = 0; 
    if (n == 1) 
        return A[0][0]; 
  
    int [][]temp = new int[N][N];
    
    int sign = 1;
    
    for (int f = 0; f < n; f++) 
    { 
    
        getCofactor(A, temp, 0, f, n); 
        D += sign * A[0][f] * determinant(temp, n - 1); 
        sign = -sign; 
    } 
  
    return D; 
} 
  
static void adjoint(int A[][],int [][]adj) 
{ 
    if (N == 1) 
    { 
        adj[0][0] = 1; 
        return; 
    } 
  
    int sign = 1; 
    int [][]temp = new int[N][N]; 
  
    for (int i = 0; i < N; i++) 
    { 
        for (int j = 0; j < N; j++) 
        { 
            
            getCofactor(A, temp, i, j, N); 
  
            
            sign = ((i + j) % 2 == 0)? 1: -1; 
  
            adj[j][i] = (sign)*(determinant(temp, N-1)); 
        } 
    } 
} 
  

static boolean inverse(int A[][], int [][]inverse) 
{ 
    
    int det = determinant(A, N); 
    if (det == 0) 
    { 
        System.out.print("Singular matrix, can't find its inverse"); 
        return false; 
    } 
  
    
    int [][]adj = new int[N][N]; 
    adjoint(A, adj); 
  
    
    for (int i = 0; i < N; i++) 
        for (int j = 0; j < N; j++) 
            inverse[i][j] = adj[i][j]/(int)det; 
  
    return true; 
} 
  


static void display(int A[][]) 
{ 
    for (int i = 0; i < N; i++) 
    { 
        for (int j = 0; j < N; j++) 
            System.out.print(A[i][j]+ " "); 
        System.out.println(); 
    } 
} 
//static void display(int A[][]) 
//{ 
//    for (int i = 0; i < N; i++) 
//    { 
//        for (int j = 0; j < N; j++) 
//            System.out.printf(" +"+A[i][j]); 
//        System.out.println(); 
//    } 
//} 

    public static void main(String[] args) throws Exception {
       
       
        String pt= "ABC";
        int plain[]=new int[3];
        for(int i=0;i<3;i++)
            plain[i]=((int)pt.charAt(i))%65;
   
        String key = "ABCDEFGHI";
       
       
        int mat[][]=new int[3][3];
        int t=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=((int)key.charAt(t))%65;
                t++;
            }
        }
       
        for(int  i=0;i<3;i++){
            {
                for(int j=0;j<3;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        }
       
        System.out.println("");
        for(int i=0;i<3;i++)
            System.out.println(plain[i]);
           
           
        int cip[]=new int[3];
        int total;
        for(int i=0;i<3;i++){
            total=0;
            for(int j=0;j<3;j++){
               total=total+mat[i][j]*plain[j];
               cip[i]=total%26;
            }
        }
       
        System.out.println("");
        for(int i=0;i<3;i++){
            System.out.println(cip[i]+" ");
           
        }
       
       
        System.out.println("\nPlain Text: "+pt);
       
        System.out.print("Ciphered Text: ");
        for(int i=0;i<3;i++){
            System.out.print((char)(cip[i]+65));
           
        }
       
       
        //int det[][]=new int[3][3];
        System.out.println("");
        display(mat);
        
        int adj[][]=new int[3][3];
        adjoint(mat, adj);
        System.out.println("");
        display(adj);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(adj[i][j]<0){
                    while(adj[i][j]<0){
                        adj[i][j]+=26;
                    }
                    
                }
                adj[i][j]=adj[i][j]%26;
            }
        }
        
        System.out.println("");
        display(adj);
       
        //int aaa[][]={{3,2,4} ,{4,6,2},{42,6,9}};
       int det = determinant(mat, N);
       int inv[][]=new int[3][3];
        System.out.println(det);
        
        if(det!=0){
            for (int i = 0; i < N; i++) 
                for (int j = 0; j < N; j++) 
                    inv[i][j] = adj[i][j]/det;
        }
        
       
        System.out.println("");
       display(inv);
       
       
    }
}