package PBO.Interface;

public interface Interface1 {
    public String cetakStr1(String x);
    public String cetakStr2(String x);
    default void message(){
        System.out.println("Default method");
    }
    static void start(){
        System.out.println("Mulai percetakan");
    }
}
