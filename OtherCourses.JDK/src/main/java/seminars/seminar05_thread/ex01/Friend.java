package seminars.seminar05_thread.ex01;

public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //region не синхронизированные методы
//    public  void bow(Friend friend){
//        System.out.println(name + ": покланился " + friend.getName());
//        friend.bowBack(this);
//    }
//
//    private  void bowBack(Friend friend) {
//        System.out.println(
//                name + ": кланяется в ответ " + friend.getName()
//        );
//    }
    //endregion

    //region Description
    public synchronized void bow(Friend friend){
        System.out.println(name + ": поклонился " + friend.getName());
        friend.bowBack(this);
    }

    private synchronized void bowBack(Friend friend) {
        System.out.println(
                name + ": кланяется в ответ " + friend.getName()
        );
    }
    //endregion
}
