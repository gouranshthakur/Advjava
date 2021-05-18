import java.awt.*;


    class FDemo extends Frame
    {
        FDemo()
        {
            Font f=new Font("Arial Black",Font.ITALIC,60);
            setFont(f);
        }
        public void paint(Graphics g)
        {
            g.fillOval (100,100,300,300);

            Color c1=new Color(0, 0, 0);
            g.setColor(c1);

            g.fillOval (180,170,25,25);
            g.fillOval (290,170,25,25);


            Color c2=new Color(255, 0, 8);
            g.setColor(c2);

            g.fillArc(200,200,100,90,170,200);

            Color c3=new Color(0, 0, 128);
            g.setColor(c3);

            g.drawString("keep smiling",100,500);

        }
    }
    class Smily
    {
        public static void main (String args[])
        {
            FDemo f=new FDemo();
            f.setVisible(true);
            f.setSize(1000,700);
            f.setLocation(400,100);
            f.setForeground(Color.yellow);
            f.setBackground(Color.green);
        }
    }

