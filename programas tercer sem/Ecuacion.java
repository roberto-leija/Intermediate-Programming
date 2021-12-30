//Imports
import java.io.*;
import java.util.*;
import java.text.*;

class Ecuacion{
   private double x;
   
   public Ecuacion(double x){
   setX(x);
   }
   
   public void setX(double x){
   this.x=x;
   }
   
   public double getX(){
   return x;
   }
   
   public double conseguirY(){
   double y;
   y=3*Math.pow(x,2)+7*x;
   return y;
   }
   
   public String toString(){
   try{
      File f=new File("C:\\Users\\robby\\OneDrive\\Escritorio\\SEMESTRE 3\\Programación Intermedia\\Final\\Resultado.txt");
      FileOutputStream f2=new FileOutputStream(f, true);
      PrintStream f3=new PrintStream(f2);
      f3.println("y es igual a : "+conseguirY());
      f3.close();
   }
   catch(IOException e){
      System.out.println("Error en archivo");
   }
   return "y es igual a: "+conseguirY();
   }
}

class Main{
   public static void main(String args[]){
   Scanner s=new Scanner(System.in); 
   int opcion;
   Ecuacion e1=new Ecuacion(pedirX());
   System.out.println(e1);
   do{
      System.out.println("Que desea hacer: "+"\n[1] Nueva operacion matematica"+"\n[2] Ver Resultados"+"\n[3] Salir");
      opcion=s.nextInt();
      switch(opcion){
      case 1:
         e1.setX(pedirX()); 
         System.out.println(e1); break;
      case 2:
         String i;
         try{
         File f=new File("C:\\Users\\robby\\OneDrive\\Escritorio\\SEMESTRE 3\\Programación Intermedia\\Final\\Resultado.txt"); //Definir el archivo con ruta
         FileInputStream f2=new FileInputStream(f);//Abrir el archivo
         InputStreamReader f3=new InputStreamReader(f2);//Clase para la lectura de datos
         BufferedReader f4=new BufferedReader(f3);//Clase para la lectura de datos
         long ff = f.length();
         for(int j=1; j<=ff; j++){
            i=f4.readLine();//Metodo para leer datos dentro del archivo
            if(i!=null)
               System.out.println(i);
         }
         f4.close();//Cerrar el archivo
      }
         catch(IOException e){
         System.out.println("Error en archivo");
         }
      break;
      case 3:
         System.out.println("Gracias por usar el programa :)"); break;
      }
   }while(opcion!=3);
   }
   
   public static double pedirX(){
   boolean error=true;
   System.out.println("Ingrese el valor de x: ");
   double x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextDouble();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("vuelva a ingresar el valor de x, valor numerico.");
         error=true;
      }   
   }while(error);
   return x;
   }
}