package com.infotrack.topartistasfm.dominio.casosdeuso.artistas;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.datos.repositorios.artista.ArtistaRepositorio;
import com.infotrack.topartistasfm.datos.repositorios.artista.ArtistaRetrofit;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import retrofit2.Call;

public class ConsultaListadoArtistas {

    //region Atributos
    private final ArtistaRepositorio repositorio;
    private String paisTopArtistas;
    private int limiteArtistas;

    //endregion

    //region constructores
    public ConsultaListadoArtistas() {
        repositorio = new ArtistaRetrofit().obtenerClienteRetrofit();
    }
    //endregion

    //region Propiedades
    public void setPaisTopArtistas(String paisTopArtistas) {
        this.paisTopArtistas = paisTopArtistas;
    }

    public void setLimiteArtistas(int limiteArtistas) {
        this.limiteArtistas = limiteArtistas;
    }

    //endregion

    //region CasoDeUso
    public Call<TopDto> obtenerArtistas() {
        return repositorio.obtenerListadoArtistas(Constantes.METODO_ENDPOINT_ARTISTAS, paisTopArtistas, Constantes.API_KEY, Constantes.FORMATO_REST, limiteArtistas);
    }
    //endregion
}
