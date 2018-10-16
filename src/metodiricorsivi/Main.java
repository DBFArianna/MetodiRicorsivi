package metodiricorsivi;

public class Main {

    public static void main(String[] args) {
//        stampo il fattoriale di un valore indicato tra parentesi
//        formattata in modo che metta i separatori delle migliaia
        System.out.println(String.format("%,d", fattoriale(14)));
    }
//    metodo ricorsivo
//    richiama se stesso
    public static long fattoriale(int N){
//        se N < 2
        if (N<2){
//            ritorna 1 (fattoeiale = 1)
            return 1;
        } else{
//            dichiaro un intero fattPrec 
//            al quale assegnamo il risultato di fattoriale -1
            long fattPrec = fattoriale(N-1);
//            dichiaro un intero risultato
//            al quale assegno il valore fattPrec*N
            long risultato = fattPrec*N;
//            restituisco risultato
            return risultato;
        }
    }
    
}
