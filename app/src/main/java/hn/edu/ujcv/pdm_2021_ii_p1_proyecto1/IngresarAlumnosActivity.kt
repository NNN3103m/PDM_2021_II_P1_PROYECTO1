package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.view.*
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*

class IngresarAlumnosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_alumnos)
        //Botones de atras y aceptar
        btnAtrasIA.setOnClickListener{onBackPressed()}
        btnAceptarIA.setOnClickListener{comprobarVacios()}
    }
    fun comprobarVacios(){
        when{
            txtNumeroCuenta.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su numero de cuenta", Toast.LENGTH_SHORT).show()
            txtNombreAlumno.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su nombre completo", Toast.LENGTH_SHORT).show()
            txtCarrera.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar la carrera que esta cursando", Toast.LENGTH_SHORT).show()
            txtFechaIngreso.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar la fecha", Toast.LENGTH_SHORT).show()
            txtCorreo.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar su correo", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, FinalizadoActivity::class.java)
                //ntent.putExtra("nombre",txtNombreAlumno.text.toString())
                startActivity(intent)
            }
        }
    }
}