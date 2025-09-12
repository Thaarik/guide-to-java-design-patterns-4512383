package com.example;

import java.util.Iterator;

public class CountryIterable implements Iterable<Country>{

  public Country[] countries;

  public CountryIterable(Country... countries){
    this.countries = countries;
  }

  public Country[] getCountries(){
    return this.countries;
  }

  @Override
  public Iterator<Country> iterator(){
    return new CountryIterator(this);
  }
  
}
