package cn.itcast.jvm.t3.load;

public class Load9_1 {

    public static void main(String[] args) {
//        Single.test();
        Single.getInstance();
    }
}

class Single {

    public static void test() {
        System.out.println("test");
    }

    private Single() {
    }

    // 由类加载器保证线程安全ld
    private static class LazyHolder {
        private static final Single INSTANCE = new Single();

        static {
            System.out.println("lazy holder init");
        }
    }

    public static Single getInstance() {
        return LazyHolder.INSTANCE;
    }
}
