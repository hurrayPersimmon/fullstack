package advance.ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button buttonOk = new Button();

        buttonOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok");
            }
        });

        buttonOk.click();

        Button buttonCancel = new Button();
        buttonCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("cancel");
            }
        });
        buttonCancel.click();

    }

}
