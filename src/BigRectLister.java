import java.util.ArrayList;
import java.awt.*;
import java.awt.geom.Rectangle2D;
public class BigRectLister {
    static ArrayList<Rectangle> rect = new ArrayList<>();
    static BigRectangleFilter lister = new BigRectangleFilter();

    public static void main(String[] args) {
        rect.add(new Rectangle(4, 4));
        rect.add(new Rectangle(4, 5));
        rect.add(new Rectangle(2, 4));
        rect.add(new Rectangle(3, 4));
        rect.add(new Rectangle(5, 2));
        rect.add(new Rectangle(1, 4));
        rect.add(new Rectangle(6, 2));
        rect.add(new Rectangle(5, 1));
        rect.add(new Rectangle(7, 1));
        rect.add(new Rectangle(1, 8));

        for(Rectangle r: rect)
        {
            if(lister.accept(r))
            {
                System.out.println(r);
            }
        }
    }


}


