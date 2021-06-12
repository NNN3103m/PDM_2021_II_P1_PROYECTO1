package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.view.*
import kotlinx.android.synthetic.main.activity_ingresar_libros.*
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*
import java.lang.StringBuilder
import java.util.regex.Matcher
import java.util.regex.Pattern


class IngresarAlumnosActivity : AppCompatActivity() {
    var valoresAlumnos: HashMap<Int, String> = hashMapOf()
    var numero = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_alumnos)

        //Btn Handler
        btnAtrasIA.setOnClickListener{onBackPressed()}
        btnAceptarIA.setOnClickListener{
            comprobarVacios()
            saveAlum()

            Log.i("data", "data is : $valoresAlumnos")
        }


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

    private fun saveAlum(){
        val datoAlumnos = StringBuilder()
        numero+=1
        datoAlumnos.append(txtNumeroCuenta.text.toString().trim()).append("|")
        datoAlumnos.append(txtNombreAlumno.text.toString().trim()).append("|")
        datoAlumnos.append(txtCarrera.text.toString().trim()).append("|")
        datoAlumnos.append(txtFechaIngreso.text.toString().trim()).append("|")
        datoAlumnos.append(txtCorreo.text.toString().trim()).append("|")

        valoresAlumnos.put(numero,datoAlumnos.toString())
    }

    fun comprobarVacios(){
        when{
            txtNumeroCuenta.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su numero de cuenta", Toast.LENGTH_SHORT).show()
            txtNombreAlumno.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su nombre completo", Toast.LENGTH_SHORT).show()
            txtCarrera.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar la carrera que esta cursando", Toast.LENGTH_SHORT).show()
            txtFechaIngreso.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar la fecha", Toast.LENGTH_SHORT).show()
            txtCorreo.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar su correo", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}