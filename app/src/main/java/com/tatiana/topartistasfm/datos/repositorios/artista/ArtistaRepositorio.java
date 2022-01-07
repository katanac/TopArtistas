package com.infotrack.topartistasfm.datos.repositorios.artista;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ArtistaRepositorio {

    @GET(Constantes.END_POINT_API)
    Call<TopDto> obtenerListadoArtistas(@Query("method") String metodo, @Query("country") String pais, @Query("api_key") String api_key, @Query("format") String formato, @Query("limit") int limite);
}
