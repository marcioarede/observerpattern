import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
        @Test
        public void Teste(){
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
                editor.openFile("test.txt");
                editor.saveFile();
        } catch (Exception e) {
                e.printStackTrace();
             }
        assertTrue(editor!=null);
        }
}
