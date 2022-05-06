import java.util.Scanner;

public class Chatbot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        greeting();
        repeatName();
        guessAge();
        countNumber();
        testQuestion();
    }
    public static void greeting (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello There!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
    }
    public static void repeatName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("I'm sorry. I didn't get that. Can you repeat your name again?");
        String repeatName= scan.nextLine();
        System.out.println("Nice to meet you " + repeatName + "!");
    }
    public static void guessAge(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Let me guess your age.");
        System.out.println("Enter any number from 1 -10");

        int num = Integer.valueOf(scan.nextLine());
         int number = ((num * 2) + 5)* 50;
         System.out.println(number);

         System.out.println("Did your birhtday pass already?");
         String birthdayPass=scan.nextLine();

         if( birthdayPass.equals("yes")){
             int age = number + 1772;
             System.out.println(age);
             System.out.println("What year were you born?");
             int birthYear= Integer.valueOf(scan.nextLine());
             int correctAge= Integer.valueOf((age-birthYear)% 100);
             System.out.println("You are " + correctAge);
         }else{
             int age = number + 1771;
             System.out.println(age);
             System.out.println("What year were you born?");
             int birthYear= Integer.valueOf(scan.nextLine());
             int correctAge= Integer.valueOf((age-birthYear)% 100);
             System.out.println("You are " + correctAge + ".");
         }
         
         System.out.println("Am I correct?");
         String guessingAge = scan.nextLine();

         if(guessingAge.equals("yes")|| guessingAge.equals("yeah")||guessingAge.equals("y")||guessingAge.equals("yelp")){
            System.out.println("Nice! I got it right!");
         }else{
             System.out.println("Oh darn!");
         }

        }
        public static void countNumber(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Now, enter a number and let's count");
            int countNum = Integer.valueOf(scan.nextLine());

            for (int i = 1; i< countNum+1; i++ )
            System.out.println(i);
        }
        public static void testQuestion(){
            Scanner scan = new Scanner(System.in);
           
             System.out.println("How would you create a variable with data type of byte whose value is 19, in java?");
             System.out.println("A: byte x = 19");
             System.out.println("B: let x = 19");
             System.out.println("C: x = 19");
             System.out.println("D: int x = 19");

             while (true)
             {
                 String answer = scan.nextLine();
                 if ( answer.equals("A")|| answer.equals("a")){
                     break;
                 }
                 else System.out.println("Please, try again.");
             }
             System.out.println("Congratulations, that is correct.");
        }
    
    }

    



