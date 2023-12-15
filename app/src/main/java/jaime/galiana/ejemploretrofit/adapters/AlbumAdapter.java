package jaime.galiana.ejemploretrofit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import jaime.galiana.ejemploretrofit.MainActivity;
import jaime.galiana.ejemploretrofit.PhotosActivity;
import jaime.galiana.ejemploretrofit.R;
import jaime.galiana.ejemploretrofit.modelos.Album;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumVH> {

    private List<Album> obejcts;
    private int resource;
    private Context context;

    public AlbumAdapter(List<Album> obejcts, int resource, Context context) {
        this.obejcts = obejcts;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public AlbumVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View albumView = LayoutInflater.from(context).inflate(resource, null);
        albumView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        return new AlbumVH(albumView);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumVH holder, int position) {
        Album a = obejcts.get(position);

        holder.lbTitulo.setText(a.getTitulo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PhotosActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("ALBUM_ID", a.getId());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return obejcts.size();
    }

    public class AlbumVH extends RecyclerView.ViewHolder {
        TextView lbTitulo;
        public AlbumVH(@NonNull View itemView) {
            super(itemView);
            lbTitulo = itemView.findViewById(R.id.lbTituloAlbumCard);
        }
    }
}
