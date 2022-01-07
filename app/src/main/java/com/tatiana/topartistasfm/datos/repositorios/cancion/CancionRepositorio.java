package com.infotrack.topartistasfm.datos.repositorios.cancion;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CancionRepositorio {

    @GET(Constantes.END_POINT_API)
    Call<TopDto> obtenerListadoCanciones(@Query("method") String metodo, @Query("artist") String artista, @Query("api_key") String api_key, @Query("format") String formato, @Query("limit") int limite);

}
