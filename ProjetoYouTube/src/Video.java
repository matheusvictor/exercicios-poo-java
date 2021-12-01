
public class Video implements AcoesVideo {
	
	private int views;
	private int curtidas;
	private String titulo;
	private int avaliacao;
	private boolean reproduzindo;
	
	// método construtor inicializando valores padrões aos atributos
	public Video(String titulo) {
		this.titulo = titulo;
		this.views = 0;
		this.curtidas = 0;
		this.avaliacao = 0;
		this.reproduzindo = false;		
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int media;
		media = (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = media;
	}
	
	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	// Sobrescrista dos métodos da Interface 
	@Override
	public void play() {
		this.reproduzindo = true;		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;		
	}

	@Override
	public void like() {
		this.curtidas ++;		
	}

	// Sobrescrita do método toString
	@Override
	public String toString() {
		return "Video [ titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", titulo=" + titulo + ", avaliacao=" + avaliacao
				+ ", reproduzindo=" + reproduzindo + "]";
	}

}