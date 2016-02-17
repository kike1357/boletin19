
package boletin19.buzon;

/**
 *
 * @author epastorizalorenzo
 */
public class Correo {
    private String contido;
    private int lido;
    
    public Correo(){ 
    
}

    public Correo(String contido, int lido) {
        this.contido = contido;
        this.lido = lido; 
        
}

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public int getLido() {
        return lido;
    }

    public void setLido(int lido) {
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", lido=" + lido + '}';
    }
    
}
