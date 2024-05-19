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

        //View imageBtn = findViewById(R.id.smallimage);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(999999);
            boolean randomBool = new Random().nextBoolean();
            String profileName = "Name " + random;
            String description = "Description " + random;
            Boolean followed = randomBool;
            int id = i + 2;
            User user = new User(profileName, description, id, followed);
            userList.add(user);
        }
//        imageBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                builder.setMessage("MADness")
//                        .setTitle("Profile")
//                        .setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
//
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Intent intent = (new Intent(v.getContext(), MainActivity.class));
//                                //intent.putExtra("profileName", profileName);
//                                startActivity(intent);
//                            }
//                        })
//                        .setNegativeButton("CLOSE", null);
//                AlertDialog alert = builder.create();
//                alert.show();
//            }
//        });
    }
}