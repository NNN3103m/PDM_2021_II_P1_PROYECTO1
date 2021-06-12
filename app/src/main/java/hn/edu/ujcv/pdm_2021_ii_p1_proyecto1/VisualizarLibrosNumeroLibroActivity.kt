package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ingresar_libros.*
import kotlinx.android.synthetic.main.activity_visualizar_libros_numero_libro.*

class VisualizarLibrosNumeroLibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_libros_numero_libro)

        //        Btn Handler
        btnAtrasVLNL.setOnClickListener{onBackPressed()}
    }
    fun mostrarLibrosNumeroLibros(view: View){

//        valoresLibros.forEach { (key, value) -> println("$key = $value") }
    }
}