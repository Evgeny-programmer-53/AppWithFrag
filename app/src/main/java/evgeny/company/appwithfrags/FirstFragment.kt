package evgeny.company.appwithfrags

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    private var router: MyRouter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val goToSecondScreenButton: Button = view.findViewById(R.id.goToSecondScreenButton)
        goToSecondScreenButton.setOnClickListener {
            router?.openSecondFragment()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MyRouter) {
            router = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        router = null
    }
}