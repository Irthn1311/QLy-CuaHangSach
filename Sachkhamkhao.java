class Sachkhamkhao extends Sach{
    private String linhvuc;
    private int dotuoi;
    public Sachkhamkhao(){
        super();
        linhvuc="";
        dotuoi=0;
    }
     public Sachkhamkhao(String masach,String tensach,String tacgia,String theloai,int dongiaban,int soluong,String linhvuc,int dotuoi){
        super(masach,tensach,tacgia,theloai,dongiaban,soluong);
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
