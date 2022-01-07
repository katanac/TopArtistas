package com.infotrack.topartistasfm.presentacion.componentes.listadoartistas;

import com.infotrack.topartistasfm.datos.modelos.artista.ArtistaDto;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ArtistaVm;

import java.util.List;

public interface ListadoArtistasContrato {

    void pintarListaArtistas(List<ArtistaVm> lista);

    void mostarMensaje(String meensaje);
}
