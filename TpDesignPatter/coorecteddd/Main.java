class Box<T> {
    private T value;
    public void set(T value) { this.value = value;}
    public T get() { return value; }
}

public void main(String[] args){
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println(stringBox.get()); // Hello
    Box<Integer> intBox = new Box<>();
    intBox.set(42);
    System.out.println(intBox.get());
} // 42
