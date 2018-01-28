import java.sql.*;


public class test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Forço a instanciação da classe Driver da implementação fornecida pela MySQL
        // Carregar o Driver (ETAPA 2)
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Especifica uma URL com informações para acessar o Banco de Dados (ETAPA 3)
        String url = "jdbc:mysql://localhost:3306/"; // Nome da base de dados
        String user = "root"; // nome do usuário do MySQL
        String password = "123pimpim"; // senha do MySQL

        // Abre uma conexão com o Banco de Dados (ETAPA 4)
        Connection c = DriverManager.getConnection(url, user, password);


        c.close();
    }


}