package InterfaceAsMemberVar;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("亚索");
        hero.setSkill(new SkillImpl());
        hero.attack();
        System.out.println("==========");
        Skill skill=new Skill() {
            @Override
            public void use() {
                System.out.println("面对疾风吧!哈撒给.");
            }
        };
        hero.setSkill(skill);
        hero.attack();
    }
}
