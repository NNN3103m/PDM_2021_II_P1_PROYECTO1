package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_libros.*
import kotlinx.android.synthetic.main.activity_ingresar_prestamo_libro.*


class IngresarPrestamoLibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_prestamo_libro)

        //Data input
        val loanNumber = findViewById<EditText>(R.id.txtNumeroCuenta)
        val loanDate = findViewById<EditText>(R.id.txtNombreAlumno)
        val loanStudentAccNumber = findViewById<EditText>(R.id.txtCarrera)
        val loanBookNumber = findViewById<EditText>(R.id.txtCorreo)
        val loanReturnDate = findViewById<Button>(R.id.btnAceptarIA)

        //Btn Handler
        btnAtrasIPL.setOnClickListener{onBackPressed()}
        btnAceptarIPL.setOnClickListener{comprobarVacios()}
    }

    fun comprobarVacios(){
        when{
            txtNumeroPrestamo.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el numero de préstamo", Toast.LENGTH_SHORT).show()
            txtFechaPrestamo.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar una fecha de inicio de préstamo", Toast.LENGTH_SHORT).show()
            txtNumeroCuentaAPrestar.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar el número de cuenta a otorgar el préstamo", Toast.LENGTH_SHORT).show()
            txtNumeroLibroAPrestar.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el número de libro a prestar", Toast.LENGTH_SHORT).show()
            txtFechaDevolucion.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar una fecha de devolución de libro", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, FinalizadoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}