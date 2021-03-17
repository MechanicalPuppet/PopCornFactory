package hernandez.brandon.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import java.util.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)


        val bundle = intent.extras
        var ns = 0;
        var id = -1;
        var title = "";
        val random = Random()
        var seats = random.nextInt(21)

        if(bundle!=null){


            seatsLeft.setText("$seats seats available")


            //ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
           // seatsLeft.setText("$ns seats available ")
            id = bundle.getInt("pos")

        }

        if(seats == 0){
          buyTickets.isEnabled = false
        } else {
            buyTickets.isEnabled=true
            buyTickets.setOnClickListener {

                val intent: Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("id",id )
                intent.putExtra("name", title) //Aquí la profe se acordó por qué era mejor enviar el array
                intent.putExtra("seatsAvailable", seats)
                this.startActivity(intent) //Hacer la lógica de que cuando le piquen a uno salga iluminado y así

            }
        }
    }
}