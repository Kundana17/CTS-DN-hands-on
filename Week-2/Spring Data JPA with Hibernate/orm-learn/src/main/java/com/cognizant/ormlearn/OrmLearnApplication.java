package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);

		testGetAllCountries();

		testAddCountry();

		testGetCountry();

		testUpdateCountry();

		testDeleteCountry();
	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.info("Countries: {}", countries);

		LOGGER.info("End");
	}

	private static void testAddCountry() {

		LOGGER.info("Start");

		Country country = new Country("FR", "France");

		countryService.addCountry(country);

		LOGGER.info("Country Added");

		LOGGER.info("Countries: {}", countryService.getAllCountries());

		LOGGER.info("End");
	}

	private static void testGetCountry() {

		LOGGER.info("Start");

		Country country = countryService.getCountry("IN");

		LOGGER.info("Country: {}", country);

		LOGGER.info("End");
	}

	private static void testUpdateCountry() {

		LOGGER.info("Start");

		Country country = countryService.getCountry("IN");

		country.setName("Bharat");

		countryService.updateCountry(country);

		LOGGER.info("Updated Country");

		LOGGER.info("Country: {}", countryService.getCountry("IN"));

		LOGGER.info("End");
	}

	private static void testDeleteCountry() {

		LOGGER.info("Start");

		countryService.deleteCountry("AU");

		LOGGER.info("Country Deleted");

		LOGGER.info("Countries: {}", countryService.getAllCountries());

		LOGGER.info("End");
	}
}