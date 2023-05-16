package cz.vladimirsimek.jpa.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class InterpretEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long interpretId;

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany
    private List<AlbumEntity> discography;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AlbumEntity> getDiscography() {
        return discography;
    }

    public void setDiscography(List<AlbumEntity> discography) {
        this.discography = discography;
    }


}
