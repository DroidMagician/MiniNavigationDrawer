package slidingpaneldemo.kishanrvajani.com.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import slidingpaneldemo.kishanrvajani.com.slidingpaneldemo.R;

public class Fragment1 extends Fragment {
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //  View view = inflater.inflate(R.layout.fragment1, container);
        View view=inflater.inflate(R.layout.fragment1, container,false);
        // setListAdapter(new MenuListAdapter(R.layout.row_menu_action_item, getActivity(), MenuActionItem.values()));
        return view;
    }
}
