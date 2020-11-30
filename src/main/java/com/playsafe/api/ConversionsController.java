package com.playsafe.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConversionsController.class);

	@GetMapping("/conversions/ktoc")
	public Double kelvinToCelsuis(@RequestParam(value = "temperatureInKelvin") Double temperatureInKelvin) {
		
		LOGGER.info("Temparature in kelvin : " + temperatureInKelvin);

		double temperatureInCelsius = temperatureInKelvin - 273.15;
		LOGGER.info("Temparature in Celsuis : " + temperatureInKelvin);
		
		return temperatureInCelsius;
	}
	
	@GetMapping("/conversions/ctok")
	public Double celsiusToKelvin(@RequestParam(value = "temperatureInCelsius") Double temperatureInCelsius) {
		
		LOGGER.info("Temparature in Celsuis : " + temperatureInCelsius);

		double temperatureInKelvin = temperatureInCelsius + 273.15;
		LOGGER.info("Temparature in kelvin : " + temperatureInKelvin);
		
		return temperatureInKelvin;
	}
	
	@GetMapping("/conversions/mtok")
	public Double milesToKm(@RequestParam(value = "distanceInMiles") Double distanceInMiles) {
		
		LOGGER.info("Distance in miles : " + distanceInMiles);

		double distanceInKm = distanceInMiles * 1.60934;
		LOGGER.info("Distance in Km : " + distanceInKm);
		
		return distanceInKm;
	}
	
	@GetMapping("/conversions/ktom")
	public Double kmToMiles(@RequestParam(value = "distanceInKm") Double distanceInKm) {
		
		LOGGER.info("Distance in Km : " + distanceInKm);
		
		double distanceInMiles = distanceInKm / 1.60934;
		LOGGER.info("Distance in miles : " + distanceInMiles);
		
		return distanceInMiles;
	}
}
