package loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i=2;i<=n-1;i++){
            if(n%i==0){ //'i' is a factor of 'n'
                System.out.println("Composite Number");
                break;
            }
            else {
                System.out.println("prime number");
                break;
            }
        }
    }
}
