package bombeiros.pr.gov.br.sisgv;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.interfaces.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import java.util.ArrayList;
import java.util.List;

import domain.RML;
import domain.RSD;
import fragment.HomeFragment;
import fragment.RMLFragment;
import fragment.RSDFragment;

public class TelaHome extends AppCompatActivity {

    private Toolbar toolbar;

    private Drawer navigationDrawerLeft;
    private AccountHeader headerNavigationLeft;

    private FloatingActionMenu fab;

    private List<PrimaryDrawerItem> listCategorias;
    private List<RML> listRML;
    private List<RSD> listRSD;

    private int mPositionClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_home);

        fab = (FloatingActionMenu) findViewById(R.id.fab_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // FRAGMENT

        HomeFragment frag = (HomeFragment) getSupportFragmentManager().findFragmentByTag("homeFrag");
        if (frag == null) {
            frag = new HomeFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.rl_home_fragment_container, frag, "homeFrag");
            ft.commit();
        }

        //NAVIGATION DRAWER
        //HEADER - LEFT
        headerNavigationLeft = new AccountHeaderBuilder()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withThreeSmallProfileImages(false)
                .withSelectionListEnabledForSingleProfile(false)
                .withHeaderBackground(R.drawable.bkg_sidebar_10)
                .addProfiles(
                        new ProfileDrawerItem().withName("Ten. Nunes")
                                .withEmail("tadeu.nunes@bm.pr.gov.br")
                                .withIcon(getResources().getDrawable(R.drawable.perfil_sidebar))
                )
                .build();

        //BODY - LEFT
        navigationDrawerLeft = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withDisplayBelowStatusBar(true)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.START)
                .withSavedInstance(savedInstanceState)
                .withAccountHeader(headerNavigationLeft)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        switch (position) {
                            case 1: {
                                HomeFragment frag = (HomeFragment) getSupportFragmentManager().findFragmentByTag("homeFrag");
                                if (frag == null) {
                                    frag = new HomeFragment();
                                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                                    ft.replace(R.id.rl_home_fragment_container, frag, "homeFrag");
                                    ft.commit();
                                }
                                break;
                            }
                            case 2: {
                                RMLFragment frag = (RMLFragment) getSupportFragmentManager().findFragmentByTag("rmlFrag");
                                if (frag == null) {
                                    frag = new RMLFragment();
                                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                                    ft.replace(R.id.rl_home_fragment_container, frag, "rmlFrag");
                                    ft.commit();
                                }
                                break;
                            }
                            case 3: {
                                RSDFragment frag = (RSDFragment) getSupportFragmentManager().findFragmentByTag("rsdFrag");
                                if (frag == null) {
                                    frag = new RSDFragment();
                                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                                    ft.replace(R.id.rl_home_fragment_container, frag, "rsdFrag");
                                    ft.commit();
                                }
                                break;
                            }

                        }

                        Toast.makeText(TelaHome.this, "onItemClick: " + position, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                })
                .withOnDrawerItemLongClickListener(new Drawer.OnDrawerItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(View view, int position, IDrawerItem drawerItem) {
                        Toast.makeText(TelaHome.this, "onItemLongClick: " + position, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                })
                .build();
        navigationDrawerLeft.addItem(new PrimaryDrawerItem()
                .withName("Início").withIcon(getResources()
                        .getDrawable(R.mipmap.ic_home)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem()
                .withName("RML").withIcon(getResources()
                        .getDrawable(R.mipmap.ic_rml_navbar)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem()
                .withName("RSD").withIcon(getResources()
                        .getDrawable(R.mipmap.ic_rsd_navbar)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem()
                .withName("Sobre").withIcon(getResources()
                        .getDrawable(R.mipmap.ic_sobre_navbar)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem()
                .withName("Sair").withIcon(getResources()
                        .getDrawable(R.mipmap.ic_exit)));

    }


    //FAZER CATEGORIAS DE RSD E RML COMO AS CATEGORIAS DE CARRO,

    /*
    private List<PrimaryDrawerItem> getSetCategoryList(){
        String[] names = new String[]{"Início", "RML", "RSD", "Sobre", "Sair"};
        int[] icons = new int[]{R.mipmap.ic_inicio, R.mipmap.ic_rml_navbar, R.mipmap.ic_rsd_navbar,
                R.mipmap.ic_sobre_navbar, R.mipmap.ic_sair_navdrawer};
        int[] iconsSelected = new int[]{R.mipmap.ic_inicio, R.mipmap.ic_rml_navbar, R.mipmap.ic_rsd_navbar,
                R.mipmap.ic_sobre_navbar, R.mipmap.ic_sair_navdrawer};
        List<PrimaryDrawerItem> list = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            PrimaryDrawerItem aux = new PrimaryDrawerItem();
            aux.withName(names[i]);
            aux.withIcon(getResources().getDrawable(icons[i]));
            aux.withSelectedTextColor(getResources().getColor(R.color.colorPrimaryText));
            aux.withSelectedIcon(getResources().getDrawable(iconsSelected[i]));
            aux.withSelectedTextColor(getResources().getColor(R.color.colorPrimary));

            list.add( aux );
        }
        return(list);
    }
    */

    public List<RML> getSetRMLList(int qtd) {

        String[] PGV = new String[]{"PGV Central", "PGV Thalia", "PGV Brejatuba", "PGV Banestado", "PGV Leste II", "PGV Ipanema III",
                "PGV UFPR", "PGV Albatroz", "PGV Gaivotas"};
        String[] data = new String[]{"20 dez. 15", "23 dez. 15", "19 jan. 16", "12 dez. 15", "9 fev. 16", "17 jan. 16", "14 dez. 15",
                "15 fev. 15", "2 jan. 16"};
        int[] photo = new int[]{R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10,
                R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10, R.drawable.logorml_10, R.drawable.logorsd_10,};
        List<RML> listAux = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            RML rml = new RML(photo[i % PGV.length], PGV[i % PGV.length], data[i % data.length]);
            listAux.add(rml);

        }
        return (listAux);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState = navigationDrawerLeft.saveInstanceState(outState);
        outState = headerNavigationLeft.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        if (navigationDrawerLeft.isDrawerOpen()) {
            navigationDrawerLeft.closeDrawer();
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


}
