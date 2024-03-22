import java.util.Scanner;
class Account{
static int balance=20000;
  void display(int account , int bal){
    System.out.println("Your account no. :"+account +"\n Your balance"+bal+"\n");
  }
   boolean count(double x){	
    	int n,c=0;
    	while(x!=0){
    		c=c+1;
    		x=x/10;
    	}
    	
     if(c==334)
        return true;
    else
        return false;
  }
  void transfer(){
    Scanner inp=new Scanner(System.in);
    int x;double ot;
    System.out.print("Enter account number to transfer:");
    ot=inp.nextDouble();
    if(count(ot)){
    System.out.print("Enter amount to be transferred :");
    x=inp.nextInt();
    if(x<=balance){
    balance= balance-x;
    System.out.println("Your balance is"+balance);
    }
    else
      System.out.println("Insufficient Balance");
  }
  else
       System.out.println("Please check your account number");
  }
  void withdraw(){
  int x;
  Scanner inp=new Scanner(System.in);
  System.out.print("Enter Amount to Withdraw [only 500s,100s are available]");
  x=inp.nextInt();
  if(x%500==0 || x%100==0){
    if(x<=balance){
     balance=balance-x;
     System.out.println("Your balance is :"+balance);}
    else
      System.out.println("Insufficient Balance");
    }
  else
      System.out.println("Notes not available");
  }
  void balance(){
    System.out.println("Your balance is :"+balance);}
    
    
  public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    Account a = new Account();
    double account;
    int x;
    System.out.print("Enter your account number :");
    account=inp.nextDouble();
    if(a.count(account) ){
    System.out.println("Enter 1-transfer money , 2- withdraw money, 3- display balance");
   
    do{
    System.out.print("Enter your case :");
     x=inp.nextInt();
    switch(x){
    case 1 :a.transfer();break;
    case 2 :a.withdraw();break;
    case 3 :a.balance();break;
    default:System.out.println("invalid case");
    }}while(x!=-1);
    }
  else
   System.out.println("Please check the account number");
    
  }
}
