package me.saufi.guidetogi_dle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMembersAdapter extends RecyclerView.Adapter<CardViewMembersAdapter.CardViewViewHolder> {

    private ArrayList<Members> listMembers;

    public CardViewMembersAdapter(ArrayList<Members> list) {
        this.listMembers = list;
    }
    @NonNull
    @Override
    public CardViewMembersAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.member_list, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewMembersAdapter.CardViewViewHolder holder, int position) {

        Members members = listMembers.get(position);

        Glide.with(holder.itemView.getContext())
                .load(members.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);

        holder.tvName.setText(members.getName());
        holder.tvPosition.setText(members.getPosition());

    }

    @Override
    public int getItemCount() {
        return listMembers.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvPosition;

        public CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TODO - ADD NEW ACTIVITY TO DISPLAY MORE DETAILS

                }
            });
            imgPhoto = itemView.findViewById(R.id.members_image);
            tvName = itemView.findViewById(R.id.members_name);
            tvPosition = itemView.findViewById(R.id.members_position);
        }

    }
}