
public class Visualizacao {
	
	// Agregração de Classes
	private Gafanhoto espectador;
	private Video filme;
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1); // atualiza o nº de vídeos assistido pelo espectador específico
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);		
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		if(porcentagem <= 20) {
			this.filme.setAvaliacao(3);
		} else if(porcentagem <= 50) {
			this.filme.setAvaliacao(5);			
		} else if(porcentagem <= 90) {
			this.filme.setAvaliacao(8);
		} else {
			this.filme.setAvaliacao(10);
		}
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}	
}
