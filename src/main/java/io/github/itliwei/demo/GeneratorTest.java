package io.github.itliwei.demo;





import io.github.itliwei.generator.generator.Config;
import io.github.itliwei.generator.generator.Generator;
import io.github.itliwei.generator.generator.handler.*;

import java.io.File;
import java.nio.file.Paths;

/**
 * @author : liwei
 * @date : 2019/05/21 21:50
 */
public class GeneratorTest {
    private static final String S = File.separator;

    public static void main(String[] args) {
        String projectPath = new File("").getAbsolutePath();
        Config config = new Config();
        config.setGenLogFile(Paths.get(System.getProperty("user.home"), "gen.log").toString());
        config.setUrl("jdbc:mysql://127.0.0.1:3306/test?useSSL=false");
        config.setEntityPackage("io.github.itliwei.demo.entity");

        config.setUsername("root");
        config.setPassword("111");
        config.setUseLombok(true);

        config.setVoPackage("io.github.itliwei.demo.vo");
        config.setQueryModelPackage("io.github.itliwei.demo.query");
        config.setControllerPackage("io.github.itliwei.demo.controller");
        config.setServicePackage("io.github.itliwei.demo.service");
        config.setElementPackage("io.github.itliwei.demo.elementui");

        Generator.generate(config
                , new VoHandler()
                , new QueryModelHandler()
                , new ServiceHandler()
                , new ControllerHandler()
                , new ElementHandler()
//               , new MysqlHandler(true)
        );

    }
}
