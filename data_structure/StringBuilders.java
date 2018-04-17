package data_structure;

import com.sun.istack.internal.Nullable;

public class StringBuilders {

    private char[] characters;
    private int chars_length;
    private int size;

    // default constructor
    StringBuilders() {
        this(0, null);
    }

    StringBuilders(int size) {
        this(size, null);
    }

    StringBuilders(String a) {
        this(a.length(), a);
    }

    StringBuilders(int space, @Nullable String a) {
        characters = a.toCharArray();
        chars_length = characters.length;
        if(size < chars_length) size = chars_length;
        else                    size = space;
    }

    public void setCharAt(int k, char new_char) throws NoSuchMethodException {
        if(k > this.size - 1)
            throw new ArrayIndexOutOfBoundsException("the index of method " + StringBuilders.class
                    .getMethod("setCharAt", int.class, char.class) + " goes out of range.");



        characters[k] = new_char;
    }

    private void resize(int new_size) {
        char[] temp = this.characters;
        characters = new char[new_size];
        size = new_size;

        for(int i = 0; i < temp.length; i++) {
            characters[i] = temp[i];
        }
    }

    public void insert(int index, char new_char) throws NoSuchMethodException {
        if(this.chars_length == this.size)
            resize(2 * size);
        else if(index > this.size - 1)
            throw new ArrayIndexOutOfBoundsException("the index of method " + this.getClass().getMethod("insert",
                    int.class, char.class) + " is out of bound");
        // temporary char variable to store characters in previous position.
        char temp = ' ';
        for(int in = 0; in < size; in++) {
            if(in < index) continue;
            this.swap(characters[in], temp);
        }
    }

    // private helper class used inside this class.
    private void swap(char old_char, char new_char) {
        char temp = old_char;
        old_char = new_char;
        new_char = temp;
    }

    // reverse the order of characters in the character array.
    public void reverse() {
        int index = 0;
        while(index < this.size / 2 - 1) {
            char temp = characters[index];
            characters[index] = characters[this.size - 1 - index];
            characters[this.size - 1 - index] = temp;
            index++;
        }
    }

    @Override
    public String toString() {
        return new String(characters);
    }

    // Unit Test
    public static void main(String[] args) {
        StringBuilders sb = new StringBuilders("Fuck you");

        try {
            sb.setCharAt(6, 'b');
            System.out.println(sb);

            sb.setCharAt(100, 'o');
            System.out.println(sb);

            sb.insert(12, 'b');
            System.out.println(sb);
        }
        catch(NoSuchMethodException e) {
            e.printStackTrace();
        }

        sb.reverse();
        System.out.println(sb);


    }
}
