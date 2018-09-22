package vell.layput_uiwiget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class event_onclick_in_xml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_onclick_in_xml);
    }

    public void btn_add(View v){
        EditText edita = (EditText)findViewById(R.id.num_a);
        int a = Integer.parseInt(edita.getText()+"");
        EditText editb = (EditText)findViewById(R.id.num_b);
        int b = Integer.parseInt(editb.getText()+"");
        TextView txtkq = (TextView) findViewById(R.id.txtkq);
        txtkq.setText((a+b)+"");
    }
}
