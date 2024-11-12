
import java.util.Scanner;

class Sachchuyennganh extends Sach{
    private String monchuyennganh;
    public Sachchuyennganh(){
        super();
        monchuyennganh="";
    }
    public Sachchuyennganh(String masach,String tensach,String matacgia,String theloai,int dongiaban,int soluong,String monchuyennganh){
         super(masach,tensach,matacgia,theloai,dongiaban,soluong);
         this.monchuyennganh=monchuyennganh;
    }
    public String getMonchuyennganh(){
        return monchuyennganh;
    }
    public void setMonchuyennganh(String monchuyennganh){
         this.monchuyennganh=monchuyennganh;
    }
    @SuppressWarnings("resource")
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("\nNhap mon chuyen nganh: ");
        monchuyennganh=sc.nextLine();
    }
    @Override public void xuat(){
        super.xuat();
        System.out.print("\nMon chuyen nganh: "+monchuyennganh);
    }
    @Override
    public String toString() {
        return super.toString() + "\nMon chuyen nganh: " + monchuyennganh;
    }
}