package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_alumnos.*
import kotlinx.android.synthetic.main.activity_visualizar_alumnos_numero_cuenta.*

class VisualizarAlumnosNumeroCuentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_alumnos_numero_cuenta)
        //Botones de atras y aceptar
        btnAtrasVANC.setOnClickListener{onBackPressed()}
    }
}