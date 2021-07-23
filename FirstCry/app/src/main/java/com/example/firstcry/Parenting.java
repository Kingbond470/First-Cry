package com.example.firstcry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.firstcry.Parenting_Fragments.Fragment_DocConnect;
import com.example.firstcry.Parenting_Fragments.Fragment_Home;
import com.example.firstcry.Parenting_Fragments.Fragment_Memories;
import com.example.firstcry.Parenting_Fragments.Fragment_QandA;
import com.example.firstcry.Parenting_Fragments.Fragment_Read;
import com.example.firstcry.Parenting_Fragments.Fragment_VaccineAndGrowth;
import com.example.firstcry.Parenting_Fragments.ParentingAdapter;
import com.google.android.material.tabs.TabLayout;

public class Parenting extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parenting);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.setupWithViewPager(viewPager);

        ParentingAdapter adapter = new ParentingAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new Fragment_Home(), "HOME");
        adapter.addFragment(new Fragment_Read(), "READ");
        adapter.addFragment(new Fragment_DocConnect(), "DocConnect");
        adapter.addFragment(new Fragment_QandA(), "Q&A");
        adapter.addFragment(new Fragment_Memories(), "MEMORIES");
        adapter.addFragment(new Fragment_VaccineAndGrowth(), "VACCINE & GROWTH");
        viewPager.setAdapter(adapter);

    }
}
