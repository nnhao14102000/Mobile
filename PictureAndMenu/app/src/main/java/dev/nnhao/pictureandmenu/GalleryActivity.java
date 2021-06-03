package dev.nnhao.pictureandmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.ConversationAction;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class GalleryActivity extends AppCompatActivity {

    private Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Gallery gallery = findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "pic" + (position + 1), Toast.LENGTH_LONG).show();
                ImageView img = (ImageView) findViewById(R.id.imageView1);
                img.setBackgroundResource(imageIDs[position]);
            }
        });
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
                imgView.setImageResource(imageIDs[position]);
                imgView.setScaleType(ImageView.ScaleType.FIT_XY);
                imgView.setLayoutParams(new Gallery.LayoutParams(150,120));
            }else{
                imgView = (ImageView) convertView;
            }
            imgView.setBackgroundResource(itemBackground);

            return imgView;
        }
    }
}