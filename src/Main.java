import java.awt.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        ShortWordFilter filter = new ShortWordFilter();
        BigRectangleFilter lister = new BigRectangleFilter();

        ArrayList<String> line = new ArrayList<>();
        line.add(new String("Word"));
        line.add(new String("Fox"));
        line.add(new String("Man"));
        line.add(new String("Germ"));
        line.add(new String("Bike"));
        line.add(new String("Jam"));
        line.add(new String("Tan"));
        line.add(new String("Cat"));
        line.add(new String("Tape"));

        ArrayList <Rectangle> rect = new ArrayList<>();
        rect.add(new Rectangle(5,3));
        rect.add(new Rectangle(5,4));
        rect.add(new Rectangle(6,2));
        rect.add(new Rectangle(8,1));
        rect.add(new Rectangle(4,4));


        String[] fields;
        for(String l: line)
        {
            fields = l.split(" ");
            for(String w: fields)
            {
                if(filter.accept(w))
                {
                    System.out.println(w.trim());
                }
            }
        }

        System.out.println();
        for(Rectangle r: rect)
        {
            if(lister.accept(r)){
                System.out.println(r);
            }
        }


    }


}