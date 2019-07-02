public class MailMessage<T> implements MailMessageInterface<String> {

  private String from;
  private String to;
  private T content;

  public MailMessage(String from, String to, T content) {
    this.from = from;
    this.to = to;
    this.content = content;
  }

  @Override
  public String getFrom() {
    return from;
  }

  @Override
  public String getTo() {
    return to;
  }

  @Override
  public String getContent() {
    return (String) content;
  }
}
