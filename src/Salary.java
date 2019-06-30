public class Salary<T> implements MailMessageInterface<Integer> {
  private String from;
  private String to;
  private T content;

  public Salary(String from, String to, T content) {
    this.from = from;
    this.to = to;
    this.content = content;
  }

  @Override
  public String getTo() {
    return to;
  }

  @Override
  public String getFrom() {
    return from;
  }

  @Override
  public Integer getContent() {
    return (Integer) content;
  }
}
