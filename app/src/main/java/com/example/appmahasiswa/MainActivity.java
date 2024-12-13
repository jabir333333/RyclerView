package com.example.appmahasiswa;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Hardcoded list of students
        studentList = new ArrayList<>();
        studentList.add(new Student("2312500560", "Ramdhan Al Djabir", "aldjabirr@gmail.com", "2005-28-10"));
        studentList.add(new Student("2312500576", "Pratama Agus", "pratamaAgus7@gmail.com", "2005-010-10"));
        studentList.add(new Student("2311500598", "zahrif ", "Zhar1010@yahoo.com", "2003-11-03"));
        studentList.add(new Student("2312500543", "putri Situmorang", "putsimu@yahoo.com", "2003-04-12"));
        studentList.add(new Student("2311500923", "bimo P.D", "aryabimo@gmail.com", "1999-10-02"));

        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);
    }
}