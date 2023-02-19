package dao;

import model.KhachHang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangdao {
    public void them(KhachHang khachHang){
        String sql = "INSERT INTO KhachHang VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,khachHang.getMaKh());
            preparedStatement.setString(2,khachHang.getTenKH());
            preparedStatement.setString(3,khachHang.getDiaChi());
            preparedStatement.setString(4,khachHang.getSdt());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void capnhat(KhachHang khachHang){
        String sql ="UPDATE KhachHang SET tenkh = ?, diachi = ?, sdt = ?, WHERE makh = ?";

        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,khachHang.getMaKh());
            preparedStatement.setString(2,khachHang.getTenKH());
            preparedStatement.setString(3,khachHang.getDiaChi());
            preparedStatement.setString(4,khachHang.getSdt());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void xoa(String a) {
        //truyen ma sp
        String sql ="DELETE FROM KhachHang WHERE masp = ?";

        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1, a);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<KhachHang> hienThi() {
        List<KhachHang> listKhachhangs = new ArrayList<>();
        String sql ="SELECT * FROM KhachHang ";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKh(resultSet.getString(1));
                khachHang.setTenKH(resultSet.getString(2));
                khachHang.setDiaChi(resultSet.getString(3));
                khachHang.setSdt(resultSet.getString(4));

                listKhachhangs.add(khachHang);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listKhachhangs;
    }


    public KhachHang timtheoid(String a){
        //a là mã khach hang truyền vào
        String sql ="SELECT  * FROM KhachHang WHERE makh = ?";
        KhachHang khachHang = new KhachHang();
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,a);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                khachHang.setMaKh(resultSet.getString(1));
                khachHang.setTenKH(resultSet.getString(2));
                khachHang.setDiaChi(resultSet.getString(3));
                khachHang.setSdt(resultSet.getString(4));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return khachHang;

    }

    public KhachHang timtheoten(String a){
        //a là mã sản phẩm truyền vào
        String sql ="SELECT  * FROM KhachHang WHERE tenkh = ?";
        KhachHang khachHang = new KhachHang();
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,a);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                khachHang.setMaKh(resultSet.getString(1));
                khachHang.setTenKH(resultSet.getString(2));
                khachHang.setDiaChi(resultSet.getString(3));
                khachHang.setSdt(resultSet.getString(4));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return khachHang;
    }

}
