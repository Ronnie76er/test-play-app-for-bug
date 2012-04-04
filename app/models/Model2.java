package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Model2 extends Model{

    @Id
    public Long id;

    @OneToMany
    public List<Model1> modelOnes;

    private static Finder<Long, Model2> find = new Finder<Long, Model2>(Long.class, Model2.class);

    public static Model2 findModelTwo(Long id) {
        Model2 unique = find.fetch("modelOnes").where().idEq(id).findUnique();
//        Without the following lines it compiles.  With it, it doesn't
        for (Model1 modelOne : unique.modelOnes) {
            System.out.println("modelOne.id = " + modelOne.id);
        }

        return unique;
    }

    public List<Model1> getModelOnes(){
        return modelOnes;
    }
}