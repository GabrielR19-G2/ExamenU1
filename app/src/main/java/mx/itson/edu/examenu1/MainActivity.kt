package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var cel:Float = 0.00F
    var far:Float = 0.00F
    var kel:Float = 0.00F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCelsius: EditText = findViewById(R.id.etC)
        val etFar:EditText = findViewById(R.id.etF)
        val etKel:EditText = findViewById(R.id.etK)

        val btnGcel: Button = findViewById(R.id.btnGC)
        val btnGFar: Button = findViewById(R.id.btnGF)
        val btnGKel: Button = findViewById(R.id.btnGK)

        btnGcel.setOnClickListener(){
            //Celsius a Far y a Kelvin
            cel = etCelsius.text.toString().toFloat()
            kel = cel + 273.15f
            far = (cel * 1.8f)+32f

            etFar.setText(far.toString())
            etKel.setText(kel.toString())
        }

        btnGFar.setOnClickListener(){
            //Fahrenheit
            far = etFar.text.toString().toFloat()
            cel = (far - 32f)/1.8f
            kel = 5f*(far-32f)/9f + 273.15f

            etCelsius.setText(cel.toString())
            etKel.setText(kel.toString())
        }

        btnGKel.setOnClickListener(){
            //Kelvin a c y f
            kel = etKel.text.toString().toFloat()
            cel = kel - 273.15f
            far = 9f*(kel-273.15f)/5f + 32f

            etCelsius.setText(cel.toString())
            etFar.setText(far.toString())
        }
    }
}