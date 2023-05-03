package org.example;
import java.util.*;

public class OasisATMInterface {

    static float available_balance = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the userID :");
        String userID = sc.nextLine();
        System.out.println("Enter the userPIN :");
        int userPIN = sc.nextInt();
        while (true) {
            System.out.println("Press 1 to enter the interface or else any number to exit the interface");
            int n = sc.nextInt();
            if(n == 1) {
                System.out.println("1:WITHDRAW AMOUNT");
                System.out.println("2:DEPOSIT AMOUNT");
                System.out.println("3:TRANSFER AMOUNT");
                System.out.println("4:CHECK BALANCE");
                System.out.println("5:EXIT/QUIT");
                System.out.println("Now, choose the operation you need to perform: ");
                int m = sc.nextInt();
                if(m == 1) {
                    Withdraw ob1 = new Withdraw();
                    ob1.withdraw();
                }
                else if(m == 2) {
                    Deposit ob2 = new Deposit();
                    ob2.deposit();
                }
                else if(m == 3) {
                    Transfer ob3 = new Transfer();
                    ob3.transfer();
                }
                else if(m == 4){
                    TransactionsHistory ob4 = new TransactionsHistory();
                    ob4.checkBalance();;
                }
                else if(m == 5){
                    break;
                }
            }
            else{
                break;
            }
        }
    }
}


class Withdraw{
    public void withdraw(){

        System.out.println("Enter the amount that is you need to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float withdraw_amount = sc.nextFloat();
        if(withdraw_amount > OasisATMInterface.available_balance){
            System.out.println("Sorry, You are out of funds :(");
        }
        else{
            OasisATMInterface.available_balance = OasisATMInterface.available_balance - withdraw_amount;
            System.out.println("The available balance after the withdrawal is: "+ OasisATMInterface.available_balance);
        }

    }
}

class Deposit{
    public void deposit(){
        System.out.println("Enter the value that is to be deposited into the account: ");
        Scanner sc = new Scanner(System.in);
        float deposit_amount = sc.nextInt();
        if(deposit_amount > 0) {
            OasisATMInterface.available_balance = deposit_amount + OasisATMInterface.available_balance;
        }
        else{
            System.out.println("Please deposit the amount");
        }
        System.out.println("The available balance is "+ OasisATMInterface.available_balance);
    }
}

class Transfer{
    public void transfer(){
        System.out.println("Enter the amount that is to be transferred: ");
        Scanner sc = new Scanner(System.in);
        float transferred_amount = sc.nextInt();
        OasisATMInterface.available_balance = OasisATMInterface.available_balance - transferred_amount;
        System.out.println("The available balance after the transfer of funds is "+ OasisATMInterface.available_balance);
    }
}



class TransactionsHistory{
    public void checkBalance() {
        System.out.println("The available balance is " + OasisATMInterface.available_balance);
    }
}



