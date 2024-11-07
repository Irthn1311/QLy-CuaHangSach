public class quanlycuahangsach {

    public class Sach
    {
        private String masach;
        private String tensach;
        private String tacgia;
        private String theloai;
        private int dongiaban;
        private int soluong;
        
        public Sach(){
            masach="";
            tensach="";
            tacgia="";
            theloai="";
            dongiaban=0;
            soluong=0;
        }
        public Sach(String masach,String tensach,String tacgia,String theloai,int dongiaban,int soluong){
            this.masach=masach;
            this.tensach=tensach;
            this.tacgia=tacgia;
            this .theloai=theloai;
            this.dongiaban=dongiaban;
            this.soluong=soluong;
        }

        public String getMasach(){
            return masach;
        }

        public String getTensach(){
            return tensach;
        }

        public String getTacgia(){
            return tacgia;
        }

        public String getTheloai(){
            return theloai;
        }

        public int getDongiaban(){
            return dongiaban;
        }
        public int getSoluong(){
            return soluong;
        }

        public void setMasach(String masach){
            this.masach=masach;
        }
        public void setTensach(String tensach){
            this.tensach=tensach;
        }
        public void setTacgia(String tacgia){
            this.tacgia=tacgia;
        }
        public void setDongiaban(int dongiaban){
            this.dongiaban=dongiaban;
        }
        public void setSoluong(int soluong){
            this.soluong=soluong;
        }

        public void xuat(){
            System.out.print("\nMa sach: "+masach);
            System.out.print("\nTen sach: "+tensach);
            System.out.print("\nTac gia : "+tacgia);
            System.out.print("\nThe loai :"+theloai);
            System.out.print("\nDon gia ban: "+dongiaban);
            System.out.println("So luong: "+soluong);
        }
    }
    class SACHCHUYENNGANH extends Sach{
        private String monchuyennganh;
        public SACHCHUYENNGANH(){
            super();
            monchuyennganh="";
        }
        public SACHCHUYENNGANH(String masach,String tensach,String tacgia,String theloai,int dongiaban,int soluong,String monchuyennganh){
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
    }
    class SACHKHAMKHAO extends Sach{
        private String linhvuc;
        private int dotuoi;
        public SACHKHAMKHAO(){
            super();
            linhvuc="";
            dotuoi=0;
        }
         public SACHKHAMKHAO(String masach,String tensach,String tacgia,String theloai,int dongiaban,int soluong,String linhvuc,int dotuoi){
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
    }
}
