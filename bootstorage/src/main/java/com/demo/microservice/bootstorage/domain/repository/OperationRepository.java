package com.demo.microservice.bootstorage.domain.repository;

import com.demo.microservice.bootstorage.domain.model.Operation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OperationRepository extends CrudRepository<Operation, Long> {
}
