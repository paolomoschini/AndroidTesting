package it.paolomoschini.usermanagerrestrictions.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

import it.paolomoschini.usermanagerrestrictions.R;
import it.paolomoschini.usermanagerrestrictions.userrestriction.UserManager;
import it.paolomoschini.usermanagerrestrictions.userrestriction.UserRestriction;

/**
 * Created by paolo on 20/01/16.
 */
public class UserManagerAdapter extends RecyclerView.Adapter<UserManagerAdapter.ViewHolder> {

    private ArrayList<UserManager> dataSet;

    public UserManagerAdapter(ArrayList<UserManager> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public UserManagerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_restriction_item, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = ((ViewHolder)view.getTag()).getAdapterPosition();
                String type = dataSet.get(position).getType();
                UserRestriction.applyUserRestriction(view.getContext(), type);
                Toast.makeText(view.getContext(),"Apply " + type,Toast.LENGTH_SHORT).show();
            }
        });

        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserManagerAdapter.ViewHolder holder, int position) {
        holder.typeOfRestrictionTextView.setText(dataSet.get(position).getType().toUpperCase());
        holder.descritionOfRestrictionTextView.setText(dataSet.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView typeOfRestrictionTextView;
        public TextView descritionOfRestrictionTextView;

        public ViewHolder(View view) {
            super(view);
            typeOfRestrictionTextView = (TextView)view.findViewById(R.id.typeOfRestrictionTextView);
            descritionOfRestrictionTextView = (TextView)view.findViewById(R.id.descritionOfRestrictionTextView);
        }
    }
}
