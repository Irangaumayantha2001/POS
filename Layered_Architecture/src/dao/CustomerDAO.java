package dao;

import db.DBConnection;
import model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {


    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;


    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;


    public boolean updateCutomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;


    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generateNewId()  throws SQLException, ClassNotFoundException ;

}





