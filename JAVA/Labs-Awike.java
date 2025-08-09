/* 
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner Marks = new Scanner(System.in);

        int[] mark = new int[10];
        
        for(int i = 0; i < mark.length; i++){

            System.out.print("How much did you get: ");
            mark[i] = Marks.nextInt(); 
        }

        int highMark = mark[0];
        for(int i = 0; i < 10; i++){
            if(mark[i] > highMark){
                highMark = mark[i];
            }
        }
        System.out.print("Highest mark is " + highMark);

    }
}
*/

/*import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] mark = new int[10];
        String[] name = new String[10];

        for(int i = 0; i < 10; i++){
            System.out.println("What is your name? ");
            name[i] = scan.nextLine();
            System.out.println("How much did you get? ");
            mark[i] = scan.nextInt();
        }

        String Lmark = LowestMarks(name, mark);
        System.out.print("Student with the lowest mark is: " + Lmark);


    }

    public static String LowestMarks(String[] array1, int[] array2){
       int lowMark = array2[0];
       String Student = array1[0];

        for(int j = 0; j < array2.length; j++){
            if(lowMark > array2[j]){
                lowMark = array2[j];
                Student = array1[j];
            }
        }
        return Student;
    }
}
*/

/* 
public class main{
    public static void main(String[] args) {
        
       for(int i = 0; i <5; i++){
           System.out.println("Hello World\n");
       }
    }
}
*/

/*import java.util.Scanner;


public class main {
   public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);

   int counter = 0;
   System.out.print("Please enter any number: ");
   int num = scanner.nextInt();

   for(int i = 0; i < num; i++){
       if(i % 2 == 0){
           counter = counter + i;
       }
   }
   System.out.println(counter);
   }


}
*/
/* 
import java.util.Scanner;


public class main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int num = scanner.nextInt();
        

        for(int i = 0; i <= num; i++){
            if(i % 2 != 0){
                System.out.print(i + " "); 
            }
        }
       

    }
}
    
*/

/*import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int mark;
        String grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        mark = scanner.nextInt();
        if (mark < 0) {
            System.out.print("Entering of negative number not permitted! Try again!");
        } else {
            if (mark >= 75) {
                grade = "Distinction";
            } else if (mark >= 70) {
                grade = "Merit";
            } else if (mark >= 60) {
                grade = "Credit";
            } else if (mark >= 50) {
                grade = "Pass";
            } else {
                grade = "Fail";
            }
            System.out.println("Your grade grade is " + grade);
        }
        

    }
}
*/

/*import java.util.Scanner;

public class main {

    int mark;
    String grade;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();

        if (mark < 0) {
            System.out.print("Numbers less than 0!");
        } else {
            switch (mark) {
                case 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
                        100:

                    System.out.print("Grade is distinction");
                    break;

                case 70, 71, 72, 73, 74:

                    System.err.print("Grade is Merit");
                    break;

                case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:

                    System.out.println("Grade is Credit");
                    break;

                case 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:

                    System.out.print("Grade is Pass");
                    break;

                default:

                    System.out.print("Retard");

            }
        }

    }
}
    */

/*import java.util.Scanner;

public  class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String original;
        String reverse = "";

        System.out.print("Enter the string to be reversed: ");
        original = scanner.nextLine();

        int length = original.length();
        for(int i = length; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
    }
}
*/

/* 
import java.util.Scanner;

public class Labs{
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("Start number: ");
       int x = scanner.nextInt();

       System.out.print("End number: ");
       int X = scanner.nextInt();

       do {
       System.out.print("value of x : " + x );
           x++;
       System.out.print("\n");
       }while( x < X);
       }
}
*/
/* 
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Start number: ");
        int x = scanner.nextInt();

        System.out.print("End number: ");
        int X = scanner.nextInt();

        while (x < X) {
            System.out.print("value of x : " + x );
            x++;
        }

    }
}
*/
/* 
import java.util.Scanner;

public class Labs{
    public static boolean main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;
        int sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            num1 = scanner.nextInt();

            if (num1 < 0) {
                return false; 
            }else{
                sum = sum + num1;
            }
            System.out.print("Sum = " +  sum);
        }
        
    }
}
*/
/* 
import java.util.Scanner;

public class Labs{

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11: ");
        number = sc.nextInt();

        if ((number % 5 == 0) && (number % 11 == 0)) {
            System.out.print("\n Given number " + number + " is Divisible by 5 and 11");
        } else {
            System.out.print("\n Given number " + number + " is Not Divisible by 5 and 11");
        }
    };
}
*/
/* 
import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        
        int num1;
        int num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt;;
        
        int diff = num1 - num2;
        int prdct = num1 * num2;
        
        System.out.print(difference + " " + product);
    }
}
*/

/*import java.util.Scanner;

public class Labs{
    public static void main(String[] args){

        float Principal;
        float Time;
        float Rate;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
         Principal = scanner.nextFloat();
        
        System.out.print("Time: ");
         Time = scanner.nextFloat();
        
        System.out.print("Rate: ");
         Rate = scanner.nextFloat();
        
        float interest = Principal * Time * Rate;
        
        System.out.print(interest);
        
    }
}
    */

/* import java.util.Scanner;

 public class Labs{
     public static Boolean main(String[] args){

         int num1;
         int sum = 0;
          
         Scanner scanner = new Scanner(System.in);
         
     while (true){

         System.out.print("Enter  a number: ");
         num1 = scanner.nextInt();

         if (num1>0) {
             num1 = sum + num1;
         }else{
             return false;
         }
     }
     }
 }*/

/*import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        
        int num1;
        int sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Enter a number: ");
            num1 = scanner.nextInt();
        
            if( num1 > 0){
                sum = sum + num1;
            }else{
                break;
            }   
        }
        System.out.print("Sum = " + sum);      
    }
}*/
/* 
import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        
        int num1,num2,num3;
        int average;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        
        average = (num1 + num2 + num3)/3;
        
        System.out.print(average);
    }
}
    */
/* 
import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {

        double average;
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        double sum = (num1 + num2 + num3);
        average = sum / 3;
        System.out.print(average);

    }
}*/
/* 
import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        
        int counter = 0;
        int number = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        
        while(number != 0){
            number = number/10;
            counter++;
        }
        System.out.print(counter);
        
    }
}*/
/* 
import java.util.Scanner;

public class Labs {
    
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
        System.out.print("Please Enter the Original String : ");
        String str = scanner.next();
       
        String newString = str.replace("oot", "out");
        
        System.out.println("The Original String was: " +str);
        
        System.out.println("The Final String is: " +newString);
        
        String latestString = newString.replace("ing","ed");
        
        System.out.println("The Last String is: " +newString);
        
        System.out.println("The Latest String  is: " +latestString);
        
     }
     
}*/

/*import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Please Enter Number of elements in an Array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Please Enter " + size + " elements of an Array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            } else {
                oddSum = oddSum + array[i];
            }
        }

        System.out.print(evenSum + " " + oddSum);

    }
}
*/
/*public class  Labs{
    public static void main(String[] args){

        int key = 0;
        int[] myArray = {10, 20, 30, 50, 70, 90};
    }
}*/

/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Labs {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // System.out.print("n: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.print("Weird");
        } else if (n % 2 == 0 && (n <= 5 && n >= 2)) {
            System.out.print("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.print("Weird");
        } else if (n % 2 == 0 && (n > 20)) {
            System.out.print("Not Weird");
        }

    }
}*/
/*import java.util.*;
import java.io.*;

public class Labs{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("How many lines?")
        int lines = scanner.nextInt();
        
        for(int i=0; i<lines; i++){
            
            //System.out.print();
            int a = scanner.nextInt();
            //System.out.print();
            int b = scanner.nextInt();
            //System.out.print();
            int n = scanner.nextInt();
            
            for(int j=0; j<n; j++){
                
                int N = 0;
                int sum = (a+((2^N)*b));
                System.out.print(sum+" ");
                sum = sum + ((2^N+1)*b); 

                
            }
        }
    }
}*/

/*import java.util.Scanner;

public class Labs{
    public static void main(String[] args){

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            //Prompt for number;
            int num = scanner.nextInt();

            if(num>0){
                sum = sum + num;
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}*/

/*import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String reverse = "";

        //Prompt user for a string
        String word = scanner.nextLine();

        int length = word.length();

        for(int i = word.length()-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println("The reversed string is:"+reverse);
    }
}
*/

/*public class Labs{
    public static void main(String[] args){

        int a = 10;
        int b = 12;
        b++;
        System.out.print(a+b);
        b++;

    }
*/
/*import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    //Prompt for first number
    int num1 = scanner.nextInt();
    //Prompt for second number
    int num2 = scanner.nextInt();
    
    printFibonacci(num2, num1+num2);

    }

  public static void printFibonacci(int a, int b){
    if(a<=55){
        System.out.print(a+" ");
        printFibonacci(b,a+b);
    }
  }
}
*/
/*import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Labs{
    public static void main(String[] args){
        try{
            File myObj = new File("ofileyandje.txt");
            Scanner scanner = new Scanner(myObj);
            while(scanner.hasNextLine()){

                String data = scanner.nextLine();
                System.out.print(data);

            }
            scanner.close();
        }catch(FileNotFoundException e){

            System.out.print("An error occured mybra!");
            e.printStackTrace();
        }
    }

    public static void Display(String[] Lnames, int[] marks){
            for(int i =0;i<Lnames.length;i++){
                System.out.print(Lnames[i]+"\tStudent's score: "+marks[i]);
            }
    }

}*/
/* 
import java.util.Scanner;
public class Labs{
    public static void main(String[] args){
        int startNo;
        int endNo;
        int evenSum=0;

        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Enter number 1: ");
        startNo = scanner.nextInt();

       // System.out.println("Enter number 2: ");
        endNo = scanner.nextInt();

        if(startNo<0){
            System.out.print("Start number cannot be less than 0!");
        }else if(endNo<0){
            System.out.print("End number cannot be less than 0");
        }else if(endNo>9){
            System.out.print("End number cannot be greater than 9");
        }else{

            while(startNo<=endNo){
                if(startNo%2==0){
                    evenSum=evenSum+startNo;
                    startNo++;
                }else{
                    startNo++;
                }      
            }
            System.out.print("Sum of even numbers ="+evenSum);
        }
    }
}*/
/* 
public class Labs{
    public static void main(String[] args){

        
        

            
    }

    public static void calculateLateFee(int daysOverdue){

        double totalOwed;

        totalOwed=daysOverdue*0.50;

        System.out.println("This user owes the library: "+totalOwed);

    }

    public static String classifySteps(int steps){

        String performance;
       
        if(steps<5000){
            performance="Low";
        }else if(steps<10000 && steps>5000){
            performance="Medium";
        }else{
            performance="High";
        }
        return performance;
    }

    public static void applyDiscount(double total){

        double discount;

        if(total>100){
            discount = total*1.10;
        }else{
            System.out.print("Customer does not qualify for a discount! ");
        }

    }

    public static boolean isPrime(int num){

        if(num%2!=0){
            return true;
        }else{
            return false;
        }

    }

    public static double findMaxPrice(double[] prices){

        double highestNum=prices[0];

        for(int i=0;i<prices.length;i++){

            if(prices[i]>highestNum){
                highestNum=prices[i];
            }
        }
        return highestNum;
    }

    public static void reverseArray(int[] myArray){

        int[] reversedArray = new int[myArray.length];
        int j=0;

        for(int i=myArray.length-1; i<myArray.length; i--){
            reversedArray[j]=myArray[i];
            j++;
        }
    }

    public static int elementFrequency(int[] myArray, int target){

        int frequency=0;

        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==target){
                frequency++;
            }
        }
        return frequency;
    }

    public static int[] findCommonElements(int[] arr1,int[] arr2){

        int[] dupArray = new int[10];
        int dupp;
        int k=0;

        for(int i=0;i<arr1.length;i++){
            dupp = arr1[i];

            for(int j=0; j<arr2.length; j++){
                if(arr2[j]==dupp){
                    dupArray[k]=dupp;
                    k++;
                }
            }
        }
        return dupArray;
    }

    public static void removeDuplicates(int[] myArray){


        int[] noDupps=new int[10];
        int currentNum;
        int yes=0;

        noDupps[0]=myArray[0];

        for(int i=0;i<myArray.length;i++){
            
            currentNum=myArray[i];

            for(int j=i;j<noDupps.length;j++){
                if(noDupps[j]==currentNum){
                    yes++;
                }

            }
            if(yes==0){
                noDupps[i]=currentNum;
            }
           
        }
    }
}
*/
/* 
import java.util.Scanner;

public class Labs{
    public static void main(String[] args){

        //declaring our scanner object for capturing user input
        Scanner scanner = new Scanner(System.in);


        //declaring an array that stores strings
        String[] names = {"John","Harry","Kane"};

        //declares an integer array to store the semester marks
        int[] semesterMark = new int[3];

        //semesterMark = {58,33,42};

        //declare a message for whether or not the student qualified
        String[] messge = new String[3];

        //messge = {yes,no,no};

        //first loop to populate our arrays with the user input
        for(int i=0; i<names.length; i++){

        System.out.println("Test 1: ");
        int test1 = scanner.nextInt();

        System.out.print("Test 2: ");
        int test2 = scanner.nextInt();

        int semMark = test1+test2;
        semesterMark[i] = semMark;

        if(semMark>=50){
            String message = "Yes,Qualified";
            messge[i]=message;
        }else{
            String message = "No,Not qualified";
            messge[i]=message;
        }


    }

    //second loop to display the results
    for(int j=0; j<names.length; j++){

        System.out.println(names[j]+" "+semesterMark[j]+" "+messge[j]);

    }
        
    }
    
}*/
/* 
import java.util.Scanner;

public class Labs{

    public static void main(String[] args){

        double total=0.00;

    Scanner scanner = new Scanner(System.in);

    int startNo;
    int endNo;
    int sumCube=0;

    System.out.print("Enter the start number: ");
    startNo = scanner.nextInt();

    System.out.print("Enter the end number: ");
    endNo = scanner.nextInt();

    for(int i=startNo; i<=endNo; i++){

        int cube = (i * i * i);
        sumCube = sumCube+cube;
    }
    System.out.print(sumCube);

    }
     
}
*/

/* 
import java.util.Scanner;

public class Labs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x and y value: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        whatQuadrant thequadrant = new whatQuadrant(x, y);

        System.out.print("Point(" + x + "," + y + ") " + "is in Quadrant " + thequadrant);
    }

    static class whatQuadrant {

        private int x;
        private int y;
        private String quadrant;

        

        

        public whatQuadrant(int x, int y) {

            this.x = x;
            this.y = y;

            if (x > 0 && y > 0) {
                quadrant = "I";
            } else if (x < 0 && y > 0) {
                quadrant = "II";
            } else if (x < 0 && y < 0) {
                quadrant = "III";
            } else if(x > 0 && y < 0) {
                quadrant = "IV";
            }else{
                quadrant = "Point of origin";
            }
        }

        void setPointX(int x) {
            this.x = x;
        }

        void setPointY(int y) {
            this.y = y;
        }

        void setQuadrant(String quadrant) {
            this.quadrant = quadrant;
        }

        int getPointX() {
            return x;
        }

        int getPointY() {
            return y;
        }

        String getQuadrant() {
            return quadrant;
        }

        

        @Override
        public String toString() {
            return quadrant;
        }

    }

}*/

/* 
import java.util.Scanner;

public class Labs {

    public static void main(String[] args){

        
        Scanner scanner= new Scanner(System.in);


        int validAge=0;
        //get number of students
        int size = scanner.nextInt();
        scanner.nextLine();
        if(size>0){
            Student[] students = new Student[size];

        //students[0]= new Student("John", "Doe", 29, 'M');
        //students[1]= new Student("Kelly", "Daniela", 40, 'F');
        
            for(int i=0;i<size;i++){
                
                String inputLine = scanner.nextLine();
                String[] parts = inputLine.split(" ");
                
                String firstname = parts[0];
                String lastname = parts[1];
                int age = Integer.parseInt(parts[2]);
                if(age>0){
                    char gender = parts[3].charAt(0);
                
                students[i]  = new Student(firstname, lastname, age, gender);
                }else{
                    System.out.println("Please enter a valid student age! ");
                    validAge++;
                    break;
                }
                
            }
             if(validAge==0){
                for(int i=0;i<size;i++){
                    System.out.println(students[i]);
                } 
             }      
            }else{
                System.out.println("Please enter a positve number of students! ");
            }
        }
       

        
        
    }


    class Student {

        private static String stNumHalf = "22201";
        private static int registeredStudents = 1;
        private String firstname;
        private String lastname;
        private int age;
        private char gender;
        private String studentnumber;

        public Student() {

        }

    public Student(String firstname, String lastname, int age, char gender){
        
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.gender=gender;
        
        
        this.studentnumber=stNumHalf+String.format("%03d", registeredStudents);
        registeredStudents++;
        
        
    }

        public void setfirstname(String firstname) {

            this.firstname = firstname;

        }

        public void setlastname(String lastname) {

            this.lastname = lastname;

        }

        public void setage(int age) {

            this.age = age;

        }

        public void setgender(char gender) {

            this.gender = gender;

        }

        public String getfirstname() {

            return firstname;

        }

        public String getlastname() {

            return lastname;

        }

        public int getage() {

            return age;

        }

        public char getGender() {

            return gender;

        }

        public String getStundentnumber() {

            return studentnumber;

        }

        @Override
        public String toString() {
            return "Full names: "+firstname+" "+lastname+
                    "\nAge: "+age+
                    "\nGender: "+gender+
                    "\nStudent number: "+studentnumber;
        }
    }*/
/* 
import java.util.Scanner;

public class Labs{

    //this was supposed to be done without encapsulation(make sure theyre not private), directly accessing the attributes from the main method(System.out.print(stud.studName);)
    //do it for practice

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);


            System.out.print("Student Name: ");
            String inputLine= scanner.nextLine();
            String[] part = inputLine.split(" ");
            String firstname = part[0];
            String lastname = part[1];


            Student stud = new Student(firstname, lastname, "Computer Science", 23, 18, 20, 93100191);
            System.out.println(stud);

        }


        public static class Student{

            private String firstname, lastname, department;
            private int test1, test2, assignment1, studentnumber, finalmark;
                        
            
                public Student(String firstname, String lastname, String department, int test1, int test2, int assignment1, int studentnumber){
                    
    
                    this.firstname=firstname;
                    this.lastname=lastname;
                    this.department=department;
                    this.test1=test1;
                    this.test2=test2;
                    this.assignment1=assignment1;
                    this.studentnumber=studentnumber;

                    this.finalmark=assignment1+test1+test2;
                
            }
            public void setFirstname(String firstname){
                this.firstname=firstname;
            }
            public void setLastname(String lastname){
                this.lastname=lastname;
            }
            public void setDepartment(String department){
                this.department=department;
            }
            public void setTest1(int test1){
                this.test1=test1;
            }
            public void setTest2(int test2){
                this.test2=test2;
            }
            public void setAssignment1(int assignment1){
                this.assignment1=assignment1;
            }
            public void setStudentnumber(int studentnumber){
                this.studentnumber=studentnumber;
            }
            public String getFirstname(){
                return firstname;
            }
            public String getLastname(){
                return lastname;
            }
            public String getDepartment(){
                return department;
            }
            public int getTest1(){
                return test1;
            }
            public int getTest2(){
                return test2;
            }
            public int getAssignment1(){
                return assignment1;
            }
            public int getStudentnumber(){
                return studentnumber;
            }
            public int getFinalmark(){
                return finalmark;
            }

            @Override
            public String toString(){
                
                return "Student Name: "+firstname+" "+lastname+
                        "\nStudent Number: "+studentnumber+
                        "\nStudent Departmnet: "+department+
                        "\nTest1: "+test1+
                        "\nTest2: "+test2+
                        "\nAssignment: "+assignment1+
                        "\nTotal Mark: "+finalmark;
            }

        }
    }
*/
/*
import java.util.Scanner;

public class Labs{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        findCube(number);
    }
    public static void findCube(int num){
        
        if(num>0){
          int cube = num*num*num;
        System.out.print("The cube is: "+cube);  
        }else if
        {
            System.out.print("Number cannot be less than 0");
        }
        if(num<0){
            
        }
    }
}*/

import java.util.ArrayList;

public class Labs{
    public static void main(String[] args){


        Car car = new Car("Toyota", "Corolla", 2023, 560500);
        System.out.print(car.getDetails());

    }
    public static class Car{


        private String make;
        private String model;
        private int year;
        private double price;

        public Car(String make, String model, int year, double price){

            this.make=make;
            this.model=model;
            this.year=year;
            this.price=price;
        }

        public double getPrice(){

            return price;
        }

        void setMake(String make){
            this.make=make;
        }
        void setModel(String model){
            this.model=model;
        }
        void setYear(int year){
            this.year=year;
        }
        void setPrice(double price){
            this.price=price;
        }
        String getMake(){
            return make;
        }
        String getModel(){
            return model;
        }
        String getYear(){
            return year;
        }
        String getPrice(){
            return price;
        }
        public String getDetails(){

            return "Make: "+getMake()+"\n",
                    "Model: "+getModel()+"\n",
                    "Year: "+getYear()+"\n",
                    "Price: "+getPrice();

          //  return make, model, year, price;
        }
    }
    public static class Dealership{

        ArrayList<Car> cars = new ArrayList<>();

        public Dealership(){

        }
        void addCar(Car car){
            cars.add(car);
        }
        public double getTotalInventoryValue(){

            double total=cars


        }
        public ArrayList<Car> listAllCars(){
            return cars;
        }
        public Car findCheapestCar(){

            double cheapestcar=cars.get(0);

            for(int i=0;i<cars.size();i++){
                if(cars.getPrice()<cheapestcar){
                    cheapestcar=cars.getPrice();
                }
            }
            return cheapestcar;

        }
        public ArrayList<Car> findCarsByMake(String make){

            ArrayList<Car> matchingMake = new ArrayList<>();

            for(int i=0;i<cars.size();i++){
                if(cars.getDetails==make){
                    matchingMake.add(i);
                }
            }
            
            }
        }


    }
