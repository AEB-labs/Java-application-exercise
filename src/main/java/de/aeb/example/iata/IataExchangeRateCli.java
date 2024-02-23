package de.aeb.example.iata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class IataExchangeRateCli {
	
	private final Logger logger = LoggerFactory.getLogger(IataExchangeRateCli.class);
	
	public String getUserInput() {
		BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput = null;
		
		try {
			userInput = consoleInput.readLine();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		
		return userInput;
	}
	
	public LocalDate getUserInputForLocalDate() {
		String userInput = getUserInput();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		return LocalDate.parse(userInput, pattern);
	}
	
	public Double getUserInputForDouble() {
		String userInput = getUserInput();
		return Double.valueOf(userInput);
	}
	
	public IataExchangeRateCli showMenu() {
		sendMessage("""
				
				IATA currency exchange rates
				
				Select an option by pressing the numeric key and hitting 'Enter':
				[1] Show currency rate
				[2] Add exchange rate
				
				[0] Exit""");
		return this;
	}
	
	public IataExchangeRateCli sendMessage(String message) {
		logger.info(message);
		return this;
	}
	
	public IataExchangeRateCli sendError(String message) {
		logger.error(message);
		return this;
	}
	
	public boolean isExitRequest(String userInput) {
		return "0".equals(userInput);
	}
	
	public boolean isShowCurrencyRate(String userInput) {
		return "1".equals(userInput);
	}
	
	public boolean isEnterCurrencyRate(String userInput) {
		return "2".equals(userInput);
	}
}
