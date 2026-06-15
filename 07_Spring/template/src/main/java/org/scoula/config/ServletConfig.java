package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc // Spring MVC기능 활성화 -> 모든 요청이 Dispatcher Servlet을 거치게됨.
// @Controller 인식 / @RequestMapping, @GepMapping
// ViewResolver 설정
@ComponentScan(basePackages = {"org.scoula.controller"})
public class ServletConfig implements WebMvcConfigurer {

    //정적 리소스(이미지, css, js 등)은 컨트롤러에서 처리하지 않기 위함
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**") // url이 resources로 시작하는 모든 URL
                .addResourceLocations("/resources/"); //실제 /resources/ 에서 파일을 찾아 반환
    }

    //jsp 쓰기 위한 view Resolver설정
    // -> 컨트롤러가 return한 view이름을 실제 JSP파일 경로로 변환해주는 역할
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);

        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");

        registry.viewResolver(bean);
    }
}
