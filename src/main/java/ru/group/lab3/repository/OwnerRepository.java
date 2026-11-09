package ru.group.lab3.repository;

import ru.group.lab3.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository
        extends CrudRepository<Owner, Long> {
}
