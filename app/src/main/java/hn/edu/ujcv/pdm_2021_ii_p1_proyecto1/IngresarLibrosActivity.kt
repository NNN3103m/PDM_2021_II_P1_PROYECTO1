package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_ingresar_libros.*


class IngresarLibrosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_libros)

        //Data input
        val bookNumber = findViewById<EditText>(R.id.txtNumeroLibro)
        val bookName = findViewById<EditText>(R.id.txtNombreLibro)
        val author = findViewById<EditText>(R.id.txtAutor)
        val publishDate = findViewById<EditText>(R.id.txtFechaPublicacion)
        val editorialName = findViewById<EditText>(R.id.txtEditorial)

        //Btn Handler
        btnAtrasIL.setOnClickListener{onBackPressed()}
        btnAceptarIL.setOnClickListener{comprobarVacios()}
    }

    fun comprobarVacios(){
        when{
            txtNumeroLibro.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su numero de libro", Toast.LENGTH_SHORT).show()
            txtNombreLibro.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar su nombre del libro", Toast.LENGTH_SHORT).show()
            txtAutor.text.isEmpty()       -> Toast.makeText(this,"Debe ingresar el autor del libro", Toast.LENGTH_SHORT).show()
            txtFechaPublicacion.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar la fecha de publicacion del libro", Toast.LENGTH_SHORT).show()
            txtEditorial.text.isEmpty()        -> Toast.makeText(this,"Debe ingresar la editorial del libro", Toast.LENGTH_SHORT).show()
            else -> {
                val intent = Intent(this, FinalizadoActivity::class.java)
                //ntent.putExtra("nombre",txtNombreAlumno.text.toString())
                startActivity(intent)
            }
        }
    }
}