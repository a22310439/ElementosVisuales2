package com.example.elementosvisuales2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    private lateinit var adialog: Button
    private lateinit var cdialog: Button
    private lateinit var tdialog: Button
    private lateinit var idialog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        adialog = findViewById(R.id.aDialogButton)
        cdialog = findViewById(R.id.cDialogButton)
        tdialog = findViewById(R.id.tDialogButton)
        idialog = findViewById(R.id.iDialogButton)

        adialog.setOnClickListener{
            val fragment: DialogFragment = EstudianteDialog()
            fragment.show(supportFragmentManager, "Estudiante")
        }

        cdialog.setOnClickListener{
            val fragment: DialogFragment = FechaDialog()
            fragment.show(supportFragmentManager, "Calendario")
        }

        tdialog.setOnClickListener{
            val fragment: DialogFragment = HoraDialog()
            fragment.show(supportFragmentManager, "Hora")
        }

        idialog.setOnClickListener{
            val fragment: DialogFragment = InputDialog()
            fragment.show(supportFragmentManager, "Input")
        }
    }
}