
package exemplos;

public class Aluno {
    public String nome;
    public String sexo;
    public int idade;
    public String cpf;
 
    //Metodos
    
    public void Escrever(){
        System.out.println("Escrevendo! ):"); 
    }
    
    public void impDados(){
        System.out.println("Sua cor é:"+ this.nome);
        System.out.println("Sua cor é:"+ this.sexo);
        System.out.println("Sua cor é:"+ this.idade+"anos");
        System.out.println("Sua cor é:"+ this.cpf);
        
        
    }
    
}