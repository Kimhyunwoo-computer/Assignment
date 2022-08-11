import java.util.Scanner;

public class assignment2_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System . in );

        System.out.print("정수 몇개?");

        int input = scanner.nextInt();

        int [ ] arr = new int[ input ];

        for(int i = 0 ; i < input ; i++ ){

            arr[ i ] = (int) ( Math.random( ) * 100 ) + 1 ;

            for(int j = 0 ; j < i ; j++ ){

                if( arr[ j ] == arr [ i ] ){

                    arr[ i ] = 0 ;
                    i-- ;

                }

            }

        }

        for(int i = 1 ; i <= input ; i++ ){

            System.out.print( arr [ i - 1 ] + " " );

            if( i % 10 == 0 )

                System.out.println();

        }

    }

}
