package uniopet.edu.br.produtos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProdutosAdapter extends ArrayAdapter<Produtos> {
    private int rId;

    public ProdutosAdapter(Context context, int resource, List<Produtos> objects) {
        super(context, resource, objects);
        this.rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Produtos produtos = getItem(position);

        TextView textNome = mView.findViewById(R.id.textNome);
        TextView textCategoria = mView.findViewById(R.id.textCategoria);
        TextView textQtde = mView.findViewById(R.id.textQtde);
        TextView textValor = mView.findViewById(R.id.textValor);
        TextView textValorTotal = mView.findViewById(R.id.textValorTotal);

        textNome.setText("Prod: "+produtos.getNome());
        textCategoria.setText("Categ: "+produtos.getCategoria());
        textQtde.setText("Qtde: "+String.valueOf(produtos.getQuantidade()));
        textValor.setText("Valor Unit: R$"+String.valueOf(produtos.getValor_unitario()));
        textValorTotal.setText("Valor total: "+String.valueOf(produtos.getValor_total()));


        return mView;
    }


}
