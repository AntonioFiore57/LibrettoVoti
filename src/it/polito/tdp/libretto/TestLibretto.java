package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.Random;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto lib = new Libretto();
		Voto[] testVoti = new Voto[10];
		
		Voto v;
		/* Punto 1 - Creazione di 10 voti ed inserimeto nel libretto*/
		for(int i = 0; i < 10; i++){
			v = generaEsame();
			testVoti[i] = v;
			lib.add(v);
		}
		
		// verifica
		System.out.printf("\n\nPunto 1\n");
		System.out.printf("Esame aspettato\t\tEsame inserito\n");
		for(int i = 0; i < 10; i++){
			System.out.printf("%s\t\t%s\n", testVoti[i], lib.get(i));
			
		}
		
		
		/* Punto 2*/
		System.out.printf("\n\nPunto 2\n");
		for(int i = 0; i < 10; i++){
			v = lib.get(i);
			if(v.getVotoOttenuto() >= 25){ // variazione sulla traccia invece di == 
				System.out.printf("%s\n",v );
			}
		}
		
		/* Punto 3*/
		System.out.printf("\n\nPunto 3\n");
		// verifichiamo  la presenza di un esame certamente presente
		
		v = testVoti[5];
		
		int t = lib.esamePresente(v.getNomeCorso());
		if(t != -1){
			System.out.printf("Esame cercato: %s\tEsame trovato: %s\n", v.getNomeCorso(), lib.get(t));
			
		}
		else{
			System.out.printf("Errore. L'esame %s non e' stato trovato\n", v.getNomeCorso());
		}
		
		// verifichiamo  la presenza di un esame certamente NON presente
		String s = "Esegesi degli insulti";
		 t = lib.esamePresente(s);
		if(t == -1){
			System.out.printf("Esame: %s NON presente\n", s );
			
		}
		else{
			System.out.printf("Errore. L'esame %s risulta PRESENTE\n", s);
		}
		
		/* Punto 4*/
		System.out.printf("\n\nPunto 4\n");
		// aggiungiamo alla fine il primo esame per testare il metodo
		lib.add(testVoti[0]);
		boolean trovato = lib.esamePresente(testVoti[0].getNomeCorso(), testVoti[0].getVotoOttenuto());
		if(trovato){
			System.out.printf("Esame duplicato %s\n", testVoti[0]);
		}
		
		/* Punto 5*/
		System.out.printf("\n\nPunto 5\n");
		trovato = lib.esamePresente(testVoti[2].getNomeCorso(), 45);
		if(!trovato){
			System.out.printf("Esampe presente con voto diverso %s\n", testVoti[2]);
		}
		
	}

	private static Voto generaEsame(){
		
		Random numEsame = new Random();
		Random mese = new Random();
		Random giorno = new Random();
		Random risultato = new Random();
		
		String corso = "Esame_" + String.format("%2d", numEsame.nextInt(20) + 1);
		int risultatoEsame = 18 + risultato.nextInt(12);
		LocalDate dataEsame = LocalDate.of(2018, 1 + mese.nextInt(12), 1+ giorno.nextInt(30));
		
		Voto v = new Voto(corso, risultatoEsame, dataEsame);
		
		return v;

		
	}
}
