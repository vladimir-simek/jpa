package cz.vladimirsimek.jpa.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long albumId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Date releasedOn;

    @ManyToOne
    private InterpretEntity interpret;

    @OneToMany
    private List<SongEntity> songs;

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

    public Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public InterpretEntity getInterpret() {
        return interpret;
    }

    public void setInterpret(InterpretEntity interpret) {
        this.interpret = interpret;
    }

    public List<SongEntity> getSongs() {
        return songs;
    }

    public void setSongs(List<SongEntity> songs) {
        this.songs = songs;
    }
}
