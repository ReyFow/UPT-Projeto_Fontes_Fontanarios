/**
 * 
 */
package fontes_e_fontanarios;

/**
 * @author grupo4
 *
 */
public class Fontes_Fontanarios {
	private boolean tipo;
	private String nome;
	private String localizacao;
	private String anoConstrucao;
	private String historia;
	private String rating; 
	/**
	 * @param tipo
	 * @param nome
	 * @param localizacao
	 * @param ano
	 * @param historia
	 */
	public Fontes_Fontanarios(boolean tipo, String nome, String localizacao, String ano, String historia, String rating) {
		this.tipo = tipo;
		this.nome = nome;
		this.localizacao = localizacao;
		this.anoConstrucao = ano;
		this.historia = historia;
		this.rating = rating;
	}
	/**
	 * @return the tipo
	 */
	public boolean isTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the localizacao
	 */
	public String getLocalizacao() {
		return localizacao;
	}
	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	/**
	 * @return the anoConstrucao
	 */
	public String getAnoConstrucao() {
		return anoConstrucao;
	}
	/**
	 * @param anoConstrucao the anoConstrucao to set
	 */
	public void setAnoConstrucao(String anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}
	/**
	 * @return the historia
	 */
	public String getHistoria() {
		return historia;
	}
	/**
	 * @param historia the historia to set
	 */
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
}
