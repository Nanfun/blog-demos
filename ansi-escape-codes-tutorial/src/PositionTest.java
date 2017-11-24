public class PositionTest {
    public static void main(String[] args) throws InterruptedException {
        // 先清理屏幕，并将光标定位到左上角
        System.out.print("\u001b[2J");
        System.out.print("\u001b[1;1H");

        System.out.println("1 2 3 4");
        System.out.println("5 6 7 8");
        System.out.println("a b c d");
        System.out.print("e f g h");

        Thread.sleep(2000);
        System.out.print("\u001b[2;3H"); // 光标移到2行3列即数字6的位置

        Thread.sleep(2000);
        System.out.print("\u001b[7G"); // 光标移动到第七列，行数保持不变，所以移动到数字8的位置

        Thread.sleep(2000);
        System.out.print("\u001b[s"); // 保存当前光标的位置即数字8的位置
        System.out.print("\u001b[2E"); // 光标向下移动2行并且移至行首，也就是字母e的位置
        Thread.sleep(2000);
        System.out.print("\u001b[u"); // 将光标恢复到刚才保存的位置，也就是数字8的位置
        Thread.sleep(2000);
    }
}
