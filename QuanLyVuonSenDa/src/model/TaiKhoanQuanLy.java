package model;

public class TaiKhoanQuanLy {
    private String username;
    private String password;
    private String sdt;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public TaiKhoanQuanLy(String username, String password, String sdt) {
        this.username = username;
        this.password = password;
        this.sdt = sdt;
    }
    public TaiKhoanQuanLy(){};
}
