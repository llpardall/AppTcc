package com.dreamfactory.cloud.dsp_xpardall.apptcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.btnCad) protected Button btnCad;
    @InjectView(R.id.btnList) protected Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_cadastro_usuarios) {
            startActivity(new Intent(this, CadUsuarioActivity.class));
        }

        if (id == R.id.action_lista_usuarios) {
            startActivity(new Intent(this, ListQuestoesActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btnCad)
    public void cadastrar(){
        startActivity(new Intent(this, CadUsuarioActivity.class));
    }

    @OnClick(R.id.btnList)
    public void listar(){
        startActivity(new Intent(this, ListQuestoesActivity.class));
    }
}
