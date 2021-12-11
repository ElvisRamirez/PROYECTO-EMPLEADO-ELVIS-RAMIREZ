package modelo.mundo;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Empleado {
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private String genero;// Femenino || Masculino
	private String imagen;
	private double salario ;
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	//Metodo Constructor
	public Empleado() {
		nombreEmpleado = "";
		apellidoEmpleado ="";
		genero ="";
		imagen= "";
		salario=0.0;
		fechaNacimiento= new Fecha ();
		fechaIngreso= new Fecha ();
	}
	//Metodo Constructor con Parametros
	public Empleado(String pnombreEmpleado,String papellidoEmpleado,String pGenero,String pImagen,double pSalario,Fecha pFechaN,Fecha pFechaI) {
		
		nombreEmpleado = pnombreEmpleado;
		apellidoEmpleado =papellidoEmpleado;
		genero =pGenero;
		imagen= pImagen;
		salario=pSalario;
		fechaNacimiento=pFechaN;
		fechaIngreso=pFechaI;
	}
	//Metodos analizadores
	public String getNombre() {
		return nombreEmpleado;
	}
	public String getApellido() {
		return apellidoEmpleado;
		
	}
    public String getGenero() {
    	return genero;
    }
    public Fecha getFechaNacimiento() {
    	return fechaNacimiento;
    }
    public Fecha getFechaIngreso() {
    	return fechaIngreso;
    }
    public String getImagen() {
    	return imagen;
    }
    public double getSalario() {
    	return salario;
    }
    public Fecha getFechaActual() {
    	GregorianCalendar gc =new GregorianCalendar();
    	int dia = gc.get(Calendar.DAY_OF_MONTH);
    	int mes =gc.get(Calendar.MONTH);
    	int anio= gc.get(Calendar.YEAR);
    	Fecha fechaActual = new Fecha(dia,mes,anio);
    	return fechaActual;
    }
    //Metodos setters
    public void setEmpleado(String pnombreEmpleado,String papellidoEmpleado,String pGenero,String pImagen,double pSalario) {
    	nombreEmpleado = pnombreEmpleado;
		apellidoEmpleado =papellidoEmpleado;
		genero =pGenero;
		imagen= pImagen;
		salario=pSalario;
    }
    public void setSalario( double pSalario) {
    	salario= pSalario;
    }
    //Metodos funcionales
    public int calcularAntiguedad () {
    	Fecha fechaActual = getFechaActual( );
    	
    	int antiguedad = fechaNacimiento.darDiferenciasEnMeses(fechaActual) / 12;
    	return antiguedad;
    }
    //Metodos funcionales 
    public int calcularEdad () {
    	
    	int edad= fechaIngreso.darDiferenciasEnMeses(getFechaActual()) / 12;
    	return edad;
    }
    //Metodos funcionales Prestaciones
    public double calcularPrestaciones ()
    
    {
    	int antiguedad=calcularAntiguedad();
    	double prestaciones =((double)(antiguedad*salario));
    	return prestaciones;
    }
   
    public void mostrarInformacion(){
    	System.out.println("Datos del Empleado");
		System.out.println("Nombre: " + nombreEmpleado);
		System.out.println("Apellido: " + apellidoEmpleado);
		System.out.println("Genero: " + genero);
		System.out.println("Edad:"+  calcularEdad());
		System.out.println("Salario: " + salario);
		System.out.println("Prestaciones: " + calcularPrestaciones());
		System.out.println("Antiguedad: " + calcularAntiguedad());
    	
    	
    }
}