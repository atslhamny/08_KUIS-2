abstract class DamageableObject extends GameObject {
    protected int MaxHealth;
    protected int Health;

    public DamageableObject(String name, int x, int y, int maxHealth) {
        super(name, x, y);
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }

    public boolean IsDead() {
        return Health <= 0;
    }

    public void TakeDamage(int damage) {
        Health -= damage;
        System.out.println(Name + " menerima damage sebesar " + damage);
        if (IsDead()) {
            OnKilled();
        }
    }

    public abstract void OnKilled();
}
