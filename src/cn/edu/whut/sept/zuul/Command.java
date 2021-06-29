package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;
 /**
     * 创建一个命令对象。必须提供第一个和第二个字，但
     * 一个（或两个）可以为空。
     * 
     * @param firstWord 命令的第一个单词。如果命令不是空的
     * 认可。
     * @param secondWord 命令的第二个字。
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
     /**
     * 返回该命令的命令字（第一个字）。如果命令是
     * 不明白，结果为空。
     * 
     * @return命令字。
     */

    public String getCommandWord()
    {
        return commandWord;
    }
 /**
     * @return此命令的第二个字。如果没有秒则返回 null
     * 单词。
     */
    public String getSecondWord()
    {
        return secondWord;
    }
/**
     * @return true 如果此命令不被理解。
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }
/**
     * @return true 如果命令有第二个单词。
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
