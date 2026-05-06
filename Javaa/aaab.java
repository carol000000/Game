/*################################
                找最大
 #################################*/

import java.util.Scanner;

public class aaab{
 public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("幾個數字n?");
    int n = sc.nextInt();
    int a []= new int[n];
    int i;
    System.err.println("輸入數字n個");
    for(i=0;i<n;i++){
        System.out.println("第"+(i+1)+"個");
        a[i] = sc.nextInt();
    }
    int j=1;
    int big = a[0];
    for(i=0;i<n;i++){
        if(j==n){
            break;
        }
        if(a[i]>a[j]){         
            big=a[i];
            j++;
        }
        else j++;
    }
    System.out.println("最大的是"+big);
    }
}