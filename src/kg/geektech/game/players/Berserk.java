package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coef = RPG_Game.random.nextInt(5) + 1; // 0, 1, 2
        boss.setHealth(boss.getHealth() - (boss.getDamage()/ coef)+this.getDamage());
        System.out.println("DopYronOtBerserka " + (boss.getDamage()/ coef+this.getDamage()));
    }
}
