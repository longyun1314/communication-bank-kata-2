package unit.test.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unit.test.practice.User;
import unit.test.practice.UserService;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceShould {
    @Test
    @DisplayName("给60岁老人打五折")
    void have_half_discount_when_user_old_than_60() {
        //given
        UserService userService = new UserService();

        //when
        double actual = userService.getDiscount(user_with_age(60));

        //then
        assertThat(actual).isEqualTo(0.5);
    }

    private User user_with_age(int age) {
        return new User(age);
    }
}
