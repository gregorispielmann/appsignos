package br.com.nuvemdeideias.appsignos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    private ListView listaSignos;
    private String[] signos  = {
            "Áries",
            "Leão",
            "Capricórnio"
    };

    private String[] detalheSignos = {
            "Áries ou Carneiro é o primeiro signo astrológico do zodíaco, situado entre Peixes e Touro e associado à constelação de Aries. Seu símbolo é um carneiro. Forma com Leão e Sagitário a triplicidade dos signos do Fogo.",
            "Leão é um signo de fogo, regido pelo Sol. Imagine um leão, com sua juba dourada, sua altivez inconfundível sua autoconfiança e luz própria, como o próprio sol caminhando elegantemente sobre a relva. Essa imagem representa o leão típico.",
            "Capricórnio é o décimo signo astrológico do zodíaco, situado entre Sagitário e Aquário e associado à constelação de Capricornus. Seu símbolo é uma cabra. Forma com Touro e Virgem a triplicidade dos signos da Terra."

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listaSignosId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                Toast.makeText(MainActivity.this,detalheSignos[codigoPosicao],Toast.LENGTH_LONG).show();
            }
        });

        botao = (Button) findViewById(R.id.BotaoAppId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ActivityLayout.class));
            }
        });

    }
}
