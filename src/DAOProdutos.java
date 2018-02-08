import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOProdutos {
    private Connection c;

    public DAOProdutos() throws ClassNotFoundException,SQLException{
        c = ConnectionFactory.getConnection();
    }

    public void adicionar(Produtos produtos){
        PreparedStatement ps = null;
        try{

            ps = c.prepareStatement("INSERT INTO Produtos(idProdutos, Bebidas, Camisinha, Cigarros, Preco, Quantidade) VALUES (?,?,?,?,?,?)");
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}