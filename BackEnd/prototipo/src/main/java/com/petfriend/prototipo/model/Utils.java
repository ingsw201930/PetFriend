package com.petfriend.prototipo.model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;


public class Utils {

    public static byte[] ImageToByte(File file) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);      
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
        }
        byte[] bytes = bos.toByteArray();
     
     return bytes; 
    }
    
    public static void byteToImage(byte [] bytes,File imageFile) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
 
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream, it seems file is OK
 
        ImageInputStream iis = ImageIO.createImageInputStream(source);

        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
 
        Image image = reader.read(0, param);
        //got an image file
 
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
      
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);
 
        ImageIO.write(bufferedImage, "jpeg", imageFile);
        //"jpeg" is the format of the image
        //imageFile is the file to be written to.
 
        System.out.println(imageFile.getPath());
    }
}
