package dao;

import db.DBConnection;
import model.ItemDTO;
import model.OrderDetailDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PlaceOrderDAO {
    public ArrayList<String> getAllOrders() throws SQLException, ClassNotFoundException ;

    public ItemDTO getItemDetail(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;

    public String generateOrderId() throws SQLException, ClassNotFoundException ;

    public ArrayList<String> getAllCustomerIds() throws SQLException, ClassNotFoundException ;

    public String getCustomerName(String id) throws SQLException, ClassNotFoundException ;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;


    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;


    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;


}
