package hn.edu.ujcv.pdm_2021_ii_p1_proyecto1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIngresarAlumnos.setOnClickListener{ingresarAlumnos()}
        btnIngresarLibros.setOnClickListener{ingresarLibros()}
        btnPrestamoLibro.setOnClickListener{ingresarPrestamoLibro()}
        btnVisualizarLibroCuenta.setOnClickListener{visualizarAlumnosNumeroCuenta()}
        btnVisualizarLibroNumero.setOnClickListener{visualizarLibrosNumeroLibro()}
        btnVisualzarPrestamoCuenta.setOnClickListener{visualizarPrestamosLibrosNumeroCuenta()}
    }
    fun ingresarAlumnos(){
        val intent = Intent(this,IngresarAlumnosActivity::class.java)
        startActivity(intent)
    }
    fun ingresarLibros(){
        val intent = Intent(this,IngresarLibrosActivity::class.java)
        startActivity(intent)
    }
    fun ingresarPrestamoLibro(){
        val intent = Intent(this,IngresarPrestamoLibroActivity::class.java)
        startActivity(intent)
    }
    fun visualizarAlumnosNumeroCuenta(){
        val intent = Intent(this,VisualizarAlumnosNumeroCuentaActivity::class.java)
        startActivity(intent)
    }
    fun visualizarLibrosNumeroLibro(){
        val intent = Intent(this,VisualizarLibrosNumeroLibroActivity::class.java)
        startActivity(intent)
    }
    fun visualizarPrestamosLibrosNumeroCuenta(){
        val intent = Intent(this,VisualizarPrestamosLibrosNumeroCuentaActivity::class.java)
        startActivity(intent)
    }
}
