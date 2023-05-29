/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livia.prototipo.bitbox;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author matheus
 */
public class ConexaoMySql {

    private JdbcTemplate connectionMySql;

    public ConexaoMySql(){

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://3.84.211.35:3306/bitbox");

        dataSource.setUsername("root");

        dataSource.setPassword("urubu100");
        this.connectionMySql = new JdbcTemplate(dataSource);
    }
    public JdbcTemplate getConnection() {
        return connectionMySql;
    }
}
