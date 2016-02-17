package boletin19.buzon;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Buzon {
    ArrayList<Correo> correo = new ArrayList<Correo>();
    
   public void Buzon(){
       
   }
   
   public int numeroDeCorreos(){
        int numeroDeCorreos=0;
        return numeroDeCorreos = correo.size();
}  
   public void añadirCorreo(Correo C){
     correo.add(C);  
     
}
   public void nonLidos(){
       for(int i=0;i<correo.size();i++)
          if(correo.get(i).getLido()==0){
              System.out.println("Hay correo sin leer");
              break;
}   
}
   public void amosarPrimerNonLido(){
       for(int i=0;i<correo.size();i++)
           if(correo.get(i).getLido()==0){
             System.out.println("Primer correo sin leer"+correo.get(i));
               break;              
               
}        
}
  
   public String amosar(){  
       int k= Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
       String C = correo.get(k).getContido();
       return C;
       
}  
 
   public void eliminar(){
       int k= Integer.parseInt(JOptionPane.showInputDialog("Posición: "));
       correo.remove(k-1);
       
}       
   public String introducir(String i){
        return JOptionPane.showInputDialog("Introduce "+i);
}
}
