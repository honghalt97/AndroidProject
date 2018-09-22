package vell.layput_uiwiget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class event_anonymous_listener extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edita = (EditText)findViewById(R.id.num_a);
                int a = Integer.parseInt(edita.getText()+"");
                EditText editb = (EditText)findViewById(R.id.num_b);
                int b = Integer.parseInt(editb.getText()+"");
                TextView txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a+b)+"");
            }
        });

    }
}
