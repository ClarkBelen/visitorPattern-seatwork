public interface TelcoSubscription {
    public String accept(UsagePromo usage, double price);
    public String accept(UnliCallTextOffer offer, boolean unliCallText);
}