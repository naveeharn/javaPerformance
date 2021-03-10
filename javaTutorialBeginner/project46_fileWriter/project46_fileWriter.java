package javaTutorialBeginner.project46_fileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// import jdk.vm.ci.code.BailoutException;

public class project46_fileWriter {
    public static void main(String[] args) {
        // try{
        //     FileWriter writer = new FileWriter("/Users/naveeharntehmarn/Desktop/Freshy/semester_2/java/javaTutorialBeginner/project46_fileWriter/poem.txt");
        //     writer.write("Kuay I na Hee 2 3");
        //     writer.close();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        try (FileWriter writer = new FileWriter("javaTutorialBeginner/project46_fileWriter/poem.txt")) {
            writer.write("new message \n\n fuck you \n\n I na Hee");
            writer.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
