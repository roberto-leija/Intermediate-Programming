//Proyecto Final de Programacion Intermedia MV 1:00PM.
//Hecho por escuderia Pro-Gamers.
//Fecha de entrega: 19 de Noviembre del 2021.
//Damos nuestra palabra de que hemos realizado esta activdad con integridad académica.

//Imports
import java.io.*;
import java.util.*;
import java.text.*;

//Clase padre
class Asalariado{

//Atributos de clase padre
protected Rfc  rfc;
protected long numIdentificacion;
protected String fechaPago;
protected String tipoRegimen;
protected String departamento;
protected Nombre nombre;
protected String curp;
protected String nss;
protected int salarioIntegrado;
protected String banco;
protected Direccion direccion;
protected Correo correo;
protected String tipoNomina;
protected String tipoContrato;
protected int salarioBase;
protected Fecha fechaInicio;
protected long telefono;
protected Incapacidad incapacidad;

//Constructor clase padre
public Asalariado(Rfc  rfc, long numIdentificacion, String fechaPago, String tipoRegimen, String departamento, Nombre nombre, String curp, String nss, int salarioIntegrado, String banco, Direccion direccion, Correo correo, String tipoNomina, String tipoContrato, int salarioBase, Fecha fechaInicio, long telefono, Incapacidad incapacidad){
   setRfc(rfc);
   setNumIdentificacion(numIdentificacion);
   setFechaPago(fechaPago);
   setTipoRegimen(tipoRegimen);
   setDepartamento(departamento);
   setNombre(nombre);
   setCurp(curp);
   setNss(nss);
   setSalarioIntegrado(salarioIntegrado);
   setBanco(banco);
   setDireccion(direccion);
   setCorreo(correo);
   setTipoNomina(tipoNomina);
   setTipoContrato(tipoContrato);
   setSalarioBase(salarioBase);
   setFechaInicio(fechaInicio);
   setTelefono(telefono);
   setIncapacidad(incapacidad);
   }

//Set Rfc   
public void setRfc(Rfc  rfc){
   this.rfc=rfc;
   } 
//Get Rfc   
public Rfc  getRfc (){
   return rfc;
   }     
 
//Set numIdentificacion 
public void setNumIdentificacion(long numIdentificacion){
   this.numIdentificacion=numIdentificacion;
   }   
//Get numIdentificacion
public long getNumIdentificacion(){
   return numIdentificacion;
   }  

//Set fechaPago
public void setFechaPago(String fechaPago){
   this.fechaPago=fechaPago;
   } 
//Get fechaPago 
public String getFechaPago(){
   return fechaPago;
   }  

//Set tipoRegimen
public void setTipoRegimen(String tipoRegimen){
   this.tipoRegimen=tipoRegimen;
   } 
//Get tipoRegimen 
public String getTipoRegimen(){
   return tipoRegimen;
   }  
   
//Set departamento
public void setDepartamento(String departamento){
   this.departamento=departamento;
   } 
//Get departamento 
public String departamento(){
   return departamento;
   }
   
//Set nombre
public void setNombre(Nombre nombre){
   this.nombre=nombre;
   } 
//Get nombre
public Nombre getNombre(){
   return nombre;
   }

//Set curp
public void setCurp(String curp){
   this.curp=curp;
   } 
//Get curp
public String getCurp(){
   return curp;
   }
   
//Set nss
public void setNss(String nss){
   this.nss=nss;
   } 
//Get nss
public String getNss(){
   return nss;
   } 

//Set salarioIntegrado
public void setSalarioIntegrado(int salarioIntegrado){
   this.salarioIntegrado=salarioIntegrado;
   } 
//Get salarioIntegrado
public int getSalarioIntegrado(){
   return salarioIntegrado;
   } 
  
//Set banco
public void setBanco(String banco){
   this.banco=banco;
   } 
//Get banco
public String getBanco(){
   return banco;
   }   

//Set direccion   
public void setDireccion(Direccion direccion){
   this.direccion=direccion;
   } 
//Get direccion   
public Direccion getDireccion(){
   return direccion;
   }
   
//Set correo   
public void setCorreo(Correo correo){
   this.correo=correo;
   }
//Get correo   
public Correo getCorreo(){
   return correo;
   } 
   
//Set tipoNomina   
public void setTipoNomina(String tipoNomina){
   this.tipoNomina=tipoNomina;
   }
//Get tipoNomina   
public String getTipoNomina(){
   return tipoNomina;
   } 
  
//Set tipoContrato  
public void setTipoContrato(String tipoContrato){
   this.tipoContrato=tipoContrato;
   }
//Get tipoNomina   
public String getTipoContrato(){
   return tipoContrato;
   } 

//Set salarioBase
public void setSalarioBase(int salarioBase){
   this.salarioBase=salarioBase;
   } 
//Get salarioBase
public int getSalarioBase(){
   return salarioBase;
   } 

//Set fechaInicio
public void setFechaInicio(Fecha fechaInicio){
   this.fechaInicio=fechaInicio;
   } 
//Get fechaInicio 
public Fecha getFechaInicio(){
   return fechaInicio;
   } 

//Set telefono   
public void setTelefono(long telefono){
   this.telefono=telefono;
   } 
//Get telefono   
public long getTelefono(){
   return telefono;
   }        
   
//Set incapacidad   
public void setIncapacidad(Incapacidad incapacidad){
   this.incapacidad=incapacidad;
   } 
//Get incapacidad   
public Incapacidad getIncapacidad(){
   return incapacidad;
   }       
   
public String toString(){
return nombre+","+rfc+","+direccion+","+correo+","+telefono;
}    

}


//Clase Nombre     ----------------------------------------------------------------------------------------------------------------------
class Nombre{
   private String nombre;
   private String ap1;
   private String ap2;
   
   //Constructor clase nombre
   public Nombre(String nombre, String ap1, String ap2){
   setNombre(nombre);
   setAp1(ap1);
   setAp2(ap2);
   }
   //Set nombre
   public void setNombre(String nombre){
      this.nombre=nombre;    
   }
   //Get nombre
   public String getNombre(){
      return nombre;
   }
   
   //Set apllido paterno
   public void setAp1(String ap1){
      this.ap1=ap1;
   }
   //Get apellido paterno
   public String getAp1(){
      return ap1;
   }
   
   //Set apellido materno
   public void setAp2(String ap2){
      this.ap2=ap2;
   }
   //Get apellido materno
   public String getAp2(){
      return ap2;
   }
   
   //ToString de clase nombre
   public String toString(){
   return nombre+" "+ap1+" "+ap2;
   }
}


//Class Rfc 
class Rfc{
private Nombre nombre;
private Fecha fecha;

   //Constructor de rfc  
   public Rfc(Nombre nombre, Fecha fecha){ 
   setNombre(nombre);
   setFecha(fecha);   
   }
   
   //Set nombre
   public void setNombre(Nombre nombre){
   this.nombre=nombre;
   }
   //Get nombre
   public Nombre getNombre(){
   return nombre;
   }
   
   //Set fecha
   public void setFecha(Fecha fecha)
   {
   this.fecha=fecha;
   }
   //Get fecha
   public Fecha getFecha()
   {
   return fecha;
   }
   
   //Metodos
   public String letras()
   {
   String abc = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
   String letra[]=abc.split("");
   int al=(int)(Math.random()*26); 
   return letra[al];
   }
   
   public int numAleatorio()
   {
   return ((int)(Math.random()*10));
   }
   
  //toString 
  public String toString(){
  //MEMD020418
  return (((nombre.getAp1()).substring(0,2)).toUpperCase())+(((nombre.getAp2()).substring(0,1)).toUpperCase())+(((nombre.getNombre()).substring(0,1)).toUpperCase())+fecha.getAnio().substring(2)+fecha.getMes()+fecha.getDia()+letras()+letras()+numAleatorio();
  }
}

//Clase Fecha
class Fecha{
   private String dia;
   private String mes;
   private String anio;
   
   //Constructor para clase fecha
   public Fecha(String dia, String mes, String anio){
   setDia(dia);         
   setMes(mes);
   setAnio(anio);
   }
   
   //Set dia
   public void setDia(String dia){
      this.dia=dia;
   }
   //Get dia
   public String getDia(){
      return dia;
   }  
   
   //Set mes
   public void setMes(String mes){
      this.mes=mes;
   }
   //Get mes
   public String getMes(){
      return mes;
   }
   
   //Set anio
   public void setAnio(String anio){
      this.anio=anio;
   }         
   //Get anio
   public String getAnio(){
      return anio;
   }
   
   //toString
   public String toString(){
   return dia+"/"+mes+"/"+anio;                                          
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
      return calle+" "+numCa+" "+colonia+" "+codigoPo+" "+municipio;
   }
}

//Clase Correo
class Correo{
private Nombre nombre;
private Fecha fecha;

   //Constructor de clase correo
   public Correo(Nombre nombre, Fecha fecha){ 
   setNombre(nombre);
   setFecha(fecha);   
   }
   
   //Set nombre
   public void setNombre(Nombre nombre){
      this.nombre=nombre;
   }
   //Get nombre
   public Nombre getNombre(){
      return nombre;
   }
   
   //Set fecha
   public void setFecha(Fecha fecha){
      this.fecha=fecha;
   }
   //Get fecha
   public Fecha getFecha(){
      return fecha;
   }
   
   //toString
   public String toString(){
   return ((nombre.getNombre()).substring(0,1)).toLowerCase()+(nombre.getAp1()).toLowerCase()+((nombre.getAp2()).substring(0,1)).toLowerCase()+fecha.getAnio()+"@imesamty.com";
   } 
}   

//Clase incapacidad
class Incapacidad{
   private String tipoIncapacidad;
   private String duracion;

   //Constructor de incapacidad
   public Incapacidad (String tipoIncapacidad, String duracion){
      setTipoIncapacidad(tipoIncapacidad);
      setDuracion(duracion);
   }
   
   //Set tipoIncapacidad
   public void setTipoIncapacidad(String tipoIncapacidad){
      this.tipoIncapacidad=tipoIncapacidad;
   }
   //Get tipoIncapacidad
   public String getTipoIncapacidad(){
      return tipoIncapacidad;
   }
   
   //Set duracion
   public void setDuracion(String duracion){
   this.duracion=duracion;
   }
   //Get duracion
   public String getDuracion(){
   return duracion;}
   
   //toString
   public String toString(){
   return tipoIncapacidad+","+duracion;
   }
}

//Clase Empleado
class Empleado extends Asalariado{
private String areaTrabajo;

   //Constructor empleado, clase hija de asalariado
   public Empleado(Rfc  rfc, long numIdentificacion, String fechaPago, String tipoRegimen, String departamento, Nombre nombre, String curp, String nss, int salarioIntegrado, String banco, Direccion direccion, Correo correo, String tipoNomina, String tipoContrato, int salarioBase, Fecha fechaInicio, long telefono, Incapacidad incapacidad, String areaTrabajo){
   super(rfc, numIdentificacion, fechaPago, tipoRegimen, departamento, nombre, curp, nss, salarioIntegrado, banco, direccion, correo, tipoNomina, tipoContrato, salarioBase, fechaInicio, telefono, incapacidad);
   setAreaTrabajo(areaTrabajo);
   }
   
   //Set areaTrabajo
   public void setAreaTrabajo(String areaTrabajo){
      this.areaTrabajo=areaTrabajo;
      }
   //Get areaTrabajo
   public String getAreaTrabajo(){
      return areaTrabajo;
      }
   
   //toString
   public String toString(){
     return rfc+","+numIdentificacion+","+fechaPago+","+tipoRegimen+","+departamento+","+nombre+","+curp+","+nss+","+salarioIntegrado+","+banco+","+direccion+","+correo+","+tipoNomina+","+tipoContrato+","+salarioBase+","+fechaInicio+","+telefono+","+incapacidad+","+areaTrabajo; 
     }         
}


//Clase Gerente, clase hija de asalariado
class Gerente extends Asalariado{
private String areaEncargada;
   
   //Constructor de clase Gerente
   public Gerente(Rfc  rfc, long numIdentificacion, String fechaPago, String tipoRegimen, String departamento, Nombre nombre, String curp, String nss, int salarioIntegrado, String banco, Direccion direccion, Correo correo, String tipoNomina, String tipoContrato, int salarioBase, Fecha fechaInicio, long telefono, Incapacidad incapacidad, String areaEncargada){
   super(rfc, numIdentificacion, fechaPago, tipoRegimen, departamento, nombre, curp, nss, salarioIntegrado, banco, direccion, correo, tipoNomina, tipoContrato, salarioBase, fechaInicio, telefono, incapacidad); 
   setAreaEncargada(areaEncargada);
   }
   
   //Set areaEncargada
   public void setAreaEncargada(String areaEncargada){
     this.areaEncargada=areaEncargada;
     }
   //Get areaEncargada
   public String getAreaEncargada(){
      return areaEncargada;
      }
   
   //toString
   public String toString(){
      return rfc+","+numIdentificacion+","+fechaPago+","+tipoRegimen+","+departamento+","+nombre+","+curp+","+nss+","+salarioIntegrado+","+banco+","+direccion+","+correo+","+tipoNomina+","+tipoContrato+","+salarioBase+","+fechaInicio+","+telefono+","+incapacidad+","+areaEncargada; 
   }            
}

//Clase Principal ----------------------------------------------------------------------------------------------------------------------------------------------
class Principal{
   public static void main(String[] args){
   Scanner s= new Scanner(System.in);
   boolean ciclo = false;
   do{
      System.out.println("[0] Quieres capturar un nuevo asalariado"+"\n[1] consultar de la base de datos"+"\n[2] salir");
      int x=s.nextInt();
      if (x==0){
         ciclo = true;
         System.out.println("[0] Quieres agregar un empleado general"+"\n[1] Un gerente");
         int res=s.nextInt();
         if (res==0){
            System.out.println("¿Cuantos empleados se van a capturar?");
            int cant = s.nextInt();  
            Empleado[] emp=new Empleado[cant];
            for (int iii=0;iii<cant;iii++){
               try{
                  String arch=("C:\\Users\\robby\\OneDrive\\Escritorio\\PP\\EmpleadosRegistrados.txt");
                  File f=new File(arch);
                  FileOutputStream f2=new FileOutputStream(f,true);
                  PrintStream f3=new PrintStream(f2);
   
                  Nombre n1=new Nombre(leerNombre(),leerApellido1(),leerApellido2());//Generar nombre
                  Fecha f1=new Fecha(leerDiaN(),leerMesN(),leerAnoN());//Fecha de nacimiento
                  Rfc  r1=new Rfc (n1,f1);//Generar el Rfc 
                  Direccion d1=new Direccion(leerCalle(),leerNum(),leerColonia(),leerMunicipio(),leerCodigoPo());//Crear direccion
                  Correo c1=new Correo(n1,f1);//Crear correo de empleado de la empresa
                  long t1=leerTelefono();//Leer Telefono
                  Fecha fi=new Fecha(leerDiaI(),leerMesI(),leerAnoI());//Leer fecha de inicio laboral del empleado
                  String inca=leerTipoIncapacidad();//Leer incapacidad
                  Incapacidad i1=new Incapacidad(inca,leerDuracion(inca));//Crear incapacidad
                  //Crear empleado           
                  emp[iii]=new Empleado(r1,leerNumIdentificacion(),leerDiaP(),leerTipoR(),leerTipoD(),n1,leerCurp(),leerNss(),leerSalarioIntegrado(),leerBanco(),d1,c1,leerTipoNomina(),leerTipoContrato(),leerSalarioBase(),fi,t1,i1,leerAreaLab());
                  System.out.println(emp[iii]);
                  f3.println(emp[iii]);
                  f3.close();
               }
               catch(IOException e){
                  System.out.println("Error en archivo");
               }
            }
         }    
         else{
            System.out.println("¿Cuantos empleados se van a capturar?");
            int cant = s.nextInt();
            Gerente[] ger=new Gerente[cant];
            for (int iii=0;iii<cant;iii++){
             try{
                String garch=("C:\\Users\\robby\\OneDrive\\Escritorio\\PP\\GerentesRegistrados.txt");
                File gf=new File(garch);
                FileOutputStream gf2=new FileOutputStream(gf,true);
                PrintStream gf3=new PrintStream(gf2);          
                Nombre n1=new Nombre(leerNombre(),leerApellido1(),leerApellido2());//Generar nombre
                Fecha f1=new Fecha(leerDiaN(),leerMesN(),leerAnoN());//Fecha de nacimiento 
                Rfc  r1=new Rfc (n1,f1);//Generar el Rfc 
                Direccion d1=new Direccion(leerCalle(),leerNum(),leerColonia(),leerMunicipio(),leerCodigoPo());//Crear direccion 
                Correo c1=new Correo(n1,f1);//Crear correo de empleado de la empresa
                long t1=leerTelefono();//Leer Telefono
                Fecha fi=new Fecha(leerDiaI(),leerMesI(),leerAnoI());//Crear fecha de inicio laboral del empleado
                String inca=leerTipoIncapacidad();//Leer incapacidad
                Incapacidad i1=new Incapacidad(inca,leerDuracion(inca));//Crear incapacidad
                //Crear gerente
                ger[iii]=new Gerente(r1,leerNumIdentificacion(),leerDiaP(),leerTipoR(),leerTipoD(),n1,leerCurp(),leerNss(),leerSalarioIntegrado(),leerBanco(),d1,c1,leerTipoNomina(),leerTipoContrato(),leerSalarioBase(),fi,t1,i1,leerAreaEncargada());
                System.out.println(ger[iii]);
                gf3.println(ger[iii]);
                gf3.close();
             }
             catch(IOException e){
               System.out.println("Error en archivo");
             } 
           }
         }   
      }   
      if(x==1){
         ciclo = true;
         int z=0;
         String texto; 
         String h="";
         System.out.println("[0] Consultar sobre los empleados"+"\n[1] Consulta sobre los gerentes");
         int y=s.nextInt();  
         if(y==0){
            try{
               File f=new File("C:\\Users\\robby\\OneDrive\\Escritorio\\PP\\EmpleadosRegistrados.txt");
               FileInputStream f2=new FileInputStream(f);
               InputStreamReader f3= new InputStreamReader(f2);
               BufferedReader f4=new BufferedReader(f3);        
               do{
                  texto=f4.readLine();
                  if (texto==null)
                     z=1; 
                  else{
                     String r[]=texto.split(","); 
                     String rrr=r[0];
                     String numId=r[1];
                     String fp=r[2];
                     String tr=r[3];
                     String depa=r[4];
                     String nom=r[5];
                     String cur=r[6];
                     String nsss=r[7];
                     String salaint=r[8];
                     String banc=r[9];
                     String dire=r[10];
                     String corree=r[11];
                     String tn=r[12];
                     String tc=r[13];
                     String salabase=r[14];
                     String fechi=r[15];
                     String tel=r[16];
                     String incapa=r[17];
                     String dura=r[18];
                     String areaLab=r[19];
                     System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Nombre: "+nom+"\nNumero de identificacion: "+numId+"\nFecha de ingreso: "+fechi+"\nRFC: "+rrr+"\nCurp: "+cur+"\nDireccion: "+dire+"\nCorreo:"+corree+"\nTelefono: "+tel+"\nDepartamento:"+depa+"\nNSS: "+nsss+"\nTipo de regimen: "+tr+"\nTipo de contrato: "+tc+"\nTipo nomina: "+tn+"\nFecha de pago: "+fp+"\nSalario base:"+salabase+"\nSalario integrado: "+salaint+"\nBanco: "+banc+"\nIncapacidad: "+incapa+"\nTiempo de incapacidad: "+dura+"\nArea que se le encargo: "+areaLab); 
                     System.out.println("--------------------------------------------------------------------------------------------------------------------");
                  }  
               }while(z==0); 
            f4.close();         
            } 
            catch(IOException e){
               System.out.println("Error en archivo");
            }
         }
         else{
            try{
               File gf=new File("C:\\Users\\robby\\OneDrive\\Escritorio\\PP\\GerentesRegistrados.txt");
               FileInputStream gf2=new FileInputStream(gf);
               InputStreamReader gf3= new InputStreamReader(gf2);
               BufferedReader gf4=new BufferedReader(gf3); 
               do{
                  texto=gf4.readLine();
                  if (texto==null)
                     z=1; 
                  else{
                     String r[]=texto.split(","); 
                     String rrr=r[0];
                     String numId=r[1];
                     String fp=r[2];
                     String tr=r[3];
                     String depa=r[4];
                     String nom=r[5];
                     String cur=r[6];
                     String nsss=r[7];
                     String salaint=r[8];
                     String banc=r[9];
                     String dire=r[10];
                     String corree=r[11];
                     String tn=r[12];
                     String tc=r[13];
                     String salabase=r[14];
                     String fechi=r[15];
                     String tel=r[16];
                     String incapa=r[17];
                     String dura=r[18];
                     String areaEnca=r[19];
                     System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Nombre: "+nom+"\nNumero de identificacion: "+numId+"\nFecha de ingreso: "+fechi+"\nRFC: "+rrr+"\nCurp: "+cur+"\nDireccion: "+dire+"\nCorreo:"+corree+"\nTelefono: "+tel+"\nDepartamento:"+depa+"\nNSS: "+nsss+"\nTipo de regimen: "+tr+"\nTipo de contrato: "+tc+"\nTipo nomina: "+tn+"\nFecha de pago: "+fp+"\nSalario base:"+salabase+"\nSalario integrado: "+salaint+"\nBanco: "+banc+"\nIncapacidad: "+incapa+"\nTiempo de incapacidad: "+dura+"\nArea que se le encargo: "+areaEnca); 
                     System.out.println("--------------------------------------------------------------------------------------------------------------------");
                  }  
               }while(z==0); 
            gf4.close();         
            } 
            catch(IOException e){
               System.out.println("Error en archivo");
            }
         }
      }
    if (x==2)
      ciclo = false;
    else
      ciclo = true;
   }while(ciclo);   
 }
 //Metodo para pedir nombre
    public static String leerNombre(){
        Scanner s=new Scanner(System.in);
        int r=0;
        String x = " ";
        do{
            System.out.println("Ingrese nombre: ");
            x = s.nextLine();
            
            if (x.length()<2){
               System.out.println("Un caracter no puede ser un nombre, por favor vuelva a intentarlo");
               r=0;
            }
            else
               r=1;
        }while(r==0);
        return x;
    }
   
   //Metodo para pedir apellido paterno
    public static String leerApellido1(){
        Scanner s=new Scanner(System.in);
        int r=0;
        String x = " ";
        do{
            System.out.println("Ingrese apellido paterno: ");
            x = s.nextLine();
            
            if (x.length()<2){
               System.out.println("Un caracter no puede ser un apellido paterno, por favor vuelva a intentarlo");
               r=0;
            }
            else
               r=1;
        }while(r==0);
        return x;

    }
   
   //Metodo para pedir apellido materno
    public static String leerApellido2(){
        Scanner s=new Scanner(System.in);
        int r=0;
        String x = " ";
        do{
            System.out.println("Ingrese apellido materno: ");
            x = s.nextLine();
            
            if (x.length()<2){
               System.out.println("Un caracter no puede ser un apellido materno, por favor vuelva a intentarlo");
               r=0;
            }
            else
               r=1;
        }while(r==0);
        return x;

    }

    //Metodo para pedir dia
    public static String leerDiaN(){
      Scanner s=new Scanner(System.in);
      int r=0; 
      int z=0;    
      do{  
        System.out.println("Ingrese el dia de nacimiento: ");
        String x= s.nextLine(); 
        try{
         z=Integer.valueOf(x);     
          if (z>0 && z<32)
            r=1;
          else
          System.out.println("Dia no valido"); 
        }
        catch(NumberFormatException e){
           System.out.println("Dia no valido");
           }   
   }while (r==0);          
   String t=Integer.toString(z);
   if(t.length()==1)
      t="0"+t;
   return t;
   }
   
   //Metodo para pedir mes
    public static String leerMesN(){
      Scanner s=new Scanner(System.in);
      int r=0; 
      int z=0;
      do{
        System.out.println("Ingrese el mes de nacimiento: ");
        String m= s.nextLine();
        //if's para que el usuario pueda escribir el mes con palabras y aún asi funcione
        if (m.equals("enero")==true || m.equals("Enero")==true)
           m = "01";
        if (m.equals("febrero")==true || m.equals("Febrero")==true)
           m = "02";
        if (m.equals("marzo")==true || m.equals("Marzo")==true)
           m = "03";
        if (m.equals("abril")==true || m.equals("Abril")==true)
           m = "04";
        if (m.equals("mayo")==true || m.equals("Mayo")==true)
           m = "05";
        if (m.equals("junio")==true || m.equals("Junio")==true)
           m = "06";
        if (m.equals("julio")==true || m.equals("Julio")==true)
           m = "07";
        if (m.equals("agosto")==true || m.equals("Agosto")==true)
           m = "08";
        if (m.equals("septiembre")==true || m.equals("Septiembre")==true)
           m = "09";
        if (m.equals("octubre")==true || m.equals("Octubre")==true)
           m = "10";
        if (m.equals("noviembre")==true || m.equals("Noviembre")==true)
           m = "11";
        if (m.equals("diciembre")==true || m.equals("Diciembre")==true)
           m = "12";
          String x = m;
        try{
        z=Integer.valueOf(x);
        if (z>0 && z<13)
         r=1;
        else
        System.out.println("Mes no valido");
        }
        catch(NumberFormatException e){
           System.out.println("Mes no valido");
        }
   }while (r==0);
   String t=Integer.toString(z);
   if(t.length()==1)
      t="0"+t;
   return t;
    } 
   
   //Metodo para pedir anio
    public static String leerAnoN(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   do{  
        System.out.println("Ingrese el Año de nacimiento: ");
        String x= s.nextLine(); 
        try 
        {
        z=Integer.valueOf(x);
        if (z>1950 && z<2022)
        r=1;
        else
        System.out.println("Anio no valido");
        }
        catch(NumberFormatException e){
           System.out.println("Anio no valido");
           } 
   }while (r==0);          
   String t=Integer.toString(z);
   return t;             
    }
   
   //Metodo para pedir calle
    public static String leerCalle(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese la calle de residencia del empleado: ");
        return s.nextLine();
    }
   
   //Metodo para pedir numero de casa
    public static String leerNum(){
        Scanner s=new Scanner(System.in);
        int r=0;
        int h=0;
        String x=" ";
        do{
         try{
            System.out.println("Ingrese el numero de residencia del empleado: ");
            x = s.nextLine();
            h = Integer.valueOf(x);
            }
            catch(NumberFormatException e){
            System.out.println("Numero de residencia no valido, debe ser un numero de 4 digitos");
            r=0;
            }
            catch(InputMismatchException e){
            System.out.println("Numero de residencia no valido, debe ser un numero de 4 digitos");
            r=0;
            }
            if (x.length()<=4)
               r=1;
            else{
               System.out.println("Numero de residencia no valido, debe ser de 4 digitos");
               r=0;
            }
        }while(r==0);
        
        return x;
    }
   
   //Metodo para pedir colonia
    public static String leerColonia(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese la colonia de residencia del empleado: ");
        return s.nextLine();
    }
   
   //Metodo para pedir municipio
    public static String leerMunicipio(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el municipio de residencia del empleado: ");
        return s.nextLine();
    }
   
   //Metodo para pedir codigo Postal
    public static String leerCodigoPo(){
    Scanner s=new Scanner(System.in);
    int r=0; 
    int z=0;  
    do{  
        System.out.println("Ingrese el Codigo Postal ");
        String x= s.nextLine(); 
        try 
        {
        z=Integer.valueOf(x);
        if (z>0 && z<100000)
        r=1;
        else
        System.out.println("Codigo Postal No Valido");
        }
        catch(NumberFormatException e){
           System.out.println("Codigo Postal No Valido");
           }      
   }while (r==0);          
   String t=Integer.toString(z);
   return t; 
   }
   
   //Metodo para pedir tipo de incapacidad
    public static String leerTipoIncapacidad(){
        Scanner s=new Scanner(System.in);
        String tipo="";
        String inca="";
        System.out.println("¿el empleado tiene alguna incapacidad?");
        tipo=(s.nextLine()).toLowerCase();
        if(tipo.equals("si")){
         System.out.println("Ingrese la incapacidad que tiene el empleado: ");
         inca=s.nextLine();
        }
        else
         inca="No tiene incapacidad";
      return inca; 
    }
    
    //Metodo para pedir duracion de la incapacidad
    public static String leerDuracion(String inca){
        Scanner s=new Scanner(System.in);
        String duracion="";
        if(inca.equals("No tiene incapacidad"))
         duracion="-";
        else{
         System.out.println("Ingrese el tiempo de la incapacidad: ");
         duracion=s.nextLine();
        }
        return duracion;
    }
   
   //Metodo para pedir Telefono
    public static long leerTelefono(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   String x=" ";
   do{  
        System.out.println("Ingrese el telefono:");
         x= s.nextLine();
        if(x.length()==10)
        {
         String a[]=x.split("");
         r=1;
         for(int i=0;i<=9;i++)
         {
            try{
               z=Integer.valueOf(a[i]);
            }
            catch(NumberFormatException e){
              System.out.println("Telefono No valido");
              r=0;
              }                               
         }
        }
        else
        System.out.println("Telefono no valido");           
   }while (r==0);          
   long h=Long.parseLong(x);
   return h;
   }
 
   //Metodo para pedir dia de inicio del empleado
    public static String leerDiaI(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   do{  
        System.out.println("Ingrese el dia que empezo a trabajar el empleado: ");
        String x= s.nextLine();
        try{
        z=Integer.valueOf(x);
        if (z>0 && z<32)
        r=1;
        else
        System.out.println("Dia no valido");
        }
        catch(NumberFormatException e){
           System.out.println("Dia no valido");
        }   
   }while (r==0);          
   String t=Integer.toString(z);
   if(t.length()==1)
   t="0"+t;
   return t;
   }
   
   //Metodo para pedir mes de inicio del empleado
    public static String leerMesI(){
      Scanner s=new Scanner(System.in);
      int r=0; 
      int z=0;
      do{
        System.out.println("Ingrese el mes de nacimiento: ");
        String m= s.nextLine();
        //if's para que el usuario pueda escribir el mes con palabras y aún asi funcione
         if (m.equals("enero")==true || m.equals("Enero")==true)
            m = "01";
         if (m.equals("febrero")==true || m.equals("Febrero")==true)
            m = "02";
         if (m.equals("marzo")==true || m.equals("Marzo")==true)
            m = "03";
         if (m.equals("abril")==true || m.equals("Abril")==true)
            m = "04";
         if (m.equals("mayo")==true || m.equals("Mayo")==true)
            m = "05";
         if (m.equals("junio")==true || m.equals("Junio")==true)
            m = "06";
         if (m.equals("julio")==true || m.equals("Julio")==true)
            m = "07";
         if (m.equals("agosto")==true || m.equals("Agosto")==true)
            m = "08";
         if (m.equals("septiembre")==true || m.equals("Septiembre")==true)
            m = "09";
         if (m.equals("octubre")==true || m.equals("Octubre")==true)
            m = "10";
         if (m.equals("noviembre")==true || m.equals("Noviembre")==true)
            m = "11";
         if (m.equals("diciembre")==true || m.equals("Diciembre")==true)
            m = "12";
           String x = m;
        try{
        z=Integer.valueOf(x);
        if (z>0 && z<13)
        r=1;
        else
        System.out.println("Mes no valido");
        }
        catch(NumberFormatException e){
           System.out.println("Mes no valido");
        }
   }while (r==0);
   String t=Integer.toString(z);
   if(t.length()==1)
   t="0"+t;
   return t;
    }
   
   //Metodo para pedir anio de inicio del empleado
    public static String leerAnoI(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   do{  
        System.out.println("Ingrese el Año en que inicio a trabajar el emplead: ");
        String x= s.nextLine();
        try{
        z=Integer.valueOf(x); 
        if (z>1950 && z<2022)
        r=1;
        else
        System.out.println("Año no valido");
        }
        catch(NumberFormatException e){
           System.out.println("Año no valido");
        }    
   }while (r==0);          
   String t=Integer.toString(z);
   return t;               
    }
    
   //Metodo para pedir numIdentificacion
    public static long leerNumIdentificacion(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el numero de identificacion del empleado: ");
        return s.nextLong();
    }
    
    //Metodo para pedir dia de pago
    public static String leerDiaP(){
        Scanner s=new Scanner(System.in);
      int r=0; 
      int z=0;    
      do{  
        System.out.println("Ingrese el dia en el que se pagara al empleado: ");
        String x= s.nextLine(); 
        try{
         z=Integer.valueOf(x);     
          if (z>0 && z<32)
            r=1;
          else
          System.out.println("Dia no valido"); 
        }
        catch(NumberFormatException e){
           System.out.println("Dia no valido");
           }   
   }while (r==0);          
   String t=Integer.toString(z);
   if(t.length()==1)
      t="0"+t;
   return t;
   }
    
        //Metodo para pedir tipo de regimen
   public static String leerTipoR(){
      Scanner s=new Scanner(System.in);
      int r=0; 
      int z=0;  
      String x=" ";
      int h=0;
      do{     
         try{
            System.out.println("¿Cual es el tipo de regimen que tendra el empleado? , (1) Asalariados , (2) Actividad Empresarial");
             x=s.next();
             h=Integer.valueOf(x);
             if(h>0 && h<3)
                r=1;
             else 
              {
                System.out.println("Regimen no valido");
                r=0;
                } 
           }
           catch(NumberFormatException e){
            System.out.println("Regimen no valido");
            r=0;
           }
           catch(InputMismatchException e){
             System.out.println("Regimen no valido");
              r=0;
           }                        
      }while (r==0);          
      if(h==1)
         return "Asalariados";
         else
         return "Actividad Empresarial";         
         } 
       
    //Metodo para pedir el departamento donde estara el empleado
    public static String leerTipoD(){
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el departamento donde estara el empleado: ");
        return s.nextLine();
    }
    
    //Metodo para pedir el curp del empleado
    public static String leerCurp(){
        Scanner s=new Scanner(System.in);
        int r=0;
        int z=0;
        String x=" ";
        int h=0;
        do{
         try{
          System.out.println("Ingrese el curp del empleado: ");
          x= s.nextLine();
          if(x.length()==18)
             r=1;
          else{
             System.out.println("CURP No valido");
             r=0;
          }
         }
         catch(InputMismatchException e){
            System.out.println("CURP No valido");
            r=0;
         } 
        }while(r==0);
        
      return x;
    }
    
    //Metodo para pedir el numero de seguridad social
    public static String leerNss(){
        Scanner s=new Scanner(System.in);
        int r=0;
        int z=0;
        String x=" ";
        int h=0;
        do{
         try{
          System.out.println("Ingrese el Numero de Seguridad Social del empleado (NSS): ");
          x= s.nextLine();
          if(x.length()==11)
             r=1;
          else{
             System.out.println("NSS No valido");
             r=0;
          }
         }
         catch(InputMismatchException e){
            System.out.println("NSS No valido");
            r=0;
         } 
        }while(r==0);
        return x;
    }
    
    //Metodo para pedir el salario integrado del empleado
    public static int leerSalarioIntegrado(){
         Scanner s=new Scanner(System.in);
         int r=0; 
         int z=0;  
         String x=" ";
         int h=0;
         do{  
      try{
       System.out.println("Ingrese el salario integrado del empleado: ");
       x= s.next();
       h=Integer.valueOf(x);
       if(h>0)
         r=1;
       else{
           System.out.println("Salario no valido");
           r=0;
           }   
       }
       catch(NumberFormatException e){
            System.out.println("Salario no valido");
            r=0;
       }
       catch(InputMismatchException e){
            System.out.println("Salario no valido");
            r=0;
       }                      
    }while (r==0);          
    return h;   
    }

    //Metodo para pedir el banco en donde pertence empleado
    public static String leerBanco(){
    Scanner s=new Scanner(System.in);
    int r=0; 
    int z=0;  
    String x=" ";
    int h=0;
    do{  
      try{
         System.out.println("Ingrese el banco donde pertenece el empleado: (1)Santander, (2)BBVA, (3)Banregio, (4)Banamex, (5)Afirme ");
         x= s.next();
         h=Integer.valueOf(x);
         if(h>0 && h<6)
            r=1;
         else{
             System.out.println("Banco no valido");
             r=0;
         }
      }
      catch(NumberFormatException e){
            System.out.println("Banco no valido");
            r=0;
      }
      catch(InputMismatchException e){
           System.out.println("Banco no valido");
           r=0;
      }                         
   }while (r==0);          
   if(h==1)
      return "Santander";
      else if(h==2)
      return "BBVA";
         else if(h==3)
         return "Banregio";  
            else if(h==4)
               return "Banamex";
               else 
               return "Afirme";        
        
   } 
    
    //Metodo para pedir el tipo de nomina
    public static String leerTipoNomina(){
    Scanner s=new Scanner(System.in);
    int r=0; 
    int z=0;  
    String x=" ";
    int h=0;
    do{  
       try{
          System.out.println("Tipo de nomina que tendra el empleado: (1)Semanal, (2)Quincenal, (3)Mensual ");
           x= s.next();
           h=Integer.valueOf(x);
           if(h>0 && h<4)
                r=1;
           else{
             System.out.println("Banco no valido");
              r=0;
            }  
       }
       catch(NumberFormatException e){
            System.out.println("Banco no valido");
            r=0;
       }
       catch(InputMismatchException e){
              System.out.println("Banco no valido");
              r=0;
       }                           
   }while (r==0);          
   if(h==1)
      return "Semanal";
      else if(h==2)
      return "Quincenal";
         else 
         return "Mensual";  
    }            
        
    
    //Metodo para pedir el tipo de contrato
    public static String leerTipoContrato(){
    Scanner s=new Scanner(System.in);
    int r=0; 
    int z=0;  
    String x=" ";
    int h=0;
    do{  
      try{
          System.out.println("Tipo de contrato que tendra el empleado: (1)Indefinido, (2)Temporal");
          x= s.next();
          h=Integer.valueOf(x);
          if(h>0 && h<3)
             r=1;
          else{
              System.out.println("Tipo de contrato no valido");
              r=0;
          }
       }
       catch(NumberFormatException e){
            System.out.println("Tipo de contrato no valido");
            r=0;
       }
       catch(InputMismatchException e){
            System.out.println("Tipo de contrato no valido");
            r=0;
       }                           
    }while (r==0);          
    if(h==1)
      return "Indefinido";
      else 
      return "Temporal"; 
    }
    
    //Metodo para pedir el salario base del empleado
    public static int leerSalarioBase(){
    Scanner s=new Scanner(System.in);
    int r=0; 
    int z=0;  
    String x=" ";
    int h=0;
    do{  
      try{
       System.out.println("Ingrese el salario base del empleado: ");
       x= s.next();
       h=Integer.valueOf(x);
       if(h>0)
         r=1;
       else{
           System.out.println("Salario no valido");
           r=0;
           }   
       }
       catch(NumberFormatException e){
            System.out.println("Salario no valido");
            r=0;
       }
       catch(InputMismatchException e){
            System.out.println("Salario no valido");
            r=0;
       }                      
    }while (r==0);          
    return h;   
    }
    
    //Metodo para pedir el areaLaboral
    public static String leerAreaLab(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   String x=" ";
   int h=0;
   do{  
      try{
      System.out.println("En que area trabajara el empleado (1)Exterior, (2)Oficina, (3)Repartidor: ");
      x= s.next();
      h=Integer.valueOf(x);
      if(h>0 && h<4)
         r=1;
      else{
           System.out.println("Area no valida");
           r=0;
      }    
      }
      catch(NumberFormatException e){
           System.out.println("Area no valida");
           r=0;
      }
            catch(InputMismatchException e){
              System.out.println("Area no valida");
              r=0;
            }                       
   }while (r==0);          
   if(h==1)
      return "Exterior";
      else if(h==2)
      return "Oficina";
         else 
         return "Repartidor";          
      }  
    
    //Metodo para pedir el areaEncargada
    public static String leerAreaEncargada(){
        Scanner s=new Scanner(System.in);
   int r=0; 
   int z=0;  
   String x=" ";
   int h=0;
   do{     
      try{
         System.out.println("De que area se encargara el empleado (1)Exterior, (2)Oficina, (3)Repartidres: ");
          x=s.next();
          h=Integer.valueOf(x);
          if(h>0 && h<4)
             r=1;
          else 
           {
             System.out.println("Area no valida");
             r=0;
             } 
        }
        catch(NumberFormatException e){
         System.out.println("Area no valida");
         r=0;
        }
        catch(InputMismatchException e){
          System.out.println("Area no valida");
           r=0;
        }                        
   }while (r==0);          
   if(h==1)
      return "Exterior";
      else if(h==2)
      return "Oficina";
         else 
         return "Repartidores";          
      }  
}    
