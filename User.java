import java.util.Date;
import java.util.ArrayList;

public class User {
   private Date birthdate;
   private int size;
   private ArrayList <Photo> photos;
   private Address address; 

   public User(Date birthdate, int size, ArrayList <Photo> photos, Address address){

    this.birthdate = birthdate;
    this.size = size;
    this.photos = photos;
    this.address = address;
   }
}
