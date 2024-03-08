package de.aeb.example.iata;

import java.time.LocalDate;

public final class IataExchangeRateApplication {
	
	private final IataExchangeRateCli cli = new IataExchangeRateCli();
	
	public IataExchangeRateApplication() {
		importIataExchangeRates();
	}
	
	public void run() {
		cli.showMenu();
		
		while (true) {
			String userInput = cli.getUserInput();
			
			if (cli.isExitRequest(userInput)) {
				cli.sendMessage("Goodbye!");
				return;
			}
			
			makeSelection(userInput);
		}
	}
	
	private void importIataExchangeRates() {
		
		// TODO: Import IATA currency exchange rates
		cli.sendError("TODO: Import the IATA currency exchange rates");
	}
	
	private void showIataExchangeRate() {
		String currencyIsoCode = cli.sendMessage("Currency").getUserInput();
		LocalDate date = cli.sendMessage("Date (dd.mm.yyyy)").getUserInputForLocalDate();
		
		// TODO: Show the corresponding exchange rate for the currencyIsoCode and date
		cli.sendError("TODO: Show the corresponding exchange rate for the currencyIsoCode and date");
	}
	
	private void enterIataExchangeRate() {
		String currencyIsoCode = cli.sendMessage("Currency").getUserInput();
		LocalDate from = cli.sendMessage("From (dd.mm.yyyy)").getUserInputForLocalDate();
		LocalDate to = cli.sendMessage("To (dd.mm.yyyy)").getUserInputForLocalDate();
		Double exchangeRate = cli.sendMessage("Euro rate for 1 " + currencyIsoCode).getUserInputForDouble();
		
		// TODO: Enter a new exchange rate for a given period (from, to) and currencyIsoCode
		cli.sendError("TODO: Enter a new exchange rate for a given period (from, to) and currencyIsoCode");
	}
	
	private void makeSelection(String userInput) {
		if (cli.isShowCurrencyRate(userInput)) {
			showIataExchangeRate();
		} else if (cli.isEnterCurrencyRate(userInput)) {
			enterIataExchangeRate();
		} else {
			cli.sendError("Wrong input. Please try again.").showMenu();
		}
	}
}
