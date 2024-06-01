import java.util.Scanner;

class Atm{



    float Balance ;
    int pin = 1234;


    public void checkpin(){
        System.out.println("Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin==pin ){
            menu();
        }else {
            System.out.println("Enter a vaild pin:");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw money ");
        System.out.println("3. Deposit money ");
        System.out.println("4. Exit ");

        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();

        if (opt == 1){
            CheckBalance();
        } else if (opt == 2) {
            WithdrawMoney();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            return;

        }else {
            System.out.println("Enter a Vaild Choice:");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        Float amount   = sc.nextFloat();
        if (amount> Balance){
            System.out.println("Insufficient balance ");
        }else {
            Balance = Balance  - amount;
            System.out.println("Money withdraw successful");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the amount:");
        Scanner sc =new Scanner(System.in);
        Float amount = sc.nextFloat();
        Balance =Balance + amount;
        System.out.println("Money Deposit Successful:");
        menu();
    }


}

public class atm_project {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();


    }
}
