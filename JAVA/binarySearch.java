public class binarySearch{
    public static void main(String[] args){

    }

    public static int[] binarySearch(int[] array,int target){
        int first = 0;
        int last = array.length - 1;

        while(first <= last){
            int midpoint = (first + last)/2;
            
            if(array[midpoint] == target){
                return midpoint;
            }else if(array[midpoint] < target){
                first = 
            }
        }

    }
    public static int[] linearSearch(int[] array, int target){
        int found = 0;

        for(int i = 0; i<array.length; i++;){
            if(array[i]==target){
                System.out.print("Target found at: "+i);
                found++;
            }
        }
        if(!found == 0){
            System.out.print("Target not present");
        }
    }

}