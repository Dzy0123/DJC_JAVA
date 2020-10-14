package djc.day12;

public class Weapon { //武器类,类作为成员变量

    private String weaponname;

    public Weapon() {
    }

    public Weapon(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

}
