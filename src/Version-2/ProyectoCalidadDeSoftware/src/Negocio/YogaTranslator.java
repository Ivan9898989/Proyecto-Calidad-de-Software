package Negocio;

import java.util.HashMap;
import java.util.Map;


public class YogaTranslator {
    private final Map<String, String> sanskritoAEspaniolMap;
    private final Map<String, String> sanskritoAInglesMap;
    private final Map<String, String> inglesAEspaniolMap;
    private final Map<String, String> inglesASanskritoMap;
    private final Map<String, String> espaniolASanscritoMap;
    private final Map<String, String> espaniolAInglesMap;
    private final Map<String, String> palabraBase;
    private final Map<String, String> palabraBaseAIngles;
     
    
    public YogaTranslator() {
        sanskritoAEspaniolMap = new HashMap<>();
        sanskritoAInglesMap = new HashMap<>();
        inglesAEspaniolMap = new HashMap<>();
        inglesASanskritoMap = new HashMap<>();
        espaniolAInglesMap = new HashMap<>();
        espaniolASanscritoMap = new HashMap<>();
        
        palabraBase = new HashMap<>();
        palabraBaseAIngles = new  HashMap<>();
        
       cargarPalabrasBase();
       cargarTraduccionesYoga();
    }
    
    // Método privado para cargar traducciones específicas relacionadas con posturas de yoga
    private void cargarPalabrasBase() {
         palabraBase.put("asana", "postura");
        palabraBase.put("adho", "abajo");
        palabraBase.put("ardha", "mitad");
        palabraBase.put("urdhva", "arriba");
        palabraBase.put("mukha", "rostro");
        palabraBase.put("svana", "perro");
        palabraBase.put("virabhadra", "guerrero");
        palabraBase.put("vriksha", "árbol");
        palabraBase.put("bala", "niño");
        palabraBase.put("bhujanga", "cobra");
        palabraBase.put("paschi", "oeste");
        palabraBase.put("setu", "puente");
        palabraBase.put("shava", "cadáver");
        palabraBase.put("trikona", "triángulo");
        palabraBase.put("matsya", "pez");
        palabraBase.put("mala", "guirnalda");
        palabraBase.put("eka", "uno");
        palabraBase.put("pada", "pie");
        palabraBase.put("raja", "real");
        palabraBase.put("kapota", "paloma");
        
        palabraBaseAIngles.put("asana", "pose");
        palabraBaseAIngles.put("adho", "down");
        palabraBaseAIngles.put("ardha", "half");
        palabraBaseAIngles.put("urdhva", "upward");
        palabraBaseAIngles.put("mukha", "face");
        palabraBaseAIngles.put("svana", "dog");
        palabraBaseAIngles.put("virabhadra", "warrior");
        palabraBaseAIngles.put("vriksha", "tree");
        palabraBaseAIngles.put("bala", "child");
        palabraBaseAIngles.put("bhujanga", "cobra");
        palabraBaseAIngles.put("paschi", "west");
        palabraBaseAIngles.put("setu", "bridge");
        palabraBaseAIngles.put("shava", "corpse");
        palabraBaseAIngles.put("trikona", "triangle");
        palabraBaseAIngles.put("matsya", "fish");
        palabraBaseAIngles.put("mala", "garland");
        palabraBaseAIngles.put("eka", "one");
        palabraBaseAIngles.put("pada", "foot");
        palabraBaseAIngles.put("raja", "royal");
        palabraBaseAIngles.put("kapota", "dove");
    }

    
    private void cargarTraduccionesYoga() {
        // Aquí se incluyen traducciones específicas para posturas de yoga
        // Cada bloque de código sigue el mismo patrón para distintas posturas
        //1. Mountain pose
        espaniolASanscritoMap.put("postura de la montaña","Tadasana");
        espaniolAInglesMap.put("postura de la montaña", "Mountain pose");
        sanskritoAEspaniolMap.put("tadasana", "Postura de la montaña");
        sanskritoAInglesMap.put("tadasana", "Mountain pose");
        inglesAEspaniolMap.put("mountain pose", "Postura de la montaña");
        inglesASanskritoMap.put("mountain pose", "Tadasana");
         
        //2. Warrior I
        espaniolASanscritoMap.put("guerrero i","Virabhadrasana I");
        espaniolAInglesMap.put("guerrero i", "Warrior I");
        sanskritoAEspaniolMap.put("virabhadrasana i", "Guerrero I");
        sanskritoAInglesMap.put("virabhadrasana i", "Warrior I");
        inglesAEspaniolMap.put("warrior i", "Guerrero I");
        inglesASanskritoMap.put("warrior i", "Virabhadrasana I");
        
        //3. Warrior II
        espaniolASanscritoMap.put("guerrero ii","Virabhadrasana II");
        espaniolAInglesMap.put("guerrero ii", "Warrior II");
        sanskritoAEspaniolMap.put("virabhadrasana ii", "Guerrero II");
        sanskritoAInglesMap.put("virabhadrasana ii", "Warrior II");
        inglesAEspaniolMap.put("warrior ii", "Guerrero II");
        inglesASanskritoMap.put("warrior ii", "Virabhadrasana II");
         
        //4. Downward-Facing Dog
        espaniolASanscritoMap.put("perro mirando hacia abajo","Adho Mukha Svanasana");
        espaniolAInglesMap.put("perro mirando hacia abajo", "Downward-Facing Dog");
        sanskritoAEspaniolMap.put("adho mukha svanasana", "Perro mirando hacia abajo");
        sanskritoAInglesMap.put("adho mukha svanasana", "Downward-Facing Dog");
        inglesAEspaniolMap.put("downward-facing dog", "Perro mirando hacia abajo");
        inglesASanskritoMap.put("downward-facing dog", "Adho Mukha Svanasana");
        
        //5. Tree Pose
        espaniolASanscritoMap.put("postura del árbol","Vrikshasana");
        espaniolAInglesMap.put("postura del árbol", "Tree Pose");
        sanskritoAEspaniolMap.put("vrikshasana", "Postura del arból");
        sanskritoAInglesMap.put("vrikshasana", "Tree Pose");
        inglesAEspaniolMap.put("tree pose", "Postura del arból");
        inglesASanskritoMap.put("tree pose", "Vrikshasana");
         
        //6. **Child's Pose:**
        espaniolASanscritoMap.put("postura del niño","Balasana");
        espaniolAInglesMap.put("postura del niño", "Child's Pose");
        sanskritoAEspaniolMap.put("balasana", "Postura del Niño");
        sanskritoAInglesMap.put("balasana", "Child's Pose");
        inglesAEspaniolMap.put("child's pose", "Postura del Niño");
        inglesASanskritoMap.put("child's pose", "Balasana");
        
        
        //7. Half Cobra Pose
        espaniolASanscritoMap.put("postura de la cobra a la mitad","Ardha Bhujangasana");
        espaniolAInglesMap.put("postura de la cobra a la mitad", "Half Cobra Pose");
        sanskritoAEspaniolMap.put("ardha bhujangasana", "Postura de la Cobra a la mitad");
        sanskritoAInglesMap.put("ardha bhujangasana", "Half Cobra Pose");
        inglesAEspaniolMap.put("half cobra pose", "Postura de la Cobra a la mitad");
        inglesASanskritoMap.put("half cobra pose", "Ardha Bhujangasana");
         
        
        //8. **Seated Forward Bend:**
        espaniolASanscritoMap.put("flexión hacia adelante sentado","Paschimottanasana");
        espaniolAInglesMap.put("flexión hacia adelante sentado", "Seated Forward Bend");
        sanskritoAEspaniolMap.put("paschimottanasana", "Flexión hacia adelante sentado");
        sanskritoAInglesMap.put("paschimottanasana", "Seated Forward Bend");
        inglesAEspaniolMap.put("seated forward bend", "Flexión hacia adelante sentado");
        inglesASanskritoMap.put("seated forward bend", "Paschimottanasana");
        
        //9. Bridge Pose
        espaniolASanscritoMap.put("postura del puente","Setu Bandhasana");
        espaniolAInglesMap.put("postura del puente", "Bridge Pose");
        sanskritoAEspaniolMap.put("setu bandhasana", "Postura del Puente");
        sanskritoAInglesMap.put("setu bandhasana", "Bridge Pose");
        inglesAEspaniolMap.put("bridge pose", "Postura del Puente");
        inglesASanskritoMap.put("bridge pose", "Setu Bandhasana");
         
        //10. **Corpse Pose**
        espaniolASanscritoMap.put("postura del cadáver","Shavasana");
        espaniolAInglesMap.put("postura del cadáver", "Corpse Pose");
        sanskritoAEspaniolMap.put("shavasana", "Postura del Cadáver");
        sanskritoAInglesMap.put("shavasana", "Corpse Pose");
        inglesAEspaniolMap.put("corpse pose", "Postura del Cadáver");
        inglesASanskritoMap.put("corpse pose", "Shavasana");
        
        //11. Triangle Pose
        espaniolASanscritoMap.put("postura del triángulo","Trikonasana");
        espaniolAInglesMap.put("postura del triángulo", "Triangle Pose");
        sanskritoAEspaniolMap.put("trikonasana", "Postura del Triángulo");
        sanskritoAInglesMap.put("trikonasana", "Triangle Pose");
        inglesAEspaniolMap.put("triangle pose", "Postura del Triángulo");
        inglesASanskritoMap.put("triangle pose", "Trikonasana");
         
        //12. Plank Pose
        espaniolASanscritoMap.put("postura de la plancha","Kumbhakasana");
        espaniolAInglesMap.put("postura de la plancha", "Plank Pose");
        sanskritoAEspaniolMap.put("kumbhakasana", "Postura de la Plancha");
        sanskritoAInglesMap.put("kumbhakasana", "Plank Pose");
        inglesAEspaniolMap.put("plank pose", "Postura de la Plancha");
        inglesASanskritoMap.put("plank pose", "Kumbhakasana");
        
        //13. Upward-Facing Dog
        espaniolASanscritoMap.put("perro mirando hacia arriba","Urdhva Mukha Svanasana");
        espaniolAInglesMap.put("perro mirando hacia arriba", "Upward-Facing Dog");
        sanskritoAEspaniolMap.put("urdhva mukha svanasana", "Perro mirando hacia arriba");
        sanskritoAInglesMap.put("urdhva mukha svanasana", "Upward-Facing Dog");
        inglesAEspaniolMap.put("upward-facing dog", "Perro mirando hacia arriba");
        inglesASanskritoMap.put("upward-facing dog", "Urdhva Mukha Svanasana");
         
        //14. Fish Pose
        espaniolASanscritoMap.put("postura del pez","Matsyasana");
        espaniolAInglesMap.put("postura del pez", "Fish Pose");
        sanskritoAEspaniolMap.put("matsyasana", "Postura del Pez");
        sanskritoAInglesMap.put("matsyasana", "Fish Pose");
        inglesAEspaniolMap.put("fish pose", "Postura del Pez");
        inglesASanskritoMap.put("fish pose", "Matsyasana");
        
        //15. Chair Pose
        espaniolASanscritoMap.put("postura de la silla","Utkatasana");
        espaniolAInglesMap.put("postura de la silla", "Chair Pose");
        sanskritoAEspaniolMap.put("utkatasana", "Postura de la Silla");
        sanskritoAInglesMap.put("utkatasana", "Chair Pose");
        inglesAEspaniolMap.put("chair pose", "Postura de la Silla");
        inglesASanskritoMap.put("chair pose", "Utkatasana");
         
        //16. **Garland Pose**
        espaniolASanscritoMap.put("postura de la guirnalda","Malasana");
        espaniolAInglesMap.put("postura de la guirnalda", "Garland Pose");
        sanskritoAEspaniolMap.put("malasana", "Postura de la Guirnalda");
        sanskritoAInglesMap.put("malasana", "Postura de la Guirnalda");
        inglesAEspaniolMap.put("garland pose", "Postura del Niño");
        inglesASanskritoMap.put("garland pose", "Malasana");
        
        
        //17. Pigeon Pose
        espaniolASanscritoMap.put("postura de la paloma","Eka Pada Rajakapotasana");
        espaniolAInglesMap.put("postura de la paloma", "Pigeon Pose");
        sanskritoAEspaniolMap.put("eka pada rajakapotasana", "Postura de la Paloma");
        sanskritoAInglesMap.put("eka pada rajakapotasana", "Pigeon Pose");
        inglesAEspaniolMap.put("pigeon pose", "Postura de la Paloma");
        inglesASanskritoMap.put("pigeon pose", "Eka Pada Rajakapotasana");
         
        
        //18. *Upward Salute:**
        espaniolASanscritoMap.put("saludo hacia arriba","Urdhva Hastasana");
        espaniolAInglesMap.put("saludo hacia arriba", "Upward Salute");
        sanskritoAEspaniolMap.put("urdhva hastasana", "Saludo hacia arriba");
        sanskritoAInglesMap.put("urdhva hastasana", "Upward Salute");
        inglesAEspaniolMap.put("upward salute", "Saludo hacia arriba");
        inglesASanskritoMap.put("upward salute", "Urdhva Hastasana");
        
        //19. Revolved Triangle Pose
        espaniolASanscritoMap.put("postura del triángulo invertido","Parivrtta Trikonasana");
        espaniolAInglesMap.put("postura del triángulo invertido", "Revolved Triangle Pose");
        sanskritoAEspaniolMap.put("parivrtta trikonasana", "Postura del Triángulo Invertido");
        sanskritoAInglesMap.put("parivrtta trikonasana", "Revolved Triangle Pose");
        inglesAEspaniolMap.put("revolved triangle pose", "Postura del Triángulo Invertido");
        inglesASanskritoMap.put("revolved triangle pose", "Parivrtta Trikonasana");
         
        //20. **Revolved Head To Knee Pose**
        espaniolASanscritoMap.put("postura de la cabeza a la rodilla invertida","Parivrtta Janu Sirsasana");
        espaniolAInglesMap.put("postura de la cabeza a la rodilla invertida", "Revolved Head To Knee Pose");
        sanskritoAEspaniolMap.put("parivrtta janu sirsasana", "Postura de la Cabeza a la Rodilla Invertida");
        sanskritoAInglesMap.put("parivrtta janu sirsasana", "Revolved Head To Knee Pose");
        inglesAEspaniolMap.put("revolved head to knee pose", "Postura de la Cabeza a la Rodilla Invertida");
        inglesASanskritoMap.put("revolved head to knee pose", "Parivrtta Janu Sirsasana");
        
    }
    
    // Métodos para traducir palabras y posturas
    public String traducirPalabraBase(String palabrabase) {
        return palabraBase.getOrDefault(palabrabase, "No se encontró traducción");
    }
    
    // Métodos para traducir palabras y posturas
    public String traducirPalabraBaseAIngles(String palabrabase) {
        return palabraBaseAIngles.getOrDefault(palabrabase, "No se encontró traducción");
    }
    
    // Métodos para traducir palabras y posturas
    public String traducirSanskritoAEspanol(String sanscrito) {
        return sanskritoAEspaniolMap.getOrDefault(sanscrito, "No se encontró traducción");
    }

    // Métodos para traducir palabras y posturas
    public String traducirSanskritoAIngles(String espanol) {
        return sanskritoAInglesMap.getOrDefault(espanol, "No se encontró traducción");
    }

    // Métodos para traducir palabras y posturas
    public String traducirInglesAEspaniol(String sanscrito) {
        return inglesAEspaniolMap.getOrDefault(sanscrito, "No se encontró traducción");
    }

    // Métodos para traducir palabras y posturas
    public String traducirInglesASanskrito(String ingles) {
        return inglesASanskritoMap.getOrDefault(ingles, "No se encontró traducción");
    }
    
    // Métodos para traducir palabras y posturas
     public String traducirEspaniolAIngles(String sanscrito) {
        return espaniolAInglesMap.getOrDefault(sanscrito, "No se encontró traducción");
    }

    // Métodos para traducir palabras y posturas
    public String traducirEspaniolASanskrito(String ingles) {
        return espaniolASanscritoMap.getOrDefault(ingles, "No se encontró traducción");
    } 
}
