package de.Nabtrap.PhySix.Loadutility;

import java.awt.Image;
import java.util.HashMap;

public class ImageList {
public static HashMap<String, Image> imgs = new HashMap<String, Image>();
public static void registerImage(String name, Image img){
	imgs.put(name, img);
}
public static Image getImage(String name){
	return imgs.get(name);
}
public static void unregisterImage(String name){
	imgs.remove(name);
}
}
