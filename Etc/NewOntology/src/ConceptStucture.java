import java.util.ArrayList;

/**
 * Created by admin on 5/2/14 AD.
 */
public class ConceptStucture {
    String name;
    String extend;

    ArrayList<String> implement ;

ArrayList<ConceptProprety> attributeArrayList = new ArrayList<ConceptProprety>();
    public ConceptStucture(String name, String extend, ArrayList<String> implement, ArrayList<ConceptProprety> attributeArrayList) {
        this.name = name;
        this.extend = extend;
        this.implement = implement;
        this.attributeArrayList = attributeArrayList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ConceptProprety> getAttributeArrayList() {
        return attributeArrayList;
    }

    public void setAttributeArrayList(ArrayList<ConceptProprety> attributeArrayList) {
        this.attributeArrayList = attributeArrayList;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public ArrayList<String> getImplement() {
        return implement;
    }

    public void setImplement(ArrayList<String> implement) {
        this.implement = implement;
    }

}
