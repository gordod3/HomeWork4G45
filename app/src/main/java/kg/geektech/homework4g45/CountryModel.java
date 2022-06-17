package kg.geektech.homework4g45;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;

public class CountryModel {
    private Drawable flags;
    private String title;

    public CountryModel(Drawable flags, String country) {
        this.flags = flags;
        this.title = country;
    }

    public Drawable getFlags() {
        return flags;
    }

    public void setFlags(Drawable flags) {
        this.flags = flags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}