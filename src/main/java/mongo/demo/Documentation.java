package mongo.demo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Documentation {

    @Id
    private String id;
    private String name;
    private String description;
    private String author;
    @Indexed
    private String emailAddress;
    private int pages;

}
