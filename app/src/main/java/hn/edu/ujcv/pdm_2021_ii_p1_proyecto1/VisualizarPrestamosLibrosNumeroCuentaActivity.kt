package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*

class VisualizarPrestamosLibrosNumeroCuentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_prestamos_libros_numero_cuenta)
        //Botones de atras y aceptar
        btnAtrasVPLNC.setOnClickListener{onBackPressed()}
    }
}