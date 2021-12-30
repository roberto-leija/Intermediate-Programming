//practica para parcial 2 de programación intermedia
//Realizado por Roberto Orlando Leija Vázquez 573847
//El 06/10/2021

import java.io.*;
import java.util.*;
import java.lang.*;

public class Aminoacido{
   private String codigoGe;
   
   public Aminoacido(String codigoGe){
   setCodigoGe(codigoGe);
   }
   
   public void setCodigoGe(String codigoGe){
   this.codigoGe=codigoGe;
   }
   
   public String getCodigoGe(){
   return codigoGe;
   }
   
   public int contarTripletas(){
      char[] t={'A', 'C','G','T'};
      char chr;
      int contador=0;
      int resultado;
      for (int i=0; i<codigoGe.length();i++){
        chr=codigoGe.charAt(i);
        for (int j=0; j<t.length; j++){
         if(t[j]==chr)
            contador+=1;
        }
      }
     return contador/3;
   }
   
   public int contarTripletasF(){
      char t[]={'A','C','G','T'};
      char chr;
      int contador=0;
      int r=0;
      int resultado;
      for (int i=0; i<codigoGe.length();i++){
        chr=codigoGe.charAt(i);
        for (int j=0; j<t.length; j++){
         if(t[j]==chr)
            contador+=1;
        }
     }
     if(contador%5==0){
      if(contador%2==0)
         r=2;
     }
     if(contador%3==0){
      if(contador%2==0)
      r=0;
     }
     else
      r=1;
    return r; 
   }
   
   public String toString(){
   return "El codigo genetico es: "+codigoGe+"\nNumero de tripletas: "+contarTripletas()+"\nNumero faltante para completar la siguiente tripleta: "+contarTripletasF();
   }
 }
 
class main{
   public static void main(String[] args){
   Aminoacido a1=new Aminoacido(conseguirCodigo());
   System.out.println(a1);
   }
   
   public static String conseguirCodigo(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el codigo genetico: ");
		return s.nextLine();
	}
}