import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        int input = scanner.nextInt() ;

        Phone[] phone_arr = new Phone[ input ] ;

        for( int i = 0 ; i < input ; i++ ){

            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");

            String name = scanner.next() ;
            String tel = scanner.next() ;

            phone_arr[i] = new Phone( name , tel ) ;

            if( i == input - 1 )
                System.out.println("저장되었습니다...") ;

        }


        while( true ){

            System.out.print("검색할 이름>>");
            String search_name = scanner.next();

            if( search_name.equals( "그만" ))
                break;

            for( int i = 0 ; i < input ; i++ ){

                if( phone_arr[i].getName().equals( search_name ) ){

                    System.out.println( phone_arr[i].getName() + "의 번호는 " + phone_arr[i].getTel() + "입니다." );
                    break;

                }
                else if( i == input - 1 ){

                    System.out.println( search_name + " 이 없습니다.");
                    break;

                }

            }

        }


    }

}

class Phone{

    private String name , tel ;

    Phone( String name , String tel ){

        this.name = name ;
        this.tel = tel ;

    }

    public String getName(){

        return this.name ;

    }

    public String getTel(){

        return this.tel ;

    }

}
