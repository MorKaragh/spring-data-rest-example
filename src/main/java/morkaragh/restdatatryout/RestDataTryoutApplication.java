package morkaragh.restdatatryout;

import morkaragh.restdatatryout.model.Attribute;
import morkaragh.restdatatryout.model.AttributeType;
import morkaragh.restdatatryout.model.Contract;
import morkaragh.restdatatryout.model.ContractObject;
import morkaragh.restdatatryout.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootApplication
public class RestDataTryoutApplication {

    private static ContractRepository contractRepository;

    @Autowired
    public void setSomeThing(ContractRepository someThing) {
        RestDataTryoutApplication.contractRepository = someThing;
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RestDataTryoutApplication.class, args);
        initData();
    }

    private static void initData() throws IOException {
		File inited = new File("database-is-filled");
		if (inited.exists()) {
			return;
		}
		inited.createNewFile();
    	for (int i = 0; i < 50; i++) {
			contractRepository.save(getContractObjects(i));
		}
    }

    private static Contract getContractObjects(int number) {
        Contract contract = new Contract();
        contract.setNumber("test-number-" + number);
        contract.setPremium(new BigDecimal(123 * number));
        contract.setSum(311411d);
        ArrayList<ContractObject> objects = new ArrayList<>();
        ContractObject object = new ContractObject();
        object.setName("object-name-" + number);
        ArrayList<Attribute> attributes = new ArrayList<>();
        Attribute attribute = new Attribute();
        AttributeType attributeType = new AttributeType();
        attributeType.setName("name");
        attribute.setType(attributeType);
        attribute.setValue("name-" + number);
        attributes.add(attribute);
        attribute = new Attribute();
        attributeType = new AttributeType();
        attributeType.setName("surname");
        attribute.setType(attributeType);
        attribute.setValue("surname-" + number);
        object.setAttributes(attributes);
        objects.add(object);
        contract.setObjects(objects);
        return contract;
    }

}
