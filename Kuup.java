
public class Kuup{
	double a;
	public Kuup(double pikkus){
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		a=pikkus;
	}
	public double ruumala(){
		return a*a*a;
	}
	public double t2ispindala(){
		return 6*(a*a);
	}
	
	public String toString(){
		return "Kuubi serva pikkus on "+a+" ning kuubi ruumalaks on "+ruumala()+" kuupsentimeetrit. Kuubi täispindala on "+t2ispindala()+" ruutsentimeetrit.";
	}
}

/*



27.0 54.0
729.0
91.125
Kuubi serva pikkus on 3.0 ning kuubi ruumalaks on 27.0 kuupsentimeetrit. Kuubi täispindala on 54.0 ruutsentimeetrit.
Kuubi serva pikkus on 9.0 ning kuubi ruumalaks on 729.0 kuupsentimeetrit. Kuubi täispindala on 486.0 ruutsentimeetrit.
Kuubi serva pikkus on 4.5 ning kuubi ruumalaks on 91.125 kuupsentimeetrit. Kuubi täispindala on 121.5 ruutsentimeetrit.


*/