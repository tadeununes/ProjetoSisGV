package fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.List;

import adapter.HomeAdapter;
import bombeiros.pr.gov.br.sisgv.R;
import bombeiros.pr.gov.br.sisgv.RMLCadastro;
import bombeiros.pr.gov.br.sisgv.RSDCadastro;
import bombeiros.pr.gov.br.sisgv.TelaHome;
import domain.RML;
import interfaces.RecyclerViewOnClickListenerHack;

/**
 * Created by Tadeu on 18/11/2015.
 */
public class RSDFragment extends Fragment implements RecyclerViewOnClickListenerHack, View.OnClickListener  {

    private Context context;
    private RecyclerView mRecyclerView;
    private List<RML> mList;
    private FloatingActionMenu fab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rsd, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("RSD");

        setFloatingActionButton(view);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_list_rsd);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    fab.hideMenuButton(true);
                } else {
                    fab.showMenuButton(true);
                }

                LinearLayoutManager llm = (LinearLayoutManager) mRecyclerView.getLayoutManager();

                HomeAdapter adapter = (HomeAdapter) mRecyclerView.getAdapter();

                if (mList.size() == llm.findLastCompletelyVisibleItemPosition() + 1) {
                    List<RML> listAux = ((TelaHome) getActivity()).getSetRMLList(10);

                    for (int i = 0; i < listAux.size(); i++) {
                        adapter.addListItem(listAux.get(i), mList.size());
                    }
                }
            }
        });

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        //criar adapter para o RMLFragment
        mList = ((TelaHome) getActivity()).getSetRMLList(10);
        HomeAdapter adapter = new HomeAdapter(getActivity(), mList);
        adapter.setRecyclerViewOnClickListenerHack(this);
        mRecyclerView.setAdapter(adapter);

        return view;
    }

    public void setFloatingActionButton(View view) {
        //fab = (FloatingActionMenu) getActivity().findViewById(R.id.fab);
        fab = (FloatingActionMenu) view.findViewById(R.id.fab_rsd);
        fab.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean b) {
                //Toast.makeText(getActivity(), "Is menu opened? " + (b ? "true" : "false"), Toast.LENGTH_SHORT).show();
            }
        });
        fab.showMenuButton(true);
        fab.setClosedOnTouchOutside(true);

        FloatingActionButton fab1 = (FloatingActionButton) view.findViewById(R.id.fab1_rsd);
        FloatingActionButton fab2 = (FloatingActionButton) view.findViewById(R.id.fab2_rsd);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
    }

    public void onClick(View v) {
        //String aux = "";

        switch (v.getId()) {
            case R.id.fab1_rsd:
                //aux = "Fab 1 clicked";
                Intent it_home_rmlCadastro = new Intent(getContext(), RMLCadastro.class);
                startActivity(it_home_rmlCadastro);
                break;
            case R.id.fab2_rsd:
                //aux = "Fab 2 clicked";
                Intent it_home_rsdCadastro = new Intent(getContext(), RSDCadastro.class);
                startActivity(it_home_rsdCadastro);
                break;
        }

        //Toast.makeText(getActivity(), aux, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClickListener(View view, int position) {
        Toast.makeText(getActivity(), "Position: " + position, Toast.LENGTH_SHORT).show();
    }
}
