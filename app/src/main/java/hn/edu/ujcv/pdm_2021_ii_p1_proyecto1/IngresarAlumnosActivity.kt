package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.view.*
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*
import java.util.regex.Matcher
import java.util.regex.Pattern


class IngresarAlumnosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_alumnos)
        //Botones de atras y aceptar
        btnAtrasIA.setOnClickListener{onBackPressed()}
        btnAceptarIA.setOnClickListener{comprobarVacios()}

        txtCorreo.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1:Int, p2:Int, p3: Int){
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(txtCorreo.text.toString()).matches())
                else {
                    txtCorreo.setError("Email Invalido")
                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })


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
                startActivity(intent)
            }
        }
    }
}