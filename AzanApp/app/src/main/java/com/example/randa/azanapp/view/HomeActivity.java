package com.example.randa.azanapp.view;

import android.app.ProgressDialog;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.randa.azanapp.R;
import com.example.randa.azanapp.application.AzanApplication;
import com.example.randa.azanapp.viewModel.PrayerViewModel;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.city)
    EditText city;
    @BindView(R.id.ok)
    Button ok;
    @BindView(R.id.result)
    TextView result;
    @BindView(R.id.country)
    EditText country;
    @Inject
    PrayerViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        ((AzanApplication)getApplication()).getComponent().inject(this);

        ok.setOnClickListener((v -> {
            ProgressDialog progressDialog = new ProgressDialog(HomeActivity.this);
            progressDialog.show();
            viewModel.getPrayerTime(city.getText().toString(), country.getText().toString())
                    .subscribe(timeResponse -> {
                        
                                result.setText("Fajr prayer: " + timeResponse.getData().getTimings().getFajr()+"\n Maghreb"+timeResponse.getData().getTimings().getMaghrib());
                                progressDialog.dismiss();
                            },
                            throwable -> {
                                Log.d("Throwable", throwable.getMessage());
                                progressDialog.dismiss();
                                Log.d("Git","Hi");
                            });
        }));
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
