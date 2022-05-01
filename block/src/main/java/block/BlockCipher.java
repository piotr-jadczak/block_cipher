package block;

import block.helper.FileLoader;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class BlockCipher {

    public static void cbcEncryption(String imageName) {
        FileLoader fileLoader = new FileLoader();
        try {
            BufferedImage originalImage = fileLoader.readImage(imageName);
            System.out.println(originalImage.getWidth());
            System.out.println(originalImage.getHeight());
        }
        catch (IOException e) {
            System.out.println("Error encountered: " + e.getMessage());
        }
    }

    public static void ecbEncryption(String imageName) {
        System.out.println("Ebc encryption");
        //throw new UnsupportedOperationException("Not implemented yet!");
    }
}
