package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room {
    /**
     * 定义房间描述.
     */
    private String description;
    /**
     * 定义房间方向哈希表.
     */
    private HashMap<String, Room> exits;
/**
     * 创建一个房间描述“描述”.
     * @param description1 room的description
     */
    public Room(final String description1) {
        this.description = description1;
        exits = new HashMap<>();
    }
/**
     * 定义这个房间的出口.
      @param direction 出口的方向。
      @param neighbor 出口通向的房间。
     */
    public void setExit(final String direction, final Room neighbor) {
        exits.put(direction, neighbor);
    }
/**
     * @return 房间的简短描述
     */
    public String getShortDescription() {
        return description;
    }
 /**
     * 在表格中返回房间的描述.
     * @return 这个房间的详细描述
     */
    public String getLongDescription() {
        return "You are " + description + ".\n" + getExitString();
    }
 /**
     * 返回一个描述房间出口的字符串.
     * @return 房间出口的详细信息。
     */
    private String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
 /**
     * 如果我们从这个房间往方向走，返回到达的房间.
     * “方向”。如果该方向没有空间，则返回 null。
     * @param direction 出口的方向。
     * @return 给定方向的房间。
     */
    public Room getExit(final String direction) {
        return exits.get(direction);
    }
}


