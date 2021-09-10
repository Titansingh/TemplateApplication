package com.example.templateapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


class Login_Tab_Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val email = activity?.findViewById<EditText>(R.id.edit_email)



        if (email != null) {
            email.animate().translationX(265F).alpha(1F).setDuration(1000).setStartDelay(400).start()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login__tab_, container, false)


    }


}