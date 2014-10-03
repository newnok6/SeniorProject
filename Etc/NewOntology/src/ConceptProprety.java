/**
 * Created by admin on 5/2/14 AD.
 */
public class ConceptProprety {
    String number[][];
    String name;
    String scope;
    String start;
    public ConceptProprety(String number[][], String name, String scope, String type, String start) {
        this.number = number;
        this.name = name;
        this.scope = scope;
        this.type = type;
        this.start = start;
    }

    public String[][] getNumber() {

        return number;
    }

    public void setNumber(String number[][]) {
        this.number = number;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String score) {
        this.scope = scope;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

}
