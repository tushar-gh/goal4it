package me.goal4it.app;

import me.goal4it.app.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Main extends TabActivity {
	// TabSpec Names
	//private static final String INBOX_SPEC = "Inbox";
	private static final String LOGIN_SPEC = "Login";
	//private static final String OUTBOX_SPEC = "Outbox";
	private static final String OUTBOX_SPEC = "Feeds";
	//private static final String PROFILE_SPEC = "Profile";
	private static final String PROFILE_SPEC = "Home";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TabHost tabHost = getTabHost();
        
        /*// Inbox Tab
        TabSpec inboxSpec = tabHost.newTabSpec(INBOX_SPEC);
        // Tab Icon
        inboxSpec.setIndicator(INBOX_SPEC, getResources().getDrawable(R.drawable.icon_inbox));
        Intent inboxIntent = new Intent(this, InboxActivity.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);*/
        // Login Tab
        TabSpec loginSpec = tabHost.newTabSpec(LOGIN_SPEC);
        // Tab Icon
        loginSpec.setIndicator(LOGIN_SPEC, getResources().getDrawable(R.drawable.icon_inbox));
        Intent loginIntent = new Intent(this, LoginActivity.class);
        // Tab Content
        loginSpec.setContent(loginIntent);
        
        // Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(OUTBOX_SPEC);
        outboxSpec.setIndicator(OUTBOX_SPEC, getResources().getDrawable(R.drawable.icon_outbox));
        Intent outboxIntent = new Intent(this, OutboxActivity.class);
        outboxSpec.setContent(outboxIntent);
        
        /*// Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(PROFILE_SPEC);
        profileSpec.setIndicator(PROFILE_SPEC, getResources().getDrawable(R.drawable.icon_profile));
        Intent profileIntent = new Intent(this, ProfileActivity.class);
        profileSpec.setContent(profileIntent);*/
        // Home Tab
        TabSpec homeSpec = tabHost.newTabSpec(PROFILE_SPEC);
        homeSpec.setIndicator(PROFILE_SPEC, getResources().getDrawable(R.drawable.icon_profile));
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homeSpec.setContent(homeIntent);
        
        // Adding all TabSpec to TabHost
        //tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(loginSpec);
        tabHost.addTab(outboxSpec); // Adding Outbox tab
        //tabHost.addTab(profileSpec); // Adding Profile tab
        tabHost.addTab(homeSpec);
    }
}