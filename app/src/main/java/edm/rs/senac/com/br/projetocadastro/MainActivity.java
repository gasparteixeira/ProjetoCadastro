package edm.rs.senac.com.br.projetocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Contato contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onCadastro(View view) {
        EditText nomeText = (EditText)findViewById(R.id.idNome);
        EditText telefoneText = (EditText)findViewById(R.id.idTelefone);

        Intent intent = new Intent(this, CadastroActivity.class);
        Contato contato = new Contato(nomeText.getText().toString(), telefoneText.getText().toString());
        intent.putExtra("Contato", contato);
        startActivity(intent);
    }


}
