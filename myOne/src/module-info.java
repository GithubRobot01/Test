import itheima_03.Impl.Czbk;
import itheima_03.MyService;

module myOne {
    exports itheima_01;
    exports itheima_03;

    //provides MyService with Itheima;
    provides MyService with Czbk;
}