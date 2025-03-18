package project.libraryManagement;

public class Runner {
    public static void main(String srgs[]){
        User prachi= new User();
        Books obj1 = new Books(101,"my fault", "akshat",50);
        Books obj2 = new Books(103,"your fault", "prateek",10);
        prachi.rentBook(obj2);
        prachi.rentBook(obj1);
        prachi.getAllBooks();
    }

}
