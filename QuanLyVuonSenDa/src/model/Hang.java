package model;

public class Hang {
    private String masp;
    private String tensp;
    private String kichCo;
    private long soLuong;
    private long donGia;
    private String diaChi;
    private long SoluongConLai;

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoluongConLai() {
        return SoluongConLai;
    }

    public void setSoluongConLai(long soluongConLai) {
        SoluongConLai = soluongConLai;
    }

    public Hang(String masp, String tensp, String kichCo, long soLuong, long donGia, String diaChi, long soluongConLai) {
        this.masp = masp;
        this.tensp = tensp;
        this.kichCo = kichCo;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.diaChi = diaChi;
        SoluongConLai = soluongConLai;
    }
    public Hang(){

    };
}
