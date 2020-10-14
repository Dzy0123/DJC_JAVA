package djc.day12;

public class Hero { //英雄类

    private String name;
    private Weapon weapon; //类作为成员变量
    private Skill skill; //接口作为成员变量

    public Hero() {
    }

    public Hero(String name, Weapon weapon, Skill skill) {
        this.name = name;
        this.weapon = weapon;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void attack() {
        System.out.println(getName() + "使用" + weapon.getWeaponname() + "攻击");
        skill.use(); //调用接口中的抽象方法
    }
}



