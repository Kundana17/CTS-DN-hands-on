package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private final List<Country> countries = new ArrayList<>();

    public CountryService() {

        Country c1 = new Country();
        c1.setCode("IN");
        c1.setName("India");

        Country c2 = new Country();
        c2.setCode("US");
        c2.setName("United States");

        Country c3 = new Country();
        c3.setCode("JP");
        c3.setName("Japan");

        Country c4 = new Country();
        c4.setCode("DE");
        c4.setName("Germany");

        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        countries.add(c4);
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountry(String code) {

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }

    public void deleteCountry(String code) {

        countries.removeIf(country ->
                country.getCode().equalsIgnoreCase(code));

    }
}