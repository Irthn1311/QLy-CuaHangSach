class Sachchuyennganh extends Sach{
    private String monchuyennganh;
    public Sachchuyennganh(){
        super();
        monchuyennganh="";
    }
    public Sachchuyennganh(String masach,String tensach,String tacgia,String theloai,int dongiaban,int soluong,String monchuyennganh){
         super(masach,tensach,tacgia,theloai,dongiaban,soluong);
         this.monchuyennganh=monchuyennganh;
    }
    public String getMonchuyennganh(){
        return monchuyennganh;
    }
    public void setMonchuyennganh(String monchuyennganh){
    this.monchuyennganh=monchuyennganh;
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