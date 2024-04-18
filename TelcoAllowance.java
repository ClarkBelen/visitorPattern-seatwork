import java.util.*;

public class TelcoAllowance implements UsagePromo{

    /*
     Smart: Offers a data allowance of 15 GB for ₱500 per month. 
     Globe: Provides a data allowance of 10 GB for ₱450 per month. 
     Ditto: Offers a data allowance of 8 GB for ₱400 per month. 
     */

     private static Map<String, Integer> allowanceMap = new HashMap<>();

     static{
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
     }

    @Override
    public String showAllowance(String telcoName, double money){
        if(money >= 500){
            return allowanceMap.get(telcoName) + "GB data allowance for P" + money + " per month.";
        } else if (money >= 450){
            allowanceMap.remove("Smart");
            return allowanceMap.get(telcoName) + "GB data allowance for P" + money + " per month.";
        } else if(money >= 400){
            allowanceMap.remove("Smart");
            allowanceMap.remove("Globe");
            return allowanceMap.get(telcoName) + "GB data allowance for P" + money + " per month.";
        }else{
            return "Your money is not enough to avail any telco promo";
        }
        
    }

   

}