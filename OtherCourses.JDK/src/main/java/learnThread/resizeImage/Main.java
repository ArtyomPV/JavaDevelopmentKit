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

        try {
            if (files != null) {
                for (File file : files) {
                    System.out.println(file);
                    BufferedImage image = ImageIO.read(file);
                    if(image == null){
                        continue;
                    }

                    int newHeght = (int)Math.round(
                            image.getHeight()/(image.getWidth()/(double) newWidth)
                    );
                    BufferedImage newImage = new BufferedImage(
                            newWidth, newHeght, BufferedImage.TYPE_INT_RGB
                    );
                    int widthStep = image.getWidth()/newWidth;
                    int heightStep = image.getHeight()/newHeght;

                    for (int x = 0; x < newWidth; x++) {
                        for (int y = 0; y < newHeght; y++) {
                            int rgb = image.getRGB(x * widthStep, y * heightStep);
                            newImage.setRGB(x, y, rgb);
                        }
                    }

                    File newFile = new File(dstFolder + "/" + file.getName());
                    ImageIO.write(newImage, "jpg", newFile);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }
}
