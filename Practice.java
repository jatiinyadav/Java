import java.awt.*;

public class Practice{
    public static void main(String[] args) {

        Frame fr = new Frame();
        fr.setTitle("Hello World");
        fr.setSize(400, 300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);

        Checkbox l1 = new Checkbox("OK");
        Checkbox l2 = new Checkbox("CANCEL");

        fr.add(l1);
        fr.add(l2);
    }

}