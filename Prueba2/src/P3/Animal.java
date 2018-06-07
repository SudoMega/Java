package P3;

public class Animal {

	int QR;
	int NFC;
	String Alimentacion;
	String Crecimiento;
	String ZonaVive;
	String Audio;
	String Nombre;
	int puntaje;
	
	public Animal(int qr, int nfc, String alimen, String crec, String zona, String audio, String nombre){
		
		QR = qr;
		NFC = nfc;
		Alimentacion = alimen;
		Crecimiento = crec;
		ZonaVive = zona;
		Audio = audio;
		Nombre = nombre;
		
	}
	
	//Cada uno de estos retorna lo que se le pide, por ejemplo getAlimentacion devuelve la variable alimentacion
	//esto sirve en todos los casos
	public String getAlimentacion() {
		return Alimentacion;
	}
	public String getCrecimiento() {
		return Crecimiento;
	}
	public String getZonaVive() {
		return ZonaVive;
	}
	public String getAudio() {
		return Audio;
	}
	public String getNombre() {
		return Nombre;
	}
public int getQR() {
	return QR;
}
public int getNFC() {
	return NFC;
}
}
