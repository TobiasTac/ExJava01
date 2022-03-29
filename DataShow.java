
package exemplos;

public class DataShow {
    public String marca;
    public String cor;
    public String resolucao;
    public double luminosidade;
 
    //Metodos
    
    public void Ligar(){
        System.out.println("Projetando! (:"); 
    }
    
    public void impDados(){
        System.out.println("Sua cor é:"+ this.marca);
        System.out.println("Sua cor é:"+ this.cor);
        System.out.println("Sua cor é:"+ this.resolucao);
        System.out.println("Sua cor é:"+ this.luminosidade);
        
        
    }
    
}