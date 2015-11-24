package bombeiros.pr.gov.br.sisgv;


import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.content.*;

public class TelaInicial extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_inicial);

        AsyncTask<Void, Integer, Void> myAsyncTask = new AsyncTask<Void, Integer, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                //Log.d(TAG, "doing some work in background");
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(20);
                        publishProgress(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
               //Log.d(TAG, "update progress bar here: " + values[0]);
            }

            @Override
            protected void onPostExecute(Void result) {
                //Log.d(TAG, "finishing background work, can start activity here");
                Intent it_inicial_login = new Intent(getBaseContext(), TelaLogin.class);
                startActivity(it_inicial_login);
            }
        };
        myAsyncTask.execute();


    }

}
