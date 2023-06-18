/*
 * @author Federico Calzati
 * ID: 21477044
 * Task 5: Design a class named Account that contains:
 * • A private int data field named id for the account (default 0).
 * • A private double data field named balance for the account (default 0).
 * • A private double data field named annualInterestRate that stores the current interest
 *   rate (default 0). Assume all accounts have the same interest rate.
 * • A private Date data field named dateCreated that stores the date when the account
 *   was created.
 * • A no-arg constructor that creates a default account.
 * • A constructor that creates an account with the specified id and initial balance.
 * • The accessor and mutator methods for id, balance, and annualInterestRate.
 * • The accessor method for dateCreated.
 * • A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * • A method named withdraw that withdraws a specified amount from the account.
 * • A method named deposit that deposits a specified amount to the account.
 * • Draw the UML diagram for the class.
 * • Implement the class.
 * 
 *  Write a Java program that creates an Account object with an
 *  account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the
 *  withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and
 *  print the balance, the monthly interest, and the date when this account was created. 
 */

/*
 * Course: Computer Science
 * Course code: COMSCF001E
 * Module: Programming
 * Instructor: Dr Ikram Ur Rehman 
 */
package account;
import java.time.LocalDate;                     // import the LocalDate class
import java.time.format.FormatStyle;            // import FormatStyle class
import java.time.format.DateTimeFormatter;      // import DateTimeFormatter class


public class Account {
    // Define class properties
    private int accountId;
    private Double accountBalance;
    private Double annualInterestRate;
    private LocalDate dateOfCreation;
    
    
    // Define a default constructor  
    public Account(){
        accountId = 0;                      // Assign initial value to accountId
        accountBalance = 0d;                // Assign initial value to accountBalance
        annualInterestRate = 0d;            // Assign initial value to annualInterestRate
        dateOfCreation  = null;             // Assign initial value to dateOfCreation

    }
    
    // Definition of a  parameterised constructor which initilises class properties to the values passed as arguments
    public Account(int id, Double initialBalance){
        accountId= id;                                      // Initilise class accountId to the values passed as argument
        accountBalance = initialBalance;                    // Initilise class accountBalance to the values passed as argument
    }

    // Definition of all set methods to set the class properties individually
    public void setAccountId(int id){
        accountId = id;                                     // Set class accountId to the value passed as argument
    }
    public void setAccountBalance(Double initialBalance){
        accountBalance = initialBalance;                    // Set class accountBalance to the value passed as argument
    }
    public void setAnnualInterestRate(Double AnnualInterestRate){
        annualInterestRate = AnnualInterestRate;          // Set class annualInterestRate to the value passed as argument
    }

    public void setDateCreated(LocalDate DateCreated){
        dateOfCreation = DateCreated;                    // Set class dateOfCreation to the value passed as argument
      
            
    }

    // Definition of all get methods to set the class properties individually  
    public int getAccountId(){
        System.out.println("The Account ID is : " + accountId);
        return accountId;
    }
    public Double getAccountBalance(){                  // Get the value of class accountBalance
        System.out.println("The Account " + accountId + " balance : $" + String.format("%.2f",accountBalance));
        return accountBalance;               
        
    }
     public Double getAnnualInterestRate(){             // Get the value of class annualInterestRate
        System.out.println(" The Account" + accountId + "balance Annual Interest rate is: " + annualInterestRate + " %");
        return annualInterestRate;
    }
    public LocalDate getDateCreated(){                  // Get the value of class dateOfCreation
        LocalDate dateOfCreation = LocalDate.now();     // Creation of LocalDate object and assign a real time value with LocalDate.now()method
        //ofLocalizedDate() dateOfCreation formats to the local date format
        System.out.println("The Account " + accountId + " has been created on date: " + dateOfCreation.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        return dateOfCreation;
    }
   
    // Definition of method  that returns the monthly interest rate
    public Double getMonthlyInterestRate(){
        Double monthlyInterestRate = annualInterestRate /12;
        System.out.println("The Account " + accountId + " monthly interest rate is: " + String.format("%.2f",monthlyInterestRate) + " %");
        return monthlyInterestRate;
    }
    
    // Definition of method that withdraws a specified amount from the account 
    public void withdraw(Double withdrawAmount){
        System.out.println("Account ID "+ accountId + " withdraw amount: $" + String.format("%.2f",withdrawAmount));
        accountBalance = accountBalance - withdrawAmount;   // Update the value of accountBalance by subtracting the withdraw amount
    }
    
    // Definition of method that deposit a specified amount from the account
    public void deposit(Double depositAmount){
        System.out.println("Account ID "+ accountId + " deposit amount: $" +   String.format("%.2f",depositAmount));
        accountBalance = accountBalance + depositAmount;      // Update the value of accountBalance by adding the withdraw amount
    }
    public static void main(String[] args) {
        Account account1 = new Account();           // Creation of Account1 object
        account1.setAccountId(1122);                // Using Account class setAccountId() method to set Account Id by passing the value as a paramentre
        account1.setAccountBalance(20000.00);       // Using Account class setAccountBalance() method to set Account balance by passing the value as a paramentre
        account1.setDateCreated(LocalDate.now());   // Using Account class setDateCreated() method to set Account date creation by passing the value as a paramentre using Jave LocalDate.now() method
        account1.getAccountBalance();               // Using Account class getAccountBalance() method to obtain the Account Balance
        account1.setAnnualInterestRate(4.5);        // Using Account class setAnnualInterestRate() method to set Account interest rate by passing the value as a parametre
        account1.withdraw(2500.00);                 // Using Account class withdraw() method to withdraw a value passed as a parametre
        account1.deposit(3000.00);                  // Using Account class deposit() method to deposit a value passed as a parametre
        account1.getAccountBalance();               // Using Account class getAccountBalance() method to obtain the Account Balance
        account1.getMonthlyInterestRate();          // Using Account class getMonthlyInterestRate() method to obtain the monthly interest rate
        account1.getDateCreated();                  // Using Account class getDateCreated() method to obtain the creation date of the account
    }
    
}
