import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x > y && x > z){
            System.out.println("Largest : "+x);
        }
        else if(y > z && y > x){
            System.out.println("Largest : "+y);
        }
        else{
            System.out.println("Largest : "+z);
        }
    }
}
