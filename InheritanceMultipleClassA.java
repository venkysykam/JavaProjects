interface InheritanceMultipleClassA {
    public void add();

    default void sub() {
        System.out.println("Sub");
    }
}