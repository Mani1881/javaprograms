import java.io.*;
public class tran {
    public static void main(String[] l)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n1");
        int n1=Integer.parseInt(br.readLine());
        System.out.print("Enter n2:");
        int n2=Integer.parseInt(br.readLine());
         int arr[][]=new int[n1][n2];
         int arr2[][]=new int[n1][n2];
         int i,j,k;
         int mul[][]=new int[n1][n2];
        for (i = 0; i < n1; i++)
            for (j = 0; j < n2 ; j++)
                arr[i][j]=Integer.parseInt(br.readLine());
       /*      }
        } */
        System.out.print("ele r:\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print(" transpose ele r:\n");
        for (i = 0; i < n2; i++) {
            for (j = 0; j < n1 ; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }
        System.out.print(" 2nd arr  ele r:\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2 ; j++) {
                arr2[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.print(" add ele r:\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2 ; j++) {
                System.out.print((arr[i][j]+arr2[i][j])+" ");
            }
            System.out.print("\n");
        }
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2 ; j++) {
              mul[i][j]=0;
                for(k=0;k<arr.length;k++){
                     mul[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }
        System.out.print(" mul is:\n");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2 ; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
