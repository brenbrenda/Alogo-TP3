public class GoogleNewsObserver implements IObserver {
    private String news;

    public GoogleNewsObserver(String info) {
        news = info;
    }

    @Override
    public void update(Message m) {
        System.out.println(news+" your subscibed messages are following:"+ m.getMessage());
    }
}
