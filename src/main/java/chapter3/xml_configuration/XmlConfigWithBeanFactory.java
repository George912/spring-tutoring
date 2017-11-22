package chapter3.xml_configuration;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {
    private static final Logger LOGGER = Logger.getLogger(XmlConfigWithBeanFactory.class);

    public static void main(String[] args) {
        LOGGER.debug("call main()");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("META-INF/spring/xml-bean-factory-config.xml"));
        LOGGER.debug("load bean defenitions from META-INF/spring/xml-bean-factory-config.xml");
        Oracle oracle = (Oracle) defaultListableBeanFactory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
