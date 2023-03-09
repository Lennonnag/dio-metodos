package metodos;
public class Horario {
    public static void obterHora(int hora) {
       
        if (hora >= 5 && hora <= 12)        
        System.out.println("Bom dia");

        if (hora > 12 && hora < 18)        
        System.out.println("Boa tarde");

        if (hora >= 18 && hora <= 24)        
        System.out.println("Boa noite");
        
        
    }
    
}
