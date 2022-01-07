package com.infotrack.topartistasfm.presentacion.componentes.listadoartistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.infotrack.topartistasfm.R;
import com.infotrack.topartistasfm.presentacion.vistasmodelo.artista.ArtistaVm;
import com.infotrack.topartistasfm.trasversales.constantes.Constantes;

import java.util.List;

public class ListaArtistaAdaptador extends RecyclerView.Adapter<ListaArtistaAdaptador.ViewHolder> {

    //region Atributos
    private final List<ArtistaVm> listadoArtista;
    private final CallbackArtista listener;
    private final Context contexto;
    //endregion

    //region Constructor
    public ListaArtistaAdaptador(List<ArtistaVm> listadoArtista, CallbackArtista listener, Context contexto) {
        this.listadoArtista = listadoArtista;
        this.listener = listener;
        this.contexto = contexto;
    }
    //endregion

    //region Sobrecargas
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_artista, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return listadoArtista.size();
    }
    //endregion

    //region Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtArtistas;
        TextView txtOyentes;
        CardView card;
        ImageView imgArtista;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtArtistas = itemView.findViewById(R.id.tv_nomnbre_artista);
            txtOyentes = itemView.findViewById(R.id.tv_oyentes_artista);
            card = itemView.findViewById(R.id.card_item_artista);
            imgArtista= itemView.findViewById(R.id.img_artista);
        }

        void bind(int posicion) {
            txtArtistas.setText(listadoArtista.get(posicion).getNombreArtista());
            txtOyentes.setText(listadoArtista.get(posicion).getOyentes());
            card.setOnClickListener(view -> listener.onClickArtista(posicion));

            Glide.with(contexto)
                    .load(Constantes.URL_IMG_ARTISTA)
                    .placeholder(R.drawable.gradient_item)
                    .centerCrop()
                    .diskCacheStrategy(DiskCacheStrategy.NONE).into(imgArtista);
        }
    }
    //endregion

    //region Callback
    interface CallbackArtista {
        void onClickArtista(int posicion);
    }
    //endregion
}
