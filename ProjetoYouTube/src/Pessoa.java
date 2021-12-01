
public abstract class Pessoa {
	
	// Uma Classse abstrata é usada como base para criar outras Classes. Ela não pode ser instanciada
	// Os atributos sendo protegido só podem ser acessados por ela mesma e pelas Classes que a herda
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.experiencia = 0;
	}

	protected void ganharExp() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

}
