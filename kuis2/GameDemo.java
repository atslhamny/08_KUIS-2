public class GameDemo {
    public static void main(String[] args) {
        // Membuat player
        Player player = new Player("Hero", 0, 0, 100, 3);

        // Membuat beberapa monster
        Monster monster1 = new Monster("Goblin", 10, 10, 50, 1, "Green");
        Monster monster2 = new Monster("Dragon", 20, 20, 200, 5, "Red");

        // Simulasi pertarungan
        System.out.println("=== Game Simulation ===");

        // Monster membuat suara
        System.out.println(monster1.Name + " says: " + monster1.MakeNoise());

        // Player menyerang monster
        monster1.TakeDamage(30);
        player.AddScore(50);
        monster1.TakeDamage(20); // Monster pertama terbunuh

        // Monster menyerang player
        player.TakeDamage(40);
        player.TakeDamage(70); // Player terbunuh sekali

        // Menyerang monster kedua
        monster2.TakeDamage(150);
        player.AddScore(200);
        monster2.TakeDamage(50); // Monster kedua terbunuh
    }
}