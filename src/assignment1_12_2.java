import java.util.Scanner;

public class assignment1_12_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");

        double x = scanner.nextDouble();
        String s = scanner.next();
        double y = scanner.nextDouble();

        switch (s){

            case "+" :

                System.out.println(x + s + y + "의 계산 결과는 " + ( x + y ));

                break;

            case "-" :

                System.out.println(x + s + y + "의 계산 결과는 " + ( x - y ));

                break;

            case "*" :

                System.out.println(x + s + y + "의 계산 결과는 " + ( x * y ));

                break;

            case "/" :
                if( y == 0 ){

                    System.out.println( "0으로 나눌 수 없습니다.");

                }

                System.out.println(x + s + y + "의 계산 결과는 " + ( x / y ));

                break;
        }

        scanner.close();

    }

}
