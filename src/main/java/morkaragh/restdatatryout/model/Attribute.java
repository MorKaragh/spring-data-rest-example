package morkaragh.restdatatryout.model;

import javax.persistence.*;

@Entity
@Table(name = "attr_value")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private AttributeType type;
    private String value;

    public Long getId() {
        return id;
    }

    public Attribute setId(Long id) {
        this.id = id;
        return this;
    }

    public AttributeType getType() {
        return type;
    }

    public Attribute setType(AttributeType type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Attribute setValue(String value) {
        this.value = value;
        return this;
    }
}
