package com.infotrack.topartistasfm.trasversales.constantes;

public class Constantes {

    //region General
    public final static String BASE_URL = "http://ws.audioscrobbler.com/";
    public static final String API_KEY="cf2894b9c73a323e24f5c6a9aab1eb85";
    //endregion


    //region EndPoints
    public static final String END_POINT_API = "2.0/";
    public static final String METODO_ENDPOINT_ARTISTAS ="geo.gettopartists";
    public static final String METODO_ENDPOINT_CANCIONES="artist.gettoptracks";


    public static final String EXTRA_NOMBRE_ARTISTA = "nombreArtista";
    public static final String URL_IMG_ARTISTA = "https://i.pinimg.com/originals/4d/65/15/4d65156467bd9bcd6ce834657fa28f68.png";
    public static final String PAIS_DEFECTO = "Colombia";
    public static final String FORMATO_REST = "json";
    public static final int LIMITE_CANCIONES = 5;
    public static final int LIMITE_ARTISTAS = 10;
    public static final String MSJ_ERROR_CONSULTA = "Ocurrio Un Error Al Realizar La Consulta";
    //endregion

}
