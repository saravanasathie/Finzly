
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    TreeMap<String, TreeMap<String, HashMap<String, ArrayList<Cities>>>> method(){
        Cities c1 = new Cities("Alanganallur", "Madurai");
        Cities c2 = new Cities("Egmore", "Chennai");
        Cities c3 = new Cities("Avaniapuram", "Madurai");
        Cities c4 = new Cities("Perambur", "Chennai");
        Cities c5 = new Cities("Guindy", "Chennai");
        Cities c6 = new Cities("Vadipatti", "Madurai");
        Cities c7 = new Cities("Velankanni", "Nagapattinam");
        Cities c8 = new Cities("Mayiladuthurai", "Nagapattinam");
        Cities c9 = new Cities("Sirkazhi", "Nagapattinam");
        Cities c10 = new Cities("Anuppanadi", "Madurai");

        ArrayList<Cities> mad = new ArrayList<>();
        mad.add(c1);
        mad.add(c3);
        mad.add(c6);
        mad.add(c10);

        ArrayList<Cities> chen = new ArrayList<>();
        chen.add(c2);
        chen.add(c4);
        chen.add(c5);

        ArrayList<Cities> nag = new ArrayList<>();
        nag.add(c7);
        nag.add(c8);
        nag.add(c9);

        HashMap<String, ArrayList<Cities>> dist = new HashMap<>();
        dist.put("Madurai", mad);
        dist.put("Chennai", chen);
        dist.put("Nagapattinam", nag);

        TreeMap<String, HashMap<String, ArrayList<Cities>>> state = new TreeMap<>();
        state.put("TamilNadu", dist);

        TreeMap<String , TreeMap<String, HashMap<String, ArrayList<Cities>>>> country = new TreeMap<>();
        country.put("India", state);

        return country;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.method());
    }
}
