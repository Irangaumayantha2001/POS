package dao;

import db.DBConnection;
import model.OrderDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlaceOrderDAOImpl {



    public ArrayList <String> getAllOrders() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Item");
        ArrayList<String> allOrders = new ArrayList<>();
        while (rst.next()) {
            allOrders.add(rst.getString(1));
        }
        return allOrders;
    }



}
