package exemplos;

public class Televisao {
    public int polegadas;
    public int resolucao;
    public String marca;
    public String tipo;
 
    //Metodos
    
    public void ligar(){
        System.out.println("Vamos Assistir TV! (:"); 
    }
    
    public void impDados(){
        System.out.println("Sua cor é:"+ this.polegadas+"pol");
        System.out.println("Sua cor é:"+ this.resolucao+"K");
        System.out.println("Sua cor é:"+ this.marca);
        System.out.println("Sua cor é:"+ this.tipo);
        
        
    }
    
}