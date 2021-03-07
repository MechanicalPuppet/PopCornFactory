package hernandez.brandon.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_serie.*

class DetalleSerie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_serie)

        var bundle = intent.extras

        if(bundle != null){
            // iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            //            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            //            tv_pelicula_desc.setText(bundle.getString("sinopsis"))

            iv_serie_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_serie.setText(bundle.getString("titulo"))
            tv_serie_desc.setText(bundle.getString("sinopsis"))

        }
    }
}