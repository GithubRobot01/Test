package ClassAsMemberVar;

public class Demo {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("盖伦");
        hero.setAge(23);
        //创建一个武器对象
        //可以使用有参构造直接给武器赋值,也可以使用无参构造再给武器赋值
        Weapon weapon=new Weapon();
        weapon.setCode("大宝剑");  // Weapon weapon=new Weapon("大宝剑");

        hero.setWeapon(weapon);
        hero.attack();
    }

}
