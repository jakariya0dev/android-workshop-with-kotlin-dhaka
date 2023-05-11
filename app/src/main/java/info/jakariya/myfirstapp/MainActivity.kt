package info.jakariya.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
3
        findViewById<TextView>(R.id.hire_me_tv_id).setOnClickListener {

            Toast.makeText(this, "Hire Me Button Clicked", Toast.LENGTH_SHORT).show()

        }

        findViewById<Button>(R.id.btn_contact_me_id).setOnClickListener {
            startActivity(Intent(this, ContactMe::class.java))
        }
    }
}