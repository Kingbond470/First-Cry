package com.example.firstcry.Parenting_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstcry.Parenting_Fragments.Parenting_Recycler.HomeAdapter;
import com.example.firstcry.Parenting_Fragments.Parenting_Recycler.HomeModel;
import com.example.firstcry.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_VaccineAndGrowth#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_VaccineAndGrowth extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<HomeModel> homeModelArrayList;

    public Fragment_VaccineAndGrowth() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_VaccineAndGrowth.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_VaccineAndGrowth newInstance(String param1, String param2) {
        Fragment_VaccineAndGrowth fragment = new Fragment_VaccineAndGrowth();
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
        View view = inflater.inflate(R.layout.fragment__vaccine_and_growth, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        homeModelArrayList = new ArrayList<>();

        HomeModel ob1 = new HomeModel(R.drawable.recycler_image_1, "Headache after C-Section");
        homeModelArrayList.add(ob1);

        HomeModel ob2 = new HomeModel(R.drawable.recycler_image_1, "Headache after C-Section");
        homeModelArrayList.add(ob2);

        HomeModel ob3 = new HomeModel(R.drawable.recycler_image_1, "Headache after C-Section");
        homeModelArrayList.add(ob3);

        HomeModel ob4 = new HomeModel(R.drawable.recycler_image_1, "Headache after C-Section");
        homeModelArrayList.add(ob4);

        recyclerView.setAdapter(new HomeAdapter(homeModelArrayList));


        return view;
    }
}