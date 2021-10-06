package se.dagstrings;

public class LabD1 {
    public void Run() {
        int antalNamn = 0;
        while (true) {
            System.out.println("Skriv in ett namn: ");
            String namn = System.console().readLine();
            int antalTecken = namn.length();

            if (namn.equalsIgnoreCase("exit")) {
                System.out.println("Hejdå. Du har skrivit in såhär många namn: " + antalNamn);
                break;
            }
            System.out.println(antalTecken);
            antalNamn++;
        }
    }
}
/**
 * Skriv ett program som (förevigt) matar in "Skriv in ett namn:" till en
 * strängvariabel
 * 
 * Du ska skriva ut hur många tecken det namnet har. Och dessutom hålla reda på
 * hur många namn som totalt matats in
 * 
 * 
 * 
 * Skriver man in "EXIT" så skall programmet avslutas och du skriver ut:
 * 
 * Hej då. Du matade in totalt <antal> stycken ord
 * 
 */