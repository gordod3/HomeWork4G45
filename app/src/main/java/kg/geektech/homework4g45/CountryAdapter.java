package kg.geektech.homework4g45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private ArrayList<CountryModel> countryModels;
    private OnItemClick onItemClick;

    public CountryAdapter(ArrayList<CountryModel> countryModels, @Nullable OnItemClick onItemClick) {
        this.countryModels = countryModels;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_country_model2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(countryModels.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClick != null) onItemClick.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView flags;
        private TextView country;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flags = itemView.findViewById(R.id.activity_country_model_imageView_flag);
            country = itemView.findViewById(R.id.activity_country_model_textView_country);
        }

        public void bind(CountryModel countryModel){
            flags.setImageDrawable(countryModel.getFlags());
            country.setText(countryModel.getTitle());
        }
    }
}
