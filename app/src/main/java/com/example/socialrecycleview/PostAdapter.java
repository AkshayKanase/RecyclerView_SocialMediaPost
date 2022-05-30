package com.example.socialrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
    private ArrayList<Post> post;


    public PostAdapter(ArrayList<Post> post) {
        this.post=post;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        public TextView txtViewTitle;
        public ImageView imageViewPost;
         public TextView txtViewLikes;
         public ImageView imageViewLikeButton;



        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            txtViewTitle=itemView.findViewById(R.id.txtViewTitle);
            imageViewPost=itemView.findViewById(R.id.imageViewPost);
            txtViewLikes=itemView.findViewById(R.id.txtViewLikes);
            imageViewLikeButton=itemView.findViewById(R.id.imgViewLikeButton);

            imageViewLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                   int likeCountStatus=Integer.parseInt(txtViewLikes.getText().toString());
                    likeCountStatus++;
                    txtViewLikes.setText(""+likeCountStatus);
                }
            });
        }
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.post_recycle_view,null);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post posts= post.get(position);
        holder.txtViewTitle.setText(posts.getTitle());
        holder.imageViewPost.setImageResource(posts.getImageId());
        holder.txtViewLikes.setText(""+posts.getLikesCount());
        holder.imageViewLikeButton.setImageResource(posts.getLikeImageId());



      /*  holder.txtViewLikes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nt likes=Integer.parseInt(holder.txtViewLikes.getText().toString());
                        likes++;
                        holder.txtViewLikes.setText(""+likes);
                    }
                }
        );

        holder.imageViewLikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   int likes=Integer.parseInt(holder.txtViewLikes.getText().toString());
                    likes++;
                    holder.txtViewLikes.setText(""+likes);

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return post.size();
    }
}
