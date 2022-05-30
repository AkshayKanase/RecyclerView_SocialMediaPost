package com.example.socialrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclePost;
   private PostAdapter postAdapter;
   private ArrayList<Post> post;
   private  int[] imgPost;
   private  Post posted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPosted();
        initData();
        initView();
    }

    public Post getPosted() {
        return posted;
    }

    private void initView(){
        recyclePost=findViewById(R.id.recyclePost);
        recyclePost.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        postAdapter=new PostAdapter(post);
        recyclePost.setAdapter(postAdapter);


    }

    private void initData(){
        imgPost= new int[]{R.drawable.kerala1, R.drawable.kerala2, R.drawable.kerala3, R.drawable.kerala4, R.drawable.goa1, R.drawable.goa2, R.drawable.goa3, R.drawable.goa4,
                R.drawable.manali1, R.drawable.manali2, R.drawable.manali3, R.drawable.manali4, R.drawable.kokan1, R.drawable.kokan2, R.drawable.kokan3, R.drawable.kokan4};
       post=new ArrayList<Post>();

       for(int i=0;i<=15;i++){
           post.add(
                   new Post(i,"Travel Diary",imgPost[i], 0, R.drawable.like4)

           );
       }



    }
}