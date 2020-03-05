
    

import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse zeichneQuadrate.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class zeichneQuadrate extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,50);
    }        

    void zeichneQuadrate(int lange, int wdh){
        for ( int i = 0; i < wdh; i++ ){
            square(0, 0, lange);
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
        zeichneQuadrate(50, 10);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {zeichneQuadrate.class.getName() });
    }

}
