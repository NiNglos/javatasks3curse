package jv.mn.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="answer")
@Data


public class Answer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int rowId;
    private int questionId;
    private String text;
    private Boolean correct;

}
