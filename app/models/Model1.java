package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Model1 extends Model{
    
    @Id
    public Long id;
    
    
    private static void doSomething(Long id){
        Model2 modelTwo = Model2.findModelTwo(id);

        // Without the following lines it compiles. With it, it doesn't
//        for (Model1 modelOne : modelTwo.modelOnes) {
//            System.out.println("modelOne.id = " + modelOne.id);
//        }
    }
    
}