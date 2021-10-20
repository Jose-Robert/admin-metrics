package br.com.monitoring.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MonitoringAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringAdminApplication.class, args);
	}

}
