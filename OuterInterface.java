interface OuterInterface {
    interface InnerInterface {
        void show();
    }
}

class Demo implements OuterInterface.InnerInterface {
    public void show() {
        System.out.println("Inner Interface Implemented!");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}