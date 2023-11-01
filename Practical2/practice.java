import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start:"); int start = input.nextInt();
        System.out.print("Enter end:"); int end = input.nextInt();
        if( start < end ) {
            System.out.print("start is smaller than end");
        }
        else {
            int plus = 0;
            for (int counter = start; counter <= end; counter++) {
                plus += counter;
            }
            System.out.printf("result = %d", plus);
        }
    }
}