import java.util.Scanner;

public class assignment1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;

        System.out.print("2자리수 정수 이별(10~99)>>");

        input = scanner.nextInt();

        int ten , one;

        ten = input / 10;
        one = input % 10;

        if( ten == one ){

            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");

        }

        else

            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");

        scanner.close();

    }

}
