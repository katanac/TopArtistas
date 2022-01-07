package com.infotrack.topartistasfm.trasversales.mapeadores;

import com.infotrack.topartistasfm.datos.modelos.artista.ListadoTopArtistasDto;
import com.infotrack.topartistasfm.datos.modelos.cancion.ListadoTopCancionesDto;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ListadoTopArtistasVm;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.ListadoTopCancionesVm;

import org.mapstruct.Mapper;

@Mapper
public interface TopMapeador {

    ListadoTopArtistasVm mapearDtoAVm(ListadoTopArtistasDto listadoTopArtistasDto);
    ListadoTopCancionesVm mapearCancionesDtoAVm(ListadoTopCancionesDto listadoTopCancionesDto);
}
