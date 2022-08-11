import java.util.Scanner;

public class assignment2_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] str = { "가위" , "바위" , "보" };

        while(true) {

            System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

            System.out.print("가위 바위 보!>>");

            String human = scanner.next();

            if(human.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }

            int human_int = 0;
            for(int i = 0 ; i < str.length ; i ++ ){
                if(human.equals(str[i]))
                    human_int = i;
            }

            int random = (int) (Math.random() * 3);

            System.out.print("사용자 = " + human + " , 컴퓨터 = " + str[random] + ", ");

            if( (human_int - random + 3 ) % 3 == 2)
                System.out.println("컴퓨터가 이겼습니다.");

            else if( (human_int - random + 3 ) % 3 == 1)
                System.out.println("사용자가 이겼습니다.");

            else if( (human_int - random + 3 ) % 3 == 0)
                System.out.println("비겼습니다.");



        }


    }
}
