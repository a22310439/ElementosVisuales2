package com.example.elementosvisuales2

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class InputDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())

        // EditText programáticamente
        val inputEditText = EditText(requireContext())
        inputEditText.hint = "Ingrese su texto"
        inputEditText.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        builder.setTitle("Entrada de Texto")
            .setView(inputEditText)
            .setPositiveButton("Aceptar") { _, _ ->
                val inputText = inputEditText.text.toString()
                if (inputText.isNotEmpty()) {
                    mostrarMensaje("Texto ingresado: $inputText")
                } else {
                    mostrarMensaje("No se ingresó ningún texto")
                }
            }
            .setNegativeButton("Cancelar") { dialog, _ ->
                dialog.dismiss()
            }

        return builder.create()
    }

    private fun mostrarMensaje(mensaje: String) {
        Toast.makeText(activity, mensaje, Toast.LENGTH_SHORT).show()
    }
}
