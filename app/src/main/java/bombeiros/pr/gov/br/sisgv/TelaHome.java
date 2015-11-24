package bombeiros.pr.gov.br.sisgv;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;

import domain.RML;
import fragment.HomeFragment;

public class TelaHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FloatingActionMenu fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // FRAGMENT
        HomeFragment frag = (HomeFragment) getSupportFragmentManager().findFragmentByTag("mainFrag");
        if (frag == null) {
            frag = new HomeFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_fragment_container, frag, "mainFrag");
            ft.commit();
        }

        fab = (FloatingActionMenu) findViewById(R.id.fab);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_rml) {

        } else if (id == R.id.nav_rsd) {

        } else if (id == R.id.nav_sobre) {

        } else if (id == R.id.nav_sair) {
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //FAZER CATEGORIAS DE RSD E RML COMO AS CATEGORIAS DE CARRO,
    //SETANDO TBM OS FRAGMENTS DE CADA UMA DELAS
    public List<RML> getSetRMLList(int qtd) {

        String[] PGV = new String[]{"PGV Central", "PGV Thalia", "PGV Brejatuba", "PGV Banestado", "PGV Leste II", "PGV Ipanema III",
                "PGV UFPR", "PGV Albatroz", "PGV Gaivotas"};
        String[] data = new String[]{"20 dez. 15", "23 dez. 15", "19 jan. 16", "12 dez. 15", "9 fev. 16", "17 jan. 16", "14 dez. 15",
                "15 fev. 15", "2 jan. 16"};
        int[] photos = new int[]{R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10,
                R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10,};
        List<RML> listAux = new ArrayList<>();

       for (int i = 0; i < qtd; i++) {
            RML rml = new RML(0, PGV[i % PGV.length], data[i % data.length]);
            //RML rml = new RML(PGV[i % PGV.length], data[i % data.length], photos[i % PGV.length]);
            listAux.add(rml);

        }
        return (listAux);
    }

}
