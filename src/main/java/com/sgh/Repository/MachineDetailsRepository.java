package com.sgh.Repository;

import com.sgh.entity.MachineDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// Repository for accessing machine data in MongoDB
@Repository
public interface MachineDetailsRepository extends MongoRepository<MachineDetails, String> {
    List<MachineDetails> findByNameContainingIgnoreCaseAndParentTypeContainingIgnoreCase(String name, String parentType);
}
