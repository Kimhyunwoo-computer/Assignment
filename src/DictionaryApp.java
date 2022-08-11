public class DictionaryApp {

    public static void main(String[] args) {

        Dictionary dic = new Dictionary( 10 ) ;

        dic.put( "황기태" , "자바" ) ;
        dic.put( "이재문" , "파이선" ) ;
        dic.put( "이재문" , "C++" ) ;

        System.out.println( "이재문의 값은 " + dic.get( "이재문" ) );
        System.out.println( "황기태의 값은 " + dic.get( "황기태" ) );

        dic.delete("황기태") ;

        System.out.println( "황기태의 값은 " + dic.get( "황기태" ) );

    }

}

abstract class PairMap{

    protected String keyArray [] ;
    protected String valueArray [] ;
    abstract String get( String key ) ;
    abstract void put( String key , String value ) ;
    abstract String delete( String key ) ;
    abstract int length() ;

}

class Dictionary extends PairMap{

    private int now = 0 ;

    Dictionary( int num ){

        super.keyArray = new String[10] ;

        super.valueArray = new String[10] ;

    }

    @Override
    String get( String key ){

        for( int i = 0 ; i < super.keyArray.length ; i++ ){

            if( key.equals( super.keyArray [ i ] ) ){

                return super.valueArray[ i ] ;
            }

        }
        return null ;
    }

    @Override
    void put(String key, String value) {

        int sameValue = super.keyArray.length ;

        for( int i = 0 ; i < super.keyArray.length ; i++ ){

            if( key.equals( super.keyArray[ i ] ) ){

                sameValue = i ;

            }


        }

        if( sameValue != super.keyArray.length ){

            super.valueArray[ sameValue ] = value ;

        }
        else{

            int num = length() ;


            super.keyArray[ num ] = key ;
            super.valueArray[ num ] = value ;

            now ++ ;

        }

    }

    @Override
    String delete( String key ){

        String deleteValue = null ;

        for( int i = 0 ; i < super.keyArray.length ; i++ ){

            if( key.equals( super.keyArray [ i ] ) ){

                super.keyArray[ i ] = null ;

                deleteValue = super.valueArray [ i ] ;

                super.valueArray[ i ] = null ;

                now -- ;

            }

        }

        return deleteValue ;

    }

    @Override
    int length(){

        return now ;

    }

}
