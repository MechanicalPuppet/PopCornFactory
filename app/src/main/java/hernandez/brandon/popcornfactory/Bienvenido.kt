package hernandez.brandon.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bienvenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        var btn: Button = findViewById(R.id.buttonBienvenido) as Button


        btn.setOnClickListener{
            var intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}