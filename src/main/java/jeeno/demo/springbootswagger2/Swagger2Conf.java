package jeeno.demo.springbootswagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/8 16:32
 */
@Configuration
@EnableSwagger2
public class Swagger2Conf {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // the base package would be scanned by swagger2
                .apis(RequestHandlerSelectors.basePackage("jeeno.demo.springbootswagger2"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("[Demo] Spring Boot with Swagger2 APIs")
                .description("a web demo for springboot-swagger2")
//                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("JeenoD")
                .version("1.0")
                .build();
    }
}
