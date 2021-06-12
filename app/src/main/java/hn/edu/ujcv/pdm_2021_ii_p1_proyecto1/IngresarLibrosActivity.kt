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


class IngresarLibrosActivity : AppCompatActivity() {
    var valoresLibros: HashMap<Int, String> = hashMapOf()
    var numero = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_libros)

        //Btn Handler
        btnAtrasIL.setOnClickListener{onBackPressed()}
        btnAceptarIL.setOnClickListener{
            comprobarVacios()
            saveLib()

            Log.i("data", "data is : $valoresLibros")

        }
    }

    private fun saveLib(){
        val datoLibros = StringBuilder()
        numero+=1
        datoLibros.append(txtNumeroLibro.text.toString().trim()).append("|")
        datoLibros.append(txtNombreLibro.text.toString().trim()).append("|")
        datoLibros.append(txtAutor.text.toString().trim()).append("|")
        datoLibros.append(txtFechaPublicacion.text.toString().trim()).append("|")
        datoLibros.append(txtEditorial.text.toString().trim()).append("|")

        valoresLibros.put(numero,datoLibros.toString())
    }
    fun comprobarVacios(){
        when{
            txtNumeroLibro.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su numero de libro", Toast.LENGTH_SHORT).show()
            txtNombreLibro.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su nombre del libro", Toast.LENGTH_SHORT).show()
            txtAutor.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar el autor del libro", Toast.LENGTH_SHORT).show()
            txtFechaPublicacion.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar la fecha de publicacion del libro", Toast.LENGTH_SHORT).show()
            txtEditorial.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar la editorial del libro", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}