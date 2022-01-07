package com.infotrack.topartistasfm.datos.modelos.compartido;

import com.google.gson.annotations.SerializedName;
import com.infotrack.topartistasfm.datos.modelos.artista.ListadoTopArtistasDto;
import com.infotrack.topartistasfm.datos.modelos.cancion.ListadoTopCancionesDto;

public class TopDto {

    @SerializedName(value = "topartists")
    private ListadoTopArtistasDto top;
    @SerializedName(value = "toptracks")
    private ListadoTopCancionesDto topCanciones;

    public ListadoTopArtistasDto getTop() {
        return top;
    }

    public void setTop(ListadoTopArtistasDto top) {
        this.top = top;
    }

    public ListadoTopCancionesDto getTopCanciones() {
        return topCanciones;
    }

    public void setTopCanciones(ListadoTopCancionesDto topCanciones) {
        this.topCanciones = topCanciones;
    }
}
