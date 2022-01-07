package com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion;

import com.google.gson.annotations.SerializedName;

public class CancionVm {

    @SerializedName(value = "mbid")
    private String idCancion;
    @SerializedName(value = "name")
    private String nombre;
    @SerializedName(value = "listeners")
    private String oyentes;
    @SerializedName(value = "url")
    private String url;

    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOyentes() {
        return oyentes;
    }

    public void setOyentes(String oyentes) {
        this.oyentes = oyentes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
