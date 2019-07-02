import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessageInterface> {

  private Map<String, List<T>> map = new HashMap<String, List<T>>() {
    @Override
    public List<T> get(Object key) {
      return getOrDefault(key, Collections.emptyList());
    }
  };

  @Override
  public void accept(MailMessageInterface mailMessage) {
    map.computeIfAbsent((String) mailMessage.getTo(),
            k -> new ArrayList<>()).add((T) mailMessage.getContent());
  }

  public Map<String, List<T>> getMailBox() {
    return map;
  }
}
