package quoters;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data

public class TerminatorQuoter implements Quoters {
    List<String> messages;
    @Override
    public void sayQuoter() {
    messages.forEach(System.out::println);
    }
}
