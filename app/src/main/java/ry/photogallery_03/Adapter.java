package ry.photogallery_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// этот код, для списка изображений (RecyclerView)
public class Adapter extends RecyclerView.Adapter<Adapter.ViewAdapter> {
    private ArrayList<CellPhotoActivity> galleryList;
    private Context context;

    public Adapter(Context context, ArrayList<CellPhotoActivity>galleryList){
        this.galleryList = galleryList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(viewGrup);
        return null;
    }
}

