package homework.oop_homework;

public class DiscountRate {
    private static double serviceDiscountPremuim = 0.2; // Atlaide attiecas tikai uz pakalpojumiem
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1; // Visiem klientiem, kuriem ir abonements, saņem fiksētu
    private static double productDiscountGold = 0.1;    // atlaidi 10% apmēra par iegādātajiem produktiem.
    private static double productDiscountSilver = 0.1;

    // Getters
    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium": return serviceDiscountPremuim;
            case "Gold": return serviceDiscountGold;
            case "Silver": return serviceDiscountSilver;
            default: return 0;
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium": return productDiscountPremium;
            case "Gold": return productDiscountGold;
            case "Silver": return productDiscountSilver;
            default: return 0;
        }
    }
}