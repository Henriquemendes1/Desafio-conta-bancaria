import java.util.Scanner;
import static java.lang.System.getProperty;

public class Desafio {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String lineBreak = getProperty("line.separator");

        String accountType = "Current Account";
        int option = 0;

        System.out.println("Hello, welcome to the best digital bank " + lineBreak + "What is your full name ?");

        String name = reading.nextLine();

        System.out.println("Great, let's start with your deposit. " + lineBreak +
         "How much will your first deposit be?");

        Double balance = reading.nextDouble();

        System.out.println("\n***********************************");
        System.out.println("\nAccount Type: " + accountType);
        System.out.println("Name: " + name);
        System.out.println("Current balance: R$" + balance);
        System.out.println("\n*********************************\n");

        String menu = """
                \n** Enter your option **
                1 - Check balance
                2 - Transfer
                3 - Deposit
                4 - Exit
                
                """;

        while(option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1){
                System.out.println("The available balance is: R$"+ balance);

            }else if (option == 2){
                System.out.println("The available balance is: R$"+ balance);
                System.out.println("What amount do you want to transfer? ");
                double value = reading.nextDouble();
                if(value > balance){
                    System.out.println("There is no balance to make the transfer");
                }else {
                    balance -= value;
                    System.out.println("New balance: R$" + balance);
                }
            }else if (option == 3){
                System.out.println("What amount will you deposit? ");
                double deposit = reading.nextDouble();
                balance += deposit;
                System.out.println("The available balance is: R$"+ balance);
            } else if (option != 4 ){
                System.out.println("Invalid, try again");
            }
            
        }
    }
}

