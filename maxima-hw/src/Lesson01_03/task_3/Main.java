package Lesson01_03.task_3;

public class Main {

    public static void main(String[] args) {
        try {
            findUserById(5);
            findUserById(-1);
        } catch (UserNotFoundException e) {
            System.out.println("User with this id is not found");
        }


    }

    static void findUserById(int id) throws UserNotFoundException {
        if (id < 0) {
            throw new UserNotFoundException();
        } else {
            System.out.println("User with id " + id + " is found");
        }

    }
}
