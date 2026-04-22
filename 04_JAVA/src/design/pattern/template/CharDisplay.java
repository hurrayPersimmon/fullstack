package design.pattern.template;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    //Dependency Injection -> 외부에서의 주입.
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");

    }

    @Override
    public void close() {
        System.out.println(">>");

    }

    @Override
    public void print() {
        System.out.print(ch);

    }
}
