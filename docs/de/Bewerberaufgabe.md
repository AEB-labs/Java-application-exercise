# Bewerberaufgabe

1. [Währungskurse](#introduction)
2. [Deine Aufgabe](#task)
    1. [Einlesen der Währungskurse](#import)
    2. [Ausgabe der Daten zu einem Währungskurs](#output)
    3. [Eingabe eines neuen Währungskurses](#input)
    4. [Automatische Tests](#tests)
3. [Hinweise](#hints)

<a name="introduction"></a>

## Währungskurse

Das Projekt enthält unter [src/main/resources/KursExport.csv](/src/main/resources/KursExport.csv) eine CSV-Datei mit den Währungskursen der IATA (International Air Transport Association). Dabei wird für ein Land 1 Euro in die angegebene Währung umgerechnet, wobei nicht immer in die jeweilige Landeswährung umgerechnet wird.  

```csv
Vereinigte Staaten;1,1366;USD;10.07.2019;09.08.2019;;
```

Eine Zeile aus der CSV-Datei enthält folgende Daten:  
1. Name des Landes  
2. Umrechnungskurs der Fremdwährung zum Euro  
3. ISO-Code der Währung  
4. Beginn des Gültigkeitszeitraums  
5. Ende des Gültigkeitszeitraums  
6. Bemerkung  

Der Eintrag von oben bedeutet also:  
> 1 Euro sind 1,1366 USD im Zeitraum vom 10.07.2019 bis zum 09.08.2019. Eine Bemerkung ist nicht angegeben.  

<a name="task"></a>

### Deine Aufgabe

Die Konsolenanwendung enthält einige Funktionen mit To-dos, die Du umsetzen sollst.  

- [ ] Einlesen der Währungskurse  
- [ ] Daten zu einem Währungskurs ausgeben 
- [ ] Eingabe eines neuen Währungskurses  
- [ ] (optional) automatische Tests  

<a name="import"></a>

#### Einlesen der Währungskurse

Die Währungskurse müssen in einer geeigneten Datenstruktur eingelesen werden, wobei folgende Bedingungen zu beachten sind:  
1. Der Ländername wird ignoriert. Die Währung wird mit dem dreistelligen ISO-Code identifiziert.  
2. Kommt ein Währungskurs für einen Zeitraum mehrfach vor (z.B. der Kurs gilt für mehrere Länder), so wird der erste Kurs beibehalten und alle weiteren ignoriert.  
3. Ignoriere alle Kurse, die eine Bemerkung enthalten.  
4. Gehe davon aus, dass sich die Kurse nicht teilweise überschneiden (z.B. USD 01.03. - 31.03. und USD 15.03. - 15.04.). Einträge mit gleichem Zeitraum und Währung können jedoch mehrfach vorkommen (für verschiedene Länder).
5. Das Format der CSV-Datei ist so definiert, wie Du sie vorfindest. Sonderbehandlungen (z.B. abweichende Datumsformate) sind nicht erforderlich.  
6. Sollten Daten nicht dem vorgegebenen Format entsprechen, wie z.B. leere oder unvollständige Zeilen, falsches Datumsformat o.ä., sollen diese Zeilen nicht eingelesen werden.  

<a name="output"></a>

#### Ausgabe der Daten zu einem Währungskurs

Die Konsolenanwendung stellt die Eingabewerte des Anwenders bei der Abfrage bereit. Die Funktion soll den Umrechnungskurs für eine Währung zu einem bestimmten Datum anzeigen (in der Form `1 XYZ entspricht xx,xxx Euro`) oder anzeigen, dass kein Umrechnungskurs existiert.  

Der entsprechende Umrechnungskurs wird aus den eingelesenen Daten ermittelt.  

<a name="input"></a>

#### Eingabe eines neuen Währungskurses

Neue Währungskurse können für einen bestimmten Zeitraum eingegeben werden. Der eingegebene Kurs muss zu den Daten hinzugefügt werden. Es darf keine Überschneidung geben.  

Wenn der neue Währungskurs in Zeiträume bestehender Kurse fällt, müssen bestehende Kurse gelöscht werden, wenn sie vollständig vom neuen Kurs komplett abgedeckt werden. Fällt ein alter Kurs nur teilweise in den Zeitraum des neuen Kurses, muss das Anfangs- oder Enddatum des alten Kurses so angepasst werden, dass sich die Kurse nicht überschneiden, sondern der alte Kurs direkt an den neuen angrenzt.  

Alle Varianten sind so abzubilden, dass der neu eingegebene Kurs immer Vorrang vor den bestehenden Kursen hat.  

<a name="tests"></a>

#### Automatische Tests

Wenn es die Zeit zulässt, erstelle automatisierte Tests, um die Funktionalität zu testen. Beschränke dich dabei auf die kritischen / komplexen Teile deines Codes.  

<a name="hints"></a>

### Hinweise

- Der bestehende Code kann zur Lösung der Aufgabe abgeändert werden. Die grundlegende Logik (z.B. welche Daten eingegeben werden) muss dabei erhalten bleiben.
- Du kannst neue Klassen für eine objektorientierte Lösung erstellen.  
- Du kannst externe Bibliotheken verwenden (z.B. Apache Commons). Diese Bibliotheken sollten jedoch einigermaßen bekannt und frei verfügbar sein.  
- Es ist nicht Teil der Aufgabe, die Konsolenanwendung zu verbessern oder robuster zu machen.  
- Der Dateipfad muss nicht dynamisch sein. Es reicht, wenn der Pfad fest im Code hinterlegt ist.  
- Versuche Dich an Clean Code und KISS zu halten. Trotzdem gilt: Bitte programmiere so, wie Du es selbst für gut und richtig hältst.  
- Die Lösung der Aufgabe sollte nicht länger als vier Stunden dauern. Du kannst natürlich mehr Zeit investieren, aber es ist völlig in Ordnung, wenn kleinere Aspekte noch nicht vollständig sind.  