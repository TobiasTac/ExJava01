
package exemplos;

public class ClassePrincipal {
    public static void main(String[] args) {
       Lampada L1 = new Lampada();
       
       System.out.println("----LAMPADA----");
       System.out.println("");
       L1.cor = "Verde";
       L1.marca = "Phillips";
       L1.potencia = 15;
       L1.tipo = "LED";
       L1.ligar();
       L1.impDados();
       
       // LAMPADA
        System.out.println("");
        System.out.println("----TELEVISÂO----");
        System.out.println("");
       Televisao T1 = new Televisao();
       T1.polegadas = 51;
       T1.resolucao = 4;
       T1.marca = "SAMSUNG";
       T1.tipo = "LED";
       T1.ligar();
       T1.impDados();
               System.out.println("");
               System.out.println("----ELEVADOR----");
               System.out.println("");
       Elevador E1 = new Elevador();
       E1.andares = 20;
       E1.corporta = "Preta";
       E1.painel = "Multiopcional";
       E1.tamanho = "500X500cm";
       E1.SubirAndar();
       E1.impDados();
       System.out.println("");
       System.out.println("----CADEIRA----");
      System.out.println(""); 
       Cadeira C1 = new Cadeira();
       C1.cor = "Marrom";
       C1.material = "Plástico";
       C1.marca = "Mondial";
       C1.tamanho = "300X100cm";
       C1.SubirAssento();
       C1.impDados();
       
       System.out.println("");      
       System.out.println("----Aluno----");
       System.out.println("");
       Aluno A1 = new Aluno();
       A1.nome = "Tobias";
       A1.idade = 15;
       A1.cpf = "066-457-173.50"; 
       A1.sexo = "Masculino";
       A1.Escrever();
       A1.impDados();
       System.out.println("");
       System.out.println("----DATA SHOW----");
       System.out.println("");
       DataShow D1 = new DataShow();
       D1.cor = "Branco";
       D1.luminosidade = 3400;
       D1.marca = "EPSON"; 
       D1.resolucao = "1024X768";
       D1.Ligar();
       D1.impDados();
       System.out.println("");
       System.out.println("----MICROONDAS----");
       System.out.println("");
       Microondas M1 = new Microondas();
       M1.cor = "Branco";
       M1.peso = 11;
       M1.marca = "LG"; 
       M1.potencia = 1000;
       M1.Esquentar();
       M1.impDados();
       
       
    }    
}

