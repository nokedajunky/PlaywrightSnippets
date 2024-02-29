package pojo;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TemplateSet {
    @XmlElement(name = "template")
    public List<Template> templates;
    @XmlAttribute
    public String group;

    public TemplateSet() {
    }

    public TemplateSet(List<Template> templates, String group) {
        this.templates = templates;
        this.group = group;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "TemplateSet{" +
                "templates=" + templates.toString() +
                ", group='" + group + '\'' +
                '}';
    }
}
