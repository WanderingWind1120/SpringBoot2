package SB4;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.random.RandomGenerator;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getRandomGirl (){
        // Random một cái tên có độ dài 10
        String name = randomGirlName(10);
        return girlRepository.getGirlByName(name);
    }

    public String randomGirlName (int lenght){
        // Random 1 String có độ dài quy định
        // Sủ dụng thư viện Aphache.common.lang
        return RandomStringUtils.randomAlphanumeric(lenght).toLowerCase();
    }
}
