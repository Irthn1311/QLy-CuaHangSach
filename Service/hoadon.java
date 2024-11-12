package Service;
public class hoadon {
    private String mahoadon;
    private String ngaytaohoadon;
    private String makhachhang;
    private String manhanvien;
    private int tongtien;
    public hoadon(){
        mahoadon="";
        ngaytaohoadon="";
        makhachhang="";
        manhanvien="";
        tongtien=0;
    }
    public hoadon(String mahoadon,String ngaytaohoadon,String makhachhang,String manhanvien,int tongtien){
        this.mahoadon=mahoadon;
        this.ngaytaohoadon=ngaytaohoadon;
        this.makhachhang=makhachhang;
        this.manhanvien=manhanvien;
        this.tongtien=tongtien;
    }
    public String getMahoadon(){
        return mahoadon;
    }
    public String getNgaytaohoadon(){
        return ngaytaohoadon;
    }
    public String getMakhachhang(){
        return makhachhang;
    }
    public String getManhanvien(){
        return manhanvien;
    }
    public int getTongtien(){
        return tongtien;
    }
    public void setMahoadon(String mahoadon){
        this.mahoadon=mahoadon;
    }
    public void setNgaytaohoadon(String ngaytoahoadon){
        this.ngaytaohoadon=ngaytoahoadon;
    }
    public void setMakhachhang(String makhachhang){
        this.makhachhang=makhachhang;
    }
    public void setManhanvien(String manhanvien){
        this.manhanvien=manhanvien;
    }
    public void setTongtien(int tongtien){
        this.tongtien=tongtien;
    }
}