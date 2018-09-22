package vell.layput_uiwiget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class event_activity_is_listener extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
                EditText edita = (EditText)findViewById(R.id.num_a);
                int a = Integer.parseInt(edita.getText()+"");
                EditText editb = (EditText)findViewById(R.id.num_b);
                int b = Integer.parseInt(editb.getText()+"");
                TextView txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a+b)+"");
    }

}
