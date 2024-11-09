package com.example.elementosvisuales2

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class EstudianteDialog: DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setMessage("Estudiante de IDS")
            .setPositiveButton("Si") { dialogInterface, i ->
                mostrar_mensaje("Si es estudiante de IDS")
            }
            .setNegativeButton("No") { dialogInterface, i ->
                mostrar_mensaje("No es estudiante de IDS")
            }
        return builder.create()
    }

    private fun mostrar_mensaje(mensaje: String){
        val toast = Toast.makeText(activity, mensaje, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 0)
        toast.show()
    }
}