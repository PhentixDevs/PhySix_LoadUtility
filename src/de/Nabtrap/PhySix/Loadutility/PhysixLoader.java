package de.Nabtrap.PhySix.Loadutility;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PhysixLoader {
/*
 * This is just an Utility, this API doesn't use PhySIX.
 * You can load Images / Sounds with this API.
 * 
 */
	
	public static Image LoadImage(String imgUrl){
		try {
			Image toReturn = ImageIO.read(new File(imgUrl));
			return toReturn;
		} catch (IOException e) {
			System.out.println("Idiot, this file isn't existing!");
			return null;
		}
		
	}
	public static File getFile(String url){
		return new File(url);
	}
}
