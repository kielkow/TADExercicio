package tadexercicio;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class Coordenadas implements Interface{
    
    private double x,y;

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Coordenadas() {
    }
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void alteraCoordenadas() {
        this.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de x:")));
        this.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite valor de y:")));
    }

    @Override
    public double retornaDistancia(Coordenadas p2) {
        
        double distancia = 0;
        double deltaX = p2.x - this.x;
        double deltaY = p2.y - this.y;
         
        deltaX = pow(2,deltaX);
        deltaY = pow(2,deltaY);
        
        distancia = deltaX + deltaY;
        
        return Math.sqrt(distancia);
    }

    @Override
    public boolean alinhamento(Coordenadas p2, Coordenadas p3) {
        
        double tg1 = (p2.getY() - this.getY()) / (p2.getX() - this.getX());
        double tg2 = (p3.getY() - this.getY()) / (p3.getX() - this.getX());

        
        return tg1 == tg2;

       
    }
    
    
    
}
