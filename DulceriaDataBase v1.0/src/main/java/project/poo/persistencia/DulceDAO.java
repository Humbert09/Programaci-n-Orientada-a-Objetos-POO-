package project.poo.persistencia;

import project.poo.modelo.Dulce;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

public class DulceDAO  implements  InterfazDAO{
    public DulceDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Dulces(Nombre, Marca, Tipo, Sabor, UrlFoto) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;

            PreparedStatement pstm = ConexionSingleton.getInstance("DulcesDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1,((Dulce)obj).getNombre());
            pstm.setString(2,((Dulce)obj).getMarca());
            pstm.setString(3,((Dulce)obj).getTipo());
            pstm.setString(4,((Dulce)obj).getSabor());
            pstm.setString(5,((Dulce)obj).getUrlFoto());
            rowCount = pstm.executeUpdate();
            return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Dulces SET Nombre = ?, Marca = ?, Tipo = ?, Sabor = ?, UrlFoto = ? WHERE Id = ? ; ";
        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("DulcesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Dulce)obj).getNombre());
        pstm.setString(2,((Dulce)obj).getMarca());
        pstm.setString(3,((Dulce)obj).getTipo());
        pstm.setString(4,((Dulce)obj).getSabor());
        pstm.setString(5,((Dulce)obj).getUrlFoto());
        pstm.setInt(6, ((Dulce)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Dulces WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("DulcesDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Dulces";
        ArrayList<Dulce> resultado = new ArrayList<>();

        PreparedStatement stm = ConexionSingleton.getInstance("DulcesDB.db").getConnection().prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        while (rst.next()){
            resultado.add(new Dulce(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Dulces WHERE Id = ? ;";
        Dulce dulce = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("DulcesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            dulce = new Dulce(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            return dulce;
        }
        return null;

    }
}
