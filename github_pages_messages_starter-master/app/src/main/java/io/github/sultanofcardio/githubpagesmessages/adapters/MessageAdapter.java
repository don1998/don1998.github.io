package io.github.sultanofcardio.githubpagesmessages.adapters;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.sultanofcardio.githubpagesmessages.R;
import io.github.sultanofcardio.githubpagesmessages.models.Message;


/**
 * @author sultanofcardio
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageHolder> {
    private List<Message> messages;

    public MessageAdapter(){
        //TODO: Initialize the list here

        messages = Message.listAll(Message.class);
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO: return an instance of the ViewHolder with the view inflated

        return null;
    }

    @Override
    public void onBindViewHolder(MessageHolder holder, int position) {
        //TODO: Modify the views here using your ViewHolder
    }

    @Override
    public int getItemCount() {
        //TODO: Return the size of your list
        return 0;
    }

    public void update(){
        //TODO: //Refresh the data by checking the database and update the views
    }

    /**
     * This class has been written for you
     */
    class MessageHolder extends RecyclerView.ViewHolder{
        TextView name, email, message;

        public MessageHolder(final View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name_value);
            email = (TextView) itemView.findViewById(R.id.email_value);
            message = (TextView) itemView.findViewById(R.id.message_value);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + email.getText().toString()));
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
