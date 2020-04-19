package morkaragh.restdatatryout.model;

import javax.persistence.*;

@Entity
@Table(name = "attr_type")
public class AttributeType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public AttributeType setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AttributeType setName(String name) {
        this.name = name;
        return this;
    }
}
