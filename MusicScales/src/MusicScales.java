import java.util.Scanner;
public class MusicScales {
    Scanner sc = new Scanner(System.in);
    int major = 1;
    int minor = 2;
    void selectMajorMinor(){
        switch(major){
            case 1:
                System.out.println("C, D, E, F, G, A, B");
            case 2:
                System.out.println("D, E, F#, G, A, B, C#");
            case 3:
                System.out.println("E, F#, G#, A, B, C#, D#");
            case 4:
                System.out.println("F, G, A, Bb, C, D, E");
            case 5:
                System.out.println("G, A, B, C, D, E, F#");
            case 6:
                System.out.println("A, B, C#, D, E, F#, G#, A");
            case 7:
                System.out.println("B, C#, D#, E, F#, G#, A#, B");
        }
        switch(minor){
            case 1:
                System.out.println("");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
        }
    }
    void run(){
        selectMajorMinor();
    }
    public static void main(String[] args) {
        new MusicScales().run();

    }
}