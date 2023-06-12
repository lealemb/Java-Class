public class student {
    int id;
    String name;
    void register(int i, String n){
        id=i;
       name=n;
    }
    void display(){
        System.out.println(id+ " "+ name);
    }

    public static void main(String[] args) {
        student s1= new student();
        student s2= new student();
        s1.register(01,"Lealem");
        s2.register(02,"Johnny");
        s1.display();
        s2.display();
    }
}
