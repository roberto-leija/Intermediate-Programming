import java.io.*;
import java.util.*;
import java.util.Random;

class Anio{
   
   private Mes m[];
   private String num;
   
   public Anio(Mes m[], String num){
      setMes(m);
      setNum(num);
   }
   
   public void setMes(Mes m[]){
   this.m=m;}
   public Mes[] getMes(){
   return m;}
   
   public void setNum(String num){
   this.num=num;}
   public String getNum(){
   return num;}
   
   public String toString(){
            byte cero=1;
      double masAlto=0;
      
      for (int j=0;j<12;j++){
         if (cero==1){
            masAlto=m[j].getTemp();
            cero=2;
         }
         else{
            if (m[j].getTemp()>masAlto)
               masAlto = m[j].getTemp();
         } 
      }
      
      int cont = 0;
      for (int x=0;x<12;x++){
         if (m[x].getTemp()==masAlto)
            cont+=1;
      }
      
      String[] mesesAltos=new String[cont];
      byte lugar = 0;
      for (int y=0;y<12;y++){
         if (m[y].getTemp()==masAlto){
            mesesAltos[lugar] = m[y].getNombreM();
            lugar+=1;
         }
      }

      System.out.println("\nPromedio de temperaturas del Año "+num+"\n");
      System.out.println(" -Mes-"+"\t\t  -PromTemp-"+"\n");
      for (int i=0;i<12;i++)
         System.out.println(m[i]);
      
      System.out.println("\n---La temperatura mas alta fue en: ---");
      for (int a=0;a<cont;a++){
         System.out.println("\n"+mesesAltos[a]);
      }
      
      return "\n -Tienen una temperatura de: "+masAlto;
   }
   
   

}

class Mes{
   private double temp;
   private String nombreM;
   
   public Mes (double temp, String nombreM){
      setTemp(temp);
      setNombreM(nombreM);
   }
   
   public void setTemp(double temp){
      this.temp=temp;}
   public double getTemp(){
      return temp;}
   
   public void setNombreM(String nombreM){
      this.nombreM=nombreM;}
   public String getNombreM(){
      return nombreM;} 
   
   public String toString(){
      
      return nombreM+"\t\t"+temp+"\n";
   }
}

class Principal{
   public static void main(String[] args){
      Mes[] mes = leerPT();
      Anio anio=new Anio(mes,"2020");
      System.out.println(anio);
   }
   
   //Metodo para pedir temperatura
	public static Mes[] leerPT(){
      Scanner s=new Scanner(System.in);
      Mes[] m = new Mes[12];
      
      String[] mm={"Enero    ", "Febrero   ", "Marzo     ", "Abril     ", "Mayo      ", "Junio     ", "Julio     ", "Agosto    ", "Septiembre", "Octubre   ", "Noviembre ", "Diciembre "};
      
      for(int i=0;i<12;i++){
		   System.out.println("Ingrese la temperatura promedio: "+mm[i]);
         m[i]=new Mes(s.nextDouble(),mm[i]);
      }
		return m;
   }
}