import java.util.*;
class ATM
{
    public static void main(String args[])
    {
        int bal = 20000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Pin = ");
        int pin = sc.nextInt();

        if(pin == 9898){

        while(true)
        {
           System.out.println("\n1.Check Balance");
            System.out.println("2.diposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            
            System.out.println("Enter Your Choice ");
            int ch = sc.nextInt();
        


            switch(ch)
            {
                case 1:
                    System.out.println("balance = " + bal);
                    break;
                case 2:
                    
                    System.out.print("Enter Diposit Amount = ");
                    int dip = sc.nextInt();
                    bal = bal + dip; 
                    System.out.println("Diposited amount = " + dip);
                    System.out.println("Total Amount " + bal);
                    break;

                case 3:

                    System.out.print("Enter Withdraw Amount = ");
                    int amt = sc.nextInt();
                    if(bal>amt)
                    {
                        bal = bal - amt;
                        System.out.println("Withdraw Amount " + amt);
                        System.out.println("\nTotal Amount = " + bal);
                    }else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                
            
                case 4 : 
                    
                    System.exit(0);                
          }

        }
    }else
    {
        System.out.println("Incurrect  Password !\n Enter Right PassWord");

    }

    }

}