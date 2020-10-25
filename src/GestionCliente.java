import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GestionCliente {

	public Cliente obtenerUsuario(Cliente cli) {
		
			Cliente cl = null;
			Conexion conexion2 = new Conexion();
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			try {
				Connection cn2 = conexion2.conectar();
				String sql = "select * from usuario where Username = ? and contr = ?";
				pst = cn2.prepareStatement(sql);
				pst.setString(1, cli.getUsername());
				pst.setString(2, cli.getContrasenya());
				rs = pst.executeQuery();
				
				while(rs.next()) {
					cl = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				}
				
			}catch (Exception e) {
				System.out.println("error en obtener cliente");
			}
			
			return cl;
		
	}
}
