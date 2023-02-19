package model;

import java.util.ArrayList;

public class PhieuXuat {
    private String maPh;
    private String ngayXuat;
    private KhachHang khachHang;
    private int soLoai;
    private ArrayList<Hang> hangs;
    private NhanVien nguoiGui;
    private UuDai uuDai;

    public String getMaPh() {
        return maPh;
    }

    public void setMaPh(String maPh) {
        this.maPh = maPh;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }


    public int getSoLoai() {
        return soLoai;
    }

    public void setSoLoai(int soLoai) {
        this.soLoai = soLoai;
    }

    public NhanVien getNguoiGui() {
        return nguoiGui;
    }

    public void setNguoiGui(NhanVien nguoiGui) {
        this.nguoiGui = nguoiGui;
    }

    public UuDai getUuDai() {
        return uuDai;
    }

    public void setUuDai(UuDai uuDai) {
        this.uuDai = uuDai;
    }

    public ArrayList<Hang> getHangs() {
        return hangs;
    }

    public void setHangs(ArrayList<Hang> hangs) {
        this.hangs = hangs;
    }

}

