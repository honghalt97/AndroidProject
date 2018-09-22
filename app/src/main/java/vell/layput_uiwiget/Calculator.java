package vell.layput_uiwiget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        Button btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edita = (EditText) findViewById(R.id.num_a);
                int a = Integer.parseInt(edita.getText() + "");
                EditText editb = (EditText) findViewById(R.id.num_b);
                int b = Integer.parseInt(editb.getText() + "");
                TextView txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a - b) + "");
            }
        });
        Button btn_multi = (Button)findViewById(R.id.btn_multi);
        btn_multi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edita = (EditText) findViewById(R.id.num_a);
                int a = Integer.parseInt(edita.getText() + "");
                EditText editb = (EditText) findViewById(R.id.num_b);
                int b = Integer.parseInt(editb.getText() + "");
                TextView txtkq = (TextView) findViewById(R.id.txtkq);
                txtkq.setText((a * b) + "");
            }
        });
    }

    @Override
    public void onClick(View v) {
        EditText edita = (EditText)findViewById(R.id.num_a);
        int a = Integer.parseInt(edita.getText()+"");
        EditText editb = (EditText)findViewById(R.id.num_b);
        int b = Integer.parseInt(editb.getText()+"");
        TextView txtkq = (TextView) findViewById(R.id.txtkq);
        txtkq.setText((a + b)+"");
    }

    public void btn_div(View v){
        EditText edita = (EditText)findViewById(R.id.num_a);
        int a = Integer.parseInt(edita.getText()+"");
        EditText editb = (EditText)findViewById(R.id.num_b);
        int b = Integer.parseInt(editb.getText()+"");
        TextView txtkq = (TextView) findViewById(R.id.txtkq);
        txtkq.setText((a / b)+"");
    }
}
