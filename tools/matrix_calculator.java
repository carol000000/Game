//矩陣計算機
import java.util.Scanner;
public class matrix_calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while (true) {   
            System.out.println("相加-1,相減-2,乘N-3,相乘-4,反方陣-5,|det(A)|-6,離開-7");
            int e = sc.nextInt();
            if(e==1){
                add();
                continue;
            }
            if(e==2){
                minus();
                continue;
            }
            if(e==3){
                xn();
                continue;
            }
            if(e==4){
                xx();
                continue;
            }
            if(e==5){
                nxx();
                continue;
            }
            if(e==6){
                deta();
                continue;
            }
            if(e==7){
                break;
        }
            else System.out.print("輸入錯誤");
    }
    }
    //相加
    public static void add(){
        System.out.println("相加,輸入矩陣1 n1 m1,矩陣2 n2 m2,範例: 3 2 2 3");
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        if (n1 !=n2 || n2 != m2){
            System.out.println("矩陣大小不同，無法相加");
            return;
        }
        double a[][]=new double[n1][m1];
        double b[][]=new double[n2][m2];
        int i,j;
        System.out.println("輸入矩陣a的值 從左到右,上到下");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("輸入矩陣b的值 從左到右,上到下");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("相加答案:");
        for(i=0;i<n1;i++){
            for (j=0;j<m2;j++){
                double c = a[i][j]+b[i][j];
                System.out.print(c+" ");
            }
            System.out.println();
        }
        return;
    }
    //相減
    public static void minus(){
         System.out.println("相減,輸入矩陣1 n1 m1,矩陣2 n2 m2,範例: 3 2 2 3");
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        if (n1 !=n2 || n2 != m2){
            System.out.println("矩陣大小不同，無法相加");
            return;
        }
        double a[][]=new double[n1][m1];
        double b[][]=new double[n2][m2];
        int i,j;
        System.out.println("輸入矩陣a的值 從左到右,上到下");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("輸入矩陣b的值 從左到右,上到下");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("相減答案:");
        for(i=0;i<n1;i++){
            for (j=0;j<m2;j++){
                double c = a[i][j]-b[i][j];
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    //乘n
    public static void xn(){
        System.out.println("乘n,輸入矩陣1 n1 m1,範例: 3 2");
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        double a[][]=new double[n1][m1];
        int i,j;
        System.out.println("輸入矩陣的值 從左到右,上到下");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("輸入要乘n倍");
        System.out.println("乘n答案:");
        double n = sc.nextDouble();
        for(i=0;i<n1;i++){
            for (j=0;j<m1;j++){
                double c = a[i][j]*n;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    //相乘
    public static void xx(){
        System.out.println("相乘,輸入矩陣1 n1 m1,矩陣2 n2 m2,範例: 3 2 2 3");
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        if(m1 != n2){
        System.out.println("無法相乘");
        return;
}
        double a[][]= new double[n1][m1];
        double b[][]= new double[n2][m2];
        double c[][]= new double[n1][m2];
        int i,j;
        System.out.println("輸入矩陣a的值 從左到右,上到下");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("輸入矩陣b的值 從左到右,上到下");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("相乘答案:");
        for(i=0;i<n1;i++){
            for (j=0;j<m2;j++){
                c[i][j] = 0;
                for(int k=0;k<m1;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]);
            }   
            System.out.println();
        }
    }
    //反方陣
    public static void nxx(){
        Scanner sc = new Scanner(System.in);
        int i =2,j=2;
        double a [][] = new double[2][2];
        System.out.println("輸入2*2矩陣的值 從左到右,上到下");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                a[i][j] = sc.nextDouble();   
            }
        }
        double d =a[0][0]*a[1][1]-a[0][1]*a[1][0];
        if(d==0){
            System.out.println("沒有反方陣");
            return;
        }
        double t = a[0][0];
        a[0][0] = a[1][1];
        a[1][1]=t;
        a[0][1]*=-1;
        a[1][0]*=-1;
        System.out.println("反方陣答案:");
        for(i=0;i<2;i++){
            for (j=0;j<2;j++){
                double c = a[i][j]/d;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public static void deta(){
        Scanner sc = new Scanner(System.in);
        int i =2,j=2;
        double a [][] = new double[2][2];
        System.out.println("輸入2*2矩陣的值 從左到右,上到下");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                a[i][j] = sc.nextDouble();   
            }
        }
        double d =a[0][0]*a[1][1]-a[0][1]*a[1][0];
        if (d<0){
            d*=-1;
        }
        System.out.println("|det(A)|答案:");
        System.out.println(d);
        }
}
