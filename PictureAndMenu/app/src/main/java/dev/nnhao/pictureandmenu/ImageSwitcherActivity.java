package dev.nnhao.pictureandmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class ImageSwitcherActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory {
    private Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7
    };
    private ImageSwitcher switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);

        switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
        switcher.setFactory(this);
        switcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        switcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        Gallery gallery = findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Pic " + (position - 1), Toast.LENGTH_SHORT).show();
                switcher.setImageResource(imageIDs[position]);
            }
        });
    }

    @Override
    public View makeView() {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundColor(0xFF000000);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT
        ));
        return imageView;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;

        public ImageAdapter(){

        }

        public ImageAdapter(Context context){
            this.context = context;
            TypedArray arr = obtainStyledAttributes(
                    R.styleable.Gallery1
            );
            itemBackground = arr.getResourceId(
                    R.styleable.Gallery1_android_galleryItemBackground,0
            );
            arr.recycle();
        }

        @Override
        public int getCount() {
            return imageIDs.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgView;
            if(convertView == null){
                imgView = new ImageView(context);
                imgView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
                imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imgView.setPadding(5,5,5,5);
            }else{
                imgView = (ImageView) convertView;
            }
            imgView.setImageResource(imageIDs[position]);
            return imgView;
        }
    }
}