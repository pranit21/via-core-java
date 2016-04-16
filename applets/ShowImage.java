import java.applet.*;
import java.awt.*;
/*
<applet code="ShowImage" width = 700 height = 400>
</applet>
*/
public class ShowImage extends Applet
{
    Image picture;
    AudioClip clip;

    public void init()
    {
        picture = getImage(getCodeBase(), "java-logo.jpg");
        clip  = getAudioClip(getDocumentBase(), "bird_caw.wav");
    }

    public String getAppletInfo()
    {
        return "Hi...";
    }

    public void start() { 
        clip.play();
        showStatus(getAppletInfo());
    }

    public void paint(Graphics g)
    {
        g.drawImage(picture, 10, 10, this);
    }
}