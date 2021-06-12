package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_visualizar_prestamos_libros_numero_cuenta.*

class VisualizarPrestamosLibrosNumeroCuentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_prestamos_libros_numero_cuenta)

        //        Btn Handler
        btnAtrasVPLNC.setOnClickListener{onBackPressed()}
    }

    fun mostrarPrestamoLibrosNumeroCuenta(view: View){

    }
}