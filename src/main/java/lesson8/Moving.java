package lesson8;

public interface Moving {

    boolean run(int length);

    boolean jump(int height);

    String getName();

    String getType();

    int getMaxJump();

    int getMaxRun();



}
