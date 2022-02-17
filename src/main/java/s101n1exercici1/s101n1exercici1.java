/*Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(),
 que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) .
 Demostra la seqüència d'execució dels mètodes de la classe (no entenc què vol dir això).
 */
package s101n1exercici1;

class Vehicle {

    Vehicle Vehicle1 = new Vehicle();

    static void iniciar() {

    }



    public static void main(String[] args) {
        iniciar();
        int iniciar = 10;


        System.out.println("la velocitat del vehicle és: " + iniciar);
    }
}