import ballerina/http;

service /hello on new http:Listener(8080) {

    resource function get sayHello/[string name]() returns string {
        return "Hello "+ name +", This is your server speaking!";
    }
}