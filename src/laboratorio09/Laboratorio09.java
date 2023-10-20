
import java.util.Scanner;




/**
 *
 * @author emers
 */
public class Laboratorio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ancho = 30;
        int altura = 30;

        int tanque1X = 13;
        int tanque1Y = 28;
        int tanque2X = 12;
        int tanque2Y = 29;
        int tanque3X = 13;
        int tanque3Y = 29;
        int tanque4X = 14;
        int tanque4Y = 29;

        int tanqueBalaX = 13;
        int tanqueBalaY = 25;

        char caracter = ' ';
        char caracterTanque = '*';
        char caracterTanqueBala = '|';

        while (true) {
             limpiarPantalla();
             if(tanqueBalaY >=0) tanqueBalaY--;
            
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < ancho; j++) {

                    if (j == tanque1X && i == tanque1Y) {
                        System.out.println(caracterTanque + ' ');
                    } else if (j == tanque2X && i == tanque2Y) {
                        System.out.println(caracterTanque + ' ');
                    } else if (j == tanque3X && i == tanque3Y) {
                        System.out.println(caracterTanque + ' ');
                    } else if (j == tanque4X && i == tanque4Y) {
                        System.out.println(caracterTanque + ' ');
                    } else if (j == tanqueBalaX && i == tanqueBalaY) {
                        System.out.println(caracterTanqueBala + ' ');
                    } else {
                        System.out.println(caracter + " ");
                    }
                }
                System.out.println("\n");

            }
           esperar();
           String letra = sc.next();
           if(letra.equalsIgnoreCase("w")){
               tanque1Y--;tanque2Y--;tanque3Y--;tanque4Y--;
               
           }else if(letra.equalsIgnoreCase("s")){
               tanque1Y++;tanque2Y++;tanque3Y++;tanque4Y++;
           }else if(letra.equalsIgnoreCase("d")){
               tanque1X++;tanque2X++;tanque3X++;tanque4X++;
           }else if(letra.equalsIgnoreCase("a")){
               tanque1X--;tanque2X--;tanque3X--;tanque4X--;
        }
    }
    
   
    public static void esperar()
    {
        try{
            Thread.sleep(1000);
        }catch (Exception s){}
        
    }
    
   

    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception ex) {
        }
        System.out.flush();
    }

}
