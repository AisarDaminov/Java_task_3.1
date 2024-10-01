public class BonusMilesService {
    public int calculateBonusMiles(int price) {
        int miles = price / 20;
        return miles;
    }
}