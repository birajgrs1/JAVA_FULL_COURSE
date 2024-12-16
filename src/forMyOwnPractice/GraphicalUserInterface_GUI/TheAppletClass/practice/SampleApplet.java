/*
package forMyOwnPractice.TheAppletClass.practice;

import java.applet.Applet;
import java.awt.Graphics;

public class SampleApplet extends Applet {

    StringBuffer buffer;

    public void init() {
        buffer = new StringBuffer();
        addItem("initializing");
    }

    public void start(){
        addItem("Starting...");
    }

    public void stop(){
        addItem("Stopping...");
    }
    public void destroy(){
        addItem("preparing for unloading...");
    }
    private void addItem(String newWord){
        System.out.println(newWord);
        buffer.append(newWord);
        repaint();
    }

    public void paint(Graphics g){
        g.drawRect(0,0,150,100);
        g.drawString(buffer.toString(),10,50);
    }
}

 */
