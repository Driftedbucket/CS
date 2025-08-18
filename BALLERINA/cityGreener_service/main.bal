import ballerina/http;

public type City record{

    readonly string name;
    string country;
    int population;
    decimal area;

};

table<City> key(name) cities = table [
    {name:"Windhoek", country: "Namibia", population: 3100000, area: 8250.5},
    {name:"Lusaka", country: "Zambia", population: 15000000, area: 7531.3}
];
service /greet on new http:Listener(8080){


    resource function get greetWithCity/[string cityName]() returns string{

        return "Wassgud my boi, u from "+cityName+" right?";
    }
    
    resource function get allCities() returns City[] {

        return cities.toArray();
    }

    resource function get cityByName/[string name]() returns City|http:NotFound{

        City? city = cities[name];

        if city is () {
            return http:NOT_FOUND;
        }
        return city;
    }
};
