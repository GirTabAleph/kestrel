package kestrel.kestrel.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class AuthorModel {

    @Id


    @Column(name = "authorname")
    private String firstName;
    @Column(name = "authorlastname")
    private String lastName;

}
