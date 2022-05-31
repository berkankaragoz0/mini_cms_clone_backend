package com.saatcms.CMS_Clone.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "licenses")
@EqualsAndHashCode(of = {"id"})
@ToString
public class License implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_licenses", allocationSize = 1)
    @GeneratedValue(generator = "seq_licenses",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 250,nullable = false)
    private String name;

    @Column(name = "start_time", length = 55)
    private String start_time;

    @Column(name = "end_time", length = 55)
    private String end_time;


}
