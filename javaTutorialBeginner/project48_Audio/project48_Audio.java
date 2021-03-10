package javaTutorialBeginner.project48_Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.Clip;
// import javax.sound.sampled.LineUnavailableException;
// import javax.sound.sampled.UnsupportedAudioFileException;

import javax.sound.sampled.*;


public class project48_Audio {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("javaTutorialBeginner/project48_Audio/videoplayback (1).wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        clip.setMicrosecondPosition(20000000);
        Scanner scanner = new Scanner(System.in);
        String response = "";
        
 
        while (!response.equals("Q")) {
            System.out.println("press P to play, press S to stop, press R to reset, press Q to Quit");
            System.out.print("Enter your F*CKING choice : ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break; 
                case "R":
                    clip.setMicrosecondPosition(20000000);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:    
                    System.out.println("Not a valid response");
                    break;
            }
        }
        System.out.println("Thank you ");
    }
}
