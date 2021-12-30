import java.io.*;

class ArchSecuencial2{
   public static void main(String args[]){
      String amigo;
      String tel;
      try{
         File f=new File("c:\\Users\\Oscar\\Documents\\Universidad\\3 Tercer Semestre\\Programación Intermedia\\Amigos.txt");
         FileInputStream f2=new FileInputStream(f);
         InputStreamReader f3=new InputStreamReader(f2);
         BufferedReader f4=new BufferedReader(f3);
         for(int i=1; i<=5; i++){
            amigo=f4.readLine();
            tel=f4.readLine();
            System.out.println("Nombre de amigo: "+amigo+"\tTelefono: "+tel);
         }
         f4.close();
      }
      catch(IOException e){
         System.out.println("Error en archivo");
      }
   }   
}
