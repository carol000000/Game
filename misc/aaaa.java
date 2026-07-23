/*###############################
           未完成
################################ */
import java.util.Scanner;

public class aaaa{
 public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int i;
    for(i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    int j = 1;
    for(i=0;i<n;i++){
        if (j >= n) break; 
        if(a[i]>a[j]){
            int k = 0;
            a[i+j] = k;
            a[i]=k-a[i];
            a[j]=k-a[j];
            j++;
        }
        else j++;

        
    
 }
 for(i=0;i<n;i++){
        System.out.print(a[i]+",");
        }
}
}
