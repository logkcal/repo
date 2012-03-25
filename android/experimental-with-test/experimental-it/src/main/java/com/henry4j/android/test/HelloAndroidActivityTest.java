package com.henry4j.android.test;

import android.test.ActivityInstrumentationTestCase2;
import com.henry4j.android.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void testError() {
        int i = 1;
        int j = 0;
        int k = i / j;
    }

    public void testFailure() {
        assertNotNull(null);
    }
}

