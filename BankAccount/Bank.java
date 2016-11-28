public class Bank
{
   public static void main(String[] args)
   {
      BankAccount bank = new BankAccount(1000.0, 5.0);
      
      System.out.printf("Courrent balance: %2.2f", bank.getBalance());
      System.out.printf("\nCourrent interst: %2.2f", bank.getInterest());
      
      bank.deposit(1000);
      
      System.out.printf("\n\nCourrent balance: %2.2f", bank.getBalance());
      System.out.printf("\nCourrent interst: %2.2f", bank.getInterest());
      
      bank.withdraw(500);
      
      System.out.printf("\n\nCourrent balance: %2.2f", bank.getBalance());
      System.out.printf("\nCourrent interst: %2.2f", bank.getInterest());
      
      bank.addInterest();
      
      System.out.printf("\n\nCourrent balance: %2.2f", bank.getBalance());
      System.out.printf("\nCourrent interst: %2.2f", bank.getInterest());
      
   }
}