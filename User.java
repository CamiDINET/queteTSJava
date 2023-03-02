import java.util.Date; 

public class User {
   private Date birthdate;
   private int size;
   private Photo[] photos;
   private Address address; 

   public User(Date birthdate, int size, Photo[] photos, Address address){

    this.birthdate = birthdate;
    this.size = size;
    this.photos = photos;
    this.address = address;
   }
}
