
import java.util.Scanner;

class Sachkhamkhao extends Sach{
    private String linhvuc;
    private int dotuoi;
    public Sachkhamkhao(){
        super();
        linhvuc="";
        dotuoi=0;
    }
     public Sachkhamkhao(String masach,String tensach,String matacgia,String theloai,int dongiaban,int soluong,String linhvuc,int dotuoi){
        super(masach,tensach,matacgia,theloai,dongiaban,soluong);
        this.linhvuc=linhvuc;
        this.dotuoi=dotuoi;
    }
    public String getLinhvuc(){
        return linhvuc;
    }
    public int getDotuoi(){
        return dotuoi;
    }
    public void setLinhvuc(String linhvuc){
        this.linhvuc=linhvuc;
    }
    public void setDotuoi(int dotuoi){
        this.dotuoi=dotuoi;
    }
    @SuppressWarnings("resource")
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("\nNhap linh vuc: ");
        linhvuc=sc.nextLine();
        System.out.print("\nNhap do tuoi: ");
        dotuoi=sc.nextInt();
    }
    @Override public void xuat(){
        super.xuat();
        System.out.print("\nLinh vuc: "+linhvuc);
        System.out.print("\nDo tuoi: "+dotuoi);
    }
    @Override
    public String toString() {
        return super.toString() + "\nLinh vuc: " + linhvuc + "\nDo tuoi: " + dotuoi;
    }
    
}
