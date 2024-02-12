package PBO.InnerClass;

public class ClassA {
    private int y = 20;
    int x = 15;
    void methodPadaA(){
        class ClassB {
            static int i = 10;
            void methodPadaB(){
                System.out.println("i = " + i);
            }
        }
        ClassB b = new ClassB();
        b.methodPadaB();
    }
}

//package PBO.InnerClass;
//
//public class ClassA {
//    private int y = 20;
//    int x = 15;
//    class ClassB {
//        static int x = 10;
//        void methodPadaB(){
//            System.out.println("\nHello, saya method di kelas A");
//            System.out.println("kelas B berada di kelas A");
//            System.out.println("y = " + y);
//            System.out.println("x di B = " + this.x);
//            System.out.println("x di A = " + ClassA.this.x);
//        }
//    }
//    void methodPadaA(){
//        ClassB b = new ClassB();
//        System.out.println("\nHello, saya method kelas A");
//        System.out.println("Saya membuat object dari inner class B");
//        b.methodPadaB();
//    }
//}

