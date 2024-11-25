package id.netra.netraai.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import id.netra.netraai.R
import id.netra.netraai.databinding.FragmentHomeBinding
import id.netra.netraai.ui.convertvoice.ConvertVoiceActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customToolbar()
        actionListener()
    }

    private fun actionListener() {
        binding.cardDocToVoice.setOnClickListener {
            Intent(requireContext(), ConvertVoiceActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun customToolbar() {
        binding.apply {
            toolbar.navBack.isInvisible = true
            toolbar.tvToolbarName.text = getString(R.string.app_name)
        }
    }

}