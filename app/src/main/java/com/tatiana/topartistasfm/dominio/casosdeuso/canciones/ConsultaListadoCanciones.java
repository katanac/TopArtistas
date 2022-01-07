package com.infotrack.topartistasfm.dominio.casosdeuso.canciones;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.datos.repositorios.cancion.CancionRepositorio;
import com.infotrack.topartistasfm.datos.repositorios.cancion.CancionRetrofit;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import retrofit2.Call;

public class ConsultaListadoCanciones {

    //region Atributos
    private final CancionRepositorio repositorio;
    private String artista;
    private int limiteCanciones;
    //endregion

    //region constructores
    public ConsultaListadoCanciones() {
        repositorio = new CancionRetrofit().obtenerClienteRetrofit();
    }
    //endregion

    //region Propiedades
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setLimiteCanciones(int limiteCanciones) {
        this.limiteCanciones = limiteCanciones;
    }

    //endregion

    //region casoDeUso
    public Call<TopDto> obtenerCanciones() {
        return repositorio.obtenerListadoCanciones(Constantes.METODO_ENDPOINT_CANCIONES, artista, Constantes.API_KEY, Constantes.FORMATO_REST, limiteCanciones);
    }
    //endregion
}
