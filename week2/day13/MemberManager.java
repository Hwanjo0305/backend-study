package day13;
import java.util.Map;
import java.util.HashMap;

public class MemberManager {
    Map<Long, User> users = new HashMap<>();

    public void addUser(User user) {
        if(users.containsKey(user.getId())) {
            System.out.println("이미 존재하는 ID입니다.");
        } else {
            users.put(user.getId(), user);
        }
        
    }

    public void findAll() {
        for(User user : users.values()) {
            user.printInfo();
        }
    }

    public void findUser(Long id) {
        User user = users.get(id);

        if(user != null) {
            user.printInfo();
        } else {
            System.out.println("회원을 찾을 수 없습니다");
        }
    }

    public void deleteUser(Long id) {
        User user = users.remove(id);
        if(user!=null) {
            System.out.println("회원이 삭제되었습니다.");
        } else {
            System.out.println("회원을 찾을 수 없습니다.");
        }
    }
}
