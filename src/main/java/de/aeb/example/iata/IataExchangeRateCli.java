package de.aeb.example.iata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class IataExchangeRateCli {
	
	public String getUserInput() {
		BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput = null;
		
		try {
			userInput = consoleInput.readLine();
		} catch (IOException e) {
			sendError(e.getMessage());
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
				[1] Show exchange rate
				[2] Add exchange rate
				
				[0] Exit""");
		return this;
	}
	
	public IataExchangeRateCli sendMessage(String message) {
		System.out.println(message);
		return this;
	}
	
	public IataExchangeRateCli sendError(String message) {
		System.out.println((char) 27 + "[31m" + message + (char) 27 + "[0m");
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
