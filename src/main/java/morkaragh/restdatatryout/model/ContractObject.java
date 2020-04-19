package morkaragh.restdatatryout.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contract_object")
public class ContractObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Attribute> attributes;

    public Long getId() {
        return id;
    }

    public ContractObject setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContractObject setName(String name) {
        this.name = name;
        return this;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public ContractObject setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
}
