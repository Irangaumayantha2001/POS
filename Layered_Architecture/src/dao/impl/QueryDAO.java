package dao.impl;


import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public interface QueryDAO {
    ArrayList<CustomerDTO> searchOrderByOrderID(String id)throws SQLException,ClassNotFoundException;
}
