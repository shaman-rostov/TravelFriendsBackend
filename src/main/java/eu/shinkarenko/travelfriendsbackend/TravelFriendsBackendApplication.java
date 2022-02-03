package eu.shinkarenko.travelfriendsbackend;

//import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;


@SpringBootApplication
public class TravelFriendsBackendApplication {
//    @Profile("dev")
//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public Server h2Server() throws SQLException {
//        return Server.createTcpServer("-tcp","-tcpAllowOthers","-tcpPort","9092");
//    }


    public static void main(String[] args) {

        SpringApplication.run(TravelFriendsBackendApplication.class, args);
    }

}
