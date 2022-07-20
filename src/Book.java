import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * @author:ap
 **/

public class Book {
    private Integer id;
    private String type;
    private String name;
    private String descri;

    public Book() {
    }

    public Book(Integer id, String type, String name, String descri) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.descri = descri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
}
