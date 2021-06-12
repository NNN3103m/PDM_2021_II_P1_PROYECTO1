package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_libros.*
import kotlinx.android.synthetic.main.activity_ingresar_prestamo_libro.*
import java.lang.StringBuilder



class IngresarPrestamoLibroActivity : AppCompatActivity() {
    var valoresPrestamo: HashMap<Int, String> = hashMapOf()
    var numero = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        initialize()
        setContentView(R.layout.activity_ingresar_prestamo_libro)

        supportActionBar?.apply {
            title = "Registro de Préstamo"
            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
        }

        //Btn Handler
        btnAtrasIPL.setOnClickListener{onBackPressed()}
        btnAceptarIPL.setOnClickListener{

            comprobarVacios()
            saveDP()

                Log.i("data", "data is : $valoresPrestamo")
        }
    }


    private fun saveDP(){
        val datoPrestamo = StringBuilder()
        numero+=1
        datoPrestamo.append(txtNumeroPrestamo.text.toString().trim()).append("|")
        datoPrestamo.append(txtFechaPrestamo.text.toString().trim()).append("|")
        datoPrestamo.append(txtNumeroCuentaAPrestar.text.toString().trim()).append("|")
        datoPrestamo.append(txtNumeroLibroAPrestar.text.toString().trim()).append("|")
        datoPrestamo.append(txtFechaDevolucion.text.toString().trim()).append("|")

        valoresPrestamo.put(numero,datoPrestamo.toString())
    }


    fun comprobarVacios(){
        when{
            txtNumeroPrestamo.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el numero de préstamo", Toast.LENGTH_SHORT).show()
            txtFechaPrestamo.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar una fecha de inicio de préstamo", Toast.LENGTH_SHORT).show()
            txtNumeroCuentaAPrestar.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar el número de cuenta a otorgar el préstamo", Toast.LENGTH_SHORT).show()
            txtNumeroLibroAPrestar.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el número de libro a prestar", Toast.LENGTH_SHORT).show()
            txtFechaDevolucion.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar una fecha de devolución de libro", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}