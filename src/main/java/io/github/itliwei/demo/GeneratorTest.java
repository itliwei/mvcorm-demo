package io.github.itliwei.demo;


import io.github.itliwei.generator.generator.Config;
import io.github.itliwei.generator.generator.Generator;
import io.github.itliwei.generator.generator.handler.ControllerHandler;
import io.github.itliwei.generator.generator.handler.QueryModelHandler;
import io.github.itliwei.generator.generator.handler.ServiceHandler;
import io.github.itliwei.generator.generator.handler.VoHandler;

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
        config.setUrl("jdbc:mysql://127.0.0.1:3306/db?useUnicode=true");
        config.setEntityPackage("io.github.itliwei.demo.entity");
        config.setQueryModelPackage("io.github.itliwei.demo.query");
        config.setVoPackage("io.github.itliwei.demo.vo");
        config.setServicePackage("io.github.itliwei.demo.service");
        config.setControllerPackage("io.github.itliwei.demo.controller");
        config.setComponentPackage("io.github.itliwei.demo.component");

        config.setUsername("root");
        config.setPassword("root");
        config.setUseLombok(true);

        config.setElementPackage("/Users/vince/myproject/mvcorm/vue");
        config.setElementPath("/Users/vince/myproject/mvcorm/vue");

        Generator.generate(config
                , new VoHandler()
                , new QueryModelHandler()
                , new ServiceHandler()
                , new ControllerHandler()
//                , new ElementHandler()
//               , new MysqlHandler(true)
        );

    }
}
