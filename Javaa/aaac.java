import java.util.Scanner;

public class aaac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double [n];
        double t = 0; 

        int i;

        //輸入
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //總和
        for(i=0;i<n;i++){
            t= t+a[i];
        }
        double big = a[0]; 
        double sm = a[0]; 

        for(i=1;i<n;i++) { 
            if (a[i] > big) {
                big = a[i]; 
            }
            if (a[i] < sm) {
                sm = a[i]; 
            }
        }
        //平均
        double c =t/n;
        //輸出
        System.out.println("總和:"+t+"\n平均:"+c+"\n最大:"+big+"\n最小:"+sm);


    }
    
}
