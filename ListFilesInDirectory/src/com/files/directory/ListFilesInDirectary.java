/**
 * 
 */
package com.files.directory;

import java.io.File;


/**
 * @author I335499
 *
 */
public class ListFilesInDirectary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String directory = "C:\\Users\\I335499\\Desktop\\Downloads\\Hello\\";
		
		File f1 = new File(directory);
		f1.mkdir();
		
		if (f1!=null)
		System.out.println("Directory"+ f1 + "Created");
		else
			System.out.println("Directory"+f1);
		
		
		
		/*File f = null;
		
		String paths [];
		
		f = new File ("C:\\Users\\I335499\\Desktop\\Bits and Pieces");
		
		paths= f.list();
		
		for (String filesInDir : paths) {
			
			System.out.println(filesInDir);
		}*/

	}
	
	
	

	
	
	
	

}
