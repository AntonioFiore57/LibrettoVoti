package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto(){
		voti = new ArrayList<>();
	}
	
	public void add(Voto v){
		voti.add(v);
	}
	
	public Voto get(int i){
		return voti.get(i);
	}
	
	public int esamePresente(String corso){
		Voto v = new Voto();
		v.setNomeCorso(corso);
		int i = voti.indexOf(v);
		return i;
	}
	
	public boolean esamePresente(String corso, int voto){
		boolean presente = false;
		Voto v = new Voto();
		v.setNomeCorso(corso);
		int i = voti.indexOf(v);
		if(i != -1 && voti.get(i).getVotoOttenuto() == voto){
			presente =  true;
		}
		
		return presente;
	}
}
