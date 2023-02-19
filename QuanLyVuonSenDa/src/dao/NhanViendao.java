package dao;
import model.NhanVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanViendao {
        public void them(NhanVien nhanVien){
            String sql = "INSERT INTO NhanVien VALUES (?, ?, ?, ?)";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,nhanVien.getMaNV());
                preparedStatement.setString(2,nhanVien.getTenNV());
                preparedStatement.setString(3,nhanVien.getDiaChi());
                preparedStatement.setString(4,nhanVien.getSdt());

                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void capnhat(NhanVien nhanVien){
            String sql ="UPDATE NhanVien SET tennv = ?, diachi = ?, sdt = ?, WHERE manv = ?";

            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,nhanVien.getMaNV());
                preparedStatement.setString(2,nhanVien.getTenNV());
                preparedStatement.setString(3,nhanVien.getDiaChi());
                preparedStatement.setString(4,nhanVien.getSdt());

                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void xoa(String a) {
            //truyen ma nv
            String sql ="DELETE FROM NhanVien WHERE manv = ?";

            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1, a);
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        public List<NhanVien> hienThi() {
            List<NhanVien> listnhanNhanViens = new ArrayList<>();
            String sql ="SELECT * FROM NhanVien ";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()){
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.setMaNV(resultSet.getString(1));
                    nhanVien.setTenNV(resultSet.getString(2));
                    nhanVien.setDiaChi(resultSet.getString(3));
                    nhanVien.setSdt(resultSet.getString(4));

                    listnhanNhanViens.add(nhanVien);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return listnhanNhanViens;
        }


        public NhanVien timtheoid(String a){
            //a là mã nhanVien truyền vào
            String sql ="SELECT  * FROM NhanVien WHERE manv = ?";
            NhanVien nhanVien = new NhanVien();
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,a);
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()){
                    nhanVien.setMaNV(resultSet.getString(1));
                    nhanVien.setTenNV(resultSet.getString(2));
                    nhanVien.setDiaChi(resultSet.getString(3));
                    nhanVien.setSdt(resultSet.getString(4));
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return nhanVien;

        }

        public NhanVien timtheoten(String a){
            //a là mã sản phẩm truyền vào
            String sql ="SELECT  * FROM NhanVien WHERE tennv = ?";
            NhanVien nhanVien = new NhanVien();
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,a);
                ResultSet resultSet = preparedStatement.getResultSet();
                while (resultSet.next()){
                    nhanVien.setMaNV(resultSet.getString(1));
                    nhanVien.setTenNV(resultSet.getString(2));
                    nhanVien.setDiaChi(resultSet.getString(3));
                    nhanVien.setSdt(resultSet.getString(4));
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return nhanVien;
        }


}
