public class FiguraGeometrica {

	double altura;
	double ancho;
	double area;
	int NumeroDeLados;
	
	public FiguraGeometrica(double altura, double ancho, double area, int numeroDeLados) {
		this.altura = altura;
		this.ancho = ancho;
		this.area = area;
		NumeroDeLados = numeroDeLados;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumeroDeLados() {
		return NumeroDeLados;
	}
	public void setNumeroDeLados(int numeroDeLados) {
		NumeroDeLados = numeroDeLados;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [altura=" + altura + ", ancho=" + ancho + ", area=" + area + ", NumeroDeLados="
				+ NumeroDeLados + "]";
	}
}
