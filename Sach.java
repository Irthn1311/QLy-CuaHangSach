import java.util.Scanner;
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

        public void nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.print("\nNhap ma sach: ");
            masach=sc.nextLine();
            System.out.print("\nNhap Ten sach: ");
            tensach=sc.nextLine();
            System.out.print("\nNhap tac gia : ");
            tacgia=sc.nextLine();
            System.out.print("\nNhap the loai :");
            theloai=sc.nextLine();
            System.out.print("\nNhap gia ban: ");
            dongiaban=sc.nextInt();
            System.out.print("\nNhap so luong: ");
            soluong=sc.nextInt();
            }

        public void xuat(){
            System.out.print("\nMa sach: "+masach);
            System.out.print("\nTen sach: "+tensach);
            System.out.print("\nTac gia : "+tacgia);
            System.out.print("\nThe loai :"+theloai);
            System.out.print("\nDon gia ban: "+dongiaban);
            System.out.print("\nSo luong: "+soluong);
        }
}