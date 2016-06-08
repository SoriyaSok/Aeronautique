package aeronautique;

import java.util.GregorianCalendar;

public class Vol {

	private int numVol;
	private String villeDep; 
	private String villeArr;
	private int numPil;
	private int numAv;
	private GregorianCalendar hDep; 
	private GregorianCalendar hArr;

	//--------------- constructeur de vol ---------------------------
	public Vol(int numVol, String villeDep, String villeArr, int numPil, int numAv, GregorianCalendar hDep,
			GregorianCalendar hArr) {
		super();
		this.numVol = numVol;
		this.villeDep = villeDep;
		this.villeArr = villeArr;
		this.numPil = numPil;
		this.numAv = numAv;
		this.hDep = hDep;
		this.hArr = hArr;
	}
	//--------- méthode toString --------------------------------
	@Override
	public String toString() {
		return "Vol [numVol=" + numVol + ", villeDep=" + villeDep + ", villeArr=" + villeArr + ", numPil=" + numPil
				+ ", numAv=" + numAv + ", hDep=" + hDep + ", hArr=" + hArr + "]";
	}

	//------------------ GETTERS et SETTERS ------------------------

	public int getNumVol() {
		return numVol;
	}
	public void setNumVol(int numVol) {
		this.numVol = numVol;
	}
	public String getVilleDep() {
		return villeDep;
	}
	public void setVilleDep(String villeDep) {
		this.villeDep = villeDep;
	}
	public String getVilleArr() {
		return villeArr;
	}
	public void setVilleArr(String villeArr) {
		this.villeArr = villeArr;
	}
	public int getNumPil() {
		return numPil;
	}
	public void setNumPil(int numPil) {
		this.numPil = numPil;
	}
	public int getNumAv() {
		return numAv;
	}
	public void setNumAv(int numAv) {
		this.numAv = numAv;
	}
	public GregorianCalendar gethDep() {
		return hDep;
	}
	public void sethDep(GregorianCalendar hDep) {
		this.hDep = hDep;
	}
	public GregorianCalendar gethArr() {
		return hArr;
	}
	public void sethArr(GregorianCalendar hArr) {
		this.hArr = hArr;
	}




}
