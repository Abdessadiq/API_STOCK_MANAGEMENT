package com.babahamou.stockmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

/**
 * La classe abstract pour déclarer les attributs qui sont commun entre les entities = classes
 */
@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @JsonIgnore
    @Column(nullable = false)

    private Instant creationDate;
    @LastModifiedDate
    @JsonIgnore
    private Instant lastUpdatedDate;
}
