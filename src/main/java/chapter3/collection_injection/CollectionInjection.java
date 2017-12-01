package chapter3.collection_injection;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollection")
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String, Object> map;
    @Resource(name = "list")
    private List list;
    @Resource(name = "set")
    private Set set;
    @Resource(name = "properties")
    private Properties properties;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:META-INF/spring/chapter3/collection_injection/annotation-app-config.xml");
        context.refresh();
        CollectionInjection collectionInjection = (CollectionInjection) context.getBean("injectCollection");
        collectionInjection.displayInfo();
    }

    private void displayInfo() {
        System.out.println("Map contents:");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key:"+entry.getKey()+" - Value: " +entry.getValue());
        }

        System.out.println("\nProperties contents:");
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println("Key:"+entry.getKey()+" - Value: " +entry.getValue());
        }

        System.out.println("\nSet contents:");
        for (Object entry : set) {
            System.out.println("Value: " +entry);
        }

        System.out.println("\nList contents:");
        for (Object entry : list) {
            System.out.println("Value: " +entry);
        }
    }
}
