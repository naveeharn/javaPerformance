package javaTutorialBeginner.project45_fileClass;

import java.io.File;

public class project45_fileClass {
    public static void main(String[] args) {
        /**
         * file
         * 
         * an abstract representation of file and directory pathnames
         */
        
        File file = new File("/Users/naveeharntehmarn/Desktop/Freshy/semester_2/java/javaTutorialBeginner/project45_fileClass/secretMessage.txt");

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            // file.delete();
        } else {
            System.out.println("That file does not exist");  
        }
        
    }
}
