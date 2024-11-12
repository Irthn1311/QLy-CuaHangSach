package Service;
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String sdt;
    private String diachi;
    private String luong;

    public NhanVien() {
        this.maNV = "";
        this.tenNV = "";
        this.sdt = "";
        this.diachi = "";
        this.luong = "";
    }

    public NhanVien(String maNV, String tenNV, String sdt, String diachi, String luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.sdt = sdt;
        this.diachi = diachi;
        this.luong = luong;
    }

    public NhanVien(NhanVien nv1) {
        this.maNV = nv1.maNV;
        this.tenNV = nv1.tenNV;
        this.sdt = nv1.sdt;
        this.diachi = nv1.diachi;
        this.luong = nv1.luong;
    }

    public String getmaNV() {
        return maNV;
    }

    public void setmaNV(String maNV) {
        this.maNV = maNV.trim();
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV.trim();
    }

    public String getsdt() {
        return sdt;
    }

    public void setsdt(String sdt) {
        this.sdt = sdt.trim();
    }

    public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi.trim();
    }

    public String getluong() {
        return luong;
    }

    public void setluong(String luong) {
        this.luong = luong.trim();
    }
}