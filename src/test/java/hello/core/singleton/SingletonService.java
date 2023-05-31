package hello.core.singleton;

public class SingletonService {

    // static 영역에 객체를 1개만 생성해놓기.
    private static final SingletonService instance = new SingletonService();

    // 조회 시
    public static SingletonService getInstance(){
        return instance;
    }
    //외부 생성 막기
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
