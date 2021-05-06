package ad222uk_assign1;

import java.io.File;

import java.io.IOException;

public class PrintJavaMain  {

public static void main(String[] args) throws IOException{
	 File F = new File("D:\\JAVA\\assign");
     if (F.exists())
         System.out.println("Start: " + F);
     else
         System.out.println("No such directory: " + F);
     Sub(F);
 }


 private static void Sub(File file) {
     if (file.isDirectory()) {
         File[] arr = file.listFiles();
         for (File f : arr) {
        	 Sub(f);
         }
     } else {
         if (file.getName().endsWith(".Java")) { 
        	 print(file);
         }
     }
 }

 private static void print(File f) {
     System.out.println("File name is"+f.getName() + " the size is " + f.length());
 }

}
