package fragment;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;


import bombeiros.pr.gov.br.sisgv.R;
import datetimepickers.HoraFinalTimePickerFragment;
import datetimepickers.RMLDatePickerFragment;
import datetimepickers.HoraInicialTimePickerFragment;
import domain.RML;


/**
 * Created by Tadeu on 01/12/2015.
 */
public class RMLCadastroFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private Spinner sp_subarea;
    private Spinner sp_pgv;
    private Spinner sp_turno;
    private Spinner sp_clima;
    private Spinner sp_mare;
    private Spinner sp_gv1;
    private Spinner sp_gv2;
    private Spinner sp_gv3;
    private Spinner sp_gv4;
    private TextView tv_data_rml;
    private TextView tv_hora_inicial_rml;
    private TextView tv_hora_final_rml;
    private EditText et_obs;

    RML rml;


    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cadastro_rml, container, false);

        sp_pgv = (Spinner) view.findViewById(R.id.sp_pgv);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                getContext(),
                R.array.pgvs,
                android.R.layout.simple_spinner_dropdown_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        sp_pgv.setAdapter(adapter);
        sp_pgv.setOnItemSelectedListener(this);

        sp_subarea = (Spinner) view.findViewById(R.id.sp_subarea);
        sp_turno = (Spinner) view.findViewById(R.id.sp_turno);
        sp_clima = (Spinner) view.findViewById(R.id.sp_clima);
        sp_mare = (Spinner) view.findViewById(R.id.sp_mare);
        sp_gv1 = (Spinner) view.findViewById(R.id.sp_gv1);
        sp_gv2 = (Spinner) view.findViewById(R.id.sp_gv2);
        sp_gv3 = (Spinner) view.findViewById(R.id.sp_gv3);
        sp_gv4 = (Spinner) view.findViewById(R.id.sp_gv4);


        tv_data_rml = (TextView) view.findViewById(R.id.tv_data_rml);
        tv_data_rml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog(v);
            }
        });

        tv_hora_inicial_rml = (TextView) view.findViewById(R.id.tv_hora_inicial_rml);
        tv_hora_inicial_rml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialogHrIni(v);
            }
        });

        tv_hora_final_rml = (TextView) view.findViewById(R.id.tv_hora_final_rml);
        tv_hora_final_rml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialogHrFim(v);
            }
        });

        et_obs = (EditText) view.findViewById(R.id.et_obs);

        return view;
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new RMLDatePickerFragment();
        newFragment.show(getChildFragmentManager(), "datePicker");
    }

    public void showTimePickerDialogHrIni(View v) {
        DialogFragment newFragment = new HoraInicialTimePickerFragment();
        newFragment.show(getChildFragmentManager(), "timePickerHrIni");
    }

    public void showTimePickerDialogHrFim(View v) {
        DialogFragment newFragment = new HoraFinalTimePickerFragment();
        newFragment.show(getChildFragmentManager(), "timePickerHrFim");
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        rml.setPGV(parent.getItemAtPosition(pos).toString());
        Toast.makeText(getContext(), "item selecionado: " + rml.getPGV(), Toast.LENGTH_SHORT).show();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

}
