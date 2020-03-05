
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: 
 *
 * @author Simon Gebert 
 * @version 1.0 vom 05.02.2020
 */
public class FigurC_mitSchleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(150,300); // Festlegen der Fenstergröße
    }        

    void zeichneBildC() {
        // ***** hier kommen deine Anweisungen hin ************
        square (0, 0, 150);
        circle (75, 225, 150);
        for ( int i=0; i < 3; i++){
            circle(75, 75, 150 - 50 * i );
            square(75 -50 + 10 * i,225 -50 + 10 * i, 100 - 20 * i );
        }
        
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
        zeichneBildC(); // Aufruf deiner Methode
    }


    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
