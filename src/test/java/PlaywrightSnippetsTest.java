import org.junit.Test;
import pojo.Template;
import pojo.TemplateSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PlaywrightSnippetsTest {

    @Test
    public void allSnippetsShouldStartWithCorrectPrefix() {
        final String prefix = "p-";
        final TemplateSet snippets = getTemplates();
        final List<Template> templates = snippets.getTemplates();

        assertThat(templates).allMatch(x -> x.getName().startsWith(prefix), String.format("Expecting that every snippets starts with a specific prefix %s!", prefix));
    }
    @Test
    public void allSnippetsShouldHaveNonEmptyDescription() {
        final TemplateSet snippets = getTemplates();
        final List<Template> templates = snippets.getTemplates();

        assertThat(templates).allMatch(x -> !x.getDescription().isEmpty(), "Expecting every snippet to have a description inside!");
    }

    public TemplateSet getTemplates() {
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(TemplateSet.class);
            final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            final TemplateSet templateSet = (TemplateSet) unmarshaller.unmarshal(new File("src\\main\\resources\\liveTemplates\\PlaywrightSnippets.xml"));
            return templateSet;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
