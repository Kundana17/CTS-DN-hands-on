package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import jakarta.validation.Valid;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        LOGGER.info("END");

        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.info("END");

        return countries;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("START");

        Country country = countryService.getCountry(code);

        LOGGER.info("END");

        return country;
    }

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {

        LOGGER.info("START");

        LOGGER.debug("Country : {}", country);

        LOGGER.info("END");

        return country;
    }

    @PutMapping("/countries")
    public Country updateCountry(@Valid @RequestBody Country country) {

        LOGGER.info("START");

        LOGGER.debug("Country : {}", country);

        LOGGER.info("END");

        return country;
    }

    @DeleteMapping("/countries/{code}")
    public void deleteCountry(@PathVariable String code) {

        LOGGER.info("START");

        countryService.deleteCountry(code);

        LOGGER.info("END");
    }
}