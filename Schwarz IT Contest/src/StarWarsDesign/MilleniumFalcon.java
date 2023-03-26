package StarWarsDesign;

public class MilleniumFalcon extends ShipCommonCharacteristics {
    private int dodge;

    public MilleniumFalcon(long id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.dodge = dodge;
    }

    @Override
    public void attack(ShipCommonCharacteristics ship) {
        ship.takeDamage(this.getAttackDamage() * 2);
        if (ship.isDestroyed()) {
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void takeDamage(int damage) {
        damage+=200;
        if (this.getShield()>=damage) {
            this.setShield(getShield()-damage);
        } else if (this.getShield() < damage) {
            setLife(this.getLife()-(damage-this.getShield()));
        }else if(this.getShield() <= 0){
            setLife(this.getLife() - damage);
        }
    }

    @Override
    public boolean isDestroyed() {
        if (this.getLife()<=0) {
            return true;
        }
        return false;
    }


    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
