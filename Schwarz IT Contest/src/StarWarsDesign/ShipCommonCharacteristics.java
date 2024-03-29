package StarWarsDesign;

public  abstract class ShipCommonCharacteristics {
    private long id;
    private String name;
    private String color;
    private int attackDamage;
    private int life;
    private int shield;
    private int capacity;

    public ShipCommonCharacteristics(long id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attackDamage;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }
    public abstract void attack(ShipCommonCharacteristics ship);
    public abstract void takeDamage(int damage);
    public abstract boolean isDestroyed();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
