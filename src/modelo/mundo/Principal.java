package modelo.mundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Empleado empleado1=null;
	String nombreEmpleados;
	String apellidoEmpleados;
	String genero;
	double salario;
	int dia=0, mes=0,anio=0;
	int opcion=0;
	Scanner ingreso = new Scanner (System.in);
	Fecha fechaNacimiento = null;
	Fecha fechaIngresos;
   //Opciones del Empleado
	boolean salir = false;
    
    while(!salir) {
    System.out.println("************************************************");
    System.out.println("************MENU DE OPCIONES****************");
    System.out.println("************************************************");
	System.out.println("        1.<-Ingresar datos del empleado");
	System.out.println("        2.<- Calcular la edad del empleado");
	System.out.println("        3.<-Calcular la antiguedad del empleado en la empresa");
	System.out.println("        4.<-Calcular las prestaciones del empleado");
	System.out.println("        5.<-Mostrar la informacion del empleado");
	System.out.println("        6. <-Salir");
	System.out.println("************************************************");
	System.out.println("        Ingrese un de las opciones");
	System.out.println("************************************************");
	opcion=ingreso.nextInt();
	
	switch(opcion) {
	
	
	case 1:
		System.out.println("*********************************************************");
			try {
		System.out.println("*********************************************************");
			System.out.println("         Ingrese los datos del Empleado");
		System.out.println("*********************************************************");
			System.out.println("Nombre: ");
			nombreEmpleados= ingreso.next();
			}catch (InputMismatchException e) {
				System.out.println("Ingrese datos correctos: ");
				nombreEmpleados=ingreso.next();
				
			}
		
			System.out.println("Apellido: ");
			apellidoEmpleados=ingreso.next();
			System.out.println("Género :");
			genero=ingreso.next();
		
	do {
		try {
	
			System.out.println("Ingrese su dia de Nacimiento: ");
			dia=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			dia=0;
			ingreso.nextInt();
		}
	}while(dia<0);
	do {
		try {
			System.out.println("Ingrese su mes de Nacimiento: ");
			mes=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			mes=0;
			ingreso.nextInt();
		}
	}while(mes<0);
	do {
		try {
			System.out.println("Ingrese su anio de Nacimiento: ");
			anio=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			anio=0;
			ingreso.nextInt();
		}
	}while(anio<=1885);	
			fechaNacimiento=new Fecha (dia,mes,anio);
	do {
		try {
			System.out.println("Salario: ");
			salario=ingreso.nextDouble();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			salario=0;
			ingreso.nextInt();
		}
	}while(salario<=385);
	do {
		try {
			System.out.println("Ingrese su dia de Ingreso: ");
			dia=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			dia=0;
			ingreso.nextInt();
		}
	}while(dia<0);	
	do {
		try {
			System.out.println("Ingrese su mes de Ingreso: ");
			mes=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			mes=0;
			ingreso.nextInt();
		}
	}while(mes<0);	
	do {
		try {
			System.out.println("Ingrese su anio de Ingreso: ");
			anio=ingreso.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese datos correctos: ");
			anio=0;
			ingreso.nextInt();
		}
	}while(anio<=1885);	
			fechaIngresos=new Fecha (dia,mes,anio);
			empleado1=new Empleado(nombreEmpleados, apellidoEmpleados, genero,"", salario,fechaIngresos,fechaNacimiento);
		break;
		
	case 2:
		System.out.println("*********************************************************");
		System.out.println("             Usted ha escogido la opción 3");
		System.out.println("*********************************************************");
		System.out.println("La edad del empleado es:");
	
		fechaNacimiento=new Fecha (dia,mes,anio);
		
		System.out.println(empleado1.calcularEdad());
		break;
	case 3:
		System.out.println("*********************************************************");
		System.out.println("             Usted ha escogido la opción 3");
		System.out.println("*********************************************************");
			System.out.println("La antiguedad del empleado es:");
			
			System.out.println(empleado1.calcularAntiguedad());
    	   
		
		break;
	case 4:
		System.out.println("*********************************************************");
		System.out.println("             Usted ha escogido la opción 4");
		System.out.println("*********************************************************");
		
			System.out.println(empleado1.calcularPrestaciones());
		
		break;
	case 5:
		System.out.println("*********************************************************");
		System.out.println("            Usted ha escogido la opción 5");
		System.out.println("*********************************************************");
		empleado1.mostrarInformacion();
		break;
	case 6: 
		System.out.println("*********************************************************");
		System.out.println("              Gracias por su ingreso");
		System.out.println("*********************************************************");
		salir=true;
		break;
	default:
		System.out.println("*********************************************************");
		System.out.println("           Eliga un numero del 1 al 6");
		System.out.println("*********************************************************");
	}
	
  }
	
}
}