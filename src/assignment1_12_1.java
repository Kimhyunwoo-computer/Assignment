import java.util.Scanner;

public class assignment1_12_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");

        double x = scanner.nextDouble();
        String s = scanner.next();
        double y = scanner.nextDouble();

        if( s.equals("+") ){

            System.out.println(x + s + y + "의 계산 결과는 " + ( x + y ));

        }
        else if( s.equals("-") ){

            System.out.println(x + s + y + "의 계산 결과는 " + ( x - y ));

        }
        else if( s.equals("*") ){

            System.out.println(x + s + y + "의 계산 결과는 " + ( x * y ));

        }
        else if( s.equals("/") ){

            if( y == 0 ){

                System.out.println("0으로 나눌 수 없습니다.");

            }
            else

            System.out.println(x + s + y + "의 계산 결과는 " + ( x / y ));

        }

    }

}
