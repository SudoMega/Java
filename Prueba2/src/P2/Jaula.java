package P2;

public class Jaula {

	Animal[] Animal;
	Animal TipoAnimal;

	
	public Jaula () {
		Animal = null;
		TipoAnimal = null;
	}
	
	public void IngresarAnimal(String nombre) {
		
		
		if (nombre == "Mono") TipoAnimal = new Mono();
		else if (nombre == "Leon") TipoAnimal = new Leon();
		else System.out.println("No existe ese animal en este zoologico");
		
	}
			
	public void GetInfoNFC(int nfc) {
		
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
		}
		
	public void GetInfoQR(int qr) {
		
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
	}
	public void GetInfo() {
		
		System.out.println("El " +TipoAnimal.getNombre() +" come " + TipoAnimal.getAlimentacion() + ", crece " +TipoAnimal.getCrecimiento() + " y vive en la " + TipoAnimal.getZonaVive());
		System.out.println(TipoAnimal.getAudio());
	}
	
	
}
