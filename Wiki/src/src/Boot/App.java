package Boot;

import java.util.List;

import guitarStore.Builder;
import guitarStore.Guitar;
import guitarStore.GuitarSpecs;
import guitarStore.Inventory;
import guitarStore.Type;
import guitarStore.Wood;

public class App {
	public static void main(String[] args) {
		Inventory inventario = new Inventory();
		InicializaInventario(inventario);

		GuitarSpecs pedido = new GuitarSpecs("", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

		List<Guitar> oferta = inventario.search(pedido);
		if (!oferta.isEmpty()) {
			for (Guitar guitar : oferta) {
				GuitarSpecs spec = guitar.getGuitarSpecs();
				System.out.println("Hola creo que le puede gustar esta: " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " en $" + guitar.getPrice());	
			}			
		} else {
			System.out.println("Lo siento, no tenemos lo que pide!");
		}
	}

	private static void InicializaInventario(Inventory inventario) {
		GuitarSpecs spec1 = new GuitarSpecs("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
		inventario.addGuitar("V594241", spec1, 1449.95d);
		
		GuitarSpecs spec2 = new GuitarSpecs("Martin", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 10);
		inventario.addGuitar("V594441", spec2, 2349.95d);
		
		GuitarSpecs spec3 = new GuitarSpecs("Stratocastor", Builder.FENDER, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 12);
		inventario.addGuitar("B474564", spec3, 865.0d);		
	}
}
