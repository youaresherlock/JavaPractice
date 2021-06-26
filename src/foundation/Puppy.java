package foundation;

public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.println("小狗的名字是: " + name);
    }

    public void setAge(int age){
        this.puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为: " + this.puppyAge);

        return this.puppyAge;
    }

    public static void main(String[] args){
        Puppy myPuppy = new Puppy("clarence");
        myPuppy.setAge(2);
        System.out.println(myPuppy.getAge());
        System.out.println("变量值: " + myPuppy.puppyAge);
    }
}


































