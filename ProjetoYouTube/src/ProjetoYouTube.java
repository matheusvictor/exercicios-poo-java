
public class ProjetoYouTube {

	public static void main(String[] args) {
		
		// vetor do tipo Video 
		Video videos[] = new Video[3];
		
		videos[0] = new Video("Aula 1 de POO");
		videos[1] = new Video("Aula 12 de PHP");
		videos[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(videos[0].toString());
		videos[0].like();
		
		Gafanhoto aprendiz[] = new Gafanhoto[2];
		
		aprendiz[0] = new Gafanhoto("Matheus", 23, "M", "math");
		System.out.println(aprendiz[0].toString());
		
		Visualizacao visualizacoes[] = new Visualizacao[5];
		
		visualizacoes[0] = new Visualizacao(aprendiz[0], videos[0]);
		visualizacoes[1] = new Visualizacao(aprendiz[0], videos[2]);
		
		System.out.println(visualizacoes[0].toString());

	}

}
