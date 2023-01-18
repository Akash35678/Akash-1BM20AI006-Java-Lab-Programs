import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class filesLibrary {
    public static void main(String[] args) throws IOException {
        int i = 0;
        FileInputStream fin;
        FileOutputStream fout;
        try {
            fin = new FileInputStream("C:\\Users\\akash\\OneDrive\\Desktop\\cietest.txt");
            fout = new FileOutputStream("C:\\Users\\akash\\OneDrive\\Desktop\\cietest.txt");
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

            String data = "This is a new book which i want to add to library.";
            byte[] b = data.getBytes();
            fout.write(b);


            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }
    }
}