package MODEL;

public class Doador extends Pessoa {
    protected String genero, estadoCivil, tipoSangue;
    protected String dataNascimento;


    public Doador(int id, String nome) {
        super(id, nome);
    }

    public Doador(String genero, String estadoCivil, String tipoSangue, String dataNascimento, String nome, String telefone, String email) {
        super(nome, telefone, email);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.tipoSangue = tipoSangue;
        this.dataNascimento = dataNascimento;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
