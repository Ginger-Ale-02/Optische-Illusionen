
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse OptischeIllusionObjectoriented.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class OptischeIllusionObjectoriented extends PApplet
{   
    int s=60; //Seitenlänge der Quadrate

    @Override
    public void settings()
    {
        size(500,280);
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
                zeichneQuadrat(i * s,k * s, farbe, rechts);
            }
            farbe =255-farbe;
        }
    }

    public void linien(){
        line(0, 60, 500, 60);
        line(0, 120, 500, 120);
        line(0, 180, 500, 180);
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
        zeichneQuadrat(0, 0, 0, true);
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
        PApplet.main(new String[] {OptischeIllusionObjectoriented.class.getName() });
    }

}
