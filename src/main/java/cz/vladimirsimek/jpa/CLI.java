package cz.vladimirsimek.jpa;

import cz.vladimirsimek.jpa.entities.AlbumEntity;
import cz.vladimirsimek.jpa.entities.InterpretEntity;
import cz.vladimirsimek.jpa.entities.SongEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;

public class CLI {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Spotify");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        InterpretEntity vlad = new InterpretEntity();
        vlad.setName("Vladimir");
        vlad.setDescription("Borec ale asi propadne snad ne idk lol");
        entityManager.persist(vlad);

        AlbumEntity vladAlbum = new AlbumEntity();
        vladAlbum.setReleasedOn(new Date());
        vladAlbum.setInterpret(vlad);
        vladAlbum.setName("Propadam OST");
        vladAlbum.setDescription("Album stavene jako story o tom jak spacham neziti");

        SongEntity vladSong = new SongEntity();
        vladSong.setAlbum(vladAlbum);
        vladSong.setDescription("Tady rapuju o tom jak si v cervnu hodim lano po tom co podelam postupovky z matiky");
        vladSong.setName("Lano za OMU");
        vladSong.setReleasedOn(new Date());


    }

}
