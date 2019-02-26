package tadexercicio;

public class TADExercicio {

    public static void main(String[] args) {
        
        Coordenadas p1 = new Coordenadas(2,3);
        Coordenadas p2 = new Coordenadas(6,7);
        Coordenadas p3 = new Coordenadas(2,2);
        
        //System.out.println("x de p1: " + p1.getX());
        //System.out.println("y de p1: " + p1.getY());
        //p1.alteraCoordenadas();
        //System.out.println("x de p1: " + p1.getX());
        //System.out.println("y de p1: " + p1.getY());
        

        System.out.println("Distancia: " + p1.retornaDistancia(p2));
        System.out.println("Alinhamento: " + p1.alinhamento(p2, p3));
        
        
        
        
    }
    
}
