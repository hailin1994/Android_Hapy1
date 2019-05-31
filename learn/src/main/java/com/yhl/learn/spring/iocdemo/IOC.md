BeanFactory


BeanDefinition 配置了一些属性 

DefaultListableBeanFactory 

private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap(256);

ApplicationContext 实现了BeanFactory

ClassPathXmlApplicationContext 获取工程目录配置文件

FileSystemXmlApplicationContext  获取绝对路径配置文件

AnnotationConfigApplicationContext  注解容器







