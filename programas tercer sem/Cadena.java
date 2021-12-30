import java.io.*;
import java.util.*;
class Cadena
{ 
  private String t;
  public Cadena(String t)
  {
    setT(t);
  }
  public void setT(String t)
  {
   this.t=t;
  }
  public String getT()
  {
    return t;
  }
  // métodos por equipo
  
  public int sacarCantidad() {
	   StringTokenizer st = new StringTokenizer(t, " ");
      return st.countTokens();
	}
public String sustituirPalabras(String palabra){
    StringTokenizer st=new StringTokenizer(t, " ");
    for (byte i=0;i<st.countTokens();i++){
      t.replaceAll(st.nextToken(), palabra);
    }
    return t;
  }
public String convertirMayus() {
        return this.t.toUpperCase();
}
public int contVocales(){
      String s;
      int j = 0;
      for (int i = 0; i<t.length();i++){
         s = t.substring(i,i+1);
         if (s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u"))
            j++;
      }
      return j;
    }


  
  public String toString()
  {
    return "la cadena de caracteres es:"+t;
  }
  }
class Principal{
  
  public static void main(String arg[])
  { 
    Scanner s=new Scanner(System.in);
    System.out.println("ingrese el texto");
    String texto=s.nextLine();
    Cadena c1=new Cadena(texto);
    byte op;
do{
    System.out.println("que desea realizar");
    System.out.println("1.mostrar cantidad de vocales");
    System.out.println("2.contar palabras");
    System.out.println("3.sustituir palabras");
    System.out.println("4.convertir a mayúsculas");
    System.out.println("5.salir");
    op=s.nextByte();
    switch(op){
    case 1:System.out.println("la cantidad de vocales es:"+c1.contVocales());break;
    case 2:System.out.println("la cantidad de palabras es:"+c1.sacarCantidad());break;
    case 3: System.out.println("ingresa la palabra con la que se va a remplazar el texto");
            String palabra=s.nextLine();
            System.out.println("la nueva cadena de caracteres es:"+c1.sustituirPalabras(palabra));break;
    case 4:System.out.println("la nueva cadena de caracteres es:"+c1.convertirMayus());break;
    }}
while(op!=5);
    }
    }
