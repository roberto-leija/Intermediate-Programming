//Programa que realiza una factura
//Realizado por escuderia Pro-gamers
//Fecha de creación: 07/10/2021

//Importes
import java.io.*;
import java.util.*;
import java.text.*;

//Clase principal Factura
public class Factura{
   private String numFactura;
   private Nombre nombreC;
   private String direccionC;
   private String rfcC;
   private String rfcE;
   private String nombreE;
   private Detalle[] d; 
   private double descuento;
   private double cantP;
   
   //Constructor de clase factura
   public Factura(String numFactura, Nombre nombreC, String direccionC, String rfcC, String rfcE, String nombreE, Detalle[] d, double descuento, double cantP){
   setNumFactura(numFactura);
   setNombreC(nombreC);
   setDireccionC(direccionC);
   setRfcC(rfcC);
   setRfcE(rfcE);
   setNombreE(nombreE);
   setD(d); 
   setDescuento(descuento);
   setCantP(cantP);
   }
   
   //set numFactura
   public void setNumFactura(String numFactura){
   this.numFactura=numFactura;
   }
   
   
   //get numFactura
   public String getNumFactura(){
   return numFactura;
   }
   
   //set nombreC
   public void setNombreC(Nombre nombreC){
   this.nombreC=nombreC;
   }
   
   //get nombreC
   public Nombre getNombreC(){
   return nombreC;
   }
   
   //set direccionC
   public void setDireccionC(String direccionC){
   this.direccionC=direccionC;
   }
   
   //get direccionC
   public String getDireccionC(){
   return direccionC;
   }
   
   //set rfcC
   public void setRfcC(String rfcC){
   this.rfcC=rfcC;
   }
   
   //get rfcC
   public String getRfcC(){
   return rfcC;
   }
   
   //set rfcE
   public void setRfcE(String rfcE){
   this.rfcE=rfcE;
   }
   
   //get rfcE
   public String getRfcE(){
   return rfcE;
   }
   
   //set nombreE
   public void setNombreE(String nombreE){
   this.nombreE=nombreE;
   }
   
   //get nombreE
   public String getNombreE(){
   return nombreE;
   }
   
   //set d
   public void setD(Detalle[] d){
   this.d=d;
   }
   
   //get d
   public Detalle[] getD(){
   return d;
   }
   
   //set descuento
   public void setDescuento(double descuento){
      this.descuento=descuento;}
   //get descuento
   public double getDescuento(){
      return descuento;}
      
   //set cantP
   public void setCantP(double cantP){
      this.cantP=cantP;}
   //get cantP
   public double getCantP(){
      return cantP;}
   
   //ToString de clase factura
   public String toString(){
   return "Numero de factura: "+numFactura+"\n-Empresa:\n"+nombreE+"\n-RFC de empresa:\n"+rfcE+"\n-Cliente:\n"+nombreC+"\nRFC Cliente: "+rfcC+"\n-Direccion Cliente:\n"+direccionC+"\n"+String.format("%-15s","Cantidad")+String.format("%-15s","Clave")+String.format("%-50s","Descripcion")+String.format("%-30s","Precio-Unitario")+String.format("%-30s","Importe");
}
}

//clase detalle
class Detalle{
   private int cant;
   private double precio;
   private String clave;
   private String descripcion;

   //Contructor de clase detalle
   public Detalle (int cant, double precio, String clave, String descripcion){
      setCant(cant);
      setPrecio(precio);
      setClave(clave);
      setDescripcion(descripcion);
   }

   //Set cantidad
   public void setCant(int cant){
      this.cant=cant;}
   //get cantidad
   public int getCant(){
      return cant;}

   //set precio
   public void setPrecio(double precio){
      this.precio=precio;}
   //get precio
   public double getPrecio(){
      return precio;}

   //set clave
   public void setClave(String clave){
      this.clave=clave;}
   //get clave
   public String getClave(){
      return clave;}
      
   //set descripcion
   public void setDescripcion(String descripcion){
      this.descripcion=descripcion;}
   //get descripcion
   public String getDescripcion(){
      return descripcion;}
   
   public String toString(){
      DecimalFormat y = new DecimalFormat("0.00");
      String m="";
      if(descripcion.length()>42)
         m=descripcion.substring(0,42)+"...";
      else
         m=descripcion;
   return String.format("%-15s",cant)+String.format("%-15s",clave)+String.format("%-50s",m)+String.format("%-30s","$"+precio)+"$"+y.format(precio*cant);
   }
}

//clase producto
class Producto{
   private String clave;

   //Contructor de clase producto
   public Producto (String clave){
      setClave(clave);
   }

   //set clave
   public void setClave(String clave){
      this.clave=clave;}
   //get clave
   public String getClave(){
      return clave;}
}

//clase cliente
class Cliente{
   private Nombre nombre;
   private Direccion direccion;
   private String rfc;
   private Fecha fecha;
	
	//Metodo constructor
	public Cliente(Nombre nombre, Direccion direccion, String rfc, Fecha fecha) {
		setNombre(nombre);
      setDireccion(direccion);
      setRfc(rfc);
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
	
   //Metodo para definir direccion
   public void setDireccion(Direccion direccion){
   this.direccion=direccion;
   }
   
   //Metodo para obtener direccion
   public Direccion getDireccion(){
   return direccion;
   }
   
   //Metodo para definir rfc
	public void setRfc(String rfc) {
		this.rfc=rfc;
	}
	
	//Metodo para obtener rfc
	public String getRfc() {
		return rfc;
	} 
   
	//Metodo para definir fecha
	public void setNacimiento(Fecha fecha) {
		this.fecha=fecha;
	}
	
	//Metodo para obtener fecha
	public Fecha getfecha() {
		return fecha;
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
   
   public String toString(){
      return "Nombre: "+primerN+"\nApellidos: "+apellidoP+" "+apellidoM;
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
//clase direccion
class Direccion{
   private String calle;
   private String numCa;
   private String colonia;
   private String municipio;
   private String codigoPo;
   
   //contructor de clase direccion
   public Direccion(String calle, String numCa, String colonia, String municipio, String codigoPo){
   setCalle(calle);
   setNumCa(numCa);
   setColonia(colonia);
   setMunicipio(municipio);
   setCodigoPo(codigoPo);
   }
   
   //set calle
   public void setCalle(String calle){
   this.calle=calle;
   }
   
   //get calle
   public String getCalle(){
   return calle;
   }
   
   // set numCa
   public void setNumCa(String numCa){
   this.numCa=numCa;
   }
   
   //get numCa
   public String getNumCa(){
   return numCa;
   }
   
   //set colonia
   public void setColonia(String colonia){
   this.colonia=colonia;
   }
   
   //get colonia
   public String getColonia(){
   return colonia;
   }
   
   //set municipio
   public void setMunicipio(String municipio){
   this.municipio=municipio;
   }
   
   //get municipio
   public String getMunicipio(){
   return municipio;
   }
   
   //set codigoPo
   public void setCodigoPo(String codigoPo){
   this.codigoPo=codigoPo;
   }
   
   //get codigoPo
   public String getCodigoPo(){
   return codigoPo;
   }

   //ToString de clase direccion
   public String toString(){
      return "Calle: "+calle+"\nNumero: "+numCa+"\nColonia: "+colonia+"\nCodigo Postal: "+codigoPo+"\nMunicipio: "+municipio;
   }
}

//Clase empresa
class Empresa{
   private String rfc;
   private String nombre;

   //contructor de empresa
   public Empresa (String rfc, String nombre){
      setRfc(rfc);
      setNombre(nombre);
   }

   //set rfc
   public void setRfc(String rfc){
      this.rfc=rfc;}
   //get rfc
   public String getRfc(){
      return rfc;}

   //set nombre empresa
   public void setNombre(String nombre){
      this.nombre=nombre;}
   //get nombre empresa
   public String getNombre(){
      return nombre;}
}

class main{
   public static void main(String[] args){
   
   
   Nombre n1=new Nombre(pedirApellidoP(), pedirApellidoM(),pedirNombre());
   Fecha f1=new Fecha(pedirDia(), pedirMes(), pedirAnio());
   Direccion dirDom1=new Direccion(pedirCalle(), pedirNumCa(), pedirColonia(), pedirMunicipio(), pedirCodigoPo());
   Cliente c1=new Cliente(n1,dirDom1,crearRFC(n1,f1),f1);
   Empresa e1=new Empresa(pedirRfc(), pedirNombreEmpresa());
   
   int opcionPro=main.pedirCantidadVariedad();
   
   
   Detalle[] d=leerDetalles(opcionPro);
   
   
   Factura fa1=new Factura("A3798", n1, dirDom1.toString(), c1.getRfc(), e1.getRfc(), e1.getNombre(), d,pedirDescuento(), opcionPro);
   System.out.println(fa1);
   for(int j=0;j<opcionPro;j++)
      System.out.println(d[j]);
      
   double sub=0;
   double iva=0;
   for(int i=0;i<d.length;i++)
      sub+=d[i].getPrecio()*d[i].getCant();
   sub = sub-fa1.getDescuento();
   iva = (sub*.16);
   DecimalFormat y = new DecimalFormat("0.00");
   System.out.println("\n"+String.format("%110s","")+"Descuento:$"+y.format(fa1.getDescuento())+"\n"+String.format("%110s","")+"Subtotal:\t$"+y.format(sub)+"\n"+String.format("%110s","")+"IVA 16%:\t$"+y.format(iva)+"\n"+String.format("%110s","")+"Total:\t\t$"+y.format((sub+iva)));
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
		boolean a=true;
      int b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el dia de nacimiento por favor: ");
      do{
      b=s.nextInt(); 
      if(b>=1&&b<=31)
         a=false;
      else
         System.out.println("Ingrese un numero entre 1 y 31 por favor: ");
		}while(a);
      String bs=String.valueOf(b);
      return bs;
	}
   
   //Metodo para pedir mes
	public static String pedirMes(){
      boolean a = true;
      int b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el mes de nacimiento por favor: ");
      do{
      b=s.nextInt(); 
      if(b>=1&&b<=12)
         a=false;
      else
         System.out.println("Ingrese un numero entre 1 y 12 por favor: ");
		}while(a);
      String bs=String.valueOf(b);
      return bs;
	}
   
   //Metodo para pedir anio
	public static String pedirAnio(){
      boolean a = true;
      int b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el anio de nacimiento por favor: ");
      do{
      b=s.nextInt(); 
      if(b>=1900&&b<=2021)
         a=false;
      else
         System.out.println("Ingrese un anio correcto y de 4 caracteres por favor: ");
		}while(a);
      String bs=String.valueOf(b);
      return bs;
	}
   
   //Metodo para pedir calle
	public static String pedirCalle(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la calle por favor: ");
		return s.nextLine();
	}
   
   //Metodo para pedir numero de casa
	public static String pedirNumCa(){
		boolean a = true;
      String b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el numero de casa por favor: ");
      do{
      b=s.nextLine(); 
      if(b.length()>0&&b.length()<=4)
         a=false;
      else
         System.out.println("Ingrese un numero entre 1 y 4 digitos por favor: ");
		}while(a);
      b=String.valueOf(b);
      return b;
	}
   
   //Metodo para pedir colonia
	public static String pedirColonia(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la colonia por favor: ");
		return s.nextLine();
	}
   
   //Metodo para pedir municipio
	public static String pedirMunicipio(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el municipio por favor: ");
		return s.nextLine();
	}
   
   //Metodo para pedir codigoPo
	public static String pedirCodigoPo(){
		boolean a = true;
      String b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese el codigo postal por favor: ");
      do{
      b=s.nextLine(); 
      if(b.length()==5)
         a=false;
      else
         System.out.println("Ingrese un numero de 5 digitos por favor: ");
		}while(a);
      b=String.valueOf(b);
      return b;
	}
   
   //Metodo para el nombre de la empresa
	public static String pedirNombreEmpresa(){
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el nombre de la empresa: ");
		return s.nextLine();
	}
   
   //Metodo para crear el RFC del cliente
   public static String crearRFC (Nombre n1,Fecha f1){
      String ap = n1.getApellidoP();
      ap = ap.toUpperCase();
      ap = ap.substring(0,2);

      String am = n1.getApellidoM();
      am = am.substring(0,1);

      String an = n1.getPrimerN();
      an = an.substring(0,1);

      String a = f1.getAnio();
      a = a.substring(2,4);

      String m = f1.getMes();
      if (m.length()==1)
         m = "0"+m;

      String d = f1.getDia();
      if (d.length()==1)
         d = "0"+d;
     
      String abc ="ABCDEFGHIJKLMONPQRSTUVWXYZ";

      int l1 = (int)(Math.random()*26+1);
      int l2 = (int)(Math.random()*26+1);

      String rfc = ap+am+an+a+m+d+abc.substring(l1-1,l1)+abc.substring(l2-1,l2)+(int)(Math.random()*9+1);
      return rfc;
   }
   
   //Metodo para pedir rfc empresa
	public static String pedirRfc(){
		Scanner s=new Scanner(System.in);
		boolean a = true;
      String b;
      System.out.println("Ingrese el RFC de la empresa por favor: ");
      do{
      b=s.nextLine(); 
      if(b.length()==13)
         a=false;
      else
         System.out.println("Ingrese un RFC de 13 caracteres por favor: ");
		}while(a);
      b=String.valueOf(b);
      return b;
	}
   
   //metodo para pedir la clave
   public static String pedirClave(){
      Scanner s=new Scanner(System.in);
		
      String b;
      
      do{
      b=s.nextLine(); 
      
      if (b.length()!=6)
      System.out.println("La clave debe de ser de 6 digitos");
      
      }while (b.length()!=6);
      
      
      return b;
      
      }
      
      
      
   //Metodo para pedir precio
   public static Double pedirPrecio()
   {
   Scanner s=new Scanner(System.in);
   double pr;
   do{ 
    pr=s.nextDouble();
    if (pr<=0)
    System.out.println("El precio debe ser mayor a 0");
   }while (pr<=0);    
   return pr;
   }     
   
   
   //metodo para pedir la cantidad de productos
   public static int pedirCantidadVariedad(){
      boolean a = true;
      int b;
		Scanner s=new Scanner(System.in);
      System.out.println("Ingrese la cantidad de productos diferentes por favor: ");
      do{
      b=s.nextInt(); 
      if(b>0)
         a=false;
      else
         System.out.println("Ingrese un numero mayor a 0 por favor: ");
		}while(a);
      return b;
   }
   
   public static String pedirDesc()
   {
   Scanner s=new Scanner(System.in);
   String desc=s.nextLine();
   return desc;
   }
   
   //metodo para pedir descuento
   public static double pedirDescuento(){
   Scanner s=new Scanner(System.in);
   boolean a = true;
   String op="";
   double desc=0;
   int val=0;
   System.out.println("Hay descuento  Si o No");
   do{
   op=s.next();
   if(op.equalsIgnoreCase("si"))
      val=1;
      else if(op.equalsIgnoreCase("no"))
      val=2;
      else
      System.out.println("Hay descuento  Si o No");
      
   }while(val==0);
   if (val==1){
      System.out.println("Ingrese el descuento: ");
      do{
      desc=s.nextDouble();
      if(desc>0)
         a=false;
      else
         System.out.println("Ingrese un numero mayor a 0 por favor: ");
		}while(a);
   }
   else
      desc=0;
   return desc;
   }
   
   public static Detalle[] leerDetalles(int opcionPro){
   Scanner s=new Scanner(System.in);
   boolean a = true;
   int x;
   double p;
   String c;
   double c1;
   String desc;
   Detalle[] r=new Detalle[opcionPro];
   
   DecimalFormat y = new DecimalFormat("0.00");
   
   String cr;
   for(int i=0;i<opcionPro;i++)
   {
      System.out.println("Ingrese la cantidad de productos del detalle: "+(i+1));
      do{
      x=s.nextInt();
      if(x>0)
         a=false;
      else
         System.out.println("Ingrese un numero mayor a 0 por favor: ");
		}while(a);
      a=true;
      System.out.println("Ingrese el precio del producto: "+(i+1));
      p=main.pedirPrecio();
      System.out.println("Ingrese la clave del prducto: "+(i+1));
      c=main.pedirClave();
      System.out.println("Ingrese la descripcion del producto: "+(i+1));
      desc=main.pedirDesc();
      r[i]=new Detalle(x,p,c,desc);
   }
   return r;
   }
   
   
   
}
