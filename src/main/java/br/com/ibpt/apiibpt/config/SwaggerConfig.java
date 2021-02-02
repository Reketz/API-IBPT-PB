//package br.com.ibpt.apiibpt.config;
//
//import com.sun.javafx.scene.control.skin.VirtualFlow;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import static springfox.documentation.builders.PathSelectors.regex;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    
//    @Bean
//    public Docket ibptApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("br.com.ibpt.apiibpt"))
//                .paths(regex("/apiibpt.*"))
//                .build().apiInfo(metaInfo());
//    }
//    
//    private ApiInfo metaInfo(){
//        return new ApiInfo(
//                "API IBPT PB", 
//                "Api de calculo de impostos nacional, estadual e municipal", 
//                "1.0", "Terms of Service", new Contact("Guilherme Estevão", "", "guilhermewilliann@hotmail.com"), 
//                "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", 
//                new VirtualFlow.ArrayLinkedList<>());
//    }
//    
//}
