package com.infotrack.topartistasfm.datos.repositorios.cancion;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.trasversales.helpers.ConexionRetrofit;

import retrofit2.Call;
import retrofit2.Retrofit;

public class CancionRetrofit implements CancionRepositorio {

    //region Cliente retrofit
    public CancionRepositorio obtenerClienteRetrofit() {
        Retrofit helper = new ConexionRetrofit().obtenerConexionRetrofit();
        return helper.create(CancionRepositorio.class);
    }
    //endregion

    //region Capacidad
    @Override
    public Call<TopDto> obtenerListadoCanciones(String metodo, String artista, String api_key, String formato, int limite) {
        return obtenerClienteRetrofit().obtenerListadoCanciones(metodo, artista, api_key, formato, limite);
    }
    //endregion
}
