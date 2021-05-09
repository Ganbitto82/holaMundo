package died.lab01.problema01;

public class Recta {
	
	public Punto p1;
	public Punto p2;

	public Recta(Punto p1 ,Punto p2) {
		this.p1=p1;
		this.p2=p2;
		
	}
	public Recta() {
		Punto p1 =new Punto(0,0);
		Punto p2 =new Punto(1,1);
		this.p1=p1;
		this.p2=p2;
					
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public float pendiente() {
		
		
		return (this.p2.getY()-this.p1.getY()) / (this.p2.getX()-this.p1.getX());
		
	}
	
	public boolean paralelas(Recta otraRecta) {
				
		if(this.pendiente()== otraRecta.pendiente())
         
			return true;
		
					else
		return false;		
		
	}
	
	public boolean equals(Object otraRecta) {
		
         if( otraRecta instanceof Recta) {
			
			Recta otra = (Recta)otraRecta;
			
			Recta r= new Recta();
			r.p1=this.p1;
			r.p2= ((Recta) otraRecta).getP2();
			
			if(this.pendiente()==otra.pendiente() && this.pendiente()== r.pendiente() )
				return true;
			else
		     	return false;
			}
		else
			
			return false;
				}

	

}
