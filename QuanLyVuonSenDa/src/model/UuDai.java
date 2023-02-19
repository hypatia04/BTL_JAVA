package model;

public class UuDai {

    private String maUD;
    private String ngayBatDau;
    private String ngayKetThuc;
    private float tyLe;

    public String getMaUD() {
        return maUD;
    }

    public void setMaUD(String maUD) {
        this.maUD = maUD;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getTyLe() {
        return tyLe;
    }

    public void setTyLe(float tyLe) {
        this.tyLe = tyLe;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    private int soluong;

    public UuDai(String maUD, String ngayBatDau, String ngayKetThuc, float tyLe, int soluong) {
        this.maUD = maUD;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tyLe = tyLe;
        this.soluong = soluong;
    }
    public UuDai(){};
}
