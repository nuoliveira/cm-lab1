package pt.ipvc.nuoliveira.lab1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<Button>(R.id.button).setOnClickListener {
            finish()
        }
    }
}
