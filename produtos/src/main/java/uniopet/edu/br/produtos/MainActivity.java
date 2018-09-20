package uniopet.edu.br.produtos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Produtos> listaProdutos;

    private EditText nome;
    private Spinner categorias;
    private EditText quantidade;
    private EditText valorUnitario;
    private ListView lista;

    private ArrayAdapter<Produtos> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProdutos = new ArrayList<>();

        nome = findViewById(R.id.editNome);
        categorias = findViewById(R.id.spinnerCategorias);
        quantidade = findViewById(R.id.editQuantidade);
        valorUnitario = findViewById(R.id.editValor);
        lista = findViewById(R.id.listProdutos);

        atualizarProdutos();
    }

    public void salvarProduto(View v){
        String n = nome.getText().toString();
        String cat = categorias.getSelectedItem().toString();
        int qtde = Integer.parseInt(quantidade.getText().toString());
        double valor = Double.parseDouble(valorUnitario.getText().toString());

        double valorTotal = valor*qtde;

        Produtos p = new Produtos();
        p.setNome(n);
        p.setCategoria(cat);
        p.setQuantidade(qtde);
        p.setValor_unitario(valor);
        p.setValor_total(valorTotal);

        listaProdutos.add(p);

        atualizarProdutos();

        nome.setText("");
        quantidade.setText("");
        valorUnitario.setText("");
    }

    public void atualizarProdutos(){
        if(adapter==null){
            adapter = new ProdutosAdapter(getApplicationContext(), R.layout.activity_produto_item, listaProdutos);
            lista.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }

    }
}
