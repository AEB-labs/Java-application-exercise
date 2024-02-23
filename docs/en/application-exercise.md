# Application exercise

1. [Currency exchange rates](#introduction)
2. [Your exercise](#task)
    1. [Import the exchange rates](#import)
    2. [Output data for a exchange rate](#output)
    3. [Entering a new exchange rate](#input)
    4. [Automatic tests](#tests)
3. [Remarks](#hints)

<a name="introduction"></a>

## Currency exchange rates

The project contains a CSV file at [src/main/resources/KursExport.csv](/src/main/resources/KursExport.csv) with currency exchange rates from the IATA (International Air Transport Association). For each country, 1 Euro is converted into the given currency, but not always into the local currency.  

```csv
Vereinigte Staaten;1,1366;USD;10.07.2019;09.08.2019;;
```

A line from the CSV file contains the following data:  
1. Name of the country  
2. Conversion rate of the foreign currency to the Euro  
3. ISO code of the currency  
4. Start of the validity period  
5. End of the validity period  
6. Remark  

The above entry therefore means:  
> 1 Euro is 1.1366 USD in the period from 10/07/2019 to 09/08/2019. There is no remark.  

<a name="task" /></a>

### Your exercise

The console application contains some functions with todos that you need to implement.  

- [ ] Import the exchange rates  
- [ ] Output data for a exchange rate 
- [ ] Enter a new exchange rate  
- [ ] (optional) automatic tests  

<a name="import"></a>

#### Import the exchange rates

The exchange rates have to be imported in an appropriate data structure, where the following conditions apply:  
1. The country name is ignored. The currency is identified by the three-digit ISO code.  
2. If an exchange rate occurs more than once for a period (e.g. the rate applies to several countries), the first exchange rate is retained and all others are ignored.  
3. Ignore any rate that contains a remark.  
4. Assume that the rates do not partially overlap (e.g. USD 01/03 - 31/03 and USD 15/03 - 15/04). However, entries with the same period and currency may occur several times (for different countries).  
5. The format of the CSV file is defined as you find it. No special treatment (e.g. different date formats) is required.  
6. Any data that does not correspond to the specified format, e.g. empty or incomplete row, incorrect date format, etc., should be intercepted by not accepting the row.  

<a name="output"></a>

#### Output data for a exchange rate

The console application provides the user's input values for the query. The function should display the exchange rate for a currency on a given date (in the form `1 XYZ equals to xx.xxx Euros`) or indicate that no exchange rate exists.  

The appropriate exchange rate is determined from the data read in.  

<a name="input"></a>

#### Entering a new exchange rate

New exchange rates can be entered for a given period. The entered exchange rate must be added to the data. There must be no overlap.  

If the new exchange rate falls within the periods of existing rates, the existing rates must be deleted if they are completely covered by the new rate. If an old rate falls only partially falls within the period of the new rate, the start or end date of the old rate must be adjusted so that the rates do not overlap, i.e. the old rate is directly adjacent to the new rate.  

All variants must be mapped in such a way that the newly entered rate always takes precedence over the existing rates.  

<a name="tests"></a>

#### Automatic tests

If time allows, create automated tests to check functionality. Limit yourself to the critical / complex parts of your code.  

<a name="hints"></a>

### Remarks

- The existing code can be modified to solve the task. The basic logic (e.g. what data is entered) must be retained.
- You can create new classes for an object-oriented solution.  
- You can use external libraries (e.g. Apache Commons). However, these libraries should be reasonably well known and freely available.  
- It is not part of the task to improve the console application or make it more robust.  
- The file path does not need to be dynamic. It is sufficient if the path is fixed in the code.  
- Try to stick to clean code and KISS. However, please code the way you think is good and right.  
- The solution to the task should not take longer than four hours. You can of course spend more time on it, but it is perfectly fine if smaller aspects are not yet completed.  