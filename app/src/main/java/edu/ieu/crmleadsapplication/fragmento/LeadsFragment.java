package edu.ieu.crmleadsapplication.fragmento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import edu.ieu.crmleadsapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeadsFragment} factory method to
 * create an instance of this fragment.
 */
public class LeadsFragment extends Fragment {
    private LeadsFragment leadsFragment;
    private ListView myLeadLists;
    private ArrayAdapter<String> myLeadsAdapter;


    public LeadsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    public static LeadsFragment newInstance(){
        return new LeadsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_leads, container, false);
        myLeadLists = (ListView) root.findViewById(R.id.leads_list);
        String[] leadsNames = {

                "Alexander Pierrot",

                "Carlos Lopez",

                "Sara Bonz",

                "Liliana Clarence",

                "Benito Peralta",

                "Juan Jaramillo",

                "Christian Steps",

                "Alexa Giraldo",

                "Linda Murillo",

                "Lizeth Astrada"

        };

        myLeadsAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                leadsNames
        );
        myLeadLists.setAdapter(myLeadsAdapter);
        return root;

    }
}