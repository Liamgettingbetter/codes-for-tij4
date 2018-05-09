package data_structure;

public class ArrayList<Element> implements List<Element> {

    private static final int DEFAULT_CAPACITY = 20;

    private Element[] container;
    private int capacity;
    private int current_size;

    public ArrayList() { this(DEFAULT_CAPACITY); }

    public ArrayList(int capacity) {
        this.container = (Element[])new Object[capacity];
        this.capacity = capacity;
        this.current_size = 0;
    }

    @Override
    public int size() { return this.current_size; }

    @Override
    public boolean isEmpty() { return this.current_size == 0; }

    @Override
    public Element get(int i) throws IndexOutOfBoundsException {
        if(i > current_size) throw new IndexOutOfBoundsException("argument i is out of array index bound.");

        
    }

    @Override
    public Element set(Element elem, int i) throws IndexOutOfBoundsException {}

    @Override
    public void add(Element e, int i) {}

    @Override
    public Element remove(int i) throws IndexOutOfBoundsException {}
}
