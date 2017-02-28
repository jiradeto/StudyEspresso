package app.pg_applications.com.studyespresso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_result)
    TextView tvResult;

    @BindView(R.id.edt_discount)
    EditText edtDiscount;

    @BindView(R.id.edt_price)
    EditText edtPrice;

    @BindView(R.id.bt_main)
    Button btMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initInstance();
    }

    private void initInstance() {

        btMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtDiscount.getText().length() != 0 && edtDiscount.getText().length() != 0) {
                    int price = Integer.parseInt(edtPrice.getText().toString());
                    int discount = Integer.parseInt(edtDiscount.getText().toString());
                    int result = price - ((price * discount) / 100);
                    tvResult.setText(String.valueOf(Math.round(result)));

                } else {
                    tvResult.setText(R.string.please_input);
                }
            }
        });

    }
}
