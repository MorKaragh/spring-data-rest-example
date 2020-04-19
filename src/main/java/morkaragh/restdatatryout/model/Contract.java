package morkaragh.restdatatryout.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    private BigDecimal premium;
    @Column(name = "contract_sum")
    private Double sum;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ContractObject> objects;

    public Long getId() {
        return id;
    }

    public Contract setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Contract setNumber(String number) {
        this.number = number;
        return this;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public Contract setPremium(BigDecimal premium) {
        this.premium = premium;
        return this;
    }

    public Double getSum() {
        return sum;
    }

    public Contract setSum(Double sum) {
        this.sum = sum;
        return this;
    }

    public List<ContractObject> getObjects() {
        return objects;
    }

    public Contract setObjects(List<ContractObject> objects) {
        this.objects = objects;
        return this;
    }
}
