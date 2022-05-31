package com.saatcms.CMS_Clone.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contents")
@EqualsAndHashCode(of = {"id"})
@ToString
public class Content {

    @Id
    @SequenceGenerator(name = "seq_contents", allocationSize = 1)
    @GeneratedValue(generator = "seq_contents",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 250,nullable = false)
    private String name;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "posterurl", length = 255)
    private String posterurl;

    @Column(name = "videourl", length = 255)
    private String videourl;

}
