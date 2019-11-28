package br.com.ufpb.mineTeste;

public class PoligonoFactory {

	public static Poligono createPoligono (int num) {
		if (num == 3) {
			return new Triangulo();
		}else if(num == 4 ) {
			return new Quadrado();
		}else if(num == 5) {
			return new Pentagono();
		}
		return null;
	}

}
