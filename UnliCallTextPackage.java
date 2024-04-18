import java.util.*;

public class UnliCallTextPackage implements UnliCallTextOffer{

    /*
     Smart:  However, they do not offer any free calls or texts, and you will be charged per use.
    Globe: This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
    Ditto: This plan includes unlimited calls and texts to all networks within the country.
     */

    private static Map<String, String> unliMap = new HashMap<>();

    static{
        unliMap.put("Smart", "you will be charged per use");
        unliMap.put("Globe", "subscribers within their network. Calls and texts to other networks are charged extra.");
        unliMap.put("Ditto", "all networks within the country");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        
        if(unliCallText){
            return "Offers unlimited calls and texts to " + unliMap.get(telcoName);
        } else{
            return "Do not offer unlimited calls and texts, and " + unliMap.get(telcoName);
        }
    }
    
}
