package modelo.mundo;

public class Fecha {
private int dia;
private int mes;
private int anio;
//Constructor
public Fecha(int pDia,int pMes, int pAnio) {
	dia= pDia;
	mes= pMes;
	anio= pAnio;
	
}
public Fecha() {
	dia=0;
	mes=0;
	anio=0;
}
//Metodo Analizadores
public int getDia() {
	return dia;
}
public int getMes() {
	return mes;
}
public int getAnio() {
	return anio;
}
public void pDia (int dia) {
	if(dia> 0 && dia<32) {
		this.dia=dia;
	}else {
		System.out.println("El dia ingresado es incorrecto");
	}
}
public void pMes (int mes) {
	if(mes> 0 && mes<13) {
		this.mes=mes;
	}else {
		System.out.println("El mes ingresado es incorrecto");
	}
}
public void pAnio (int anio) {
	if(anio>0) {
		this.anio=anio;
	}else {
		System.out.println("El año ingresado es incorrecto");
	}
}
//Metodos Funcionales
public int darDiferenciasEnMeses(Fecha pFecha) {
	int numeroMeses=0;
	int difAnios = pFecha.getAnio();
	int difMes=pFecha.getMes();
	int difDia=pFecha.getDia();
	numeroMeses =12*(difAnios-anio) + (difMes -mes);
	if (difDia<dia)
	{
		numeroMeses--;
	}
		return numeroMeses;
}
public String toString() 
{
	return dia + "-" + mes + "-" +anio;

}
}