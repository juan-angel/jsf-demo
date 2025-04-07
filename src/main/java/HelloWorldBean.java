import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {
    public String getMessage() {
        return "Hello World from Fuertefentura";
    }
}
