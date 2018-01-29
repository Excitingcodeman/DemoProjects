package huang.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
