//  @ Project : Untitled
//  @ File Name : Persona.java
//  @ Date : 05/09/2021
//  @ Author : Robeerto Leija

import java.io.*;
import java.util.*;

public class Persona {
   Nombre nombre;
   Fecha fecha;
	
	//Metodo constructor
	public Persona(Nombre nombre, Fecha fecha) {
		setNombre(nombre);
		setNacimiento(fecha);
	}
	
	//Metodo para definir nombre
	public void setNombre(Nombre nombre) {
		this.nombre=nombre;
	}
	
	//Metodo para obtener nombre
	public Nombre getNombre() {
		return nombre;
	}
	
	//Metodo para definir fecha
	public void setNacimiento(Fecha fecha) {
		this.fecha=fecha;
	}
	
	//Metodo para obtener fecha
	public Fecha getfecha() {
		return fecha;
	}
   
   //metodo para crear el RFS
   
   public String crearRFS(){
   String[] letras=new String[] {"A","B","D","C","V","F","G","V","B","H","N","J","T","G","H","I"};
   String apellido1=(nombre.getApellidoP().substring(0,2)).toUpperCase();
   String apellido2=(nombre.getApellidoM().substring(0,1)).toUpperCase();
   String nombre1=(nombre.getPrimerN().substring(0,1)).toUpperCase();
   String anio1=fecha.getAnio().substring(2);
   String mes1=fecha.getMes().substring(0);
   String dia1=fecha.getDia();
   if (dia1.length()==1)
      dia1="0"+dia1;
   String rfc=apellido1+apellido2+nombre1+anio1+mes1+dia1+letras[(int)Math.random()*17+1]+letras[(int)Math.random()*16+1]+String.valueOf((int)Math.random()*10+1);
   return rfc;
   }
   
	//Metodo toString
	public String toString(){
		return "el RFC es: "+crearRFS();
	}
}

//Clase nombre
class Nombre{
   private String apellidoP;
   private String apellidoM;
   private String primerN;
   
   //Constructor de nombre
   public Nombre(String apellidoP, String apellidoM, String primerN){
   setApellidoP(apellidoP);
   setApellidoM(apellidoM);
   setPrimerN(primerN);
   }
   
   //Definir apellido paterno
   public void setApellidoP(String apellidoP){
   this.apellidoP=apellidoP;
   }
   
   //Conseguir apellido paterno
   public String getApellidoP(){
   return apellidoP;
   }
   
   //Definir apellido materno
   public void setApellidoM(String apellidoM){
   this.apellidoM=apellidoM;
   }
   
   //Conseguir apellido materno
   public String getApellidoM(){
   return apellidoM;
   }
   
   //Definir primer nombre
   public void setPrimerN(String primerN){
   this.primerN=primerN;
   }
   
   //Conseguir primer nombre
   public String getPrimerN(){
   return primerN;
   }
}

//Clase fecha
class Fecha{
   private String dia;
   private String mes;
   private String anio; 
   
   //Contructor de fecha
   public Fecha(String dia, String mes, String anio){
   setDia(dia);
   setMes(mes);
   setAnio(anio);
   }
   
   //Definir dia
   public void setDia(String dia){
   this.dia=dia;
   }
   
   //Conseguir dia
   public String getDia(){
   return dia;
   }
   
   //Definir mes
   public void setMes(String mes){
   this.mes=mes;
   }
   
   //Conseguir mes
   public String getMes(){
   return mes;
   }
   
   //Definir anio
   public void setAnio(String anio){
   this.anio=anio;
   }
   
   //Conseguir anio
   public String getAnio(){
   return anio;
   }
}

class Main1{
	public static void main(String[] args) {
      Nombre n1=new Nombre(pedirApellidoP(), pedirApellidoM(),pedirNombre());
      Fecha f1=new Fecha(pedirDia(), pedirMes(), pedirAnio());
		Persona p1=new Persona(n1,f1);
      System.out.println(p1);
	}

	//Metodo para pedir nombre
	public static String pedirNombre(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		return s.nextLine();
	}
   
   //Metodo para pedir apellido paterno
	public static String pedirApellidoP(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese apellido paterno: ");
		return s.nextLine();
	}
   
   //Metodo para pedir apellido materno
	public static String pedirApellidoM(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese apellido materno: ");
		return s.nextLine();
	}

	//Metodo para pedir dia
	public static String pedirDia(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el dia de nacimiento: ");
		return s.nextLine();
	}
   
   //Metodo para pedir mes
	public static String pedirMes(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el mes de nacimiento: ");
		return s.nextLine();
	}
   
   //Metodo para pedir anio
	public static String pedirAnio(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el anio de nacimiento: ");
		return s.nextLine();
	}
}
