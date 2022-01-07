package com.infotrack.topartistasfm.presentacion.componentes.listadoartistas;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.infotrack.topartistasfm.R;
import com.infotrack.topartistasfm.presentacion.componentes.listadocanciones.ListadoCancionesActividad;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ArtistaVm;

import java.util.LinkedList;
import java.util.List;

public class ListadoArtistasActividad extends AppCompatActivity implements ListadoArtistasContrato, ListaArtistaAdaptador.CallbackArtista {

    //region Atributos
    private final List<ArtistaVm> listadoArtista;
    private ListaArtistaAdaptador adaptador;
    //endregion

    //region Constructor
    public ListadoArtistasActividad() {
        this.listadoArtista = new LinkedList<>();
    }
    //endregion

    //region Sobrecargas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_artistas);

        RecyclerView recycler = findViewById(R.id.lista_artistas);
        ListadoArtistasPresentador presentador = new ListadoArtistasPresentador(this);


        adaptador = new ListaArtistaAdaptador(listadoArtista, this, getApplicationContext());
        recycler.setAdapter(adaptador);


        presentador.obtenerArtistas();
    }
    //endregion

    //region Contrato
    @Override
    public void pintarListaArtistas(List<ArtistaVm> lista) {
        listadoArtista.clear();
        listadoArtista.addAll(lista);
        adaptador.notifyDataSetChanged();
    }

    @Override
    public void mostarMensaje(String meensaje) {
        Toast.makeText(getApplicationContext(), meensaje, Toast.LENGTH_LONG).show();
    }
    //endregion

    //region CallBacks
    @Override
        public void onClickArtista(int posicion) {
        getApplicationContext().startActivity(ListadoCancionesActividad.obtenerIntencionListadoCanciones(getBaseContext(), listadoArtista.get(posicion).getNombreArtista()));
    }
    //endregion
}