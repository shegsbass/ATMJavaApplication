import java.util.Scanner;
public class AtmTransaction {
	int pin; 
	int yes = 1;
	int no = 2;
	String repeat;
	String name;
	Scanner s = new Scanner(System.in);
	
	public void AtmTransaction(){
	System.out.println("Welcome to Shegs bank\nPlease Enter your name as your atm card");
	name = s.nextLine();
	System.out.println("Hello "+ name + " Nice to have you here\n");
	}
	
	public void verification(){
		

		System.out.print("ENTER YOUR PIN: ");
		int read = s.nextInt();
		
		if (String.valueOf(read).length() == 4){
			System.out.println("Correct pin\n");
		}else{
			System.out.println("------------------------------");
			System.out.println("Incorrect pin");
			System.out.println("------------------------------");
			verification();
		}

	}
	
	public void repeatProcess(){
			System.out.println("Would you like to perform another transaction?\n1 for YES\n2 for NO");
			int n = s.nextInt();
			switch(n){
			case 1:
                System.out.println(yes);
                break;
                
			default:
				System.out.println("------------------------------");
				System.out.print("Thank you for banking with us" + name);
				System.out.println("------------------------------");
                System.exit(0);
                
			}
		}
        
           
	public void operation(){
		 int balance = 5000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("You may now begin your Transaction\n");
	            System.out.println("Enter 1 for Withdraw");
	            System.out.println("Enter 2 for Deposit");
	            System.out.println("Enter 3 for Check Balance");
	            System.out.println("Enter 4 for EXIT");
	            System.out.print("Choose the operation you want to perform:");
	            
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("\nEnter money to be withdrawn:");
	                withdraw = s.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("------------------------------");
	                    System.out.println("Please collect your money");
	                    System.out.println("------------------------------");
	                    repeatProcess();
	                    
	                }
	                else
	                {
	                	System.out.println("------------------------------");
	                    System.out.println("Insufficient Balance");
	                    System.out.println("------------------------------");
	                    repeatProcess();
	                }
	                System.out.println("");
	                break;
	 
	                case 2:
	                System.out.print("\nEnter the amount to be deposited:");
	                deposit = s.nextInt();
	                balance = balance + deposit;
	                System.out.println("------------------------------");
	                System.out.println("Your Money has been successfully depsited");
	                System.out.println("------------------------------");
	                repeatProcess();
	                break;
	 
	                case 3:
	                System.out.println("------------------------------");
	                System.out.println("The current amount in you account Balance is: #"+balance);
	                System.out.println("------------------------------");
	                System.out.println("");
	                repeatProcess();
	                break;
	 
	                default:
	                System.out.println("------------------------------");
	    			System.out.print("Thank you for banking with us" + name + "Do have a nice day.\n");
	    			System.out.println("------------------------------");
	                System.exit(0);
	            }
	        }
	}
	public static void main(String[] args) {
		AtmTransaction input = new AtmTransaction();
		input.AtmTransaction();
		input.verification();
		input.operation();
		input.repeatProcess();
		
		
	}
	}
