package cn.edu.whut.sept.zuul;

public class CommandWords {
    /**
     * 个包含所有有效命令字的常量数组.
     * 最后一个后面不应该有逗号！
     */

    private static  String[] validCommands = {
            "go", "quit", "help"
    };
/**
 * 空参构造函数.
 */
    public CommandWords() {
        // nothing to do at the moment...
    }
    /**
     * @param aString 传入方法的字符串
     * @return 输入字符串合法返回true，否则返回false
     */
    public boolean isCommand(final String aString) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(aString)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 展示所有字符串.
     */
    public void showAll() {
        for (String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
