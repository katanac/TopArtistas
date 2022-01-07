package com.infotrack.topartistasfm.presentacion.componentes.listadocanciones;

import androidx.annotation.NonNull;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.dominio.casosdeuso.canciones.ConsultaListadoCanciones;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ListadoTopArtistasVm;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.ListadoTopCancionesVm;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;
import com.infotrack.topartistasfm.trasversales.mapeadores.TopMapeador;

import org.mapstruct.factory.Mappers;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListadoCancionesPresentador {

    //region Propiedades
    private final ListadoCancionesContrato contratoCallback;
    private final TopMapeador topMapeador;
    //endregion

    //region Construtor
    public ListadoCancionesPresentador(ListadoCancionesContrato contratoCallback) {
        this.contratoCallback = contratoCallback;

        this.topMapeador = Mappers.getMapper(TopMapeador.class);
    }
    //endregion

    //region Capacidad
    public void obtenerCanciones(String nombreArtista) {
        ConsultaListadoCanciones consultaListadoCanciones = new ConsultaListadoCanciones();
        consultaListadoCanciones.setArtista(nombreArtista);
        consultaListadoCanciones.setLimiteCanciones(Constantes.LIMITE_CANCIONES);
        consultaListadoCanciones.obtenerCanciones().enqueue(callArtistas);
    }
    //endregion

    //region Callbacks observador
    Callback callArtistas = new Callback<TopDto>() {
        @Override
        public void onResponse(@NonNull Call<TopDto> call, @NonNull Response<TopDto> response) {
            if (response.isSuccessful() && response.body() != null) {
                ListadoTopCancionesVm top = topMapeador.mapearCancionesDtoAVm(response.body().getTopCanciones());
                contratoCallback.pintarListaCanciones(top.getListadoCanciones());
            } else {
                contratoCallback.mostarMensaje(Constantes.MSJ_ERROR_CONSULTA);
            }
        }

        @Override
        public void onFailure(Call<TopDto> call, Throwable t) {
            contratoCallback.mostarMensaje(Constantes.MSJ_ERROR_CONSULTA);
        }
    };
    //endregion
}
