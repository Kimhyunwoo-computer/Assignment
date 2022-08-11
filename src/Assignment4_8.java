public class Assignment4_8 {

    public static void main(String[] args) {

        PositivePoint p = new PositivePoint() ;

        p.move( 10 ,10 ) ;

        System.out.println( p.toString() + "입니다." ) ;

        p.move( -5 , 5 ) ;

        System.out.println( p.toString()  + "입니다." ) ;

        PositivePoint p2 = new PositivePoint( -10 , -10 ) ;

        System.out.println( p2.toString() + "입니다." );

    }

}

class Point{

    private int x , y ;

    Point(){

        this. x = 0;

        this. y = 0 ;

    }

    Point( int x , int y ){

        this. x = x ;

        this. y = y ;

    }

    int getX(){

        return this.x ;

    }

    int getY(){

        return this.y ;

    }

    void move( int x , int y ){

        this. x = x ;

        this. y = y ;

    }


}

class PositivePoint extends Point{

    PositivePoint(){

        super();

    }

    PositivePoint( int x , int y ){

        super( x , y );

        if( x < 0 || y < 0){

            super.move( 0 , 0 );

        }

    }

    @Override
    void move( int x , int y ){

        if( x > 0 && y > 0 ){

            super. move( x , y );

        }

    }

    public String toString(){

        return "(" + getX() + "," + getY() +")의 점"  ;

    }

}
