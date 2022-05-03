package dao;

import db.DBConnection;
import model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;

    public boolean saveItems(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean exitItems(String code) throws SQLException, ClassNotFoundException ;

    public String genarateNewId() throws SQLException, ClassNotFoundException ;


    public boolean deleteItems(String code) throws SQLException, ClassNotFoundException ;


    public boolean updateItems(ItemDTO dto) throws SQLException, ClassNotFoundException ;

}
