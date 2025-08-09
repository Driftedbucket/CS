public class DSA{
    public static void main(String[] args){
    
    int[] myArray = new int[11];

    myArray[0] = 6;
    myArray[1] = 8;
    myArray[2] = 17;
    myArray[3] = 20;
    myArray[4] = 23;
    myArray[5] = 27;
    myArray[6] = 37;
    myArray[7] = 51;
    myArray[8] = 57;
    myArray[9] = 73;
    myArray[10] = 89;

    binarySearch(myArray, 8);
    selectionSort(myArray);
    insertionSort(myArray);
    

    }

    public static int[] selectionSort(int myArray[]){
        for(int i = 0; i < myArray.length; i++){
            int min = i;
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[j] < myArray[min]){
                    min = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;
        }

        return myArray;
    }
    public static int[] insertionSort(int myArray[]){
        for(int i = 1; i<myArray.length; i++){
            int temp = myArray[i];
            int j = i - 1;
            while(j>=0 && myArray[j]>temp){
                myArray[j+1] = myArray[j];
                j--;
            }
            myArray[j+1] = temp;
        }
        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " "+"\n");
        }
        
    }

    public static int[] quickSort(int myArray[], int highIndex, int lowIndex){

        int pivot = highIndex;
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(myArray[leftPointer]<=myArray[pivot] && leftPointer<rightPointer){
                leftPointer++;
            }
            while(myArray[rightPointer]>=myArray[pivot] && leftPointer<rightPointer){
                rightPointer--;
            }

            int temp = myArray[leftPointer];
            myArray[leftPointer] = myArray[rightPointer];
            myArray[rightPointer] = temp;
        }
        
        int temp = myArray[pivot];
        myArray[pivot] = myArray[leftPointer];
        myArray[pivot] = temp;

        return myArray;
    }
    public static void binarySearch(int[] array,int target){
        int first = 0;
        int last = array.length - 1;
        int found = 0;

        while(first <= last){
            int midpoint = (first + last)/2;
            
            if(array[midpoint] == target){
                System.out.print("Target found at: "+midpoint);
                found++;
                break;
            }else if(array[midpoint] < target){
                first = midpoint + 1;
            }else{
                last = midpoint - 1;
            }
        }
        if(found == 0){
            System.out.print("Target not found!");
        }

    }
    public static void verify(){

    }
    public static void linearSearch(int[] array, int target){
        int found = 0;
        for(int i = 0;i< array.length; i++){
            if(array[i] == target){
                System.out.print("Target found at: "+i);
                found++;
            }
        }
        if(found == 0){
            System.out.print("TARGET NOT FOUND! ");
        }
    }
    

}
