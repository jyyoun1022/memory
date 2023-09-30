package lab.jaeyeal.memory.lab;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCart {

    /** @Scope(value = WebApplicationContext.SCOPE_SESSION)
     * 이것은 웹 애플리케이션의 각 세션당 빈으 ㅣ인스턴스를 생성하도록 스프링에 지시한는 것.
     * 인스턴스는 여러개 존재하지만, 한 가지는 주어진 세션을 위해 성되고, 그것은 해당 세션에 관해서는 본질적으로 싱글톤으로 적용된다.
     * */

    /** @Scope(proxyMode = ScopedProxyMode.INTERFACES)
     * 이 특성은 싱글톤 범위의 빈에 세션 범위 또는 요청 범위 빈을 주입할 때 발생하는 문제를 해결한다.
     * */

}
