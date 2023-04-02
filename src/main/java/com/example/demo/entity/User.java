package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author udarasan
 * @TimeStamp 2023-03-27 14:30
 * @ProjectDetails demo
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String username;
    private String dob;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

}

    /*

    @OneToOne(cascade = CascadeType.ALL) Explain
    `````````````````````````````````````````````
    The @OneToOne(cascade = CascadeType.ALL) annotation is used in JPA to define a one-to-one mapping between
    two entities and to specify the cascading behavior of the associated entity when the owning entity is saved,
    updated or deleted.


    CASCADE TYPE
    `````````````
    CascadeType is an enumeration in JPA that is used to define the cascading behavior between
    entities when performing various operations such as persist, remove, refresh, and merge.
    When an operation is performed on an entity, the cascade type determines whether the
    same operation should be propagated to the related entities.

    For example, if a User entity has an Address entity associated with it with CascadeType.ALL set,
    then when the User entity is saved, the Address entity will also be saved automatically
    because the CascadeType.ALL includes all operations (persist, merge, remove, refresh) and
    propagates them to the related entities.

    The CascadeType enumeration has the following values:

    ALL: All operations (persist, merge, remove, refresh) should be cascaded to the related entities.
    PERSIST: Only the persist operation should be cascaded to the related entities.
    MERGE: Only the merge operation should be cascaded to the related entities.
    REMOVE: Only the remove operation should be cascaded to the related entities.
    REFRESH: Only the refresh operation should be cascaded to the related entities.
    DETACH: Only the detach operation should be cascaded to the related entities.

    By default, no operations are cascaded between entities, so if you want to propagate an operation
    to related entities, you need to specify the appropriate cascade type.

    @JoinColumn Annotation Explain
    ``````````````````````````````
    The @JoinColumn annotation is used in JPA to define a mapping between two entities based on a
    foreign key column.

    In the case of a one-to-one mapping, the @JoinColumn annotation is used to specify the
    foreign key column in the owning entity (User entity in this case) that references the
    primary key column in the related entity (Address entity in this case).

    The name attribute of the @JoinColumn annotation specifies the name of the foreign key column
    in the owning entity, while the referencedColumnName attribute specifies the name of the primary key
    column in the related entity that the foreign key column references.

    In the example, @JoinColumn(name = "address_id", referencedColumnName = "id") is used to define
    a mapping between the User entity and the Address entity based on the address_id column in the
    User entity that references the id column in the Address entity.

    This means that whenever a User entity is saved or updated, the address_id column in the
    User table will contain the value of the id column in the related Address entity.
    And whenever a User entity is retrieved, JPA will automatically fetch the associated
    Address entity based on the value in the address_id column and set it in the address property of the
    User entity.


    */