import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println( "명품콘서트홀 예약 시스템입니다." ) ;

        Concert concert = new Concert() ;

        int exit = 0;
        while( true ){

            System.out.print("예약:1 , 조회:2 , 취소:3 , 끝내기:4 >>") ;


            try{

                int num = scanner.nextInt() ;

                switch ( num ){
                    case 1:
                        concert.reserveSeat();
                        break;

                    case 2:
                        concert.show();
                        break;

                    case 3:
                        concert.deleteSeat();
                        break;

                    case 4:
                        exit = -1 ;
                        break;

                    default :
                        System.out.println("다시 입력해주세요.");

                }


            }
            catch( InputMismatchException e ){

                System.out.println("다시 입력해주세요.");
                scanner.nextLine();

            }
            if( exit == -1 )
                break;
        }
    }
}

class Concert{

    private String[] s = new String[10];
    private String[] a = new String[10];
    private String[] b = new String[10];

    Concert(){

        for(int i = 0 ; i < 10 ; i++){
            s[i] = "---";
            a[i] = "---";
            b[i] = "---";
        }

    }

    Scanner scanner = new Scanner(System.in);


    void showLine(String[] arr){ // 좌석에 따라 좌석 출력하기

        for(int i = 0 ; i < arr.length ; i ++){

            System.out.print( " " + arr[i] + " " );

        }
        System.out.println();

    }

    void reserveSeat(){



        while( true ){

            System.out.print("좌석구분 S(1) , A(2) , B(3)>>");
            int select = scanner.nextInt();

            switch (select){

                case 1:
                    System.out.print("S>>");
                    showLine(s);
                    reserve(s);
                    return;

                case 2:
                    System.out.print("A>>");
                    showLine(a);
                    reserve(a);
                    return;

                case 3:
                    System.out.print("B>>");
                    showLine(b);
                    reserve(b);
                    return;

                default:
                    System.out.println("좌석구분 다시 입력해주세요.");

            }

        }

    }

    void reserve(String[] arr){

        while( true ){
            System.out.print("이름>>");
            String name = scanner.next();
            System.out.print("번호>>");
            int num = scanner.nextInt();

            if( num < 1 || num > 10 ){

                System.out.println("번호 입력 오류입니다.");

            }

            else{

                if( !arr[ num - 1 ].equals("---") ){

                    System.out.println("이미 예약된 자리 입니다.");

                }

                else{
                    arr[ num - 1 ] = name ;
                    break;
                }

            }

        }

    }

    void show(){

        System.out.print("S>>");
        showLine(s);
        System.out.print("A>>");
        showLine(a);
        System.out.print("B>>");
        showLine(b);

        System.out.println("<<<조회를 완료하였습니다.>>>");

    }

    void deleteSeat(){

        System.out.print("좌석구분 S(1) , A(2) , B(3)>>");
        int select = scanner.nextInt();

        while( true ){

            switch (select){

                case 1:
                    System.out.print("S>>");
                    showLine(s);
                    delete(s);
                    return;

                case 2:
                    System.out.print("A>>");
                    showLine(a);
                    delete(a);
                    return;

                case 3:
                    System.out.print("B>>");
                    showLine(b);
                    delete(b);
                    return;

            }

        }

    }

    void delete(String[] arr){

        System.out.print("이름>>");
        String name = scanner.next();

        int i ;
        for( i = 0 ; i < arr.length ; i++ ){

            if( arr[i].equals(name) ){

                arr[i] = "---" ;
                break;

            }

        }

        if( i == arr.length ){

            System.out.println("예약자가 없습니다.");

        }

    }


}
