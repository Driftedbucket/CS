import ballerina/io;
//import ballerina/random;


public function main() {
    
   // string name = "Awike";
   // io:println(greeting, " ",name);
   // checkEvenOrOdd(2);


    //boolean flag = false;
    //io:println(flag);

    //int n = flag ? 1 : 2;
    //io:println(n);
    //foo(flag);
    //int answer = add2nums(5, 5);
    //io:println(answer);
    //checkEvenOrOdd(10);

    //io:println(computeFactorsOfRandomNum(10,61));

    //io:println("Hello, world");

    int[] list= [1,2,3,4];
    int|() result = findIndex(list, 2);

    if result == (){
        io:println("Element not found!");
    }else{
        io:println("Element found at index:", result);
    }


}
    function foo(boolean flag){
        if flag{
            io:println("MASA!");
        }else{
            io:println("AI YOUNGBOY 2!");
        }
    }

function add2nums(int x, int y) returns int{

    int sum = x+y;
    return sum;
}

function checkEvenOrOdd(int z){

    if(z%2==0){
        io:println("even");
    }else{
        io:println("odd");
    }
}

//function computeFactorsOfRandomNum(int min, int max) returns string{

     //int range = max-min;

     ///if range <=0{
      //  return "your range is invalid!";
    // }else{

       // int ranNum = min + random:nextInt(max-min);
       // string myString="Owa kutha onumber:"+ ranNum.toString();

     //return myString; 
    // }
     //io:print("Owa kutha onumber:", ranNum);

     //string myString="Owa kutha onumber:"+ ranNum.toString();

     //return myString; 

//}


//function computeFFactorsOfRandomNum(){

   // int min=10;
   // int max=61;

     //int ranNum = min+ random:nextInt(maxstr);
     //io:print("Owa kutha onumber:", ranNum);


//}

function findIndex(int[] nums,int target) returns int|(){

    foreach int i in 0 ..<nums.length(){
        
        if nums[i]==target{
            return i;
        }

    }
    return ();    
}



