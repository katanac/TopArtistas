package com.infotrack.topartistasfm.presentacion.componentes.listadocanciones;

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
import com.infotrack.topartistasfm.presentacion.vistasmodelo.cancion.CancionVm;

import java.util.List;

public class ListaCancionAdaptador extends RecyclerView.Adapter<ListaCancionAdaptador.ViewHolder> {

    //region Atributos
    private final List<CancionVm> listadoCanciones;
    private final Context contexto;
    //endregion

    //region Constructor
    public ListaCancionAdaptador(List<CancionVm> listadoCanciones, Context contexto) {
        this.listadoCanciones = listadoCanciones;
        this.contexto = contexto;
    }
    //endregion

    //region Sobrecargas
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cancion, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return listadoCanciones.size();
    }
    //endregion

    //region Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombreCancion;
        TextView txtOyentesCancion;
        CardView cardCancion;
        ImageView imgArtista;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreCancion = itemView.findViewById(R.id.tv_nomnbre_cancion);
            txtOyentesCancion = itemView.findViewById(R.id.tv_oyentes_cancion);
            cardCancion = itemView.findViewById(R.id.card_item_cancion);
            imgArtista = itemView.findViewById(R.id.img_cancion);
        }

        void bind(int posicion) {
            txtNombreCancion.setText(listadoCanciones.get(posicion).getNombre());
            txtOyentesCancion.setText(listadoCanciones.get(posicion).getOyentes());

            Glide.with(contexto)
                    .load("https://i.pinimg.com/originals/82/6c/84/826c84df2fb9bd88c81b28f71516c6e4.jpg")
                    .placeholder(R.drawable.gradient_item)
                    .centerCrop()
                    .diskCacheStrategy(DiskCacheStrategy.NONE).into(imgArtista);
        }
    }
    //endregion

}
