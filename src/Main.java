public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 9987;
        int bonusMiles = service.calculate(ticketPrice);
        System.out.println(bonusMiles);
    }
}