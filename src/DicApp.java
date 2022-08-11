import java.util.Scanner;

public class DicApp {

    public static void main(String[] args) {

        System.out.println("한영 단어 검색 프로그램입니다.");

        Scanner scanner = new Scanner(System.in) ;

        while( true ){

            System.out.print("한글 단어?");

            String kor = scanner.next();

            if( kor.equals("그만") )
                break ;

            System.out.println( kor + "은 " + Dictionary_d.kor2Eng(kor) );

        }

    }

}

class Dictionary_d{

    private static String[] kor = { "사랑" , "아기" , "돈" , "미래" , "희망" } ;
    private static String[] eng = { "love" , "baby" , "money" , "future" , "hope" } ;

    public static String kor2Eng(String word){

        int num = kor.length ;
        for( int i = 0 ; i < kor.length ; i++ ){

            if( kor[i].equals(word) ){
                num = i ;
            }

        }

        if( num != kor.length ){

            return eng[num];

        }
        return "저의 사전에 없습니다.";
    }
}
