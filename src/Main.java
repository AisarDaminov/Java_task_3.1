public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculateBonusMiles(price);

        System.out.println(miles);
    }
}
