import java.util.ArrayList;
import java.util.List;

public class solution {



    public static void main(String[] args) {
        
        int[] myDigits = {1,2,1,4};

      //System.out.println(plusOne(myDigits));

       // String s = "Hello World";
       // System.out.println(lengthOfLastWord(s));
 
       //System.out.println(fizzBuzz(15));

       //System.out.println(removeDuplicates(myDigits));
       int x =-23;
       System.out.println(reverse(x));
    }   

        public static int lengthOfLastWord(String s) {
        
        String trimmedString = s.trim();

        int i=trimmedString.length()-1;
        int count=0;

        while(i>=0 && trimmedString.charAt(i) != ' '){
            count++;
            i--;
        }

        
        return count;  
    }

    public static List<String> fizzBuzz(int n) {
        
        //List<String> ListOfNumbers = new ArrayList<>();
        List<String> fizzList = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                fizzList.add("FizzBuzz");
            }else if(i%3==0 && i%5!=0){
                fizzList.add("Fizz");
            }else if(i%5==0 && i%3!=0){
                fizzList.add("Buzz");
            }else{
                fizzList.add(String.valueOf(i));
            }
        }
        return fizzList;
    }
    public static int removeDuplicates(int[] nums) {
        
        int[] myArray = new int[nums.length];


        int k=0;
        myArray[k]=nums[0];
        k++;
        int count=1;

        for(int i=0; i<nums.length;i++){
            for(int j=0; j<myArray.length;j++){
                if(nums[i] != myArray[j]){
                    myArray[k]=nums[i];
                    count++;
                }
            }
        }
        return count;
    }

    public static int reverse(int x) {

        String newInt;
        String newX= String.valueOf(x);

        if(x>0){
            StringBuilder sb = new StringBuilder(newX);
            sb.reverse();
            int finalNum = Integer.valueOf(sb.toString());
            return finalNum;
        }else{
            StringBuilder sb = new StringBuilder(newX);
            sb.reverse();
            String finalString = sb.toString();
            String negative = "-";
            String newString =negative + finalString;

            int stringAsInt = Integer.valueOf(newString);  
            return stringAsInt;
        }
        

        



        /* for(int i=newX.length()-1; i<newX.length(); i++){
            newInt.charAt(j) = newX.charAt(i);
            j++;
        } */

        

        //int finalNum = Integer.valueOf(newInt);
        //return finalNum;
    }
}

    /* public static int plusOne(int[] digits) {

        int actualNumber=0;

        
        for(int i=0;i<digits.length;i++){
            actualNumber = actualNumber * 10 + digits[i];
        }
        
        int numPlusOne=actualNumber+1;
        String StringNum= String.valueOf(numPlusOne);
        String[] myArray = new String[StringNum.length()];

        for(int j=0;j<StringNum.length();j++){
            myArray[j]=StringNum.charAt(j);
        }

        
        return actualNumber;  
    } */
    

