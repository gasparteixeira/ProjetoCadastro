package edm.rs.senac.com.br.projetocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CadastroActivity extends AppCompatActivity {

    private Contato contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Intent intent = getIntent();
        contato = (Contato)intent.getSerializableExtra("Contato");

        TextView labelNome = (TextView)findViewById(R.id.idNomeLabel);
        labelNome.setText(contato.getNome());

        TextView labelTelefone = (TextView)findViewById(R.id.idFoneLabel);
        labelTelefone.setText(contato.getTelefone());
    }

    public void onVoltar(View view) {
        this.finish();
    }

}
