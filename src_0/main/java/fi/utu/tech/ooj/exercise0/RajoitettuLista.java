package fi.utu.tech.ooj.exercise0;

import java.util.ArrayList;

/**
 * RajoitettuLista esittää kokonaislukulistaa, jonka alkioiden summa ei voi ylittää annettua maksimiarvoa.  
 */
public class RajoitettuLista {
	private int maxSumma; // Suurin sallittu listan alkioiden summa
	private ArrayList<Integer> luvut;
	
	/**
	 * Konstruktori - luo uuden RajoitettuLista-olion
	 * @param maksimiSumma Suurin sallittu listan alkioiden summa 
	 */
	public RajoitettuLista(int maksimiSumma) {
		maxSumma = maksimiSumma;
		luvut = new ArrayList<Integer>();
	}
	
	public int annaMaksimiSumma() { return maxSumma; }
	
	public String toString() {
		return luvut.toString();
	}
	
	/**
	 * Palauttaa listan sisältämien alkioiden summan.
	 */
	public void laskeSumma() {
		// Toteuta tämä

		// HUOM! pitäisi myös palauttaa int eikä void

	}
	
	/**
	 * Lisää annetun luvun listaan, mikäli listan alkioiden summa on lisäyksen jälkeen korkeintaan
	 * this.annaMaksimiSumma(). Muussa tapauksessa lista pysyy ennallaan.
	 * 
	 * @param luku Lisättävä luku
	 * @return True, jos luku lisättiin listaan. False, jos lukua ei lisätty.
	 */
	public void lisaa(int luku) {
		// Toteuta tämä

		// HUOM! pitäisi myös palauttaa boolean eikä void
	}
}