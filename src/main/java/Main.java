import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File imageFile = new File("test1.png");
        Tesseract t = Tesseract.getInstance();

        String output = t.doOCR(imageFile);
        System.out.println(output);
    }
}
