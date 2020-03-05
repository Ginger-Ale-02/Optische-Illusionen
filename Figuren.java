
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: 
 *
 * @author Simon Gebert 
 * @version 1.0 vom 05.02.2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(210, 415); // Festlegen der Fenstergröße
    }        

    void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        // ***** hier kommen deine Anweisungen hin ************
        rect(5, 5, 200, 200);
        ellipse(105, 105, 150, 150);
        ellipse(105, 105, 100, 100);
        ellipse(105, 105,  50,  50);
        
        
        
        ellipse(105, 310, 200, 200);
        rect(40, 250, 130, 120);
        rect(55, 265, 100, 90);
        rect(70, 280, 70, 60);
        // ***** Ende der eigenen Anweisungen **********
        
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        ellipse(105, 105, 100, 100);
        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
       //zeichneBildC(); // Aufruf deiner Methode
       zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
