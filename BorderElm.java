
import java.awt.*;
import java.util.StringTokenizer;

class BorderElm extends GraphicElm {

    public BorderElm(int xx, int yy) {
        super(xx, yy);
        x2 = xx;
        y2 = yy;
        setBbox(x, y, x2, y2);
    }

    public BorderElm(int xa, int ya, int xb, int yb, int f,
            StringTokenizer st) {
        super(xa, ya, xb, yb, f);
        x2 = xb;
        y2 = yb;
        /*	if ( st.hasMoreTokens() )
         x = new Integer(st.nextToken()).intValue();
         if ( st.hasMoreTokens() )
         y = new Integer(st.nextToken()).intValue();
         if ( st.hasMoreTokens() )
         x2 = new Integer(st.nextToken()).intValue();
         if ( st.hasMoreTokens() )
         y2 = new Integer(st.nextToken()).intValue();*/
        setBbox(x, y, x2, y2);
    }

    String dump() {
        return super.dump();
    }

    int getDumpType() {
        return 130;
    }

    void drag(int xx, int yy) {
        x = xx;
        y = yy;
    }

    void draw(Graphics g) {
        //g.setColor(needsHighlight() ? selectColor : lightGrayColor);
        g.setColor(needsHighlight() ? selectColor : Color.GRAY);
        setBbox(x, y, x2, y2);
        drawThickLine(g, x , y , x2, y );
        drawThickLine(g, x , y , x , y2);
        drawThickLine(g, x2, y , x2, y2);
        drawThickLine(g, x , y2, x2, y2);
    }

    public EditInfo getEditInfo(int n) {
        return null;
    }

    public void setEditValue(int n, EditInfo ei) {
    }

    void getInfo(String arr[]) {
    }

    @Override
    int getShortcut() {
        return 0;
    }
}
