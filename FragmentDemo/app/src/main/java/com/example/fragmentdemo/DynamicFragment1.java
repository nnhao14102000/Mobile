package com.example.fragmentdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DynamicFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DynamicFragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DynamicFragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DynamicFragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static DynamicFragment1 newInstance(String param1, String param2) {
        DynamicFragment1 fragment = new DynamicFragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Dynamic 1", "onCreate");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Dynamic 1", "onCreateView");
        return inflater.inflate(R.layout.fragment_dynamic1, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d("Dynamic 1", "onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d("Dynamic 1", "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("Dynamic 1", "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Dynamic 1", "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("Dynamic 1", "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("Dynamic 1", "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("Dynamic 1", "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("Dynamic 1", "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("Dynamic 1", "onDetach");
        super.onDetach();
    }
}