package hernandez.brandon.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)

        val bundle = intent.extras
        var movie: String = ""
        var seat: Int = 0


        val tv_movie: TextView = findViewById(R.id.tituloPelicula)
        val tv_seats: TextView = findViewById(R.id.asiento)

        if(bundle != null){
            movie = bundle.getString("movie")!!
            seat = bundle.getInt("seat")
        }

        tv_movie.setText("$movie")
        tv_seats.setText("En el asiento: $seat")

    }
}