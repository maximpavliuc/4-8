package org.example.lab4.Task4;

public class Main {
    public static void main(final String[] args) {

        LoggerBase logger1 = new ConsoleLogger();
        LoggerBase logger2 = new EmailLogger();
        LoggerBase logger3 = new FileLogger();


        // Hint: setNext() method
        logger1.setNext(logger2);
        logger2.setNext(logger3);


        logger1.message("Se execută metoda ProcessOrder()", LogLevel.DEBUG);
        logger1.message("Comanda a fost procesată cu succes", LogLevel.INFO);
        logger1.message("Datele despre adresa clientului lipsesc din baza de date a filialei", LogLevel.WARNING);
        logger1.message("Detele despre adresa clientului lipsesc din baza de date a organizație", LogLevel.ERROR);
        logger1.message("Nu se poate procesa comanda #Comanda1 datată pe 25.11.2018 pentru clientul #Clientul1",
                LogLevel.FUNCTIONAL_ERROR);
        logger1.message("Comandă procesată", LogLevel.FUNCTIONAL_MESSAGE);

    }
}
