import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCadastroClientes {
    private Connection c;

    public DAOCadastroClientes() throws ClassNotFoundException,SQLException{
        c = ConnectionFactory.getConnection();
    }

    public void adicionar(Cliente cliente){
        PreparedStatement ps = null;
        try{

            ps = c.prepareStatement("INSERT INTO CadastroClientes(Nome, DataNasc, Cpf, Telefone, Endereco, Cidade, Estado, Cep, Quartos_idQuartos, Quartos_Hr_Entrada, Quartos_Data) VALUES (?,?,?,?,?,?,?,?,?,?,?);");
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
