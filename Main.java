//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
  ///  public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    ///    System.out.printf("Hello and welcome!");

   ///     for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    ///        System.out.println("i = " + i);
   ///     }
  ///  }
///} ...
public class ConversorMonedas {
    // Definir tasas de cambio (ejemplo)
    private static final double EUR_USD = 1.12;
    private static final double EUR_GBP = 0.87;
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