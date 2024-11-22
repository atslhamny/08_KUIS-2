class Monster extends DamageableObject {
    private int ThreatLevel;
    private String Color;

    public Monster(String name, int x, int y, int maxHealth, int threatLevel, String color) {
        super(name, x, y, maxHealth);
        this.ThreatLevel = threatLevel;
        this.Color = color;
    }

    public String MakeNoise() {
        return "Rawr!";
    }

    @Override
    public void OnKilled() {
        System.out.println("Monster " + Name + " telah dikalahkan!");
        System.out.println("Dropping loot based on threat level: " + ThreatLevel);
    }
}
