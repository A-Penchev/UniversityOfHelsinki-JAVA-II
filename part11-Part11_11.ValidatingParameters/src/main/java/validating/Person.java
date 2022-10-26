package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(age>120||age<0){
            throw new IllegalArgumentException("Error in age");
        }
        if(name==null||name.length()==0||name.length()>40){
            throw new IllegalArgumentException("Error in name");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
