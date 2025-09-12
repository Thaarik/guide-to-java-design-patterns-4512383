package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country>{

  private CountryIterable countryIterable;
  private int index;

  public CountryIterator(CountryIterable countryIterable){
    this.countryIterable = countryIterable;
    this.index=0;
  }

  @Override
  public boolean hasNext(){
    Country[] countries = countryIterable.getCountries();
    return index < countries.length;
  }

  @Override
  public Country next(){
    Country[] countries = countryIterable.getCountries();
    if (hasNext()){
      Country country = countries[index++];
      // BONUS
      if(!country.getName().substring(0,1).equalsIgnoreCase("i")){
        return country;
      } else {
        return next();
      }
    }else{
      return null;
    }
  }
}
