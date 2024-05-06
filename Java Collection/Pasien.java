public class Pasien {
    private String name;
    private int age;

    public Pasien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", Usia: " + age;
    }
}
