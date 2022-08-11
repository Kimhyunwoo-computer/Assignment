import java.util.Scanner;

public class assignment2_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System . in );

        System.out.print("소문 자 알파벳 하나를 입력하시오>>");

        String input = scanner.next();

        char c = input.charAt(0);

        for(int i = (int) c - 97 ; i >= 0 ; i-- ){

            for(int j = 97 ; j <= 97 + i ; j++ ){

                System.out.print((char) j );

            }

            System.out.println();

        }

        scanner.close();

    }

}
