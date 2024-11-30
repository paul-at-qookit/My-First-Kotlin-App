package com.example.platformbasedcriticalthinkingthree
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {  // Extend AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // Call the parent class method
        setContentView(R.layout.activity_main)  // Link to the XML layout
    }
}