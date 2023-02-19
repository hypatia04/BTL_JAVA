package dao;

import model.TaiKhoanQuanLy;
import model.UuDai;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UuDaidao {
        public void them(UuDai uuDai){
            String sql ="INSERT INTO UuDai VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,uuDai.getMaUD());
                preparedStatement.setString(2,uuDai.getNgayBatDau());
                preparedStatement.setString(3,uuDai.getNgayKetThuc());
                preparedStatement.setFloat(4,uuDai.getTyLe());
                preparedStatement.setLong(5,uuDai.getSoluong());
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        public void capnhat(UuDai uuDai){
            String sql ="UPDATE UuDai SET  ngaybd = ?, ngaykt =?, tyle = ?, soluong = ?  WHERE maud = ?";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,uuDai.getNgayBatDau());
                preparedStatement.setString(2,uuDai.getNgayKetThuc());
                preparedStatement.setFloat(3,uuDai.getTyLe());
                preparedStatement.setInt(4,uuDai.getSoluong());
                preparedStatement.setString(5,uuDai.getMaUD());

                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        public void xoa(String a){
            String sql ="DELETE FROM UuDai WHERE maud = ?";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,a);
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        public List<UuDai> hienthi(){
            List<UuDai> uuDaiList = new ArrayList<>();
            String sql ="SELECT * FROM UuDai ";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()){
                    UuDai uuDai = new UuDai();
                    uuDai.setMaUD(resultSet.getString(1));
                    uuDai.setNgayBatDau(resultSet.getString(2));
                    uuDai.setNgayKetThuc(resultSet.getString(3));
                    uuDaiList.add(uuDai);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return uuDaiList;

        }

        public UuDai timtheoid(String a){
            //a là mã sản phẩm truyền vào
            String sql ="SELECT  * FROM UuDai WHERE maud = ?";
            UuDai uuDai = new UuDai();
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,a);
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()){
                    uuDai.setMaUD(resultSet.getString(1));
                    uuDai.setNgayBatDau(resultSet.getString(2));
                    uuDai.setNgayKetThuc(resultSet.getString(3));
                    uuDai.setTyLe(resultSet.getFloat(4));
                    uuDai.setSoluong(resultSet.getInt(5));
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return uuDai;
        }


}
