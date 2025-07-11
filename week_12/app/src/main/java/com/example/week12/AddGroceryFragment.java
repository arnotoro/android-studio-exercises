package com.example.week12;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.week12.GroceryListAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddGroceryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddGroceryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddGroceryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddGroceryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddGroceryFragment newInstance(String param1, String param2) {
        AddGroceryFragment fragment = new AddGroceryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_grocery, container, false);
        Button button = (Button) view.findViewById(R.id.buttonAddGrocery);
        button.setOnClickListener(v -> {
            String name = ((EditText) view.findViewById(R.id.editGroceryName)).getText().toString();
            String note = ((EditText) view.findViewById(R.id.editGroceryNote)).getText().toString();
            boolean isBought = ((CheckBox) view.findViewById(R.id.checkImportant)).isChecked();
            ListGrocery.getInstance().addGrocery(new Grocery(name, note, isBought));
        });


        return view;
    }


}