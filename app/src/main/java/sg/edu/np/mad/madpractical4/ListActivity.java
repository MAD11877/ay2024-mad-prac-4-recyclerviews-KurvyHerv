package sg.edu.np.mad.madpractical4;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.DefaultItemAnimator;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<User> users = new ArrayList<User>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randNum = rand.nextInt(9999999);
            String name = "Name " + randNum;
            String description = "Description " + randNum;

            User user = new User(name, description, randNum, false);
            user.setName("Name " + randNum);
            user.setDescription("Description " + randNum);
            user.setId(randNum);
            users.add(user);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        UserAdapter userAdapter = new UserAdapter(users, this);
        LinearLayoutManager userLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(userLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userAdapter);
    }
}