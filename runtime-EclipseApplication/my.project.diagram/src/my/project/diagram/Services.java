package my.project.diagram;

import domain.Kingdom;
import domain.Species;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.eclipse.emf.ecore.EObject;
/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public Graphics getPokemonIcon(Species pokemon) throws IOException {
		String iconURL = pokemon.getIcon();
		URL url = new URL(iconURL);
		Image img = ImageIO.read(url);
		return img.getGraphics();
	}
    
    public Graphics getAnIcon(Kingdom kingdom) throws IOException {
 		String iconURL = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png";
 		URL url = new URL(iconURL);
		Image img = ImageIO.read(url);
		return img.getGraphics();
 	}
    
    public String getAnIcon2(Kingdom kingdom) {
 		String data = kingdom.getName();
		String fileSeparator = System.getProperty("file.separator");
		Path p = Paths.get("/my.project.diagram/img/branch.png");
		
		
		return "/my.project.diagram/img/branch.png";
 	}
    
    public String getPokemonIcon1(Species pokemon) throws IOException {
		String iconURL = pokemon.getIcon();
		String destinationFile = "image" + iconURL.charAt(-4) + ".png";
		System.out.println(destinationFile);
		URL url = new URL(iconURL);
		BufferedImage c = ImageIO.read(url);
		ImageIcon image = new ImageIcon(c);
		OutputStream os = new FileOutputStream(destinationFile);
	    InputStream is = url.openStream();

	    byte[] b = new byte[2048];
	    int length;

	    while ((length = is.read(b)) != -1) {
	        os.write(b, 0, length);
	    }

	    is.close();
	    os.close();
		return destinationFile;
	}
}
