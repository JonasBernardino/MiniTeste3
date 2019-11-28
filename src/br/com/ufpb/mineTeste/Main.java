package br.com.ufpb.mineTeste;

public class Main {

	public static void main(String[] args) {

		
		Poligono triangulo = PoligonoFactory.createPoligono(3);
		System.out.println(triangulo.getDescicao());
		
		Poligono quadrado = PoligonoFactory.createPoligono(4);
		System.out.println(quadrado.getDescicao());
		
		Poligono pentagono = PoligonoFactory.createPoligono(5);
		System.out.println(pentagono.getDescicao());

	}

}
