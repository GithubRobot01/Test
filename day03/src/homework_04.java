public class homework_04 {
        public static void main(String[] args) {
            //Outer.method()可以调用方法,所以Outer.method()的返回值必然是对象
            Outer.method().show();
        }
    }

    interface Inter {
        void show();
    }

    class Outer {
        /*public static Inter method() {
            return new Inter(){
                @Override
                public void show() {
                    System.out.println("HelloWorld");
                }
            };
        }*/

        public static Inter method() {
            return ()-> System.out.println("HelloWorld");
        };
    }