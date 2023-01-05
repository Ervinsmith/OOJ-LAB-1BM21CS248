import java.util.Scanner;
class Father{
    int Father_age;
    public Father(int Fa){
        try{
            Father_age = Fa;
            if(Father_age < 0){
                throw new Exception("Error! Age is less than 0");
            }
            else{
                Father_age = Fa;
            }
        }
        catch(Exception e){
            System.out.println("Caught : "+e);
        }
    }
}

class Son extends Father{
    int Son_age;
    public Son(int Fa,int Sa){
        super(Fa);
        try{
            Son_age = Sa;
            if(Son_age<0){
                throw new Exception("Error! Son's age is less than 0");
            }
            else if(Son_age >= Father_age){
                throw new Exception("Error! Son's age cannot be more than the Father's age");
            }
            else{
                Son_age = Sa;
            }
        }
        catch(Exception e){
            System.out.println("Caught : "+e);
        }
}
void display(){
    System.out.println("Father's age = "+Father_age);
    System.out.println("Son's age = "+Son_age);
}
}

class InheritanceTree extends Exception{
    public static void main(String args[]){
        Scanner ss = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the father's age");   
        a = ss.nextInt();
        System.out.println("Enter the son's age");
        b = ss.nextInt();
        Son ob1 = new Son(a,b);
        ob1.display();
    }
}