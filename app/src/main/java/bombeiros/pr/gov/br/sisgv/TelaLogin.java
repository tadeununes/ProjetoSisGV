package bombeiros.pr.gov.br.sisgv;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.support.design.widget.*;

public class TelaLogin extends AppCompatActivity implements View.OnClickListener {

    /*private EditText login;
    private EditText senha;*/
    private Button btlogin;

    private RelativeLayout mRoot;
    private TextInputLayout mEmailLayout;
    private TextInputLayout mPasswordLayout;
    private EditText mInputEmail;
    private EditText mInputPassword;

    private View.OnClickListener mSnackBarClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_login);

        mRoot = (RelativeLayout) findViewById(R.id.telaloginlayout);
        mEmailLayout = (TextInputLayout) findViewById(R.id.email_layout);
        mPasswordLayout = (TextInputLayout) findViewById(R.id.password_layout);
        mInputEmail = (EditText) findViewById(R.id.input_email);
        mInputPassword = (EditText) findViewById(R.id.input_password);

        /*EditText login = (EditText) findViewById(R.id.login);
        EditText senha = (EditText) findViewById(R.id.senha);*/

        Button btlogin = (Button) findViewById(R.id.btlogin);
        btlogin.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent it_login_home = new Intent(this, TelaHome.class);
        startActivity(it_login_home);
    }

    public void submit(View view) {

        boolean isEmptyEmail = isEmptyEmail();
        boolean isEmptyPassword = isEmptyPassword();
        if (isEmptyEmail && isEmptyPassword) {
            Snackbar.make(mRoot, "Um ou mais campos estão em branco!", Snackbar.LENGTH_SHORT)
                    .setAction(getString(R.string.text_dismiss), mSnackBarClickListener)
                    .show();
        } else if (isEmptyEmail && !isEmptyPassword) {
            mEmailLayout.setError("O login não pode estar vazio!");
            mPasswordLayout.setError(null);
        } else if (!isEmptyEmail && isEmptyPassword) {
            mPasswordLayout.setError("A senha não pode estar vazia!");
            mEmailLayout.setError(null);
        } else {
            //All Good Here
        }
    }

    private boolean isEmptyEmail() {
        return mInputEmail.getText() == null
                || mInputEmail.getText().toString() == null
                || mInputEmail.getText().toString().isEmpty();

    }

    private boolean isEmptyPassword() {
        return mInputPassword.getText() == null
                || mInputPassword.getText().toString() == null
                || mInputPassword.getText().toString().isEmpty();

    }


}
