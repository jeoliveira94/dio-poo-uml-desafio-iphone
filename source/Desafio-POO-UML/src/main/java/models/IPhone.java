package models;

public class IPhone implements ReprodutorMusical, Telefone, Navegador {

    private final ReprodutorMusical reprodutorMusical;
    private final Telefone telefone;
    private final Navegador navegador;

    public IPhone(ReprodutorMusical reprodutorMusical, Telefone telefone, Navegador navegador) {
        this.reprodutorMusical = reprodutorMusical;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    @Override
    public void exibirPagina() {
        navegador.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    @Override
    public void tocar(String musica) {
        reprodutorMusical.tocar(musica);
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public String selecionarMusica() {
        return reprodutorMusical.selecionarMusica();
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void antender() {
        telefone.antender();
    }

    @Override
    public void iniciarCorrerioVoz() {
        telefone.iniciarCorrerioVoz();
    }
}
