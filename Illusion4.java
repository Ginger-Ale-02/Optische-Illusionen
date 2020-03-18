
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Illusion 4.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Illusion4 extends PApplet
{   
    int s=60; //Seitenlänge der Quadrate

    @Override
    public void settings()
    {
        size(500,260);
    }        

    public void zeichneQuadrat(int x, int y, int hintergrundFarbe, boolean rechts){

        fill(hintergrundFarbe);
        square(x, y, s);

        if(hintergrundFarbe == 0){
            fill(255);
        }
        else{
            fill(0);
        }
        if (rechts == true){
            circle(x + 45, y + 15, 10);
            circle(x + 45, y + 45, 10);
        }
        else{
            circle(x + 15, y + 15, 10);
            circle(x + 15, y + 45, 10);
        }
    }

    public void quadrate(){
        int farbe =  255;
        boolean rechts = false;//eigentlich links
        for(int k = 0; k < 4; k++){
            if(rechts == true){
                rechts = false;
            }
            else{
                rechts = true;
            }
            // rechts = !rechts;

            for(int i = 0; i < 8; i++){
                farbe = 255-farbe;
                zeichneQuadrat(i * s +10,k * s +10, farbe, rechts);
            }
            farbe =255-farbe;
        }
    }

    public void linien(){
        line(0, 70, 500, 70);
        line(0, 130, 500, 130);
        line(0, 190, 500, 190);
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255,165,0);
        zeichneQuadrat(10, 10, 0, true);
        quadrate();
        colorMode(RGB);
        stroke(0, 255, 0);
        linien();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Illusion4.class.getName() });
    }

}
