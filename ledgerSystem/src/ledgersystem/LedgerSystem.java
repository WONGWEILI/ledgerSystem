package ledgersystem;

import java.util.Scanner;

public class LedgerSystem {

     private static Scanner scanner = new Scanner(System.in);
     
    private static void applyLoan() {
        System.out.println("\n== Apply Loan ==");
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter repayment period (months): ");
        int period = scanner.nextInt();
        scanner.nextLine();
        //loggedInUser.applyLoan(principal, rate, period);
    }

    private static void repayLoan() {
        System.out.println("\n== Repay Loan ==");
        System.out.print("Enter repayment amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        //loggedInUser.repayLoan(amount);
    }
    
    private static void manageLoan() {
        
        System.out.println("\n== Credit Loan ==");
        System.out.println("1. Apply");
        System.out.println("2. Repay");
        System.out.print("> ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                applyLoan();
                break;
            case 2:
                repayLoan();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    
    public static void main(String[] args) {
       
        
        System.out.println("\n== Welcome, " );
            System.out.println("Balance: " );
            System.out.println("Savings: " );
            System.out.println("Loan: " );
            System.out.println("\n== Transaction ==");
            System.out.println("1. Debit");
            System.out.println("2. Credit");
            System.out.println("3. History");
            System.out.println("4. Savings");
            System.out.println("5. Credit Loan");
            System.out.println("6. Deposit Interest Predictor");
            System.out.println("7. Logout");
            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                   
                    break;
                case 5:
                    manageLoan();
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    
     public void applyLoan(double principal, double rate, int period) {
            loan += principal + (principal * rate * period / 100);
        }

        public void repayLoan(double amount) {
            if (loan >= amount) {
                loan -= amount;
                System.out.println("Loan repaid successfully.");
            } else {
                System.out.println("Amount exceeds outstanding loan.");
            }
        }
    }
    
    

