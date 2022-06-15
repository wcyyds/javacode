
public class Outer {
    private String name = "Ð¡Ã÷";

    public class Inner {
        private String name = "Ð¡ºì";

        public void show1() {
            System.out.println(name);
        }

        public void show2() {
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.show2();
        i.show1();
    }


}
