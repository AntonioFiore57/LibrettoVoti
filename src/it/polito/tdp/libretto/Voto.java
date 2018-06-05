package it.polito.tdp.libretto;

import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

public class Voto {
	private String nomeCorso;
	private int votoOttenuto;
	private LocalDate data;
	
	public Voto(){} 
	
	public Voto(String nomeCorso, int votoOttenuto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.votoOttenuto = votoOttenuto;
		this.data = data;
	}

	/**
	 * @return the nomeCorso
	 */
	public String getNomeCorso() {
		return nomeCorso;
	}

	/**
	 * @param nomeCorso the nomeCorso to set
	 */
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	/**
	 * @return the votoOttenuto
	 */
	public int getVotoOttenuto() {
		return votoOttenuto;
	}

	/**
	 * @param votoOttenuto the votoOttenuto to set
	 */
	public void setVotoOttenuto(int votoOttenuto) {
		this.votoOttenuto = votoOttenuto;
	}

	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[nomeCorso=" + nomeCorso + ", votoOttenuto=" + votoOttenuto + ", data=" + data + "]";
	}
	
	public String myToString() {
		return "[" + nomeCorso + ";" + votoOttenuto + ";" + data + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		
		
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!( nomeCorso.equalsIgnoreCase(other.nomeCorso)) )
			return false;
		return true;
	}
	
	
}
