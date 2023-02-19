package dao;

import model.NhanVien;
import model.PhieuXuat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuXuatdao {
        public void them(PhieuXuat phieuXuat){
            String sql = "INSERT INTO PhieuXuat VALUES (?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,phieuXuat.getMaPh());
                preparedStatement.setString(2,phieuXuat.getNgayXuat());
                preparedStatement.setObject(3,phieuXuat.getKhachHang());
                preparedStatement.setObject(4,phieuXuat.getHangs());
                preparedStatement.setObject(5,phieuXuat.getNguoiGui());
                preparedStatement.setObject(6,phieuXuat.getUuDai());
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void capnhat(PhieuXuat phieuXuat){
            String sql ="UPDATE PhieuXuat  SET ngayxuat = ?, khachhang = ?, hang = ?, nguoigui= ?, uudai = ?, WHERE maph = ?";

            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(6,phieuXuat.getMaPh());
                preparedStatement.setString(1,phieuXuat.getNgayXuat());
                preparedStatement.setObject(2,phieuXuat.getKhachHang());
                preparedStatement.setObject(3,phieuXuat.getHangs());
                preparedStatement.setObject(4,phieuXuat.getNguoiGui());
                preparedStatement.setObject(5,phieuXuat.getUuDai());

                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public void xoa(String a) {
            //truyen ma nv
            String sql ="DELETE FROM PhieuXuat WHERE maph = ?";

            try {
                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
                preparedStatement.setString(1,a );
                preparedStatement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
//        public List<PhieuXuat> hienThi() {
//            List<PhieuXuat> phieuXuatList = new ArrayList<>();
//            String sql ="SELECT * FROM PhieuXuat ";
//            try {
//                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
//                ResultSet resultSet = preparedStatement.getResultSet();
//                while (resultSet.next()){
//                    PhieuXuat phieuXuat = new PhieuXuat();
//                    phieuXuat.setMaPh(resultSet.getString(1));
//                    phieuXuat.setNgayXuat(resultSet.getString(2));
//                    phieuXuat.setKhachHang(resultSet.getObject());
//                    nhanVien.setSdt(resultSet.getString(4));
//
//                    listnhanNhanViens.add(nhanVien);
//                }
//
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            return listnhanNhanViens;
//        }


//        public PhieuXuat timtheoid(String a){
//            //a là mã nhanVien truyền vào
//            String sql ="SELECT  * FROM NhanVien WHERE manv = ?";
//            PhieuXuat phieuXuat = new PhieuXuat();
//            try {
//                PreparedStatement preparedStatement = JDBCConector.getJDBCConnector().prepareStatement(sql);
//                preparedStatement.setString(1,a);
//                ResultSet resultSet = preparedStatement.getResultSet();
//                while (resultSet.next()){
//                    phieuXuat.setMaPh(resultSet.getString(1));
//                    phieuXuat.setNgayXuat(resultSet.getString(2));
//                    phieuXuat.setNguoiGui(resultSet.getObject(3));
//                    phieuXuat.setHangs(resultSet.getObject(4));
//                }
//
//
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            return phieuXuat;
//
//        }

}
