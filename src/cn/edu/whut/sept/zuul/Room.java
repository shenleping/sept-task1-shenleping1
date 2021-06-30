package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;
/**
     * 创建一个房间描述“描述”
    没有出口。“描述”类似于“厨房”
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }
/**
     * 定义这个房间的出口。
      direction 出口的方向。
      neighbor 出口通向的房间。
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
/**
     * @return房间的简短描述
     *（在构造函数中定义的那个）。
     */
    public String getShortDescription()
    {
        return description;
    }
 /**
     * 在表格中返回房间的描述：
     * 你在厨房。
     * 出口：西北
     * @return这个房间的详细描述
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
 /**
     * 返回一个描述房间出口的字符串，例如
     *“出口：西北”。
     * @return房间出口的详细信息。
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
 /**
     * 如果我们从这个房间往方向走，返回到达的房间
     * “方向”。如果该方向没有空间，则返回 null。
     * @param direction 出口的方向。
     * @return给定方向的房间。
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


