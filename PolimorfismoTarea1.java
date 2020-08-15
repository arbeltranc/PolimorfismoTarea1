/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotarea1;

/**
 *
 * @author ALEX BELTRAN
 */

class Sensor{
public void Reconocer(){
System.out.println("Sensores de reconocimiento.\n");
}
}
class Sharp extends Sensor{
public void Reconocer(){
System.out.println("El sensor infrarrojo tipo Sharp detecta la distancia entre el sensor y un objeto.\n");
}
}
class LineTracking extends Sensor{
public void Reconocer(){
System.out.println("El sensor infrarrojo tipo Line Tracking reconoce una línea en el suelo por donde se moverá el vehículo.\n");
}
}
class Lidar extends Sensor{
public void Reconocer(){
System.out.println("El sensor LIDAR LITE de Garmin detecta objetos que se encuentren en su rango de alcance.\n");
}
}
class Ultrasonico extends Sensor{
public void Reconocer(){
System.out.println("El sensor ultrasónico HC-SR04 permite medir distancias mediante ultrasonido.\n");
}
}

public class PolimorfismoTarea1 {
    
    public static void main(String[] args) {
    
        Sensor Objeto1=new Sharp();
        Sensor Objeto2=new LineTracking();
        Sensor Objeto3=new Lidar();
        Sensor Objeto4=new Ultrasonico();
        
        System.out.println("Sensor infrarrojo tipo SHARP.");
        Objeto1.Reconocer();
        System.out.println("Sensor infrarrojo Line Tracking.");
        Objeto2.Reconocer();
        System.out.println("Sensor LIDAR LITE de Garmin.");
        Objeto3.Reconocer();
        System.out.println("Sensor ultrasónico HC-SR04.");
        Objeto4.Reconocer();
        
    }
    
}
