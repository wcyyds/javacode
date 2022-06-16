public class Text18 {
    public static void main(String[] args) {
        Ouuter.method().show();
    }
}

interface Inner {
    void show();
}

class Ouuter implements Inner {
    public void show() {

    }

    static public Ouuter method() {
        Ouuter ouuter = new Ouuter();
        return ouuter;
    }
}
