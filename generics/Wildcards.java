package generics;

/**
 * Created by Liam on 12/03/2017.
 */
public class Wildcards {
    // Raw argument.
    static void rawArgs(Holder holder, Object arg) {
        // holder.set(arg); warnings :
        // Unchecked call to set(T) as a member of the raw type
        // Holder

        // Can't do this :
        // T t = holder.get();

        // OK, but type information has been lost
        Object obj = holder.get();
    }

    // Similar to rawArgs(), but errors instead of warnings.
    static void unboundedArg(Holder<?> holder, Object arg) {
        // holder.set(arg);

        // Can't do this, don't have any T
        // T t = holder.get();

        // OK, but the type information has been lost :
        Object object = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
        // holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        // T t = holder.get();

        // OK, but type information has been lost
        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        // Or :
        raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        // Object r1 = exact1(raw);
        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);

        // Long r5 = exact2(raw, lng);
        Long r6 = exact2(qualified, lng);

        // Long r7 = exact2(unbounded, lng);
        // Long r8 = exact2(bounded, lng);
        // Long r9 = exact2(raw, lng);
        Long r10 = wildSubtype(qualified, lng);
        // OK, but can only return Object
        Object r11 = wildSubtype(unbounded, lng);
        Long r12 = wildSubtype(bounded, lng);

        // wildSupertype(raw, lng);
        wildSupertype(qualified, lng);
    }
}
