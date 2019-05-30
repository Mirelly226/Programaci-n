
public class Main {	
	public static void main(String[] args) {
		
		FiguraGeometrica Cuadrado = new FiguraGeometrica(2.6, 2.6, 6.76, 4);

		System.out.println("Altura = " + Cuadrado.getAltura());
		System.out.println("Ancho = " + Cuadrado.getAncho());
		System.out.println("Area = " + Cuadrado.getArea());
		System.out.println("Numero de Lados = " + Cuadrado.getNumeroDeLados());
	}
}