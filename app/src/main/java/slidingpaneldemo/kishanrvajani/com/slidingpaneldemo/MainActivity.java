package slidingpaneldemo.kishanrvajani.com.slidingpaneldemo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment1;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment2;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment3;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment4;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment5;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment6;
import slidingpaneldemo.kishanrvajani.com.Fragments.Fragment7;

public class MainActivity extends AppCompatActivity{
    private boolean isTransactionSafe;

    //Boolean variable to mark if there is any transaction pending
    private boolean isTransactionPending;
    FrameLayout flContent;
    Fragment fragment = null;
    Class fragmentClass;
    public static Handler HomeFragmentHandler;
    SlidingPaneLayout sliding_pane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//getSupportActionBar().hide();
        flContent = (FrameLayout)findViewById(R.id.flContent);

        sliding_pane = (SlidingPaneLayout)findViewById(R.id.sliding_pane);

        sliding_pane.setSliderFadeColor(getResources().getColor(android.R.color.transparent));
        //  sliding_pane.openPane();



        fragmentClass = Fragment1.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(MenuFragment.fragmentMenuBinding != null)
        {
            MenuFragment.fragmentMenuBinding.lilPost.performClick();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
        transaction.replace(R.id.flContent, fragment);
        transaction.addToBackStack(null);
        transaction.commit();






        HomeFragmentHandler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 0:
                    {

                        if(isTransactionSafe) {
                            fragmentClass = Fragment1.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        break;
                    }
                    case 1:
                    {

                        if(isTransactionSafe) {
                            fragmentClass = Fragment2.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        //  fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
                        //  setListViewHeightBasedOnChildren(fragmentHomeBinding.listView);
                        break;
                    }
                    case 2:
                    {
                        if(isTransactionSafe) {
                            fragmentClass = Fragment3.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        // fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
                        break;
                    }
                    case 3:
                    {
                        if(isTransactionSafe) {
                            fragmentClass = Fragment4.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        // fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
                        break;
                    }
                    case 4:
                    {
                        if(isTransactionSafe) {
                            fragmentClass = Fragment5.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        };
                        break;
                    }
                    case 5:
                    {
                        if(isTransactionSafe) {
                            fragmentClass = Fragment6.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        break;
                    }
                    case 6:
                    {
                        if(isTransactionSafe) {
                            fragmentClass = Fragment7.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        break;
                    }
                    case 10:

                    default:
                        if(isTransactionSafe) {
                            fragmentClass = Fragment1.class;
                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                            transaction.replace(R.id.flContent, fragment);
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            isTransactionPending=true;
                        }
                        //fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
                        break;
                }
            }
        };
    }


    public void onPostResume(){
        super.onPostResume();
        isTransactionSafe=true;
    }


    public void onPause(){
        super.onPause();
        isTransactionSafe=false;
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
