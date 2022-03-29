
package exemplos;

public class Lampada {
    public String cor;
    public int potencia;
    public String marca;
    public String tipo;
 
    //Metodos
    
    public void ligar(){
        System.out.println("Agora está claro! (:"); 
    }
    
    public void impDados(){
        System.out.println("Sua cor é:"+ this.cor);
        System.out.println("Sua cor é:"+ this.potencia+"w");
        System.out.println("Sua cor é:"+ this.marca);
        System.out.println("Sua cor é:"+ this.tipo);
        
        
    }
    
}
