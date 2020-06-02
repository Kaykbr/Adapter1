package Adapter;

public class Run {

    
    
    
    public static void main(String[] args) {
        
     
        Dispositivo d = new Pc();
        
        System.out.println("Teste PC \n Aguarde... \n");
        
        
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        

        d = new Adapter();
        
        System.out.println("Teste Tv \n Aguarde... \n");
           
        d.pesquisarFilme();
        d.carregarFilme();
        d.assistirFilme();
        
        
    }
    
}