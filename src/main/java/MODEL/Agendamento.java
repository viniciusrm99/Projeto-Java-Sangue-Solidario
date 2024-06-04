package MODEL;

import java.sql.Date;

public class Agendamento extends Doador {

    protected String hospital, observacao;
    protected Date data_agendamento, hora_agendamento;

    public Agendamento(int id, String nome) {
        super(id, nome);
    }

    public Agendamento(String hospital, String observacao, Date data_agendamento, Date hora_agendamento, int id, String nome) {
        super(id, nome);
        this.hospital = hospital;
        this.observacao = observacao;
        this.data_agendamento = data_agendamento;
        this.hora_agendamento = hora_agendamento;
    }

    public Agendamento(String hospital, String observacao, Date data_agendamento, Date hora_agendamento, String genero, String estadoCivil, String tipoSangue, String dataNascimento, String nome, String telefone, String email) {
        super(genero, estadoCivil, tipoSangue, dataNascimento, nome, telefone, email);
        this.hospital = hospital;
        this.observacao = observacao;
        this.data_agendamento = data_agendamento;
        this.hora_agendamento = hora_agendamento;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public Date getHora_agendamento() {
        return hora_agendamento;
    }

    public void setHora_agendamento(Date hora_agendamento) {
        this.hora_agendamento = hora_agendamento;
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

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
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

