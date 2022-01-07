package com.infotrack.topartistasfm.presentacion.componentes.listadocanciones;

import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ArtistaVm;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.CancionVm;

import java.util.List;

public interface ListadoCancionesContrato {

    void pintarListaCanciones(List<CancionVm> lista);

    void mostarMensaje(String meensaje);
}
