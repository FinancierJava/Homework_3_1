public class Test {
    public static void main(String[] args) {
        // Нельзя создать меч из пластика
        // Sword<Plastic> plasticSword = new Sword<>(new Plastic());
        Sword<Steel> steelSword = new Sword<>(new Steel());
        boolean isSteelSwordStrong = steelSword.checkEndurance();
        System.out.println("Steel Sword passed endurance check: " + isSteelSwordStrong);
    }
}
