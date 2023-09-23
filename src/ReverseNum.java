import java.util.*;
import java.util.*;

public class ReverseNum {

    public static void reverse(int n){
        if (n==0) return;
        System.out.println(n%10);
        reverse(n/10);
    }

    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int n = input.nextInt();
        reverse(n);
    }

}
