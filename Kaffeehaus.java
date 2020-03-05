
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        
    int s=40;//seitenlänge
    int[]abstand = {10, 20, 30, 20,10, 20, 30, 20,10, 20};//verschiebungsvariable
    public void parallelen(){
        for (int i = 0; i < 10; i++){
            line(0, s * i, 640, s * i);
        }
    } //Erstellt 10 parallele Linien
    public void zeichneAlleQuadrate(){
        for (int k = 0; k < 10; k++){
            for (int a = 0; a < 8; a++){
                square(abstand[k] + 80 * a, k * 40 ,s);
            }
        }
    }//zeichnet quadrate

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);//weiß
        stroke(153);//grau
        parallelen();
        fill(0);//schwarz
        zeichneAlleQuadrate();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
