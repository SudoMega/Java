package P1;


/**
 * Cada animal tiene un codigo QR y un NFC, son del tipo int para simplificar
 * el programa crea 3 jaulas vacias, luego las llena con animales, 1 por ahora
 * luego le pide la info dependiendo de la jaula en donde se encuentra el usuario
 */
public class Wrapper {

	public static void main(String[] args) {
Jaula jaula1 = new Jaula();	
Jaula jaula2 = new Jaula();
Jaula jaula3 = new Jaula();
	
jaula1.IngresarAnimal("Mono");
jaula2.IngresarAnimal("Leon");
jaula3.IngresarAnimal("Raton"); //este se ingresa para probar que no esta en la base de datos

//Ingresamos codigos QR en la jaula en la que estamos
jaula1.GetInfoQR(1);
jaula2.GetInfoQR(2);

//Ingresamos el Token en la jaula donde nos encontramos
jaula1.GetInfoNFC(1);
jaula2.GetInfoNFC(2);



	}
	
}
