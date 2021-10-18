package Main;

public class Main1 {

    private int id;
    private String name;

    public Main1(int id, String name){
        this.id = id;
        this.name = name;
    }

    //印刷する
    public void disPlay(){
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
    }
    
}
