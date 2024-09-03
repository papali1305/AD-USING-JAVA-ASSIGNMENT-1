// PART 2


public class Student implements DetailInfo {
    private static int maxCount = 0;
    private String name;

    // Setter method: setter(String name)
    public void setter(String name) {
        this.name = name;
        maxCount = Math.max(maxCount, name.length());
    }

    // Getter method: getter()
    public String getter() {
        return name;
    }

    // Implementation of DetailInfo interface method: display()
    @Override
    public void display() {
        System.out.println("Name: " + getter());
        System.out.println("Character Count: " + count());
    }

    // Implementation of DetailInfo interface method: count()
    @Override
    public int count() {
        return getter().length();
    }

    // Static method to get the maximum character count
    public static int getMaxCount() {
        return maxCount;
    }
}