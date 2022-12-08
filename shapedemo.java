abstract class shape{
    int a,b;
    shape(int x, int y){
        a=x;
        b=y;
    }
    shape(int x){
        a=x;
    }
    void PrintArea(){
    }
}
class rectangle extends shape{
    rectangle(int x,int y){
        super(x,y);
    }
    void PrintArea(){
        System.out.println("area of rectangle is: "+(a*b));
    }
}
class triangle extends shape{
    triangle(int x,int y){
        super(x,y);
    }
    void PrintArea(){
        System.out.println("area of triangle is: "+(0.5*a*b));
    }
}
class circle extends shape{
    circle(int x){
        super(x);
    }
    void PrintArea(){
        System.out.println("area of the circle is: "+(3.14*a*a));
    }
}
class shapedemo{
    public static void main(String args[]){
        rectangle r1 = new rectangle(30,40);
        triangle t1 = new triangle(50,40);
        circle c1 = new circle(10);
        r1.PrintArea();
        t1.PrintArea();
        c1.PrintArea();
    }
}