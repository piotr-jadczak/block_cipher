package block.helper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FileLoader {

    private static final String ROOT = "./files/";


    public BufferedImage readImage(String fileName) throws IOException {
        try {
            return ImageIO.read(new File(ROOT + fileName));
        }
        catch (IOException e) {
            throw new IOException("cannot read image file");
        }
    }
}
