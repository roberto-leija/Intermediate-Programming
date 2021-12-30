//Imports
import java.io.*;
import java.util.*;
import java.text.*;

class Recibo{
   private int dia;
   private double pD;
   
   public Recibo(int dia, double pD){
   setDia(dia);
   setPD(pD);
   }
   
   public void setDia(int dia){
   this.dia=dia;
   }
   
   public int getDia(){
   return dia;
   }
   
   public void setPD(double pD){
   this.pD=pD;
   }
   
   public double getPD(){
   return pD;
   }
   
   public double hacerSubTotal(){
   return dia*pD;
   }
   
   public double hacerTotal(){
   double total=0.00;
   if(dia<5)
      total=hacerSubTotal();
   if(dia>5 && dia<=10)
      total=hacerSubTotal()*0.10;
   if(dia>10 && dia<=15)
      total=hacerSubTotal()*0.15;
   if(dia>15)
      total=hacerSubTotal()*0.20;
   return total;
   }
   
   public String hacerDesc(){
   String desc="";
   if(dia<5)
      desc="No hay descuento";
   if(dia>5&&dia<=10)
      desc="10%";
   if(dia>10&&dia<=15)
      desc="15%";
   if(dia>15)
      desc="20%";
   return desc;
   }
   
   public String toString(){ 
   try{
      File f=new File("C:\\Users\\robby\\OneDrive\\Escritorio\\SEMESTRE 3\\Programación Intermedia\\Final\\ReciboCliente.txt");
      FileOutputStream f2=new FileOutputStream(f,true);
      PrintStream f3=new PrintStream(f2);
      f3.println("subTotal: "+"\t$"+hacerSubTotal()+"\nDescuento: "+"\t"+hacerDesc()+"\nTotal: "+"\t\t$"+hacerTotal());
      f3.close();
   }
   catch(IOException e){
      System.out.println("Error de archivo");
   }
   return "subTotal: "+"\t$"+hacerSubTotal()+"\nDescuento: "+"\t"+hacerDesc()+"\nTotal: "+"\t\t$"+hacerTotal();
   }
}

class Main{
   public static void main(String args[]){
   Recibo r1=new Recibo(pedirDia(),pedirPD());
   System.out.println(r1);
   }
   
   public static double pedirPD(){
   boolean error=true;
   System.out.println("Ingrese cuanto cuesta un dia de alojamiento: ");
   double x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextDouble();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("vuelva a ingresar el costo de alojamiento por dia, un valor numerico.");
         error=true;
      }   
   }while(error);
   return x;
   }
   
   public static int pedirDia(){
   boolean error=true;
   System.out.println("Ingrese el numero de dias que se quedara el cliente: ");
   int x=0;
   do{
      Scanner s=new Scanner(System.in);      
      error=false;
      try{
         x=s.nextInt();
      }
      catch(InputMismatchException e){
         System.out.println("Error en la captura. ");
         System.out.println("vuelva a ingresar el numero de dias que se quedara, un valor numerico.");
         error=true;
      }   
   }while(error);
   return x;
   }
}   