package jv.mn.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="student_answer")
@Data

public class StudAnsw {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int rowId;
    private int testId;
    private int userId;
    private int answerId;
}
