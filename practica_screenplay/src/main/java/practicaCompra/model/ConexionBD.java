package practicaCompra.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	public static final String ORRACLE_DRIVER = "";
	public static final String HOST_DB = "";
	public static final String USER_DB = "";
	public static final String PASSWORD_DB = "";

	public static void main(String[] args) {

		ConexionBD conexionBD = new ConexionBD();
		conexionBD.conectar();
		conexionBD.desconectar(conexionBD.conectar());

	}

	public void desconectar(Connection conectar) {
		try {
			System.out.println("Se desconeta base de datos");
			conectar.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public  Connection conectar() {
		Connection conn = null;
		try {

			Class.forName(ORRACLE_DRIVER);
			conn = DriverManager.getConnection(HOST_DB, USER_DB, PASSWORD_DB);
			System.out.println("Conexi�n Exitosa" + HOST_DB);
		} catch (SQLException sql) {
			System.out.println("Error en la clase conexion " + sql.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;

	}

	;
}
