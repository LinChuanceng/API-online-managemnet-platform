package lin.apiinterface;

import com.lin.apiclientsdk.client.LinApiClient;
import com.lin.apiclientsdk.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiInterfaceApplicationTests {
    @Autowired
    LinApiClient linApiClient;

    @Test
    void testStart(){
        User user = new User();
        user.setUsername("liao");
        String usernameByPost = linApiClient.getUsernameByPost(user);
        System.out.println(usernameByPost);
    }

}
