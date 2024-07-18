public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       
       System.out.println("A TV está ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: "+ smartTv.volume);
    
        smartTv.ligar();
        System.out.println(" Novo status:::: A TV está ligada? " + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println(" Novo status:::: A TV está ligada? " + smartTv.ligada);
    
        smartTv.diminuirVolume();
        System.out.println(" Novo status:::: Volume atual " + smartTv.volume);
        
        smartTv.mudarCanal(13);
        System.out.println(" Novo status:::: Canal atual " + smartTv.canal);
    

    }
}
