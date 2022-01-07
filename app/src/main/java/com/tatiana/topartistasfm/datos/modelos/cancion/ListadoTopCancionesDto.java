package com.infotrack.topartistasfm.datos.modelos.cancion;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListadoTopCancionesDto {

    @SerializedName(value = "track")
    private List<CancionDto> listadoCanciones;

    public List<CancionDto> getListadoCanciones() {
        return listadoCanciones;
    }

    public void setListadoCanciones(List<CancionDto> listadoCanciones) {
        this.listadoCanciones = listadoCanciones;
    }
}
