public class ISEPObserver implements IObserver {
    private String news;

    public ISEPObserver(String info) {
        this.news = info;
    }

    @Override
    public void update(Message message) {
        System.out.println(news + "subscribed message are following:" + message.getMessage());
    }
}
