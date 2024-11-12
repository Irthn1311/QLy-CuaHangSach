import java.util.Scanner;
public class Sach
{
        private String masach;
        private String tensach;
        private String matacgia;
        private String theloai;
        private int dongiaban;
        private int soluong;
        
        public Sach(){
            masach="";
            tensach="";
            matacgia="";
            theloai="";
            dongiaban=0;
            soluong=0;
        }
        public Sach(String masach,String tensach,String matacgia,String theloai,int dongiaban,int soluong){
            this.masach=masach;
            this.tensach=tensach;
            this.matacgia=matacgia;
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
            return matacgia;
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
            this.matacgia=tacgia;
        }
        public void setDongiaban(int dongiaban){
            this.dongiaban=dongiaban;
        }
        public void setSoluong(int soluong){
            this.soluong=soluong;
        }
        @SuppressWarnings("resource")
        public void nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.print("\nNhap ma sach: ");
            masach=sc.nextLine();
            System.out.print("\nNhap Ten sach: ");
            tensach=sc.nextLine();
            System.out.print("\nNhap ma tac gia : ");
            matacgia=sc.nextLine();
            System.out.print("\nNhap the loai :");
            theloai=sc.nextLine();
            System.out.print("\nNhap gia ban: ");
            dongiaban=sc.nextInt();
            System.out.print("\nNhap so luong: ");
            soluong=sc.nextInt();
            }

        public void xuat(){
            /*System.out.print("\nMa sach: "+masach);
            System.out.print("\nTen sach: "+tensach);
            System.out.print("\nTac gia : "+matacgia);
            System.out.print("\nThe loai :"+theloai);
            System.out.print("\nDon gia ban: "+dongiaban);
            System.out.print("\nSo luong: "+soluong);*/
            System.out.print("\nMa asch: "+masach+
                              "\nTen sach: "+tensach+
                              "\nMa tac gia: "+matacgia+
                              "\nThe loai: "+theloai+
                              "\nDon gia ban: "+dongiaban+
                              "\nSo luong: "+soluong);
        }
}