public interface MailMessageInterface<T> {

  String getTo();

  String getFrom();

  T getContent();
}

