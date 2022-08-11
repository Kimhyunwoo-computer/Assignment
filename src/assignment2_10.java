public class assignment2_10 {

    public static void main(String[] args) {

        int[][] arr = new int [ 4 ][ 4 ];

        int[] zero = new int [ 6 ];

        for( int i = 0 ; i < 6 ; i++ ){

            zero[ i ] = (int) ( Math.random( ) * 16 )  ;

            for( int j = 0 ; j < i ; j ++){

                if( zero[ i ] == zero[ j ] ){

                    zero[ i ] = 0 ;

                    i--;

                }
            }
        }

        for( int i = 0 ; i < 4 ; i++ ){

            for( int j = 0 ; j < 4 ; j++){

                arr[ i ][ j ] = (int) ( Math.random( ) * 10 ) + 1 ;

            }

        }

        for( int i = 0 ; i < 6 ; i++ ){

            arr[ zero [ i ] / 4 ][ zero[ i ] % 4 ] = 0;

        }

        for( int i = 0 ; i < 4 ; i++ ){

            for( int j = 0 ; j < 4 ; j++ ){

                System.out.print( arr[ i ][ j ] + "\t");

            }

                System.out.println("");

        }

    }

}
