package metodiricorsivi;

public class Main {

    public static void main(String[] args) {
//        stampo il fattoriale di un valore indicato tra parentesi
//        formattata in modo che metta i separatori delle migliaia
//        catturo l'eccezione
        try {
//            prova a fare il fattoriale del numero passato tra parentesi
            System.out.println(String.format("%,d", fattoriale(13)));
//        cattura l'eccezione  
        } catch (ExceptionParamNegativo e) {
//            stampa l'eccezione
            System.out.println(e);
        } catch (ExceptionParamGrande e) {
            System.out.println(e);
        }

    }

//    metodo ricorsivo
//    richiama se stesso
//    li passo un intero N
//    lancia le eccezioni dalla classe costruita sotto
    public static int fattoriale(int N) throws ExceptionParamNegativo, ExceptionParamGrande {
//        se N < 0
        if (N < 0) {
//            lancia l'eccezione
            throw new ExceptionParamNegativo("Argomento del fattoriale negativo.");
        }
//        se N > 12
        if (N > 12) {
            throw new ExceptionParamGrande("Argomento del fattoriale troppo grande");
        }
//        se N < 2
        if (N < 2) {
//            ritorna 1 (fattoeiale = 1)
            return 1;
        } else {
//            dichiaro un intero fattPrec 
//            al quale assegnamo il risultato di fattoriale -1
            int fattPrec = fattoriale(N - 1);
//            dichiaro un intero risultato
//            al quale assegno il valore fattPrec*N
            int risultato = fattPrec * N;
//            restituisco risultato
            return risultato;
        }
    }
}

class ExceptionParamGrande extends Exception {

    public ExceptionParamGrande(String s) {
        System.out.println(s);
        System.exit(1);
    }
}

//creo una nuova classe che estenda eccezione
class ExceptionParamNegativo extends Exception {

//    creo una Stringa messaggioIniziale
    private String messaggioIniziale;

//    faccio il costruttore
//    assegno a messaggioIniziale la Stringa s
//    passatali come parametro
//    stampo la stringa s
//    faccio uscire 1 se c'è un errore
    public ExceptionParamNegativo(String s) {
        messaggioIniziale = s;
        System.out.println(s);
        System.exit(1);
    }
}
