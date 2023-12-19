package learnThread.resizeImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static int newWidth = 300;
    public static void main(String[] args) throws IOException {
        String srcFolder = "OtherCourses.JDK/src/main/resources/resizeImage/src";
        String dstFolder = "OtherCourses.JDK/src/main/resources/resizeImage/dst";

        File srcDir = new File(srcFolder);

        System.out.println(srcDir.isFile());
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        int middle = files.length/2;

        File[] files1 = new File[middle];
        System.arraycopy(files, 0, files1, 0, files1.length);
        ImageResizer resizer1 = new ImageResizer(files1, newWidth,dstFolder, start);

        File[] files2 = new File[files.length-middle];
        System.arraycopy(files, middle, files2, 0, files2.length);
        ImageResizer resizer2 = new ImageResizer(files2, newWidth,dstFolder, start);

        resizer1.start();
        resizer2.start();


    }
}
