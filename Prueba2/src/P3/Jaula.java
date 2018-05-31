package P3;

public class Jaula {

	Animal[] Animal;
	Animal TipoAnimal;

	
	public Jaula () {
		Animal = null;
		TipoAnimal = null;
	}
	
	public void IngresarAnimal(String nombre) {
		//Ingresa un animal a la jaula, esto funciona desde cualquier Wrapper, el solo debe decir el nombre del aliman que se encuentre previamente en la base de datos
		
		if (nombre == "Mono") TipoAnimal = new Mono();
		else if (nombre == "Leon") TipoAnimal = new Leon();
		else System.out.println("No existe ese animal en este zoologico");
		
	}
			
	public void GetInfoNFC(int nfc) {
		//Consigue la informacion del animal
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
		}
		
	public void GetInfoQR(int qr) {
		//Consigue la informacion del animal
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
	}
	public void GetInfo() {
		//Consigue la informacion del animal
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
	}
	
	
}
