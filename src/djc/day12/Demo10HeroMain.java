package djc.day12;

public class Demo10HeroMain { //使用英雄

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");

        //给英雄配备武器并释放技能

        /*配备武器*/
        Weapon weapon = new Weapon("黑切");
        hero.setWeapon(weapon);

        /*施放技能使用实现类*/
        hero.setSkill(new SkillImpl());
        hero.attack();

        /*施放技能使用匿名内部类方法*/
        Skill skill = new Skill() { //使用匿名内部类
            @Override
            public void use() {
                System.out.println("施放技能：德玛西亚！！！");
            }
        };
        hero.setSkill(skill);
        hero.attack();
        System.out.println("===============");

        /*施放技能使用匿名内部类和匿名对象*/
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("施放技能：旋转！！！");
            }
        });
        hero.attack();
    }
}
