
public class Administrador extends Cliente{

	private boolean esAdmin;

	public Administrador(String username, String email, String nombre, String apellido_1, String apellido_2,
			String fecha_nac, String contraseña, boolean esAdmin) {
		super(username, email, nombre, apellido_1, apellido_2, fecha_nac, contraseña);
		this.esAdmin = esAdmin;
	}
	
	

	public Administrador() {
		super();
		
		this.esAdmin= false;
		// TODO Auto-generated constructor stub
	}



	


	public boolean isEsAdmin() {
		return esAdmin;
	}

	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	
	

}


