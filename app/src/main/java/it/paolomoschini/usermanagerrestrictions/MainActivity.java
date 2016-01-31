package it.paolomoschini.usermanagerrestrictions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import it.paolomoschini.usermanagerrestrictions.adapter.DividerItemDecoration;
import it.paolomoschini.usermanagerrestrictions.adapter.UserManagerAdapter;
import it.paolomoschini.usermanagerrestrictions.userrestriction.UserManager;
import it.paolomoschini.usermanagerrestrictions.userrestriction.UserRestriction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        UserManagerAdapter userRestrictionsAdapter = new UserManagerAdapter(UserManager.userManagersFactory());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(userRestrictionsAdapter);

        Button clearUserRestrictionButton = (Button)findViewById(R.id.clearURButton);
        clearUserRestrictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserRestriction.clearLastUserRestriction(getApplicationContext());
            }
        });
    }
}
