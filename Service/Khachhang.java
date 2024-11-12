package Service;

public class Khachhang {
    private String soKhachhang;
    private String tenKhachhang;
    private String diaChi;
    private String soDienThoai;
    private String email;
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getSoKhachhang() {
        return soKhachhang;
    }
    public void setSoKhachhang(String soKhachhang) {
        this.soKhachhang = soKhachhang;
    }
    public String getTenKhachhang() {
        return tenKhachhang;
    }
    public void setTenKhachhang(String tenKhachhang) {
        this.tenKhachhang = tenKhachhang;
    }
    public Khachhang(String soKhachhang, String tenKhachhang, String diaChi, String soDienThoai, String email) {
        this.soKhachhang = soKhachhang;
        this.tenKhachhang = tenKhachhang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }
}
