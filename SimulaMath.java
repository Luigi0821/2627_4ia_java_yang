public class SimulaMath {

    /* 
      Costruttore della classe SimulaMath.
      Viene chiamato quando creiamo un oggetto di questa classe. 
    */
    public SimulaMath() {
		
	}

    /* 
      Calcola il valore assoluto di un numero.
      Se il numero è negativo, lo trasforma in positivo.
      Se è già positivo, lo restituisce senza modificarlo. 
    */
	public double abs(double x) {
		if (x < 0) {
			return -x;
		}
		return x;
	}

	/* 
	  Calcola il valore intero inferiore di un numero (floor).
	  Converte il numero in intero eliminando i decimali.
	  Se il numero è negativo e la conversione ha eliminato una parte decimale,
	  sottrae 1 per ottenere l'intero inferiore corretto. 
	*/
	public double floor(double x) {
		int n = (int) x;
		if (x < n) {
			n = n - 1;
		}
		return n;
	}

	/* 
	  Arrotonda un numero all'intero più vicino.
	  Se la parte decimale è maggiore o uguale a 0.5, arrotonda per eccesso.
	  Se la parte decimale è minore di -0.5, arrotonda per difetto.
	  Negli altri casi restituisce la parte intera del numero. 
	*/
	public double round(double x) {
        double risultato;
        if (x % 1 >= 0.5) {
            risultato = (int) x + 1;
        } else if (x % 1 < -0.5) {
            risultato = (int) x - 1;
        } else {
            risultato = (int) x;
        }
        return risultato;
    }

    /* 
      Calcola la potenza di un numero.
      x rappresenta la base e y rappresenta l'esponente.
      Il ciclo si ripete tante volte quanto vale il valore assoluto di y.
      A ogni ciclo moltiplica il risultato per la base x.
      Alla fine restituisce il risultato. 
    */
    public double pow(double x, int y) { 
        double risultato = 1;
        for (int i = 0; i < abs(y); i++) {
             risultato = risultato * x;
        } 
        return risultato;
    }

    /* 
      Calcola la radice quadrata di un numero.
      Parte da 0 e aumenta il risultato di 0.1 a ogni ciclo.
      Continua finché il quadrato del risultato è minore del numero iniziale.
      Quando il quadrato raggiunge o supera il numero, restituisce il risultato. 
    */
    public double sqrt(double x) {
        double risultato = 0;
          while (risultato * risultato < x) {
               risultato += 0.1;
          }
          return risultato;
    } 

    public static void main(String[] args) {
        SimulaMath m = new SimulaMath();
     
        System.out.println("abs(-5.3)   = " + m.abs(-5.3));
        System.out.println("floor(4.8)  = " + m.floor(4.8));
        System.out.println("round(4.5)  = " + m.round(4.5));
        System.out.println("round(4.3)  = " + m.round(4.3));
        System.out.println("sqrt(16)    = " + m.sqrt(16));
        System.out.println("pow(2, 10)  = " + m.pow(2, 10));
    }     
}
    
  
