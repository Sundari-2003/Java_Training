package com.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import jakarta.persistence.TypedQuery;

public class MovieDao {

    private static SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        return cfg.buildSessionFactory();
    }

    public static void createMovie(Movie movie) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(movie);
        tx.commit();
        session.close();
    }

    public static List<Movie> getAllMovies() {
        Session session = getSessionFactory().openSession();
        List<Movie> movies = session.createQuery("from Movie", Movie.class).getResultList();
        session.close();
        return movies;
    }

    public static Movie getMovieByName(String name) {
        Session session = getSessionFactory().openSession();
        TypedQuery<Movie> query = session.getNamedQuery("findMovieByName");
        query.setParameter("name", name);
        Movie movie = query.getSingleResult();
        session.close();
        return movie;
    }

    public static void updateMovie(int id, String newDirector) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Movie movie = session.get(Movie.class, id);
        if (movie != null) {
            movie.setDirector(newDirector);
            session.merge(movie);
        }
        tx.commit();
        session.close();
    }

    public static void deleteMovie(int id) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Movie movie = session.get(Movie.class, id);
        if (movie != null) {
            session.remove(movie);
        }
        tx.commit();
        session.close();
    }
}