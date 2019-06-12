package shopbanhang;

import org.salespointframework.EnableSalespoint;
import org.salespointframework.SalespointSecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableSalespoint
public class ShopBanHangApplication {
	private static final String LOGIN_ROUTE = "/login";

	public static void main(String[] args) {
		SpringApplication.run(ShopBanHangApplication.class, args);
	}
	@Configuration
	static class ShopBanHangConfiguration implements WebMvcConfigurer {

	
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController(LOGIN_ROUTE).setViewName("login");
			registry.addViewController("/").setViewName("index");
			registry.addViewController("/add").setViewName("Add");
		}
	}

	@Configuration
	static class WebSecurityConfiguration extends SalespointSecurityConfiguration {

	
		@Override
		protected void configure(HttpSecurity http) throws Exception {

			http.csrf().disable();
			http.headers().frameOptions().sameOrigin();

			http.authorizeRequests().antMatchers("/**").permitAll().and().//
					formLogin().loginPage(LOGIN_ROUTE).loginProcessingUrl(LOGIN_ROUTE).and(). //
					logout().logoutUrl("/logout").logoutSuccessUrl("/");
		}
	}
}
