package learnThread.resizeImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizer extends Thread{
    private File[] files;
    private int newWidth;
    private String dstFolder;
    private long start;
    public ImageResizer(File[] files, int newWidth, String dstFolder, long start) {
        this.files = files;
        this.newWidth = newWidth;
        this.dstFolder = dstFolder;
        this.start = start;
    }

    @Override
    public void run() {
        try {
            if (files != null) {
                for (File file : files) {
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
        System.out.println("Finished after start: " + (System.currentTimeMillis()-start));
    }

}
