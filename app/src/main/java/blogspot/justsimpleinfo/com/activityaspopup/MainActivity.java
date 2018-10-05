package blogspot.justsimpleinfo.com.activityaspopup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mOpenPopupActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOpenPopupActivityBtn = this.findViewById(R.id.open_popup_activity_btn);
        mOpenPopupActivityBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this,PopupActivityActivity.class);
        startActivity(intent);

    }
}
