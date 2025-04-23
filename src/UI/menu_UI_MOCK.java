package UI;

import PharmacyJDBC.JDBCManager;

public class menu_UI_MOCK {
	
	private static JDBCManager jdbcmanager;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jdbcmanager = new JDBCManager();
		jdbcmanager.closeConnection();
	}

}
