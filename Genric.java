class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class Genric
{
	public static void main(String[] args)
	{
		Box<Integer> integerBox = new Box<>();
		integerBox.set(10);
		int value = integerBox.get();
		System.out.println(value);
		


		Box<String> stringBox = new Box<>();
		stringBox.set("Amith");
		String value2 = stringBox.get();
				System.out.println(value2);

	}
}
