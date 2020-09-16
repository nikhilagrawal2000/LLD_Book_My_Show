package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "roles")
public class Role extends Auditable {
    @NotBlank
    @Column(unique = true)
    @Getter
    @Setter
    private String name;

    @NotBlank
    @Getter
    @Setter
    private String description;

    public Role() {
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
