package springboot.db.replication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.db.replication.entity.Person;

@Repository
public interface DBReadWriteRepository extends JpaRepository<Person, Long>{

}
