package automationtest.dropdown;

public class TestDropdown {

    public static void main(String[] args) {

        SelectFacebookDropdown ob=new SelectFacebookDropdown();
        try {
            ob.selectDDValues();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
