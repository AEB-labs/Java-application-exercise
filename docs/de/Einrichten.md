# Einrichten

> [!CAUTION]  
> Bitte erstelle keinen Pull Request auf das Hauptprojekt oder einen Fork! Dein Code ist dann **nicht** mehr privat!

Die Bewerberaufgabe ist für die IDEs Eclipses, IntelliJ und VS Code eingerichtet, aber es steht Dir frei, andere Entwicklungsumgebungen (oder gar keine) zu verwenden.  
Bevor Du mit dem Programmieren beginnen kannst, musst Du die Bewerberaufgabe richtig vorbereiten. Dazu hast Du drei Möglichkeiten:

- [GitHub Template](#template)
- [Git Clone / Import](#clone)
- [ZIP-Export](#zip)

<a name="template"></a>

## GitHub Template

> [!TIP]  
> GitHub Templates ist der schnellste Weg, um das Projekt für die Programmierung vorzubereiten.

| Schritte                                                                                                                                                                                                                                                                                                                   | Bild                                                                |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| <ul><li> Dafür klicke auf `Use this template` und dann auf `Create a new repository`. </li></ul>                                                                                                                                                                                                                           | ![Use this template](/docs/assets/images/template.png)              |
| <ul><li> Wähle dann `Include all branches` aus. </li><li> Achte darauf, dass unter `Owner` Dein Benutzername steht und nicht eine Gruppe oder Organisation. </li><li> Den `Repository name` und die `Description` kannst Du frei wählen. </li><li> Wähle die Option `Private` damit Dein Repository privat ist. </li></ul> | ![Create new repository](/docs/assets/images/create-repository.png) |
| <ul><li> Nachdem Du das private Repository erstellt hast, musst Du uns Zugriff darauf gewähren. </li><li> Dazu klickst Du auf `Settings`, dann auf `Collaborators` und wählst unter `Manage access` die Schaltfläche `Add people`. </li><li> Im Eingabefeld trägst Du die genannten E-Mail-Addressen ein. </li></ul>       | ![Access](/docs/assets/images/access.png)                           |
| <ul><li> In deinem Repository gehe zurück zu `Code` und klicke auf den grünen `Code` Button. </li><li> Am einfachsten ist es, den Code über `HTTPS` herunterzuladen. <br /> Dazu wähle HTTPS und klicke auf das Kopiersymbol. </li></ul>                                                                                   | ![Git clone](/docs/assets/images/git-clone.png)                     |

Nachdem Du das Projekt vorbereitet hast, gibt es noch ein paar Schritte in Git zu erledigen. Wenn Du noch nie mit Git gearbeitet hast, musst Du es zuerst [installieren](https://git-scm.com/downloads).

Dann öffnest Du eine Konsole (z.B. `cmd`) die Git unterstützt. Wenn Du Dir unsicher bist, führe `git --version` aus. Führe dann die folgenden Befehle aus:

```bash
git clone https://github.com/[GitHub-Benutzername]/[Repository-Name].git # Hier den Link vom HTTPS einfügen
cd [Repository-Name] # Hier den Namen von deinem Repository z.B. AEB-Bewerberaufgabe
git switch dev # Wechselt zum Branch dev
```

<a name="clone"></a>

## Git Clone / Import

> [!IMPORTANT]
> Diese Option ist eher für Experten geeignet, da Du Dich mit Git und dem Source-Code-Hoster auskennen musst.

Du kannst natürlich die Bewerberaufgabe auch klonen und in Dein eigenes **privates** Repository pushen oder importieren. Dein Code muss nicht auf GitHub gehostet sein. Dir steht frei andere Anbieter zu nutzen. Du musst nur sicherstellen, dass wir Zugriff auf Deinen Code haben und dass der Code privat ist.  

Bitte arbeite in dem Branch `dev`, um deine Änderungen besser vergleichen zu können.  

<a name="zip"></a>

## ZIP-Export

| Schritte                                                                                                                                                                                                                                                                                                                                                                             | Bild                                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|
| <ul><li> Wenn Du z.B. kein GitHub Account erstellen möchtest, kannst Du die Bewerberaufgabe als ZIP-Datei auf GitHub herunterladen. </li><li> Dafür klickst du auf `Code` und dann auf `Download ZIP`. </li><li> Du kannst dann ohne Git bzw. Versionierung an der Aufgabe arbeiten. <br /> Trotzdem wird Dir empfohlen zumindest lokal eine Git-Versionierung zu nutzen. </li></ul> | ![Download ZIP](/docs/assets/images/download-zip.png) |