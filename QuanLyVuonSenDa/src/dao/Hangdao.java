package dao;

import model.Hang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Hangdao {
    public void them(Hang hang){
        String sql ="INSERT INTO Hang VALUES (?, ?, ?, ?, ?, ?, ? )";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,hang.getMasp());
            preparedStatement.setString(2,hang.getTensp());
            preparedStatement.setString(3,hang.getKichCo());
            preparedStatement.setLong(4,hang.getSoLuong());
            preparedStatement.setLong(5,hang.getDonGia());
            preparedStatement.setString(6,hang.getDiaChi());
            ResultSet resultSet =preparedStatement.getResultSet();
            hang.setSoluongConLai(resultSet.getLong(7)-hang.getSoLuong());
            preparedStatement.setLong(7,hang.getSoluongConLai());
// muốn giảm số lượng cây còn lại = số lượng cây còn lại ban đầu trừ đi số lượng hàng bán.
            // mot cau lenh cap nhat thay the gia tri
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void capnhat(Hang hang){
        String sql ="UPDATE Hang SET tensp = ?, kichco = ?, soluong = ?, donGia = ?, diaChi = ?, soluongcon =?, WHERE masp = ?";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,hang.getTensp());
            preparedStatement.setString(2,hang.getKichCo());
            preparedStatement.setLong(3,hang.getSoLuong());
            preparedStatement.setLong(4,hang.getDonGia());
            preparedStatement.setString(5,hang.getDiaChi());
            preparedStatement.setLong(6, hang.getSoluongConLai());
            preparedStatement.setString(7,hang.getMasp());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void xoa(String a){
        //a là mã sản phẩm truyền vào
        String sql ="DELETE FROM KhachHang WHERE makh = ?";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,a);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public List<Hang> hienthi(){
        List<Hang> listHangs = new ArrayList<>();
        String sql ="SELECT * FROM Hang ";
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                Hang hang = new Hang();
                hang.setMasp(resultSet.getString(1));
                hang.setTensp(resultSet.getString(2));
                hang.setKichCo(resultSet.getString(3));
                hang.setSoLuong(resultSet.getLong(4));
                hang.setDonGia(resultSet.getLong(5));
                hang.setDiaChi(resultSet.getString(6));
                listHangs.add(hang);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listHangs;

    }

    public Hang timtheoid(String a){
        //a là mã sản phẩm truyền vào
        String sql ="SELECT  * FROM Hang WHERE masp = ?";
        Hang hang = new Hang();
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,a);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                hang.setMasp(resultSet.getString(1));
                hang.setTensp(resultSet.getString(2));
                hang.setKichCo(resultSet.getString(3));
                hang.setSoLuong(resultSet.getLong(4));
                hang.setDonGia(resultSet.getLong(5));
                hang.setDiaChi(resultSet.getString(6));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return hang;
    }

    public Hang timtheoten(String a){
        //a là mã sản phẩm truyền vào
        String sql ="SELECT  * FROM Hang WHERE tensp = ?";
        Hang hang = new Hang();
        try {
            PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
            preparedStatement.setString(1,a);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                hang.setMasp(resultSet.getString(1));
                hang.setTensp(resultSet.getString(2));
                hang.setKichCo(resultSet.getString(3));
                hang.setSoLuong(resultSet.getLong(4));
                hang.setDonGia(resultSet.getLong(5));
                hang.setDiaChi(resultSet.getString(6));
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hang;
    }

}
