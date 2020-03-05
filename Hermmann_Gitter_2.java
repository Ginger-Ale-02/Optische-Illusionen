
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermmann_Gitter_2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermmann_Gitter_2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(490,490);
    }        
    int s = 40;
    int a = 10;

    public void quadrate(){
        for (int k = 0; k < 10; k++){
            for (int i = 0; i < 10; i++){
                square(i*s + i*a, k*s + k*a, s);
            }
        }
    }
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {   
        background(100);
        quadrate();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermmann_Gitter_2.class.getName() });
    }

}
