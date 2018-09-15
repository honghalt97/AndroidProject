package vell.layput_uiwiget;

import android.app.Activity;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.facebook__clone);

        TextView textView = (TextView) findViewById(R.id.btn_sign_up);
        textView.setPaintFlags(textView.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
        TextView textView_forgot_pwd = (TextView) findViewById(R.id.btn_forget_passwd);
        textView_forgot_pwd.setPaintFlags(textView_forgot_pwd.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
    }
}
