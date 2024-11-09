package com.example.elementosvisuales2

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.util.Calendar

class HoraDialog: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c: Calendar = Calendar.getInstance()
        val hour: Int = c.get(Calendar.HOUR_OF_DAY)
        val minute: Int = c.get(Calendar.MINUTE)

        val tpd = TimePickerDialog(requireActivity(), TimePickerDialog.OnTimeSetListener(
            function = {view, h, m ->
                val toast: Toast = Toast.makeText(activity, h.toString() + " " + m, Toast.LENGTH_LONG)
                toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0, 0)
                toast.show()
            }), hour, minute, true)
        tpd.show()

        return tpd
    }
}