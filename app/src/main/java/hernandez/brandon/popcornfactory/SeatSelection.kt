package hernandez.brandon.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_seat_selection.*
import java.util.*
import kotlin.collections.ArrayList


class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        var posMovie = -1;
        val bundle = intent.extras
        var seleccionado = -1;
        var indice = -1;
        var fila = -1;
        var seats = -1;
        var movieTitle = "";
        val confirm: Button = findViewById(R.id.confirm)

        val boton1: RadioButton = findViewById(R.id.boton1)
        val boton2: RadioButton = findViewById(R.id.boton2)
        val boton3: RadioButton = findViewById(R.id.boton3)
        val boton4: RadioButton = findViewById(R.id.boton4)
        val boton5: RadioButton = findViewById(R.id.boton5)
        val boton6: RadioButton = findViewById(R.id.boton6)
        val boton7: RadioButton = findViewById(R.id.boton7)
        val boton8: RadioButton = findViewById(R.id.boton8)
        val boton9: RadioButton = findViewById(R.id.boton9)
        val boton10: RadioButton = findViewById(R.id.boton10)
        val boton11: RadioButton = findViewById(R.id.boton11)
        val boton12: RadioButton = findViewById(R.id.boton12)
        val boton13: RadioButton = findViewById(R.id.boton13)
        val boton14: RadioButton = findViewById(R.id.boton14)
        val boton15: RadioButton = findViewById(R.id.boton15)
        val boton16: RadioButton = findViewById(R.id.boton16)
        val boton17: RadioButton = findViewById(R.id.boton17)
        val boton18: RadioButton = findViewById(R.id.boton18)
        val boton19: RadioButton = findViewById(R.id.boton19)
        val boton20: RadioButton = findViewById(R.id.boton20)


        if(bundle != null){
            title.setText(bundle.getString("name"))
            movieTitle = bundle.getString("name")!!
            posMovie = bundle.getInt("id")
            seats = bundle.getInt("seatsAvailable")
        }




        confirm.setOnClickListener {

            var seatSelected = seat_selection()
            val intent: Intent = Intent(this, ReservationActivity::class.java)
            intent.putExtra("seat", seatSelected)
            intent.putExtra("movie", movieTitle)
            startActivity(intent)

   /*         var radioButton: View = row1.findViewById(seleccionado)
            var index: Int = -1
            var rb: RadioButton
            if(radioButton != null){
                index = row1.indexOfChild(radioButton)
                row1.getChildAt(index).setBackgroundColor(R.drawable.radio_disabled) as RadioButton
                Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()




            } else {
                radioButton = row2.findViewById(seleccionado)
            }
            if (index != -1){
                index = row2.indexOfChild(radioButton)
                rb = row2.getChildAt(index) as RadioButton
                rb.setBackgroundColor(R.drawable.radio_disabled)
                Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()
            } else{
                radioButton = row3.findViewById(seleccionado)
            }

            if(index != -1){
                index = row3.indexOfChild(radioButton)
                rb = row3.getChildAt(index) as RadioButton
                rb.setBackgroundColor(R.drawable.radio_disabled)
                Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()
            } else {
                radioButton = row4.findViewById(seleccionado)
            }

            if(index != -1){
                index = row4.indexOfChild(radioButton)
                rb = row4.getChildAt(index) as RadioButton
                rb.setBackgroundColor(R.drawable.radio_disabled)
                Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()
            }*/
/*



           // when (row1.get(seleccionado).findViewById(R.id.row)) {
           //
            //    1 -> boton1.setBackgroundColor(R.drawable.radio_disabled)
             //   2 -> boton2.setBackgroundColor(R.drawable.radio_disabled)
              //  3 -> boton3.setBackgroundColor(R.drawable.radio_disabled)
               // 4 -> boton4.setBackgroundColor(R.drawable.radio_disabled)
                //5 -> boton5.setBackgroundColor(R.drawable.radio_disabled)
                //6 -> boton6.setBackgroundColor(R.drawable.radio_disabled)
                //7 -> boton7.setBackgroundColor(R.drawable.radio_disabled)
                //8 -> boton8.setBackgroundColor(R.drawable.radio_disabled)
                //9 -> boton9.setBackgroundColor(R.drawable.radio_disabled)
                //10 -> boton10.setBackgroundColor(R.drawable.radio_disabled)
                //11 -> boton11.setBackgroundColor(R.drawable.radio_disabled)
                //12 -> boton12.setBackgroundColor(R.drawable.radio_disabled)
                //13 -> boton13.setBackgroundColor(R.drawable.radio_disabled);
                //14 -> boton14.setBackgroundColor(R.drawable.radio_disabled)
                //15 -> boton15.setBackgroundColor(R.drawable.radio_disabled)
                //16 -> boton16.setBackgroundColor(R.drawable.radio_disabled)
                //17 -> boton17.setBackgroundColor(R.drawable.radio_disabled)
                //18 -> boton18.setBackgroundColor(R.drawable.radio_disabled)
                //19 -> boton19.setBackgroundColor(R.drawable.radio_disabled)
                //20 -> boton20.setBackgroundColor(R.drawable.radio_disabled)
                //else -> { // Note the block
                   // println("Error")

                //}
*/
 /*           when (fila){
                1 -> {
                    var radioButton: View = row1.findViewById(seleccionado)
                    indice = row1.indexOfChild(radioButton)

                    when (indice){
                        0 -> intent.putExtra("numeroAsiento", 1)
                        1 -> intent.putExtra("numeroAsiento", 2)
                        2 -> intent.putExtra("numeroAsiento", 3)
                        3 -> intent.putExtra("numeroAsiento", 4)
                        4 -> intent.putExtra("numeroAsiento", 5)
                    }

                    intent.putExtra("boton_seleccionado", row1[indice].id)
                   row1[indice].isEnabled = false
                }
                2 -> {
                    var radioButton: View = row2.findViewById(seleccionado)
                    indice = row2.indexOfChild(radioButton)

                    when (indice){
                        0 -> intent.putExtra("numeroAsiento", 6)
                        1 -> intent.putExtra("numeroAsiento", 7)
                        2 -> intent.putExtra("numeroAsiento", 8)
                        3 -> intent.putExtra("numeroAsiento", 9)
                        4 -> intent.putExtra("numeroAsiento", 10)
                    }


                    intent.putExtra("boton_seleccionado", row2[indice].id)
                    row2[indice].isEnabled = false
                }
                3 -> {
                    var radioButton: View = row3.findViewById(seleccionado)
                    indice = row3.indexOfChild(radioButton)

                    when (indice){
                        0 -> intent.putExtra("numeroAsiento", 11)
                        1 -> intent.putExtra("numeroAsiento", 12)
                        2 -> intent.putExtra("numeroAsiento", 13)
                        3 -> intent.putExtra("numeroAsiento", 14)
                        4 -> intent.putExtra("numeroAsiento", 15)
                    }

                    intent.putExtra("boton_seleccionado", row3[indice].id)
                    row3[indice].isEnabled = false

                }
                4 -> {
                    var radioButton: View = row4.findViewById(seleccionado)
                    indice = row4.indexOfChild(radioButton)

                    when (indice){
                        0 -> intent.putExtra("numeroAsiento", 16)
                        1 -> intent.putExtra("numeroAsiento", 17)
                        2 -> intent.putExtra("numeroAsiento", 18)
                        3 -> intent.putExtra("numeroAsiento", 19)
                        4 -> intent.putExtra("numeroAsiento", 20)
                    }
                    intent.putExtra("boton_seleccionado", row4[indice].id)
                   row4[indice].isEnabled = false;
                }

            }*/


        }

        val row1:RadioGroup = findViewById(R.id.row1)
        val row2:RadioGroup = findViewById(R.id.row2)
        val row3:RadioGroup = findViewById(R.id.row3)
        val row4:RadioGroup = findViewById(R.id.row4)

        row1.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)

                fila = 1
                seleccionado = checkedId


            }

        }

        row2.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
                seleccionado = checkedId
                fila = 2
            }

        }

        row3.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()


                row3.check(checkedId)
                seleccionado = checkedId
                fila = 3;
            }

        }

        row4.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()

                row4.check(checkedId)
                seleccionado = checkedId
                fila = 4;
            }

        }
        

        disableButtons(seats)
    }
    fun disableButtons(seatsav: Int){
        var asientos: ArrayList<Int> = ArrayList<Int>()

        for(i in 0 until seatsav){
            asientos.add(1)
        }

        for(i in seatsav until 20){
            asientos.add(0)
        }

        Collections.shuffle(asientos)

        for(i in 0 until 20){
            if(asientos.get(i)==0){
                var radioid: String = "boton"+(i+1)
                var resID: Int = resources.getIdentifier(radioid, "id", packageName)
                var radio: RadioButton = findViewById(resID)
                radio.isEnabled = false
            }
        }
    }

    fun seat_selection(): Int{
        var seat = 0
        for(i in 0 until 20){
            var radioid: String = "boton"+(i+1)
            var resID: Int = resources.getIdentifier(radioid, "id", packageName)
            var radio: RadioButton = findViewById(resID)
            if (radio.isChecked){
                seat = i+1
            }

        }
        return seat
    }
}