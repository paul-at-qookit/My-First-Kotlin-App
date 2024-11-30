package com.example.platformbasedcriticalthinkingthree
<<<<<<< HEAD
import ListManager
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
=======
import android.os.Bundle
>>>>>>> 57b2bb7 (solved gradle issues so MainActivity and AndroidManifest can function properly)
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {  // Extend AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // Call the parent class method
        setContentView(R.layout.activity_main)  // Link to the XML layout
    }
<<<<<<< HEAD

    private val myManager = ListManager()

    val buttonForTaskAdd = findViewById<Button>(R.id.buttonForTaskAdd)
    val textFieldForTasks = findViewById<EditText>(R.id.textFieldForTasks)
    val markTaskDoneButton = findViewById<Button>(R.id.markTaskDoneButton)
    val textFieldForID = findViewById<EditText>(R.id.textFieldForID)
    val spaceForTaskList = findViewById<TextView>(R.id.spaceForTaskList)






=======
>>>>>>> 57b2bb7 (solved gradle issues so MainActivity and AndroidManifest can function properly)
}