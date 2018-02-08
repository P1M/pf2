import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCadastroClientes {
    private Connection c;

    public DAOCadastroClientes() throws ClassNotFoundException,SQLException{
        c = ConnectionFactory.getConnection();
    }

    public void adicionar(CadastraClientes cadastraClientes){
        PreparedStatement ps = null;
        try{

            ps = c.prepareStatement("INSERT INTO CadastroClientes(Nome, DataNasc, Cpf, Telefone, Endereco, Cidade, Estado, Cep) VALUES (?,?,?,?,?,?,?,?);");
           ps.setString(1,cadastraClientes.getNome());
            ps.setString(2,cadastraClientes.getDatanasc());
            ps.setString(3,cadastraClientes.getCpf());
            ps.setString(4,cadastraClientes.getTelefone());
            ps.setString(5,cadastraClientes.getEndereco());
            ps.setString(6,cadastraClientes.getCidade());
            ps.setString(7,cadastraClientes.getEstado());
            ps.setString(8,cadastraClientes.getCep());







            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
