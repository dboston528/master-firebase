package com.example.mastering_firebase_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize cloud firestore:
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // Create new map object to send data to the dv
        Map<String, Object> user = new HashMap<>();

        //Add data to this map
        user.put("first", "John");
        user.put("last", "Cena");
        user.put("born", "New York");

        //Step 4: Add a new document with a generated ID:
        db.collection(collectionPath: "users")
            .add(user).addSuccessListener(new onNew)



    }
}
