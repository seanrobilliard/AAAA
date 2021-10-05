import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Main {



    @Test

    public static void main(String[] args) {

        String[] array = {"Maths", "Software Engineeering", "Physics"};
        List<String> list = Arrays.asList(array);
        student student1 = new student("Sean" ,20, "29/01/2000" ,1111111);
        String name = student1.getUsername();
        assertEquals("Sean20" , name);



    }




}
