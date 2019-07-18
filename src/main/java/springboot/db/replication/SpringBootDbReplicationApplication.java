package springboot.db.replication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@EnableAutoConfiguration
public class SpringBootDbReplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbReplicationApplication.class, args);
	}

}
