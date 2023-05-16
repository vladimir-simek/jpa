package cz.vladimirsimek.jpa.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class SongEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long songId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Date releasedOn;

    @ManyToOne
    private AlbumEntity album;

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

    public AlbumEntity getAlbum() {
        return album;
    }

    public void setAlbum(AlbumEntity album) {
        this.album = album;
    }
}
