package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * @author Administrator
 * 模拟各班某项科目总成绩及平均分
 */
public class MapAndList {
    public static void main(String[] args) {
        List<Student> stuList = exam ();
        view(count(stuList));
        
    }
    
    /**
     * 模拟考试结果
     *
     */
    static List<Student> exam () {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Lebron James","a", 92));
        list.add(new Student("Stephon Curry","a", 90));
        list.add(new Student("James Harden","b", 88));
        list.add(new Student("Chris Paul","c", 84));
        list.add(new Student("Russel Westbrook","b", 89));
        list.add(new Student("Clay Thompson","c", 83));
        list.add(new Student("Kobe","a", 95));
        
        return list;
    }
    
    /**
     * 统计分析
     * 使用hashmap分拣存储，遍历List
     *
     */
    static Map<String,  ClassRoom> count(List<Student> list) {
        Map<String,  ClassRoom> map = new HashMap<String , ClassRoom>();
        
        for (Student stu : list) {
            String no = stu.getRoomNo();
            double score = stu.getScore();
            
            ClassRoom room = map.get(no);
            
            if (room == null) {
                room = new ClassRoom(no);
                map.put(no, room);
            }
            
            room.getStudList().add(stu); // 放入学生
            room.setTotal(room.getTotal()+score);// 计算总分
        }
        
        return map;
    }
    
    /**
     * 查看各班总分和平均分
     * 遍历map
     *
     */
    static void view(Map<String,  ClassRoom> map) {
        Set<String> keys = map.keySet();
        
        Iterator<String> it = keys.iterator();
        
        while (it.hasNext()) {
            String no = it.next();
            ClassRoom room = map.get(no);
            
            double total = room.getTotal();
            double avg = total/room.getStudList().size();
            
            System.out.println(no+"班总分："+total+"---------,平均分："+avg);
        }
        
    }
}

class Student {
    // 姓名
    private String name;
    // 班级编号
    private String roomNo;
    // 成绩
    private double score;
    
    public Student(String name, String roomNo, double score) {
        this.name = name;
        this.roomNo = roomNo;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRoomNo() {
        return roomNo;
    }
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    
}

class ClassRoom {
    // 班级编号
    private String no;
    public String getNo() {
        return no;
    }

    // 学生列表
    private List<Student> studList;
    
    private double total;// 总分

    public ClassRoom() {
        studList = new ArrayList<Student>();
    }
    
    public ClassRoom(String no) {
        this();
        this.no = no;
        
    }
    
    public List<Student> getStudList() {
        return studList;
    }

    public void setStudList(List<Student> studList) {
        this.studList = studList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
}
