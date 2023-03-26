package StarWarsDesign;

public class EbonHawk extends ShipCommonCharacteristics {
    public EbonHawk(long id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
    }

    @Override
    public void attack(ShipCommonCharacteristics ship) {
        ship.takeDamage(this.getAttackDamage());
        if (ship.isDestroyed()) {
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (this.getShield() >= damage) {
            this.setShield(getShield() - damage);
        } else if (this.getShield() < damage) {
            setLife(this.getLife() - (damage - this.getShield()));
        } else if (this.getShield() <= 0) {
            setLife(this.getLife() - damage);
        }
    }

    @Override
    public boolean isDestroyed() {
        if (this.getLife() <= 0) {
            return true;
        }
        return false;
    }

    public void heal(int life) {
        this.setLife(getLife() + life);
    }
}
