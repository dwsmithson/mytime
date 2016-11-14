package com.grs.mt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dwsmithson on 11/13/16.
 */
@Entity
public class Task {

    @Id
    private long id;
    private String name;
}
