import java.io.*;
import java.util.*;

class ArchSecuencial{
   public static void main(String args[]){
      String amigo;
      String tel;
      try{
         File f=new File("c:\\Users\\Oscar\\Documents\\Universidad\\3 Tercer Semestre\\Programación Intermedia\\Amigos.txt");
         FileOutputStream f2=new FileOutputStream(f,true);
         PrintStream f3=new PrintStream(f2);
         Scanner s=new Scanner(System.in);
         for(int i=1; i<=5; i++){
            System.out.println("Ingrese nombre del amigo: "+i);
            amigo=s.nextLine();
            System.out.println("Ingrese telefono del amigo: "+i);
            tel=s.nextLine();
            f3.println(amigo);
            f3.println(tel);
         }
         f3.close();
      }
      catch(IOException e){
         System.out.println("Error en archivo");
      }
   }   
}
