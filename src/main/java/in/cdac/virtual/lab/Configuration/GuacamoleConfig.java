//package in.cdac.virtual.lab.Configuration;
//
//// GuacamoleConfig.java
//import org.apache.guacamole.GuacamoleException;
//import org.apache.guacamole.auth.mysql.MySQLAuthenticationProvider;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GuacamoleConfig {
//
//    @Value("${guacamole.auth.jdbc.mysql.hostname}")
//    private String hostname;
//
//    @Value("${guacamole.auth.jdbc.mysql.port}")
//    private int port;
//
//    @Value("${guacamole.auth.jdbc.mysql.database}")
//    private String database;
//
//    @Value("${guacamole.auth.jdbc.mysql.username}")
//    private String username;
//
//    @Value("${guacamole.auth.jdbc.mysql.password}")
//    private String password;
//
//    @Value("${guacamole.auth.jdbc.mysql.user-model}")
//    private String userModel;
//
//    @Bean
//    public MySQLAuthenticationProvider mySQLAuthenticationProvider() throws GuacamoleException {
//        MySQLAuthenticationProvider provider = new MySQLAuthenticationProvider();
////        provider.setHostname(hostname);
////        provider.setPort(port);
////        provider.setDatabase(database);
////        provider.setUsername(username);
////        provider.setPassword(password);
////        provider.setUserModel(userModel);
//        return provider;
//    }
//}
