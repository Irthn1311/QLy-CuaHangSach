import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
    void ghiFile() throws IOException {
        DataOutputStream outStream = new DataOutputStream(new FileOutputStream("teo.txt", true));
        for (int i = 0; i < 10; i++) {
            outStream.writeUTF("Hello");
            outStream.writeInt((int) (20 + Math.random() * 25));
            outStream.writeDouble(Math.random() * 500);
        }
        outStream.close();
    }
    
    void docFile() {
        FileInputStream f;
        try {
            f = new FileInputStream("teo.txt");
            DataInputStream inStream = new DataInputStream(f);
            try {
                while (true) {
                    String name = inStream.readUTF();
                    int age = inStream.readInt();
                    double salary = inStream.readDouble();
                    System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
                }
            } catch (EOFException e) {
            } finally {
                inStream.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        BinaryFile binaryFile = new BinaryFile();
        try {
            binaryFile.ghiFile();
            binaryFile.docFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}