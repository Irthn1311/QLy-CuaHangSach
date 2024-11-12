import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TestSach {
    static void docfileSach(){
        try{
            File filesach=new File("quanlysach.txt");
            Scanner reader=new Scanner(filesach);
            while (reader.hasNextLine()) {
                String data=reader.nextLine();
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("\nError");
            e.printStackTrace();
        }
        
    }
    static void timkiem(){

    }
    public static void main(String[] args) {
        docfileSach();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhap so luong sach:");
        int n=sc.nextInt();
        sc.nextLine();
        Sach[] sach=new Sach[n];
        int lc;
        while(true){
            System.out.print("\n------Menu--------");
            System.out.print("\n1.Nhap thong tin sach");
            System.out.print("\n2.Xem danh sach cua sach");
            System.out.print("\n3.Tim kiem");
            System.out.print("\n");
            System.out.print("\n4.Thoat!");
            System.out.print("\nNhap su lua chon: ");
            lc=sc.nextInt();
            switch (lc) {
                case 1:for(int i=0;i<n;i++){
                       System.out.print("\nNhap thong tin sach thu: "+(i+1));
                       System.out.print("\nChon the loai sach:");
                       System.out.print("\n1.Sach chuyen nganh");
                       System.out.print("\n2.Sach kham khao");
                       System.out.print("\nNhap su lua chon: ");
                       int choice=sc.nextInt();
                       sc.nextLine();
                       if(choice==1){
                          sach[i]=new Sachchuyennganh();
                          sach[i].nhap();
                        }
                        else if(choice==2){
                            sach[i]=new Sachkhamkhao();
                            sach[i].nhap();
                        }
                        else{
                            System.out.print("\nLua chon khong hop le!");
                        }
                    }
                    break;
                case 2:
                      for(int i=0;i<n;i++){
                         System.out.print("\nSach thu: "+(i+1));
                            sach[i].xuat();
                        }
                        break;
                case 3:break;
                case 4:System.out.print("\nThoat chuong trinh!");
                sc.close();
                return;
            }
        }
    }
}
