public class Assignment4_14 {

    public static void main(String[] args) {

        Shape [] list = new Shape [ 3 ] ;

        list[ 0 ] = new Circle( 10 ) ;
        list[ 1 ] = new Oval( 20 ,30 );
        list[ 2 ] = new Rect( 10 , 40 ) ;

        for( int i = 0 ; i < list.length ; i++ ){

            list[ i ].redraw() ;

        }

        for( int i = 0 ; i < list.length ; i++ ){

            System.out.println("면적은 " + list[ i ].getArea() );

        }

    }

}

interface Shape {

    final double PI = 3.14 ;
    void draw() ;
    double getArea() ;
    default public void redraw(){

        System.out.print("--- 다시 그립니다. ");
        draw();

    }

}

class Circle implements Shape{

    private int radius ;

    public Circle( int raidus ){

        this.radius = raidus ;

    }

    public void draw(){

        System.out.println("반지름이 " + this.radius + "인 원입니다.");

    }

    public double getArea() {
        return PI * this.radius * this.radius ;
    }

}

class Oval implements Shape{

    private int radius1 , radius2 ;

    public Oval( int radius1 , int radius2 ){

        this.radius1 = radius1 ;
        this.radius2 = radius2 ;

    }

    public void draw(){

        System.out.println( this.radius1 + "x" + this.radius2 + "에 내접하는 타원입니다.");

    }

    public double getArea() {

        return PI * this.radius1 * this.radius2 ;

    }

}

class Rect implements Shape{

    private int width , height ;

    public Rect( int width , int height ){

        this.width = width ;
        this.height = height ;

    }

    public void draw() {

        System.out.println( this.width + "x" + this.height + "크기의 사각형입니다.");

    }

    public double getArea() {

        return this.width * this.height ;

    }
}