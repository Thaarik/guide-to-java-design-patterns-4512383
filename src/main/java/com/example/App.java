package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countryIterable = new CountryIterable(india, poland, nigeria, canada, argentina);
        var countryIterator = countryIterable.iterator();

        while(countryIterator.hasNext()){
            Country country = countryIterator.next();
            System.out.println(country.getName());
        }
        

    }

}
