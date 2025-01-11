package ioc.container.environment_load;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigPrinter {
    public ConfigPrinter() {

    }

    @Value("${test.name}")
    private String name;

    @Value("${test.path}")
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
