package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private  int episodiosPorTemporada;
    private  int minutosPorCapitulo;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return minutosPorCapitulo * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorCapitulo() {
        return minutosPorCapitulo;
    }

    public void setMinutosPorCapitulo(int minutosPorCapitulo) {
        this.minutosPorCapitulo = minutosPorCapitulo;
    }
}
