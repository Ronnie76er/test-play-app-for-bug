package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Model1 extends Model{
    
    @Id
    public Long id;
    
    
    private static void doSomething(){
        List<Model2> modelTwo = Model2.doSomething();

        // Without the following lines it compiles. With it, it doesn't
        for (Model1 modelOne : modelTwo.get(0).modelOnes) {
            System.out.println("modelOne.id = " + modelOne.id);
        }
    }
    
}