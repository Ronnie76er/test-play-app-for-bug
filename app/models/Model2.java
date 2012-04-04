package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Model2 extends Model{

    @Id
    public Long id;

    @ManyToMany
    public List<Model1> modelOnes;

    private static Finder<Long, Model2> find = new Finder<Long, Model2>(Long.class, Model2.class);

    public static Model2 findModelTwo(Long id) {

        return find.fetch("modelOnes").where().idEq(id).findUnique();
    }


}