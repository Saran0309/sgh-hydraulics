package com.sgh.Repository;

import com.sgh.entity.Machine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MachineRepository extends MongoRepository<Machine, String> {
    List<Machine> findByParentType(String type);
}
