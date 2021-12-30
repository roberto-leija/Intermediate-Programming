//Imports
import java.io.*;
import java.util.*;
import java.text.*;

class Main{
   public static void main(String args[]){
   }
//comprobar que sea int
public static int pedirInt(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   int x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextInt();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }
//comprobar que sea double
public static double pedirDouble(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   double x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextDouble();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }

//comprobar que sea float
public static float pedirFloat(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   float x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextFloat();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }
   
//comprobar que sea float
public static byte pedirByte(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   byte x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextByte();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }
   
//comprobar que sea short
public static short pedirShort(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   short x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextByte();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }
   
//comprobar que sea long
public static long pedirLong(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   long x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextLong();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }
   
//comprobar que sea String
public static String pedirString(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   String x="";
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextLine();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }  
   
//comprobar que sea char
public static char pedirChar(){
   boolean error=true;
   System.out.println("MENSAJE PARA PEDIR DATO");
   char x=' ';
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.next().charAt(0);
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("MENSAJE PARA VOLVER A PEDIR DATO");
         error=true;
      }   
   }while(error);
   return x;
   }    

//Archivos ingreso de datos
try{
   File f=new File("C:\\RUTA"); //Definir el archivo con ruta
   FileOutputStream f2=new FileOutputStream(f,true);//Abrir el archivo
   PrintStream f3=new PrintStream(f2);//Clase para escribir dentro del archivo
   for(int i=1; i<=5; i++){
      System.out.println("Ingrese nombre del amigo: "+i);
      amigo=s.nextLine();
      System.out.println("Ingrese telefono del amigo: "+i);
      tel=s.nextLine();
      f3.println(amigo);//Metodo para escribir en el archivo
      f3.println(tel);//Metodo para escribir en el archivo
  }
  f3.close();//Cerrar el archivo
}
catch(IOException e){
   System.out.println("Error en archivo");
}

//Archivos lectura
try{
   File f=new File("C:\\RUTA"); //Definir el archivo con ruta
   FileInputStream f2=new FileInputStream(f);//Abrir el archivo
   InputStreamReader f3=new InputStreamReader(f2);//Clase para la lectura de datos
   BufferedReader f4=new BufferedReader(f3);//Clase para la lectura de datos
   for(int i=1; i<=5; i++){
      amigo=f4.readLine();//Metodo para leer datos dentro del archivo
      tel=f4.readLine();//Metodo para leer datos dentro del archivo
      System.out.println("Nombre de amigo: "+amigo+"\tTelefono: "+tel);
  }
f4.close();//Cerrar el archivo
}
catch(IOException e){
   System.out.println("Error en archivo");
}
}
