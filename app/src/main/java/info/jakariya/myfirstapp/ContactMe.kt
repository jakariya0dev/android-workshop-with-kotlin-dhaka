package info.jakariya.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class ContactMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_me)

        val ivProfile = findViewById<ImageView>(R.id.iv_profile_id)
        val imageUrl = "https://images.pexels.com/photos/15529247/pexels-photo-15529247.jpeg?auto=compress&cs=tinysrgb&w=260&h=250&dpr=1"

        Picasso.get()
            .load(imageUrl)
            .into(ivProfile)

        findViewById<Button>(R.id.btn_visit_my_site_id).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.jakariya.info")))
        }

        findViewById<Button>(R.id.btn_call_me_id).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("tel:+8801762940480")))
        }
    }
}