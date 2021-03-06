package com.example.selfjournalparty;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.selfjournalparty.utilities.JournalApi;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;

public class PostJournalActivity extends AppCompatActivity  {
    //implements View.OnClickListener
    private Button saveButton;
    private ProgressBar progressBar;
    private ImageView addPhotoButton;
    private EditText titleEditText;
    private EditText thoughtEditText;
    private TextView currentUserTextView;
    private ImageView postImageView;

    private final int GALLERY_CODE = 1;
    private Uri imageUri  ;

    private String currentUserId;
    private String currentUserName;

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser user;

    //Connection to FireStore
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private StorageReference storageReference;

    private CollectionReference collectionReference = db.collection("Journal");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_journal);

//        firebaseAuth = FirebaseAuth.getInstance();
//        progressBar.findViewById(R.id.post_progressBar);
//        titleEditText.findViewById(R.id.post_title_et);
//        thoughtEditText.findViewById(R.id.post_description_et);
//        currentUserTextView.findViewById(R.id.post_username_textview);
//        postImageView.findViewById(R.id.post_imageView);

//        saveButton.findViewById(R.id.post_save_journal_button);
//        saveButton.setOnClickListener(this);
//
//        addPhotoButton.findViewById(R.id.post_Camera_Button);
//        addPhotoButton.setOnClickListener(this);

//        if (JournalApi.getInstance() != null){
//            currentUserId = JournalApi.getInstance().getUserId();
//            currentUserName = JournalApi.getInstance().getUsername();
//
//            currentUserTextView.setText(currentUserName);
//        }
//
//        authStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                user = firebaseAuth.getCurrentUser();
//                if(user != null){
//
//                }else {
//
//                }
//            }
//
//        };




    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case  R.id.post_save_journal_button:
//                //save Journal
//                break;
//            case R.id.post_Camera_Button:
//                //get image from gallery/Phone
//                Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
//                galleryIntent.setType("image/*");
//
//                startActivityForResult(galleryIntent, GALLERY_CODE);
//                break;
//
//        }
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == GALLERY_CODE && requestCode == RESULT_OK){
//            if (data != null){
//                imageUri = data.getData(); // we have the actual path
//                postImageView.setImageURI(imageUri);//show image
//
//            }
//        }
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        user = firebaseAuth.getCurrentUser();
//        firebaseAuth.addAuthStateListener(authStateListener);
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (firebaseAuth != null){
//            firebaseAuth.removeAuthStateListener(authStateListener);
//        }
//    }
}