package bombeiros.pr.gov.br.sisgv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class RMLCadastro extends AppCompatActivity {

    private Drawer navigationDrawerLeft;
    private AccountHeader headerNavigationLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_rmlcadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                                Intent it = new Intent(getBaseContext(), TelaHome.class);
                                startActivity(it);
                                break;
                            }
                            case 2: {
                                Toast.makeText(RMLCadastro.this, "Mandar parâmetro para setar RMLFragment no TelaHome", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 3: {
                                Toast.makeText(RMLCadastro.this, "Mandar parâmetro para setar RSDFragment no TelaHome", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }

                        Toast.makeText(RMLCadastro.this, "onItemClick: " + position, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                })
                .withOnDrawerItemLongClickListener(new Drawer.OnDrawerItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(View view, int position, IDrawerItem drawerItem) {
                        Toast.makeText(RMLCadastro.this, "onItemLongClick: " + position, Toast.LENGTH_SHORT).show();
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
        getMenuInflater().inflate(R.menu.rmlcadastro, menu);
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
