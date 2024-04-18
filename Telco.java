public class Telco implements TelcoSubscription {

    private String telcoName;
    private Double promoPrice;
    // private Integer dataAllowance;
    private Boolean unliCallText;

    public Telco(double promoPrice, String telcoName, boolean unliCallText) {
        // this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usage, double price){
        this.promoPrice = price;
        return usage.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallTextOffer offer, boolean isUnliCallText) {
       this.unliCallText = isUnliCallText;
       return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }   

    public String getTelcoName() {
        return telcoName;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    // public Integer getDataAllowance() {
    //     return dataAllowance;
    // }

    public Boolean getUnliCallText() {
        return unliCallText;
    }

     
}