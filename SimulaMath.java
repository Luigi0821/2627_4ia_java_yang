public class SimulaMath {

    public SimulaMath() {
		
	}

    // Svolge il valore assoluto
	public double abs(double x) {
		if (x < 0) {
			return -x;
		}
		return x;
	}

	// Toglie i decimali sempre uguale alla base, per i numeri negativi devo fare -1
	public double floor(double x) {
		int n = (int) x;
		if (x < n) {
			n = n - 1;
		}
		return n;
	}

	// Arrotonda un numero all'intero più vicino 
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

    // Calcola la potenza
    public double pow(double x, int y) { 
        double risultato = 1;
        for (int i = 0; i < abs(y); i++) {
             risultato = risultato * x;
        }
        if (y < 0) {
           return 1 / risultato;
        }  
        return risultato;
    }

    // Calcola la radice quadrata
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
    
  
