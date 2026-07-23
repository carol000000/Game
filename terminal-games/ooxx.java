/*########
OOXX
#########*/
import java.util.Scanner;
import java.util.Random;
public class ooxx{
    static int playerScore = 0;
        static int playerSum = 0;
        static int botScore = 0;
        static int botSum = 0;
    public static void main (String []args){
        System.out.println("====OOXX====");
        System.out.println("00 | 01 | 02");
        System.out.println("------------");
        System.out.println("10 | 11 | 12");
        System.out.println("------------");
        System.out.println("20 | 21 | 22");
        //o=0;x=9
        int [][] ooxx ={{1,2,3},{3,1,2},{2,3,1}};
        while (true) {
            int sum = botSum = playerSum;
            System.out.println("目前步數總和"+sum);
            play(ooxx,playerScore,playerSum,botScore,botSum);
            if(playerScore == 6 && playerSum >=3){
                System.out.println("你贏了");
                break;
            }
            else if(botScore == 6 && botSum >=3){
                System.out.println("你輸了");
                break;
            }
            else if(playerScore == 3 && playerSum >=3){
                System.out.println("你贏了");
                break;
            }
            else if(botScore == 3 && botSum >=3){
                System.out.println("你輸了");
                break;
            }
            else if(sum >=9){
                System.out.println("平手");
                break;}
            else{
                System.out.println("==========");
                for(int f=0;f<3;f++){
                    System.out.println("\n--------");
                    for(int g=0;g<3;g++){
                        System.out.print("|");
                        
                        if(ooxx[f][g]==0){
                            System.out.print("O ");}
                        else if(ooxx[f][g]==9){
                            System.out.print("X ");}
                        else{
                            System.out.print("  ");}
                    }
                }
            }  
        }
    }
    public static void play(int[][] ooxx,int playerScore,int playerSum,int botScore,int botSum){
        System.out.println("\n輸入位置座標");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i =sc.nextInt();
        int j =sc.nextInt();
        if (ooxx[i][j]==0 || ooxx[i][j]==9){
                System.out.println("已經有人填了");
        }
        else{
        ooxx[i][j] += playerScore;    
        ooxx [i][j] =0;
        playerSum +=1;
        while (true) {
            int m = random.nextInt(0,3);
            int n = random.nextInt(0,3);
            if (ooxx[m][n]!=0 && ooxx[m][n]!=9){
                ooxx[m][n]+=botScore;
                ooxx[m][n]=9;
                botSum +=1;
                break;
            }
        }
        }
        return;
    }
}