package com.sgh.Repository;

import com.sgh.entity.DeliveredMachines;
import com.sgh.entity.MachineDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DeliveredMachineRepository extends MongoRepository<DeliveredMachines, String> {

}
