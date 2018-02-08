import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOServicos {
    private Connection c;

    public DAOServicos() throws ClassNotFoundException,SQLException{
        c = ConnectionFactory.getConnection();
    }

    public void adicionar(Servicos servicos){
        PreparedStatement ps = null;
        try{

            ps = c.prepareStatement("INSERT INTO Servicos(idServicos, Massagem, Danca, Completo, Preco, Funcionarios_Cpf_Func) VALUES (?,?,?,?,?,?)");
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}