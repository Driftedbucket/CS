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

    //int[] list= [1,2,3,4];
    //int|() result = findIndex(list, 2);

    //if result == (){
      //  io:println("Element not found!");
    //}else{
      //  io:println("Element found at index:", result);
    //}

//float result = addFloats(20,2.2);
//io:print(result);

//boolean flag = false;
//string message = getMessage(flag);
//io:println(message);

//int num = safeGetValue(38);
//int num1 = safeGetValue(());
//io:println(num);
//io:println(num1);

//logWelcome("Awike");

//checkEligibility(15);
//checkEligibility(20);
//checkEligibility(());

//processUser("Awike ", 20);
//processUser("Lil Tay", 17);

//Person p1 = {name: "Awike", age: 20, isStudent: true, email: "ndinowix@gmail.com"};
//Person p2 = {name: "Nigaboy", age: 15, isStudent: false, email: "nigger@gmail.com"};
//Person p3 = {name: "Kentrell", age: 25, isStudent:true, email: ()};

//io:println(p1);
//io:println(p2);

//Person[] people = [p1, p2, p3];

//printStudents(people);

//printEmail(p3);

Person person = createPerson("Kacey", 12, true, ());

string dudeCreated = describePerson(person);

io:println(dudeCreated);
}


type LinkedList record{
    string value;
    LinkedList? next;
};

function linkedListLength(LinkedList ll) returns int {

    int n =0;

    LinkedList? nextNode = ll.next;

    while nextNode != () {

        n += 1;
        nextNode = nextNode.next;
    }
    return n;
}

type Person record{
    string name;
    int age;
    boolean isStudent;
    string? email;
};

function describePerson(Person p) returns string{

    string studentStatus = p.isStudent? "is a student, ":"is not a student, ";
    return p.name + "is " + p.age.toString() + " years old and " + studentStatus +  "his email is " + p.email.toString();
}

function isAdult(Person p) returns boolean{

    int age = p.age;

    boolean areThey = age>=18 ? true :false;
    return areThey;

    //if(age>=18){
      //  return true;
    //}else{
      //  return false;
    //}
}

function printStudents(Person[] people){

    foreach Person i in people{
        boolean schoolHere = i.isStudent;
        if(schoolHere==true){
            string studentStatus = i.isStudent ? " is a student at NUST. His email is ":" is not a student at NUST. His email is" ;
            io:println(i.name, " is ", i.age, " years old and", studentStatus, i.email);
        }

    }

}

function printEmail(Person p){
    string? userEmail=p.email;

    if(userEmail != ()){
        io:println(p.name + "'s email is " + userEmail);
    }else{
        io:println("No email provided.");
    } 
}

function createPerson(string name, int age, boolean isStudent, string? email) returns Person{

    Person myNigga = {name: name, age: age, isStudent: isStudent, email: email};
    return myNigga;

}
function findIndex(int[] nums,int target) returns int|(){

    foreach int i in nums{
        
        if nums[i]==target{
            return i;
        }

    }
    return ();    
}

function addFloats(int x, float y) returns float{

    float result = <float>x+y;

    return result;
}

function getMessage(boolean flag) returns string{

    string message = flag? "Access granted":"Access denied";
    return message;

}

function safeGetValue(int? x) returns int{

    int result = x == () ? 0 : x;
    return result;
}

function logWelcome(string name) returns (){

    io:println("Welcome ", name);
    return ();

}

function checkEligibility(int? age) returns (){

    if(age==()){
       io:println("Unknown age!");
    }else if (age>=18) {
        io:println("Eligible!");
    }else{
        io:println("Not eligible!");
    }

    return ();
}

function processUser(string name, int? age) returns (){

    logWelcome(name);

    checkEligibility(age);

    int userAge = safeGetValue(age);

    io:println("You are:", userAge);

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
