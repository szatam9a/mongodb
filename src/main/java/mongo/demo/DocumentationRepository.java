package mongo.demo;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentationRepository extends MongoRepository<Documentation, String> {

        Optional<Documentation> findByEmailAddress(String email);

}
