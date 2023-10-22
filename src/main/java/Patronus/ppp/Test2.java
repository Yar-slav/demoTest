package Patronus.ppp;

public class Test2 implements inter {
    static Test2 test2 = new Test2();
    protected String prot = "prot";
    public String pub = "pub";


    public static void main(String[] args) {
        test2.met();
        int code = test2.hashCode();
        System.out.println(code);
    }

    @Override
    public void met() {
        inter.m();
        def();
    }
}

interface inter {
    void met();

    static void m() {
        System.out.println("m");
    }

    default void def(){
        System.out.println("def");
    }
}
