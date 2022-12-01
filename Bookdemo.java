import java.util.Scanner;

class Book {
    String Name;
    String author;
    int price;
    int num_pages;

    Book(String N, String Au, int P, int Pa) {
        Name = N;
        author = Au;
        price = P;
        num_pages = Pa;
    }

    Book() {

    }

    void setdetails() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the book Name: ");
        Name = ss.nextLine();
        System.out.println("Enter the Author Name: ");
        author = ss.nextLine();
        System.out.println("Enter the Price: ");
        price = ss.nextInt();
        System.out.println("Enter the No.Of Pages: ");
        num_pages = ss.nextInt();
        System.out.println("DETAILS SET SUCCESFULLY");
    }

    void getdetails() {
        System.out.println("NAME: " + Name);
        System.out.println("AUTHOR: " + author);
        System.out.println("PRICE: " + price);
        System.out.println("NO.OF PAGES: " + num_pages);
    }

    public String toString() {
        return ("NAME: " + Name + "\nAUTHOR: " + author + "\nPRICE: " + price + "\nNo.Of Pages: " + num_pages);
    }
}

class Bookdemo {
    public static void main(String args[]) {
        int n;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the no of Books: ");
        n = ss.nextInt();
        Book b1[] = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER DETAILS:");
            System.out.println("1:set using methods\n2:set using constructor");
            int ch = ss.nextInt();
            if (ch == 1) {
                b1[i] = new Book();
                b1[i].setdetails();
            } else {
                b1[i] = new Book("Kings", "Kingsley", 1000, 1500);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\n PRINRING BOOK DETAILS");
            System.out.println("1:Display using methods\n2:Display using toString");
            int ch = ss.nextInt();
            if (ch == 1) {
                b1[i].getdetails();
                System.out.println();
            } else {
                String details = b1[i].toString();
                System.out.println(details);
            }
        }
    }
}