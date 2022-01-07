package com.infotrack.topartistasfm.datos.repositorios.artista;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.trasversales.helpers.ConexionRetrofit;

import retrofit2.Call;
import retrofit2.Retrofit;

public class ArtistaRetrofit implements ArtistaRepositorio {


    //region Cliente Retrofit
    public ArtistaRepositorio obtenerClienteRetrofit() {
        Retrofit helper = new ConexionRetrofit().obtenerConexionRetrofit();
        return helper.create(ArtistaRepositorio.class);
    }
    //endregion

    //region Capacidad
    @Override
    public Call<TopDto> obtenerListadoArtistas(String metodo, String pais, String api_key, String formato, int limite) {
        return obtenerClienteRetrofit().obtenerListadoArtistas(metodo, pais, api_key, formato,limite);
    }
    //endregion
}
