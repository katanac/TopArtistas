package com.infotrack.topartistasfm.datos.modelos.artista;

import com.google.gson.annotations.SerializedName;

public class ArtistaDto {


    @SerializedName(value = "mbid")
    private String idArtista;
    @SerializedName(value = "name")
    private String nombreArtista;
    @SerializedName(value = "listeners")
    private String oyentes;
    @SerializedName(value = "url")
    private String urlArtista;

    public String getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(String idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getOyentes() {
        return oyentes;
    }

    public void setOyentes(String oyentes) {
        this.oyentes = oyentes;
    }

    public String getUrlArtista() {
        return urlArtista;
    }

    public void setUrlArtista(String urlArtista) {
        this.urlArtista = urlArtista;
    }
}
