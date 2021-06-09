package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*

class IngresarAlumnosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_alumnos)
        //Botones de atras y aceptar
        btnAtrasIA.setOnClickListener{onBackPressed()}

    }
}