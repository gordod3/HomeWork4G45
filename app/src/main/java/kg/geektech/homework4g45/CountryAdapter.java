package kg.geektech.homework4g45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private ArrayList<CountryModel> countryModels;

    public CountryAdapter(ArrayList<CountryModel> countryModels) {
        this.countryModels = countryModels;
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
