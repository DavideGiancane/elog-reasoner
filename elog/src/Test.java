import de.elog.elSampler.Sampler;
import de.elog.misSampler.MisSampler;

public class Test {
    public static void main(String[] args) throws Exception {

        //System.setProperty("java.library.path", "/opt/gurobi801/linux64/lib");

        String numberOfSamples = "-s" + 300000;
        String n_explUnsatClasses = "-e" + 10;
        String n_explInconsistency = "-i" + 10;

        String ontName = "test";
        String ontologiesPath = System.getProperty("user.dir") + "/inputOntology/";
        String inputOntologyPath = ontologiesPath + ontName + ".owl";

        //String eventsPath = ontologiesPath + "event" + ".owl";

        //ELOG: lo avvio in modalità sampling per calcolo inferenza marginale
      //Sampler.main(new String[]{inputOntologyPath, eventsPath, "400"});

        //Pellet-based sampler
      MisSampler.main(new String[]{numberOfSamples, n_explUnsatClasses, inputOntologyPath});
    }
}
