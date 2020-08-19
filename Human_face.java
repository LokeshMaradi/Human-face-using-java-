import java.awt.*;
import java.applet.*;
public class Human extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(140, 40, 120, 150);//border of face
        g.fillArc(135, 490, 55, 40, 180, 180);//shoe
        g.fillArc(208, 490, 55, 40, 180, 180);//rshoe
        g.fillOval(168, 81, 10, 10);//l pupil
        g.fillOval(221, 81, 10, 10);//r pupil
        g.fillArc(160, 125, 80, 40, 180, 180);//mouth
        g.setColor(Color.red);
        g.fillRect(135, 190, 130, 190);//body
        g.setColor(Color.blue);
        g.fillRect(137, 380, 50, 130);//left leg
        g.fillRect(210, 380, 50, 130);//right leg
        g.setColor(Color.blue);
        g.fillRect(40, 190, 100, 35);//lhand
        g.fillRect(260, 190, 100, 35);//rhand
        g.drawOval(157, 75, 30, 20);//left eye
        g.drawOval(210, 75, 30, 20);//right eye
        g.drawOval(185, 100, 30, 30);//nose
        g.drawOval(125, 92, 15, 30);//l ear
        g.drawOval(260, 92, 15, 30);//r ear
        
    }

}
/*<applet code="Human" width="900" height="900"></applet>*/
