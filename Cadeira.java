
package exemplos;

public class Cadeira {
    public String cor;
    public String material;
    public String marca;
    public String tamanho;
 
    //Metodos
    
    public void SubirAssento(){
        System.out.println("Subiu! (:"); 
    }
    
    public void impDados(){
        System.out.println("Sua cor é:"+ this.cor);
        System.out.println("Sua cor é:"+ this.material);
        System.out.println("Sua cor é:"+ this.marca);
        System.out.println("Sua cor é:"+ this.tamanho);
        
        
    }
    
}