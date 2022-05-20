package KOOP.OOP4;

public class ObjectClass {
    // It is the top most class in the inheritance
    // Methods we can override in the object class:-

    // 1. Hashcode
    // A unique number representation of an object
    // It is not an address
    // In java we cannot print the address of the object

    // 2. equals
    //

    // 3. clone
    // 4. toString
    // 5. finalize (Used to garbage collection)

    // Hashcode
    int num;

    ObjectClass(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Equals
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass) obj).num;
    }

    public static void main(String[] args) {

        // Hashcode
        ObjectClass ex = new ObjectClass(4);
        ObjectClass ex1 = new ObjectClass(2);
        // System.out.println(ex.hashCode());
        // System.out.println(ex1.hashCode());

        // Equals
        // Double equals to check whether both the variables are pointing to the same
        // object or not
        if (ex == ex1) {
            System.out.println("ex and ex1 are equal");
        } else {
            System.out.println("Not Equal");
        }

        if (ex.equals(ex1)) {
            System.out.println("ex and ex1 are equal");
        } else {
            System.out.println("Not Equal");
        }

        // Get class method
        System.out.println(ex1.getClass());
    }
}
