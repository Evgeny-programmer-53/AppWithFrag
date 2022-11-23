package evgeny.company.appwithfrags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Orientation

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myRecyclerView = view.findViewById<RecyclerView>(R.id.myRecycler)
        myRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val myListOfItems = listOf(
            MyItem(name = "Space Barley", description = "110 долларов за 6 бутылок."),
            MyItem(name = "Tutankhamun Ale", description = "75 долларов за 500 мл."),
            MyItem(name = "Crown Ambassador Reserve", description = "90 долларов за 750 мл."),
            MyItem(name = "Sink the Bismarck", description = "80 долларов за 375 мл."),
            MyItem(name = "Utopias", description = "150 долларов за 700 мл."),
            MyItem(name = "Schorschbock 57", description = "275 долларов за 330 мл."),
            MyItem(name = "Cantillon Gueuze 1978", description = "397 долларов за 350 мл."),
            MyItem(name = "Jacobsen Brewhouse Vintage No. 1", description = "400 долларов за 350 мл."),
            MyItem(name = "Brasserie Caulier Vieille Bon Secours Ale", description = "750 долларов за 350 мл."),
            MyItem(name = "BrewDog The End of History", description = "765 долларов за 350 мл"),
            MyItem(name = "Nail Brewing Antarctic Nail Ale - 800-1", description = "500 долларов за 500 мл."),
            MyItem(name = "The Lost Abbey Cable Car Kriek", description = "923 доллара за 750 мл."),
            MyItem(name = "De Cam/Drie Fonteinen Millennium Geuze 1998", description = "923 доллара за 750 мл."),
            MyItem(name = "Cantillon Loerik 1998 - 2", description = "583 доллара за 750 мл."),
            MyItem(name = "Allsopp’s Arctic Ale ", description = "5131 доллар за 650 мл."),
        )
        val myAdapter = MyRecyclerViewAdapter(myListOfItems)

        myRecyclerView.adapter = myAdapter
    }
}
