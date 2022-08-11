import java.util.Scanner;

public class assignment1_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a , b , c ;

        System.out.print("정수 3개 입력>>");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if( a != b && b != c){

            System.out.print("중간 값은 ");

            if( ( a > b && b > c ) || ( c > b && b > a) ){

                System.out.println(b);

            }

            else if( ( a > c && c > b ) || ( b > c && c > a ) ){

                System.out.println(c);

            }

            else if( ( b > a && a > c ) || ( c > a && a > b ) ){

                System.out.println(a);

            }

        }

        else{

            System.out.println("");

        }

        scanner.close();

    }

}
