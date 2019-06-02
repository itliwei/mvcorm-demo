package io.github.itliwei.demo;



import io.github.itliwei.mvcorm.generator.generator.Config;
import io.github.itliwei.mvcorm.generator.generator.Generator;
import io.github.itliwei.mvcorm.generator.generator.handler.MysqlHandler;
import io.github.itliwei.mvcorm.generator.generator.handler.QueryModelHandler;
import io.github.itliwei.mvcorm.generator.generator.handler.ServiceHandler;
import io.github.itliwei.mvcorm.generator.generator.handler.VoHandler;

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
        config.setEntityPackage("io.github.itliwei.demo.entity.User");

        config.setUsername("root");
        config.setPassword("111");
        config.setUseLombok(true);

        Generator.generate(config
                , new VoHandler()
                , new QueryModelHandler()
                , new ServiceHandler()
                //, new ControllerHandler()
                //, new ElementHandler()
               , new MysqlHandler(true)
        );

    }
}
