import java.time.LocalDate;

class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }
}