import java.util.ArrayList;
import java.util.Scanner;
public class BigRectLister {

    public static void main(String[] args)
    {
        ArrayList<Object> parallelogram = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        BigRectangleFilter bigPara = new BigRectangleFilter();

        Object paraInput;

        System.out.println("Enter the perimeter of 10 specific rectangles");

        for(int i = 0; i < 10; i++) {
            System.out.println("Numerical order of rectange " + (i + 1));
            paraInput = SafeInput.getInt(in, "Enter the perimeter of the rectangle");
            parallelogram.add(paraInput);
        }
        ArrayList<Object> passedPara;
        passedPara = collectAll(parallelogram, bigPara);

        System.out.println("\nPassed perimeters: ");
        for(Object passedParas : passedPara)
        {
            System.out.println(passedParas);
        }

    }

    private static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter filter)
    {
        ArrayList<Object> passed = new ArrayList<>();
        for (Object object : objects)
        {
            if(filter.accept(object))
            {
                passed.add(object);
            }

        }
        return passed;
    }
}

