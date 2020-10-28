package quoters;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ShakespeareQuoter implements Quoters {
    private String message;



    @Override
    public void sayQuoter() {
        System.out.println(message);
    }


  /*  public void setMessage(String message) {
      //  System.out.println(message);
        this.message=message;
    }*/
}
