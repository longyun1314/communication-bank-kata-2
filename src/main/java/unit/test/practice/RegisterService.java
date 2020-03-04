package unit.test.practice;

public class RegisterService {

    //请创建测试类，为方法register编写足够多的单元测试用例
    //当我反转if else，或则注释掉smsService.send(user)时，测试用例能捕获到错误
    private SmsService smsService = new SmsService();

    public RegisterService() {
    }

    void register(User user) {
        if (user.getPhone() != null) {
            smsService.send(user);
        }
    }
}
