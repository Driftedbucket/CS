//import ballerina/io;
import ballerina/http;

public type Country record{

    record {
        string common;
    }name; 
    string[] continents;
    int population;
    decimal area;
};

final http:Client countriesClient = check new ("https://restcountries.com/v3.1/all");

service / on new http:Listener(8080) {

    resource function get countries() returns Country[]|error{

        Country[] countries = check countriesClient->/all;
        return countries;
    } 
}