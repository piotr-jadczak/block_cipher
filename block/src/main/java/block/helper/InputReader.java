package block.helper;

import block.BlockCipher;

import java.io.File;

public class InputReader {

    private static final int ARG_NUMBER = 1;
    private static final String ROOT = "./files/";

    public static void read(String[] args) {
        try {
            if(isArgsNumberInCorrect(args)) {
                throw new IllegalArgumentException("You need to add to command line image name to encrypt.");
            }
            if(!fileExists(args[0])) {
                throw new IllegalArgumentException("Image does not exist. You need to place image in files folder.");
            }
            if(!isBmpFile(args[0])) {
                throw new IllegalArgumentException("Invalid image file. Only bmp files can be encoded.");
            }
            BlockCipher.cbcEncryption(args[0]);
            BlockCipher.ecbEncryption(args[0]);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error encountered: " + e.getMessage());
        }
    }

    private static boolean isArgsNumberInCorrect(String[] args) {
        return args.length != ARG_NUMBER;
    }
    private static boolean fileExists(String fileName) {
        return new File(ROOT + fileName).exists();
    }
    private static boolean isBmpFile(String fileName) {
        int commaIndex = fileName.lastIndexOf('.');
        if(commaIndex > 0) {
            String extension = fileName.substring(commaIndex+1);
            return extension.equals("bmp");
        }
        return false;
    }
}
