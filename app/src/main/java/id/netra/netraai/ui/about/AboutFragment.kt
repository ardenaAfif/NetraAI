package id.netra.netraai.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import id.netra.netraai.R
import id.netra.netraai.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customToolbar()
    }

    private fun customToolbar() {
        binding.apply {
            toolbar.navBack.isInvisible = true
            toolbar.tvToolbarName.text = getString(R.string.app_name)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}