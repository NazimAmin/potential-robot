
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journey;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class readCSV {
       public static String[] citiesname = new String[180];
       public static String[] color = new String[180];
       public static int[]quad = new int[180];
       public static double[] x = new double[180];
       public static double[] y = new double[180];
            
     public void readToArrayList(){
        String csvFile = "cities.txt";
	BufferedReader br = null;
	String line = "";
	try {
           int i = 0;
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {
                        
			String[] country = line.split(",");
                           citiesname[i] = country[0];
                           color[i] = country[1];
                           quad[i] = Integer.parseInt(country[2]);
                           x[i] = Double.parseDouble(country[3])* 0.232835821;
                           y[i] = Double.parseDouble(country[4])* 0.224601012;
                           i++;        
                       
       // col*=(double)(468/2010);
       // row*=(double)(577/2569);
		}
             for(int k = 0; k< 180; k++){
                 System.out.println("x: "+x[k]);
                 System.out.println("y: "+y[k]);
                 
             } 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    }
}