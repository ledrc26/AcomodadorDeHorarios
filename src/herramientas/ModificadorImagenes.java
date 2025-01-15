/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ledrc
 */
public class ModificadorImagenes
{
    
    public static ImageIcon convertirBytesAImageIcon(byte[] imageBytes)
    {
        ImageIcon icon = null;
        try
        {
            InputStream in = new ByteArrayInputStream(imageBytes);
            BufferedImage bufferedImage = ImageIO.read(in);  // Leer los bytes como una imagen
            icon = new ImageIcon(bufferedImage);  // Convertir BufferedImage a ImageIcon
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return icon;
    }

    public static  byte[] convertirImageIconABytes(ImageIcon icon) throws IOException
    {
        BufferedImage bufferedImage = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);

        icon.paintIcon(null, bufferedImage.getGraphics(), 0, 0);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "jpg", baos);

        return baos.toByteArray();
    }

    public static ImageIcon redimencionarImagenes(ImageIcon image, int width, int height)
    {
        BufferedImage bufferedImage = new BufferedImage(image.getIconWidth(), image.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(image.getImage(), 0, 0, null);
        g2d.dispose();
        BufferedImage resizedImage = resizeImage(bufferedImage, width, height);
        return new ImageIcon(resizedImage);
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int width, int height)
    {
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage bufferedResizedImage = new BufferedImage(width, height, originalImage.getType());

        Graphics2D g2d = bufferedResizedImage.createGraphics();
        g2d.drawImage(resizedImage, 0, 0, null);
        g2d.dispose();

        return bufferedResizedImage;
    }
    
    public static ImageIcon convertir_a_ImageIcon(Icon icon) {
        if (icon instanceof ImageIcon) {
            return (ImageIcon) icon;
        } else {
            BufferedImage bufferedImage = new BufferedImage(
                    icon.getIconWidth(),
                    icon.getIconHeight(),
                    BufferedImage.TYPE_INT_ARGB
            );
            Graphics g = bufferedImage.getGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return new ImageIcon(bufferedImage);
        }
    }
}
