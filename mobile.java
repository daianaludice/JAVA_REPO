package com.example.admin.myapplication;

	import android.annotation.TargetApi;
	import android.content.Intent;
	import android.os.Build;
	import android.support.v7.app.AppCompatActivity;
	import android.os.Bundle;
	import android.view.View;
	import android.widget.Button;
	import android.widget.CompoundButton;
	import android.widget.EditText;
	import android.widget.Switch;
	import android.widget.TextView;

	public class MainActivity extends AppCompatActivity {

	    EditText ed1;
	    EditText ed2;
	    EditText ed3;
	    EditText ed4;
	    EditText edt_re;

	    Button bt1;
	    Button bt2;

	    int[] temp = new int[4];

	    @TargetApi(Build.VERSION_CODES.M)
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        bt1 = (Button)this.findViewById(R.id.bt1);
	        bt2 = (Button)this.findViewById(R.id.bt2);

	        ed1 = (EditText)this.findViewById(R.id.edt1);
	        ed2 = (EditText)this.findViewById(R.id.edt2);
	        ed3 = (EditText)this.findViewById(R.id.edt3);
	        ed4 = (EditText)this.findViewById(R.id.edt4);
	        edt_re = (EditText)this.findViewById(R.id.edtre);

	        bt1.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View v) {

	                String temp_c;
	                temp_c = ed1.getText().toString();
	                temp[0] = Integer.parseInt(temp_c);
	                temp_c = ed2.getText().toString();
	                temp[1] = Integer.parseInt(temp_c);
	                temp_c = ed3.getText().toString();
	                temp[2] = Integer.parseInt(temp_c);
	                temp_c = ed4.getText().toString();
	                temp[3] = Integer.parseInt(temp_c);

	                double result = avg(temp);

	                edt_re.setText(Double.toString(result));

	            }
	        });

	        bt2.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v){

	                String temp_c;
	                temp_c = ed1.getText().toString();
	                temp[0] = Integer.parseInt(temp_c);
	                temp_c = ed2.getText().toString();
	                temp[1] = Integer.parseInt(temp_c);
	                temp_c = ed3.getText().toString();
	                temp[2] = Integer.parseInt(temp_c);
	                temp_c = ed4.getText().toString();
	                temp[3] = Integer.parseInt(temp_c);

	                int result = min(temp);

	                edt_re.setText(Integer.toString(result));

	            }
	        });


	    }

	    public double avg(int a[]){

	        double result = 0;
	        double sum = 0;
	        int size = a.length;

	        for(int i = 0; i < size; i++){
	            sum += a[i];
	        }
	        return sum/size;
	    }

	    public int min(int a[]){

	        int result = 0;
	        int min=100;
	        int size = a.length;

	        for(int i = 0; i < size; i++){
	            if (a[i] <= min) {
	                min = a[i];
	            }
	            else if (a[i] > min) continue;
	        }
	        return min;
	    }
	}
