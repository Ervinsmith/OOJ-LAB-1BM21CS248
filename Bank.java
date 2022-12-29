import java.util.Scanner;

class account {
    String Name;
    int Acc_num;
    String Acc_type;
}

class sav_acc extends account {
    double balance;

    sav_acc(String N, int An, String At, double B) {
        Name = N;
        Acc_num = An;
        Acc_type = At;
        balance = B;
    }

    Scanner ss = new Scanner(System.in);

    void deposit(int val) {
        balance += val;

    }

    void display_bal() {
        System.out.println("YOUR BALANCE IS: " + balance);
    }

    void deposit_interest() {
        double interest_rate = 0.05;
        double time = 0;
        System.out.println("ENTER THE TIME PERIOD");
        time = ss.nextDouble();
        double amount;
        amount = balance * Math.pow((1 + interest_rate), time);
        balance = amount;
    }

    void withdraw(int val) {
        if (val > balance) {
            System.out.println("out of funds, withdraw lesser amount");
        } else {
            balance -= val;
            System.out.println("withdrawal successful");
            System.out.println("new balance: " + balance);
        }
    }

    void check_min() {
        double min_bal = 2000.00;
        double penalty = 100.00;
        if (balance < min_bal) {
            System.out.println("BALANCE LESSER THAN MINIMUM BALANCE, PENALTY IMPOSED");
            balance -= penalty;
        } else {
            System.out.println("BALANCE HIGHER THAN MINIMUM BALANCE, NO PENALTY");
        }
    }
}

class cur_acc extends account {
    double balance;

    cur_acc(String N, int An, String At, Double B) {
        Name = N;
        Acc_num = An;
        Acc_type = At;
        balance = B;
    }

    void deposit(int val) {
        balance += val;
    }

    void display_bal() {
        System.out.println("YOUR BALANCE IS: " + balance);
    }

    void deposit_interest() {
        System.out.println("NO DEPOSIT PROVIDED FOR CURRENT ACCOUNT");
    }

    void withdraw() {
        System.out.println("NO WITHDRAWAL PROVIDED FOR CURRENT ACCOUNT");
    }

    void Cheque_withdrawal(int val) {
        balance -= val;
        System.out.println("withdrawal successful");
        System.out.println("new balance: " + balance);
    }

    void check_min() {
        double min_bal = 2000.00;
        double penalty = 100.00;
        if (balance < min_bal) {
            System.out.println("BALANCE LESSER THAN MINIMUM BALANCE, PENALTY IMPOSED");
            balance -= penalty;
        } else {
            System.out.println("BALANCE HIGHER THAN MINIMUM BALANCE, NO PENALTY");
        }
    }
}

class Bank {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your name, account number, aacount type(savings/current), balance");
        String Name = ss.nextLine();
        int Acc_num = ss.nextInt();
        String Acc_type = ss.next();
        double balance = ss.nextDouble();
        if (Acc_type.equals("savings")) {
            sav_acc a1 = new sav_acc(Name, Acc_num, Acc_type, balance);
            int choice = 0;
            while (choice != 6) {
                System.out.println(
                        "1.Deposit\n2.Display Balance\n3.Compute and deposit interest\n4.withdraw\n5.Check for minimum balance\n6.Exit");
                choice = ss.nextInt();
                switch (choice) {
                    case (1):
                        System.out.println("Enter the value to deposit");
                        int val = ss.nextInt();
                        a1.deposit(val);
                        break;
                    case (2):
                        a1.display_bal();
                        break;
                    case (3):
                        a1.deposit_interest();
                        break;
                    case (4):
                        System.out.println("Enter the value to withdraw");
                        int withd = ss.nextInt();
                        a1.withdraw(withd);
                        break;
                    case (5):
                        a1.check_min();
                        break;
                    case (6):
                        System.out.println("Exited");
                        break;
                    default:
                        System.out.println("Enter a valid choice");
                        break;
                }
            }
        } else {
            cur_acc a1 = new cur_acc(Name, Acc_num, Acc_type, balance);
            int choice = 0;
            while (choice != 7) {
                System.out.println(
                        "1.Deposit\n2.Display balance\n3.Compute and deposit interest\n4.Withdraw\n5.Cheque Withdrawal\n6.Check for minimum balance\n7.Exit");
                choice = ss.nextInt();
                switch (choice) {
                    case (1):
                        System.out.println("Enter the value to deposit");
                        int val = ss.nextInt();
                        a1.deposit(val);
                        break;
                    case (2):
                        a1.display_bal();
                        break;
                    case (3):
                        a1.deposit_interest();
                        break;
                    case (4):
                        a1.withdraw();
                        break;
                    case(5):
                    System.out.println("Enter the value to withdraw");
                    int val1 = ss.nextInt();
                        a1.Cheque_withdrawal(val1);
                    case (6):
                        a1.check_min();
                        break;
                    case (7):
                        System.out.println("Exited");
                        break;
                    default:
                        System.out.println("Enter a valid choice");
                        break;
                }
            }
        }
    }
}
