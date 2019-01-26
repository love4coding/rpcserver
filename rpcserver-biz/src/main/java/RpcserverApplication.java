import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ImportResource(locations = {"classpath*:config/spring/*.xml"})
@ComponentScan(basePackages = {"com.study.rpcserver.*"})
public class RpcserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(RpcserverApplication.class, args);
	}
}
