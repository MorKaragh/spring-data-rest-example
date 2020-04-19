package morkaragh.restdatatryout.repository;

import morkaragh.restdatatryout.model.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contract", path = "contract")
public interface ContractRepository extends PagingAndSortingRepository<Contract, Long> {

    List<Contract> findByNumber(@Param("number") String number);

}
