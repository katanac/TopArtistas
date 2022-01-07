package com.infotrack.topartistasfm.presentacion.componentes.listadoartistas;

import androidx.annotation.NonNull;

import com.infotrack.topartistasfm.datos.modelos.compartido.TopDto;
import com.infotrack.topartistasfm.dominio.casosdeuso.artistas.ConsultaListadoArtistas;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ListadoTopArtistasVm;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;
import com.infotrack.topartistasfm.trasversales.mapeadores.TopMapeador;

import org.mapstruct.factory.Mappers;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListadoArtistasPresentador {

    //region Atibutos
    private final ListadoArtistasContrato contratoCallback;
    private final TopMapeador topMapeador;
    //endregion

    //region Constructor
    public ListadoArtistasPresentador(ListadoArtistasContrato contratoCallback) {
        this.contratoCallback = contratoCallback;
        this.topMapeador = Mappers.getMapper(TopMapeador.class);
    }
    //endregion

    //region Capacidades
    public void obtenerArtistas() {

        ConsultaListadoArtistas consultaListadoArtistas = new ConsultaListadoArtistas();
        consultaListadoArtistas.setPaisTopArtistas(Constantes.PAIS_DEFECTO);
        consultaListadoArtistas.setLimiteArtistas(Constantes.LIMITE_ARTISTAS);
        consultaListadoArtistas.obtenerArtistas().enqueue(callArtistas);
    }
    //endregion

    //region Callbacks Observadores
    Callback callArtistas = new Callback<TopDto>() {
        @Override
        public void onResponse(@NonNull Call<TopDto> call, @NonNull Response<TopDto> response) {
            if (response.isSuccessful() && response.body() != null) {
                ListadoTopArtistasVm top = topMapeador.mapearDtoAVm(response.body().getTop());
                contratoCallback.pintarListaArtistas(top.getArtist());
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
