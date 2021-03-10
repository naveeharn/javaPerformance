package javaTutorialBeginner.project47_fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class project47_fileReader {
    /**
     * FileReader
     * 
     * read the contents of a file as a stream of characters. One by One
     * read() returns an int value which cotains the byte value 
     * when read() return -1, there is no more data to be read
     * 
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println();

        try (FileReader reader = new FileReader("javaTutorialBeginner/project47_fileReader/art.txt")) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
