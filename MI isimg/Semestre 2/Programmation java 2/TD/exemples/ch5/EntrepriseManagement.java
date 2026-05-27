
import java.math.BigDecimal;
import java.sql.*;

public class EntrepriseManagement {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/entreprise_db";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "isimg";

	private static Connection connection;

	public static Connection getInstance() throws SQLException {
		if (connection == null) {
           connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		}
		return connection;
	}

	public static void createTable(Connection connection) throws SQLException {
		try (Statement statement = connection.createStatement()) {
			statement.executeUpdate("DROP TABLE IF EXISTS employes");
			statement.executeUpdate("CREATE TABLE employes (" 
		                     + "id INT PRIMARY KEY AUTO_INCREMENT,"
		                     + "nom VARCHAR(255)," 
		                     + "age INT," 
		                     + "salaire DECIMAL(10, 3))");
		}
	}

	public static void insertEmployes(Connection connection) throws SQLException {
	            String insertQuery = "INSERT INTO employes (nom, age, salaire) VALUES (?, ?, ?)";
	       try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

			preparedStatement.setString(1, "Rami Krid");
			preparedStatement.setInt(2, 34);
			preparedStatement.setBigDecimal(3, new BigDecimal("2200.500"));
			preparedStatement.executeUpdate();

			preparedStatement.setString(1, "Sami Feki");
			preparedStatement.setInt(2, 28);
			preparedStatement.setBigDecimal(3, new BigDecimal("1500.750"));
			preparedStatement.executeUpdate();

			preparedStatement.setString(1, "Salma Abid");
			preparedStatement.setInt(2, 24);
			preparedStatement.setBigDecimal(3, new BigDecimal("1200.000"));
			preparedStatement.executeUpdate();
		}
	}

	public static void retrieveEmployes(Connection connection) throws SQLException {
		String selectQuery = "SELECT * FROM employes";
		try (Statement statement = connection.createStatement();
		       ResultSet resultSet = statement.executeQuery(selectQuery)) {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nom = resultSet.getString("nom");
				int age = resultSet.getInt("age");
				BigDecimal salaire = resultSet.getBigDecimal("salaire");
				System.out.println("Employé ID: " + id);
				System.out.println("Nom: " + nom);
				System.out.println("Age: " + age);
				System.out.println("Salaire: " + salaire);
				System.out.println();
			}
		}
	}

public static void updateSalaire(Connection connection, int id, double pourcentageAugmentation)
			throws SQLException {
	     String updateQuery = "UPDATE employes SET salaire = salaire * (1 + ?) WHERE id = ?";
             	try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
			preparedStatement.setDouble(1, pourcentageAugmentation);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
		}
	}

	public static void main(String[] args) throws SQLException{
		
			Connection connection = EntrepriseManagement.getInstance();
			createTable(connection);
			insertEmployes(connection);
			retrieveEmployes(connection);
			updateSalaire(connection, 1, 0.1);
		
	}
}