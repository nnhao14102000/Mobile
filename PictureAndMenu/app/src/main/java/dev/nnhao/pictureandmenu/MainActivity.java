package dev.nnhao.pictureandmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToGallery(View view) {
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

    public void clickToSwitch(View view) {
        Intent intent = new Intent(this, ImageSwitcherActivity.class);
        startActivity(intent);
    }

    public void clickToGrid(View view) {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }

    private void createMenu(Menu menu){
        menu.setQwertyMode(true);
        MenuItem menu1 = menu.add(0,0,0, "Item 1");
        menu1.setAlphabeticShortcut('1');
        menu1.setIcon(R.drawable.ic_launcher_background);

        MenuItem menu2 = menu.add(0,1,1, "Item 2");
        menu2.setAlphabeticShortcut('2');
        menu2.setIcon(R.drawable.ic_launcher_background);

        MenuItem menu3 = menu.add(0,2,2, "Item 3");
        menu3.setAlphabeticShortcut('3');
        menu3.setIcon(R.drawable.ic_launcher_background);

        MenuItem menu4 = menu.add(0,3,3, "Item 4");
        menu4.setAlphabeticShortcut('4');

        menu.add(0,4,4, "Item 5");
        menu.add(0,5,5, "Item 6");
        menu.add(0,6,6, "Item 7");

    }

    private boolean menuChoice(MenuItem item){
        switch (item.getItemId()){
            case 0:
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 1:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 4:
                Toast.makeText(this, "Item 5 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 5:
                Toast.makeText(this, "Item 6 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case 6:
                Toast.makeText(this, "Item 7 clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        return menuChoice(item);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        createMenu(menu);
    }

    public void clickToClock(View view) {

    }

    public void clickToWebView(View view) {

    }
}