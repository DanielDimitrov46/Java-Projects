package StarWarsDesign;

public class Outrider extends ShipCommonCharacteristics {
    private int plasma;
    public Outrider(long id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life+100, shield, capacity);
        this.plasma = plasma;
    }



    @Override
    public void attack(ShipCommonCharacteristics ship){
        ship.takeDamage(this.getAttackDamage());
        if(ship.isDestroyed()) {
            System.out.println("Ship is destroyed");
        }
    }

    @Override
    public void takeDamage(int damage) {
        damage-=50;
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
    public int getPlasma() {
        return plasma;
    }

    public void setPlasma(int plasma) {
        this.plasma = plasma;
    }
}
