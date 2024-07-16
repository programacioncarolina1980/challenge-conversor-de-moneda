
public class ConversorMonedas {
    // Definir tasas de cambio (ejemplo)
    private static final double EUR_USD = 1.12;
    private static final double EUR_GBP = 1.00;
// Más tasas de cambio según necesites...
// Método para convertir de EUR a USD
public double convertirEURaUSD(double cantidadEUR) {
    return cantidadEUR * EUR_USD;
}

       // Método para convertir de EUR a GBP
       public double convertirEURaGBP(double cantidadEUR) {
           return cantidadEUR * EUR_GBP;
       }

       // Método principal para probar el conversor
       public static void main(String[] args) {
           ConversorMonedas conversor = new ConversorMonedas();

           double cantidadEUR = 100.0;
           double cantidadUSD = conversor.convertirEURaUSD(cantidadEUR);
           double cantidadGBP = conversor.convertirEURaGBP(cantidadEUR);

           System.out.println(cantidadEUR + " EUR equivale a " + cantidadUSD + " USD");
           System.out.println(cantidadEUR + " EUR equivale a " + cantidadGBP + " GBP");
       }
   }
