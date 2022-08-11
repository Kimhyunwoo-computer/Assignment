import java.util.Scanner;

public class assignment1_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("직사각형을 구성하는 두 점을 입력하시오>>");

        int rectx1 = scanner.nextInt();
        int recty1 = scanner.nextInt();
        int rectx2 = scanner.nextInt();
        int recty2 = scanner.nextInt();

        if (inRect(rectx1, recty1, rectx2, recty2)) {

            System.out.println("직사각형이 충돌합니다.");

        }

        else
            System.out.println("직사각형이 충돌안합니다.");
    }

    static boolean inRect( int rectx1 , int recty1 ,int rectx2 , int recty2 ){

            if( ( rectx1 >= 100 && rectx1 <= 200 ) || ( rectx2 >= 100 && rectx2 <= 200 ) ){

                if( ( recty1 >= 100 && recty1 <= 200 ) || ( recty2 >= 100 && recty2 <= 200 ) ){

                    return true;

                }

            }

            return false;
        }

    }


