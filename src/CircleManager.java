import java.util.Scanner;

public class CircleManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle_c[] c = new Circle_c[3];

        for (int i = 0; i < c.length; i++) {

            System.out.print("x, y, radius >>");

            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();

            c[i] = new Circle_c( x , y , radius);

        }

        int max = 0;
        int max_i = 0;

        for (int i = 0; i < c.length; i++) {

            if( max < c[i].showRadius() ){

                max = c[i].showRadius() ;
                max_i = i ;

            }
        }

        System.out.print( "가장 면적인 큰 원은 " );
        c[max_i].show();

    }
}

class Circle_c{

    private double x , y ;
    private int radius ;

    public Circle_c ( double x , double y , int radius ){

        this.x = x ;
        this.y = y ;
        this.radius = radius ;

    }

    public void show(){

        System.out.println( "(" + this.x + "," + this.y + ")" + this.radius );

    }

    public int showRadius(){

        return this.radius ;

    }


}
