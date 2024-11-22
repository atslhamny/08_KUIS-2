package soal1;
class Player extends DamageableObject {
    private int Score;
    private int LivesRemaining;

    public Player(String name, int x, int y, int maxHealth, int lives) {
        super(name, x, y, maxHealth);
        this.Score = 0;
        this.LivesRemaining = lives;
    }

    @Override
    public void OnKilled() {
        LivesRemaining--;
        System.out.println("Player terbunuh! Sisa nyawa: " + LivesRemaining);
        if (LivesRemaining <= 0) {
            System.out.println("Game Over! Final Score: " + Score);
        } else {
            Health = MaxHealth; 
        }
    }

    public void AddScore(int points) {
        Score += points;
        System.out.println("Score bertambah " + points + ". Total score: " + Score);
    }
}
