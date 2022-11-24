import java.util.Scanner;
class student{
String USN;
String Name;
int credits[] = new int[9];
int marks[] = new int[9];

void EnterInfo(){
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the USN");
    USN = ss.nextLine();
    System.out.println("Enter the Name");
    Name = ss.nextLine();
    System.out.println("Enter the credits");
    for(int i=0;i<9;i++){
        credits[i] = ss.nextInt();
    }
    System.out.println("Enter the marks");
    for(int i=0;i<9;i++){
        marks[i] = ss.nextInt();
    }
}
void DisplayInfo(){
    System.out.println("\nPRINTING STUDENTS INFO: \n");
    System.out.println("USN: "+ USN);
    System.out.println("NAME: "+ Name);
    System.out.print("CREDITS: ");
    for(int i=0;i<9;i++){
        System.out.print(credits[i]+ " ");
    }
    System.out.println();
    System.out.print("MARKS: ");
    for(int i=0;i<9;i++){
    System.out.print(marks[i]+ " ");
    }
}
float CalculateSGPA(){
    float sgpa;
    float totalcredits = 0;
    for(int i=0;i<9;i++){
        totalcredits+=credits[i];
    }
    float Sumgp=0;
    float gp=0;
    for(int i=0;i<9;i++){
        gp = (((marks[i])/10)+1);
        Sumgp+= credits[i] * gp;
    }
    sgpa= Sumgp/totalcredits;
    return sgpa;
}
}
class SGPA{
    public static void main(String args[]){
        student s1= new student();
        s1.EnterInfo();
        s1.DisplayInfo();
        float sgpa = s1.CalculateSGPA();
        System.out.println("\nSGPA: "+sgpa);
    }
}
