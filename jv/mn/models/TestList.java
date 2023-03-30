package jv.mn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="test_list")
@Data

public class TestList {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int rowId;
    private String name;
    private Integer subjectId;
    private Integer teacherId;

}
