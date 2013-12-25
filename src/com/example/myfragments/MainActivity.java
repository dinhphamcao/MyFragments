package com.example.myfragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Configuration config = getResources().getConfiguration();
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		if(config.orientation==Configuration.ORIENTATION_LANDSCAPE){
			
			LM_Fragment ls_fragment = new LM_Fragment();
			fragmentTransaction.replace(android.R.id.content, ls_fragment);
			
		}else{
			
			PM_Fragment pm_fragment = new PM_Fragment();
			fragmentTransaction.replace(android.R.id.content, pm_fragment);
		}
		fragmentTransaction.commit();
		
	}


}
