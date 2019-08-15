package com.hjl.artisan.web;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.webkit.WebView;
import com.hjl.artisan.R;
import com.orhanobut.logger.Logger;
import com.wusy.wusylibrary.view.TitleView;

/**
 * Created by XIAO RONG on 2018/11/6.
 */

public class WebViewActivity extends Activity {
    private final String TAG = "WebViewActivity";
    private final String PRE = "protocol://android";
    private WebView webView;
    private TitleView titleView;
    private String url = "";
    private CustomWebChromeClient webChromeClient;
    private NullPageControll nullPageControll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        titleView=findViewById(R.id.titleView);
        titleView.setTitle("工匠总动员")
                .showBackButton(true,this)
                .build();
        url=getIntent().getStringExtra("url");
        Logger.i("WebView当前加载的url--"+url);
        webView = findViewById(R.id.webview);
        nullPageControll=new NullPageControll(this,webView);
        WebSettingUtil.getInstance(webView,this).initWebSetting();
        webView.loadUrl(url);
        webView.setWebViewClient(new CustomWebViewClient(PRE,this,nullPageControll));
        webChromeClient=new CustomWebChromeClient(this,nullPageControll);
        webView.setWebChromeClient(webChromeClient);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        WebViewH5Order.parseOnActivityForResult(webView,this,requestCode,resultCode,intent);
        webChromeClient.forActivityResult(requestCode,resultCode,intent);
    }
}
