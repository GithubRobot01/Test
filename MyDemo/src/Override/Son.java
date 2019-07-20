package Override;

public class Son extends Father {
   /* 对于已经投入使用的类,尽量不要进行修改
    推荐定义一个新的类,来重复利用其中共性内容,并且添加改动新内容*/

    @Override
    public void play(){
        super.play();
        /*System.out.println("打电话");
        System.out.println("发信息");*/
        System.out.println("打游戏");
    }

}
