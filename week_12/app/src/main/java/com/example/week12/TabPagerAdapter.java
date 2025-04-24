package com.example.week12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.Map;

public class TabPagerAdapter extends FragmentStateAdapter {
    private Map<Integer, String> mFragmentTags;
    private FragmentManager mFragmentManager;


        public TabPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 1:
                    return new AddGroceryFragment();
                case 2:
                    return new ListGroceryFragment();
                default:
                    return new MainPageFragment();
            }
        }
        @Override
        public int getItemCount() {
            return 3;
        }
}
