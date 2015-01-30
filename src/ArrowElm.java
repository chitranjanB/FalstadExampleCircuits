
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.StringTokenizer;

class ArrowElm extends GraphicElm {

    int size;
    int colorR, colorG, colorB;

    public ArrowElm(int xx, int yy) {
        super(xx, yy);
        size = 10;
        colorR = colorG = colorB = 128;
    }

    public ArrowElm(int xa, int ya, int xb, int yb, int f,
            StringTokenizer st) {
        super(xa, ya, xb, yb, f);
        setBbox(xa, ya, xb, yb);
        colorR = colorG = colorB = 128;
        size = new Integer(st.nextToken());
        /*
         text = st.nextToken();
         while (st.hasMoreTokens()) {
         text += ' ' + st.nextToken();
         }
         */
    }

    void drawArrow(Graphics g1, int x1, int y1, int x2, int y2) {
        Graphics2D g = (Graphics2D) g1.create();

        double dx = x2 - x1, dy = y2 - y1;
        double angle = Math.atan2(dy, dx);
        int len = (int) Math.sqrt(dx * dx + dy * dy);
        AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
        at.concatenate(AffineTransform.getRotateInstance(angle));
        g.transform(at);

        // Draw horizontal arrow starting in (0, 0)
        g.setStroke(new BasicStroke(size/2));
        g.drawLine(0, 0, len-size, 0);
        g.fillPolygon(new int[]{len, len - size, len - size, len},
                new int[]{0, -size, size, 0}, 4);
    }

    String dump() {
        return super.dump() + " " + size /*+ " " + text*/;
    }

    int getDumpType() {
        return 129;
    }
/*
    void drag(int xx, int yy) {
        x = xx;
        y = yy;
        x2 = xx + 16;
        y2 = yy;
    }*/

    void draw(Graphics g) {
        setBbox(x-size, y-size, x2+size, y2+size);
        Color colour = new Color(colorR, colorG, colorB);
        g.setColor(needsHighlight() ? selectColor : colour);
        drawArrow(g, x, y, x2, y2);
    }

    public EditInfo getEditInfo(int n) {
        if (n == 0) {
            return new EditInfo("Size", size, 1, 100);
        }
        if (n == 1) {
            return new EditInfo("Red (1-255)", colorR, 1, 255);
        }
        if (n == 2) {
            return new EditInfo("Green (1-255)", colorG, 1, 255);
        }
        if (n == 3) {
            return new EditInfo("Blue (1-255)", colorB, 1, 255);
        }
        return null;
    }

    public void setEditValue(int n, EditInfo ei) {
        if (n == 0) {
            size = (int) ei.value;
        }
        if (n == 1) {
            colorR = (int) ei.value;
        }
        if (n == 2) {
            colorG = (int) ei.value;
        }
        if (n == 3) {
            colorB = (int) ei.value;
        }
    }

    void getInfo(String arr[]) {
        // arr[0] = ?
    }

    @Override
    int getShortcut() {
        return 'a';
    }
}
