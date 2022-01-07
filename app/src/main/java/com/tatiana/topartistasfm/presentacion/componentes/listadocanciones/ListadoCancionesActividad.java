package com.infotrack.topartistasfm.presentacion.componentes.listadocanciones;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.infotrack.topartistasfm.R;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.CancionVm;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import java.util.LinkedList;
import java.util.List;

public class ListadoCancionesActividad extends AppCompatActivity implements ListadoCancionesContrato {

    //region atributos
    private final List<CancionVm> listadoCanciones;
    private ListaCancionAdaptador adaptador;
    //endregion

    //region Constructor
    public ListadoCancionesActividad() {
        this.listadoCanciones = new LinkedList<>();
    }
    //endregion

    //region Intencion
    public static Intent obtenerIntencionListadoCanciones(Context contexto, String nombreArtista) {
        Intent intencion = new Intent(contexto, ListadoCancionesActividad.class);
        intencion.putExtra(Constantes.EXTRA_NOMBRE_ARTISTA, nombreArtista);
        return intencion;
    }
    //endregion

    //region Sobrecarga
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_cancion);

        String nombreArtista = getIntent().getExtras().getString(Constantes.EXTRA_NOMBRE_ARTISTA);

        RecyclerView recycler = findViewById(R.id.lista_canciones);
        ListadoCancionesPresentador presentador = new ListadoCancionesPresentador(this);

        adaptador = new ListaCancionAdaptador(listadoCanciones, getApplicationContext());
        recycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recycler.setAdapter(adaptador);


        presentador.obtenerCanciones(nombreArtista);
    }
    //endregion

    //region Contrato
    @Override
    public void pintarListaCanciones(List<CancionVm> lista) {
        listadoCanciones.clear();
        listadoCanciones.addAll(lista);
        adaptador.notifyDataSetChanged();
    }

    @Override
    public void mostarMensaje(String meensaje) {
        Toast.makeText(getApplicationContext(), meensaje, Toast.LENGTH_LONG).show();
    }
    //endregion


}
