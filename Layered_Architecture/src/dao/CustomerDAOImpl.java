package dao;

import db.DBConnection;
import model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO{


    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {

        ResultSet rst=SQLUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerDTO>allCustomers=new ArrayList<>();
        while (rst.next()){

            allCustomers.add(new CustomerDTO(rst.getString(1),  rst.getString(2), rst.getString(3)));
        }
        return allCustomers;
    }

    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("INSERT INTO Customer (id,name, address) VALUES (?,?,?)", dto.getId(), dto.getName(), dto.getAddress());
    }

    public boolean updateCutomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("UPDATE Customer SET name=?, address=? WHERE id=?", dto.getName(), dto.getAddress(), dto.getId());

    }
    public  boolean exitCustomer(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("SELECT id FROM Customer WHERE id=?",id);
    }

    public  boolean  deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.executeUpdate("DELETE FROM Customer WHERE id=?",id);
    }

    public String generateNewId()  throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");

        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }

}


