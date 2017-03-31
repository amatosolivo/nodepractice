package guitarStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	public void addGuitar(String serialNumber, GuitarSpecs guitarSpecs, double price) {
		Guitar guitar = new Guitar(serialNumber, guitarSpecs, price);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = iterator.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpecs searchSpecs) {
		List<Guitar> maches = new ArrayList<Guitar>();
		for (Iterator<Guitar> iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = iterator.next();
			
			//Se extrajo la comparacion para hacerla donde debe hacerce en la clase de specs
			if (guitar.getGuitarSpecs().matches(searchSpecs)) {
				maches.add(guitar);
			}
		}
		return maches;
	}
}
