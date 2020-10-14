package djc.day12;

public class SkillImpl implements Skill{ //技能接口实现类

    @Override
    public void use() {
        System.out.println("施放技能：沉默");
    }
}
