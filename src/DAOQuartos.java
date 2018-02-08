import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOQuartos {
    private Connection c;

    public DAOQuartos() throws ClassNotFoundException,SQLException{
        c = ConnectionFactory.getConnection();
    }

    public void adicionar(Quartos quartos){
        PreparedStatement ps = null;
        try{

            ps = c.prepareStatement("INSERT INTO Quartos(idQuartos, Tipo_Quarto, Preco_Quarto, Hr_Entrada, Hr_Saida, Data, Produtos_idProdutos, Servicos_idServicos) VALUES (?,?,?,?,?,?,?,?)");
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}