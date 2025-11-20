public class Rechner {
    public static void main(String[] args) {

        // ### nach Anzahl von US-Dollar-Banknoten und -Münzen fragen ###
        Out.println("Bitte geben Sie die Anzahl der US-Dollar-Banknoten und -Münzen ein: ");


        // ### jeweilige Anzahl vom Nutzer abfragen/einlesen ###

        //Dollar-Scheine
        Out.println("100-Dollar-Scheine: ");
        int usd100 = In.readInt();

        Out.println("50-Dollar-Scheine: ");
        int usd50 = In.readInt();

        Out.println("20-Dollar-Scheine: ");
        int usd20 = In.readInt();

        Out.println("10-Dollar-Scheine: ");
        int usd10 = In.readInt();

        Out.println("5-Dollar-Scheine: ");
        int usd5 = In.readInt();

        Out.println("2-Dollar-Scheine: ");
        int usd2 = In.readInt();

        Out.println("1-Dollar-Scheine: ");
        int usd1 = In.readInt();


        // Dollar-Münze
        Out.println("1-Dollar-Münze: ");
        int usdM1 = In.readInt();


        // cent-Münzen
        Out.println("50-Cent-Münzen: ");
        int centM50 = In.readInt();

        Out.println("25-Cent-Münzen: ");
        int centM25 = In.readInt();

        Out.println("10-Cent-Münzen: ");
        int centM10 = In.readInt();

        Out.println("5-Cent-Münzen: ");
        int centM5 = In.readInt();

        Out.println("1-Cent-Münzen: ");
        int centM1 = In.readInt();



        // ### nach aktuellem Umrechnungskurs fragen und einlesen ###
        Out.println("Bitte geben Sie den Umrechnungskurs ein (1 Euro in Dollar-Cents):");
        int Umrechnungskurs = In.readInt();



        // ### Gesamtbetrag in US-Dollar-cent ###
        int gesUSDcent = usd100 * 10000 + usd50  *  5000 + usd20  *  2000 + usd10  *  1000 + usd5   *   500 + usd2   *   200 + usd1   *   100 + usdM1  *   100 + centM50 * 50 + centM25 * 25 + centM10 * 10 + centM5  * 5 + centM1;

        int gesDollar = gesUSDcent / 100;
        int gesCent   = gesUSDcent % 100;

        // Ausgabe des Geasmtbetrags
        Out.println("Gesamtbetrag in US-Dollar: " + gesDollar + " US-Dollar und " + gesCent + " Cent");



        // ### Gesamtbetrag in Euro ###

        int euroCentGesamt = (gesUSDcent * 100) / Umrechnungskurs; // Gesamtbetrag in Eurocent

        // für Ausgabe:
        int gesEuro       = euroCentGesamt / 100; // Gesamtbetrag in Euro
        int gesCentEuro   = euroCentGesamt % 100; // Rest vom Gesamtbetrag in Cent

        //Ausgabe des Gesamtbetrags
        Out.println("Gesamtbetrag in Euro: " + gesEuro + " Euro " + gesCentEuro + " Cent\n");



        // ### der Gesamtbetrag in US-Dollar in größtmögliche Euro-Scheine und -Münzen ###

        // Startwert für den Rest setzen
        int rest = euroCentGesamt;

        // Berechnung der jeweiligen Stückzahl
        int eur500 = rest / 50000; rest = rest % 50000;  // 500 € = 50_000 Cent
        int eur200 = rest / 20000; rest = rest % 20000;  // 200 € = 20_000 Cent
        int eur100 = rest / 10000; rest = rest % 10000;  // 100 € = 10_000 Cent
        int eur50  = rest /  5000; rest = rest %  5000;  // 50 € = 5000 Cent
        int eur20  = rest /  2000; rest = rest %  2000;  // 20 € = 2000 Cent
        int eur10  = rest /  1000; rest = rest %  1000;  // 10 € = 1000 Cent
        int eur5   = rest /   500; rest = rest %   500;  // 5 € = 500 Cent
        int eur2   = rest /   200; rest = rest %   200;  // 2 € = 200 Cent
        int eur1   = rest /   100; rest = rest %   100;  // 1 € = 100 Cent

        int c50    = rest /    50; rest = rest %    50;
        int c20    = rest /    20; rest = rest %    20;
        int c10    = rest /    10; rest = rest %    10;
        int c5     = rest /     5; rest = rest %     5;
        int c2     = rest /     2; rest = rest %     2;
        int c1     = rest;               // das was noch über bleibt (0 oder 1)


        //Ausgabe der Anzahl an Scheinen und Münzen
        Out.println("500 Euro-Scheine: " + eur500);
        Out.println("200 Euro-Scheine: " + eur200);
        Out.println("100 Euro-Scheine: " + eur100);
        Out.println("50 Euro-Scheine: " + eur50);
        Out.println("20 Euro-Scheine: " + eur20);
        Out.println("10 Euro-Scheine: " + eur10);
        Out.println("5 Euro-Scheine: " + eur5 + "\n");

        Out.println("2 Euro-Münze: " + eur2);
        Out.println("1 Euro-Münze: " + eur1 + "\n");

        Out.println("50 Cent-Münze: " + c50);
        Out.println("20 Cent-Münze: " + c20);
        Out.println("10 Cent-Münze: " + c10);
        Out.println("5 Cent-Münze: " + c5);
        Out.println("2 Cent-Münze: " + c2);
        Out.println("1 Cent-Münze: " + c1);
    }
}