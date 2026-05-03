package com.java.inheritance;


public class PolymorphismLab {

    static class A {
        int x = 10;

        void show() {
            System.out.println("A show, x = " + x);
        }

        void process(A obj) {
            System.out.println("A process(A)");
        }

        static void staticMethod() {
            System.out.println("A static");
        }
    }

    static class B extends A {
        int x = 20;

        @Override
        void show() {
            System.out.println("B show, x = " + x);
        }

        void process(B obj) {
            System.out.println("B process(B)");
        }

        @Override
        void process(A obj) {
            System.out.println("B overrides process(A)");
        }

        static void staticMethod() {
            System.out.println("B static");
        }
    }

    public static void main(String[] args) {

        System.out.println("---- Variable vs Method ----");
        A obj = new B();
        System.out.println(obj.x);     // field → A
        obj.show();                   // method → B

        System.out.println("\n---- Overloading vs Overriding ----");
        obj.process(new B());         // compile → A.process(A), runtime → B overrides

        System.out.println("\n---- Static Method ----");
        obj.staticMethod();           // static → A

        System.out.println("\n---- Downcasting ----");
        if (obj instanceof B) {
            B b = (B) obj;
            b.process(b);             // now calls B.process(B)
        }

        System.out.println("\n---- Unsafe Cast ----");
        A obj2 = new A();
        try {
            B b2 = (B) obj2;         // runtime error
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException");
        }

        System.out.println("\n---- Parent Method Calling Overridden Method ----");
        new A() {
            void print() {
                show();              // runtime dispatch still works
            }
        }.print();
    }
}