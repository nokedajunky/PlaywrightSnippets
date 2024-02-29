package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "template")
@XmlAccessorType(XmlAccessType.FIELD)
public class Template {
    @XmlAttribute
    public String name;
    @XmlAttribute
    public String value;
    @XmlAttribute
    public String description;
    @XmlAttribute
    public boolean toReformat;
    @XmlAttribute
    public boolean toShortenFQNames;

    public Template() {
    }

    public Template(String name, String value, String description, boolean toReformat, boolean toShortenFQNames) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.toReformat = toReformat;
        this.toShortenFQNames = toShortenFQNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isToReformat() {
        return toReformat;
    }

    public void setToReformat(boolean toReformat) {
        this.toReformat = toReformat;
    }

    public boolean isToShortenFQNames() {
        return toShortenFQNames;
    }
    public void setToShortenFQNames(boolean toShortenFQNames) {
        this.toShortenFQNames = toShortenFQNames;
    }

    @Override
    public String toString() {
        return "Template{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                ", toReformat=" + toReformat +
                ", toShortenFQNames=" + toShortenFQNames +
                '}';
    }

}
