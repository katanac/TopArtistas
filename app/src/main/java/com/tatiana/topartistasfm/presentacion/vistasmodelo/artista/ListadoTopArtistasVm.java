package com.infotrack.topartistasfm.presentacion.vistasmodelo.artista;

import com.infotrack.topartistasfm.datos.modelos.artista.ArtistaDto;
import com.infotrack.topartistasfm.datos.modelos.cancion.CancionDto;
import com.infotrack.topartistasfm.datos.modelos.cancion.ListadoTopCancionesDto;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.CancionVm;

import java.util.List;

public class ListadoTopArtistasVm {

    private List<ArtistaVm> artist;

    public List<ArtistaVm> getArtist() {
        return artist;
    }

    public void setArtist(List<ArtistaVm> artist) {
        this.artist = artist;
    }


}
