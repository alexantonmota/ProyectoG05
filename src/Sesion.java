
public class Sesion {
	
	protected double hora;

	public Sesion(double hora) {
		super();
		this.hora = hora;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		
		if(hora==16.00||hora==18.00||hora==20.00||hora==22.00) {
		this.hora = hora;
		}else {
			System.out.println("Selecciona un horario disponible");
		}
	}
	
	

}
