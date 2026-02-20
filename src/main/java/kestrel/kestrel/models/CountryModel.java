package kestrel.kestrel.models;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class CountryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "countryid")
    private Integer id;

    @Column(name = "countryname", nullable = false, length = 100)
    private String countryName;



}
