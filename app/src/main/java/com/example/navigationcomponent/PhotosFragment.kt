package com.example.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.Fragments.PhotosFragmentArgs
import com.example.navigationcomponent.PhotosFragmentArgs
import kotlinx.android.synthetic.main.fragment_photos.*

class PhotosFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_back_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }
        arguments?.let {
            val safeArgs =
                PhotosFragmentArgs.fromBundle(it)
            textView_num.text = "Number of Photos: ${safeArgs.numOfPhotos}"
        }
    }

}
