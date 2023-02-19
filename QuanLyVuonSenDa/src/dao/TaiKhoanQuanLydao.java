package dao;

import model.TaiKhoanQuanLy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanQuanLydao {
    public List<TaiKhoanQuanLy> getTaiKhoan(){

        String sql = "SELECT * FROM TaiKhoan  ";
        List<TaiKhoanQuanLy> listtk = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.getResultSet();

            while(resultSet.next()){
                TaiKhoanQuanLy taiKhoanQuanLy = new TaiKhoanQuanLy();
                taiKhoanQuanLy.setUsername(resultSet.getString("username"));
                taiKhoanQuanLy.setPassword(resultSet.getString("password"));
                listtk.add(taiKhoanQuanLy);
            }
            return listtk;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;


    }
}
