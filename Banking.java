import java.util.*;
class BankAccount
{
    String name;
    double balance=0;
    BankAccount(String s)
      {
        name=s;
       }
    BankAccount(String s,double b)
      {
        name=s;
        balance=b; 
       }  
    void getBalance()
      { 
        System.out.println("Testing default constructor..."); 
        System.out.print(name+  " ");
        System.out.println("Current Balance:$ "+balance); 
       }

     void deposit(double d)
      {
         if(d<0)
         {
           System.out.println("Testing deposit method... depositing $"+d);    
           System.out.println("Cannot deposit a negative amount...");
           System.out.println("Current Balance:$ "+balance);
       
          }
         else
          {
            System.out.println("Testing deposit method... depositing $"+d);
            balance=balance+d; 
            System.out.print(name+  " ");
            System.out.println("Current Balance:$ "+balance);   
           }         
       }
     void withdraw(double w)
      {
         if(w<0)
           {
             System.out.println("Cannot withdraw a negative amount");
            }

         else if(w==(balance/2))
              {
                System.out.println("Retreiving balance...");
                System.out.println("Withdrawing half of that amount...");
                balance=balance-w;
                System.out.print(name+  " ");
                System.out.println("Current Balance:$ "+balance);
                
               }
            
         else if(w>balance)
             {
             System.out.println("Your account balance is only $ "+balance+" you cannot withdraw $"+w);
             System.out.print(name+  " ");
             System.out.println("Current Balance:$ "+balance);
            }  
        else 
            { 
             System.out.println("Retreiving balance...");
             System.out.println("Withdrawing... $"+w);
             balance=balance-w;   
             System.out.print(name+  " ");
             System.out.println("Current Balance:$ "+balance); 
             }
      }
     void printBal()
      {      
             System.out.println("Account Info : ");
             System.out.print(name+  " ");
             System.out.println("Current Balance:$ "+balance);          
      }

}
class Banking
{
  public static void main(String args[])
  {
    BankAccount b1=new  BankAccount("Bill Gates");
    BankAccount b2=new  BankAccount("Bill Gates",0.00);
    b2.getBalance();
    b2.deposit(-18);
    b2.deposit(455.14);
    b2.withdraw(227.57);
    b2.printBal();
  }
}
    
    
