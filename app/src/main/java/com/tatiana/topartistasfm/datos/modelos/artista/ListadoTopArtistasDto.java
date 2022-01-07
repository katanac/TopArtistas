package com.infotrack.topartistasfm.datos.modelos.artista;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListadoTopArtistasDto {

    @SerializedName(value = "artist")
    private List<ArtistaDto> artist;

    public List<ArtistaDto> getArtist() {
        return artist;
    }

    public void setArtist(List<ArtistaDto> artist) {
        this.artist = artist;
    }


}
