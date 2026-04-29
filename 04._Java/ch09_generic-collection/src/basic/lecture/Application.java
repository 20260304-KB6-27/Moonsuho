package basic.lecture;

public class Application {
    public static void main(String[] args) {

        // api 요청이 들어온 상태

        // 서비스로직
        User user = new User("Kim", 20);
        System.out.println(user);

        // Controller
        APIResponse<User> response = APIResponse.ok(user);
        System.out.println(response); // api 요청한 곳에서 응답받는 객체
    }



//    @GetMapping("/user/1")
//    public APIResponse<User> getUser() {
//        User user = new User("Kim", 20);
//
//        return APIResponse.ok(user);
//    }
}