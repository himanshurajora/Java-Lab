

import java.util.*;

class OverloadingMain {
    public static void main(String[] args)
    {
        System.out.println("Main with args array");
        OverloadingMain.main("abc");
        OverloadingMain.main();
    }
    public static void main(String args)
    {
        System.out.println("Main with args");
    }
    public static void main()
    {
        System.out.println("Main without arguments");
    }
}
