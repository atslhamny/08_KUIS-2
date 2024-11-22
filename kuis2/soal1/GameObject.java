package soal1;
public class GameObject {
    protected String Name;
    protected int PosX;
    protected int PosY;
    
    public GameObject(String name, int x, int y) {
        this.Name = name;
        this.PosX = x;
        this.PosY = y;
    }
    
    public void Despawn() {
        System.out.println(Name + " telah dihapus dari game.");
    }
}