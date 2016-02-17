package boletin19.buzon;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Boletin19Buzon {

    
    public static void main(String[] args) {

        Buzon obj=new Buzon();
        
        
        switch (Integer.parseInt(obj.introducir("la opcion:\n\n1.) Añadir correo\n2.) Ver numero de correos en la bandeja\n3.) Ver si hay correos por leer\n4.) Ver el primer correo no leido\n5.) Ver el correo deseado\n6.) Eliminar correo\n7.) Salir"))) {
           
                case 1:
                    obj.añadirCorreo(null);
                    break;
                case 2:
                    obj.numeroDeCorreos();
                    break;
                case 3:
                    obj.nonLidos();
                    break;
                case 4:
                    obj.amosarPrimerNonLido();
                    break;
                case 5:
                    obj.amosar();
                    break;
                case 6:
                    obj.eliminar();
                    break;
                

                default:
                    break;
                
             
}
}
}