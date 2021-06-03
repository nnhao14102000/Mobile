package extended.ui.formwidgetsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.wVWebsite);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.kieutrongkhanh.net");
    }
}