package utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class JunitTest {

    private Method method;

    @BeforeEach
    public void setup() {
        try {
            // Try to find method with String parameter
            try {
                method = WebDriverHelper.class.getDeclaredMethod("getElementsByXPath", String.class);
            } catch (NoSuchMethodException e) {
                // If not found, try to find the method without parameters
                method = WebDriverHelper.class.getDeclaredMethod("getElementsByXPath");
            }
            assertNotNull(method, "Method 'getElementsByXPath' should exist in WebDriverHelper class");

        } catch (NoSuchMethodException | SecurityException e) {
            fail("Method 'getElementsByXPath' not found in WebDriverHelper class: " + e.getMessage());
        }
    }
       public void logger(String logtxt) {
        if(logtxt != null) {
            try {
                File file = new File("/home/coder/project/log.log");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.write(logtxt);             
                writer.write("\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testgetElementsByXPathFunctionality() {
        assertNotNull(method, "Method 'getElementsByXPath' should exist in WebDriverHelper class");
        logger("Verified_NotNull");
    }

    @Test
    public void testgetElementsByXPath_returnType() {
        assertEquals(List.class, method.getReturnType(), "Return type should be List.");
         logger("Verified_ReturnType");
    }

    @Test
    public void testgetElementsByXPath_Parameter() {
        // Get method parameters
        Class<?>[] parameterTypes = method.getParameterTypes();
        assertEquals(1, parameterTypes.length, "Method should have exactly one parameter.");
        assertEquals(String.class, parameterTypes[0], "Method parameter should be of type String.");
            logger("Verified_ParameterType");
    }
}
