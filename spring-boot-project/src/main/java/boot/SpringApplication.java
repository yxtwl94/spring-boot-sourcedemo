package boot;

import org.springframework.core.io.ResourceLoader;

/**
 * 仅供学习使用的最小spring boot
 */
public class SpringApplication {
	private ResourceLoader resourceLoader;

	public SpringApplication(Class<?>... primarySources) {
		this(null, primarySources);
	}

	public SpringApplication(ResourceLoader resourceLoader, Class<?>... primarySources){
		this.resourceLoader = resourceLoader;

	}

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[0], args);
	}

	public static ConfigurableApplicationContext run(Class<?>[] primarySources, String[] args){
		return new SpringApplication(primarySources).run(args);
	}

	public ConfigurableApplicationContext run(String... args){
		return new ConfigurableApplicationContext();
	}
}
