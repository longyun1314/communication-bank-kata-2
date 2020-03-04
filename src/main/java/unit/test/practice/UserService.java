package unit.test.practice;

public class UserService {
    public double getDiscount(User user) {
        if (user.getAge() >= 60) {
            return 0.5;
        } else {
            return 1;
        }
    }
}
